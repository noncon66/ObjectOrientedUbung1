package com.Klaus.SkiRental;

import java.util.Random;
import java.util.Vector;

public class SimulationFactory {


    private static Random random = new Random();
    private static Vector<Customer> createdCustomers = new Vector<>();

    public static Customer createCustomer() throws SameNameException {

        // TODO: 18.02.21 add exceprtion handling for same name
        //String[] firstNames = {"Hans", "Doris", "Barbara", "Jakob", "Anna", "Klaus", "Julia", "Philipp", "Erna"};
        //String[] lastNames = {"Maier", "Moser", "Gruber", "Müller", "Wagner", "Pichler", "Steiner", "Huber"};
        String[] firstNames = CSVNameListReader.names("/Users/klaus/IdeaProjects/ObjectOrientedUbung1/src/com/Klaus/SkiRental/firstnames.txt", ";");
        String[] lastNames = CSVNameListReader.names("/Users/klaus/IdeaProjects/ObjectOrientedUbung1/src/com/Klaus/SkiRental/lastnames.txt", ";");
        String name = firstNames[random.nextInt(firstNames.length)] + " " +
                lastNames[random.nextInt(lastNames.length)];
        for (var customer :
                createdCustomers) {
            if (customer.getName().equals(name)) {
                throw new SameNameException("Der Name " + name + " existiert schon");
            }
        }
        Customer c = new Customer(name);
        createdCustomers.add(c);

        return c;
    }

    public static Vector<Item> createItems(int count) {
        var items = new Vector<Item>();

        for (Category value : Category.values()
        ) {
            for (int i = 0; i < count; i++) {
                items.add(createItem(value, i));
            }
        }
        return items;
    }

    private static Item createItem(Category category, int seq) {
        return new Item(category, category.toString().toLowerCase() + seq);
    }


    public static Vector<Category> createCategoriesToRent() {
        var categoriesToRent = new Vector<Category>();

        while (categoriesToRent.size() == 0) {
            for (Category category : Category.values()
            ) {
                if (random.nextDouble() < 0.3) {
                    categoriesToRent.add(category);
                }
            }
        }
        return categoriesToRent;
    }


}
