package com.Klaus.Restaurant;

public class Main {

    public static void main(String[] args) {
        Restaurant hirschen = new Restaurant("Hirschen");
        hirschen.addTable(1, 4);
        hirschen.addTable(2, 6);
        hirschen.addTable(3, 2);
        hirschen.addTable(4, 12);

        Menu mittagskarte = new Menu("Mittagskarte");
        mittagskarte.addItem("Bier", MenuItemType.DRINK, 4.2);
        mittagskarte.addItem("Cola", MenuItemType.DRINK, 3.4);
        mittagskarte.addItem("Suppe", MenuItemType.STARTER, 5.3);
        mittagskarte.addItem("Salat", MenuItemType.STARTER, 4.8);
        mittagskarte.addItem("SchniPo", MenuItemType.MAIN, 12.2);
        mittagskarte.addItem("Grillteller", MenuItemType.MAIN, 14.5);
        mittagskarte.addItem("Gemüselaibchen", MenuItemType.MAIN, 9.9);
        mittagskarte.addItem("Eis", MenuItemType.DESSERT, 3.3);
        mittagskarte.addItem("Kuchen", MenuItemType.DESSERT, 2.9);

        hirschen.addMenu(mittagskarte);


        int quarterHours = 20;
        while (quarterHours>0){
            hirschen.addNewGroup(12);








            quarterHours--;
        }


















    }
}
