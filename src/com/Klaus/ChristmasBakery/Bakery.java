package com.Klaus.ChristmasBakery;

import java.util.Vector;

public class Bakery {

    private String name;
    private Vector<Employee> employees;
    private Vector<Customer> customers;
    private Vector<Cookie> cookies;
    private Vector<Order> orders;

    public Bakery(String name) {

        this.name = name;
        employees = new Vector<>();
        customers = new Vector<>();
        cookies = new Vector<>();
        orders = new Vector<>();
    }

    public Employee employ(String name, String favouriteCookie, String[] cookies, int productionCapacityTotal) {
        for (var employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        //add favourite cookie of new employee to cookies list
        Cookie fc = searchAndCreateCookie(favouriteCookie);

        //add cookie of new employee to cookies list
        for (var cookie :
                cookies) {
            searchAndCreateCookie(cookie);
        }
        Employee e = new Employee(name, fc, cookies, productionCapacityTotal);
        employees.add(e);
        return e;
    }

    public Customer registerCustomer(String name, String address) {
        for (var customer :
                customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        Customer newCustomer = new Customer(name, address);
        customers.add(newCustomer);
        return newCustomer;
    }


    public Order customerOrder(String customerName, String orderItemsString) {

        Vector<OrderItem> orderItems = new Vector<>();

        String[] items = orderItemsString.split(",");
        for (var item :
                items) {
            String[] itemSplit = item.split(":");

            String cookieName = itemSplit[0];
            int amount = Integer.parseInt(itemSplit[1]);

            Cookie cookieToAdd = searchAndCreateCookie(cookieName);

            orderItems.add(new OrderItem(cookieToAdd, amount));
        }

        Order newOrder = new Order(findCustomer(customerName), orderItems);
        orders.add(newOrder);
        return newOrder;
    }


    public void produceOrder (Order orderToProduce){
        for (var orderItem:
             orderToProduce.getOrderItems()) {

            for (var employee:  employees
                 ) {
                //Employee with favorite cookie and capacity
                if (employee.getFavouriteCookie().equals(orderItem.getCookie()) &&
                        employee.getProductionCapacityLeft()>= orderItem.getAmount()) {
                    employee.produce(orderItem.getAmount());
                    System.out.println(employee.getName()+" produces " + orderItem.getCookie().getName());
                    break;
                }
                //Employee with cookie and capacity
                else if (employee.getCookies().contains(orderItem.getCookie())&&
                        employee.getProductionCapacityLeft()>= orderItem.getAmount()){
                    employee.produce(orderItem.getAmount());
                    System.out.println(employee.getName()+" produces " + orderItem.getCookie().getName());
                    break;
                }
            }
        }
    }




    public Cookie searchAndCreateCookie(String name) {
        for (var cookie :
                cookies) {
            if (cookie.getName().equals(name)) {
                return cookie;
            }
        }
        Cookie c = new Cookie(name);
        cookies.add(c);
        return c;
    }

    public Customer findCustomer(String name) {
        for (var customer :
                customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null; //Throw error if not found?
    }

    public Vector<Order> getOrders() {
        return orders;
    }
}
