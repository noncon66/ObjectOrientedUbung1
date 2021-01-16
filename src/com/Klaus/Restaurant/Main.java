package com.Klaus.Restaurant;

public class Main {

    public static void main(String[] args) {
        Restaurant hirschen = new Restaurant("Hirschen");
        hirschen.addTable(1, 4);
        hirschen.addTable(2, 6);
        hirschen.addTable(3, 2);
        hirschen.addTable(4, 12);

        Menu mittagskarte = new Menu("Mittagskarte");
        mittagskarte.addItem("Bier", MenuItemType.DRINK);
        mittagskarte.addItem("Cola", MenuItemType.DRINK);
        mittagskarte.addItem("Suppe", MenuItemType.STARTER);
        mittagskarte.addItem("Salat", MenuItemType.STARTER);
        mittagskarte.addItem("SchniPo", MenuItemType.MAIN);
        mittagskarte.addItem("Grillteller", MenuItemType.MAIN);
        mittagskarte.addItem("Gemüselaibchen", MenuItemType.MAIN);
        mittagskarte.addItem("Eis", MenuItemType.DESSERT);
        mittagskarte.addItem("Kuchen", MenuItemType.DESSERT);

        hirschen.addMenu(mittagskarte);


















    }
}
