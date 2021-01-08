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

    public Employee employ(String name, String favouriteCookie, String[] cookies) {
        for (var employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        //add favourite cookie of new employee to cookies list
        searchAndCreateCookie(favouriteCookie);

        //add cookie of new employee to cookies list
        for (var cookie :
                cookies) {
            searchAndCreateCookie(cookie);
        }
        Employee e = new Employee(name, favouriteCookie, cookies);
        employees.add(e);
        return e;
    }

    public Customer registerCustomer(String name, String address){
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



    public Cookie searchAndCreateCookie(String name){
        for (var cookie :
                cookies) {
            if(cookie.getName().equals(name)){
                return cookie;
            }
        }
        Cookie c = new Cookie(name);
        cookies.add(c);
        return c;
    }
}
