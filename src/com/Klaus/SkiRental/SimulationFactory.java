package com.Klaus.SkiRental;

import java.util.Random;
import java.util.Vector;

public class SimulationFactory {

    private static Random random = new Random();


    public static Customer createCustomer() {
        String[] firstNames = {"Hans", "Doris", "Barbara", "Jakob", "Anna", "Klaus", "Julia", "Philipp", "Erna"};
        String[] lastNames = {"Maier", "Moser", "Gruber", "Müller", "Wagner", "Pichler", "Steiner", "Huber"};
        String name = firstNames[random.nextInt(firstNames.length)] + " " +
                lastNames[random.nextInt(lastNames.length)];

        return new Customer(name);

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


    private static Vector<Category> createCategoriesToRent() {
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
