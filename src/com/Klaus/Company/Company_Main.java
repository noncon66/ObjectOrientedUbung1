package com.Klaus.Company;

public class Company_Main {
    public static void main(String[] args) {
        Department vorstand = new Department("Vorstand", "Alfred Boss");
        Department vertieb = new Department("Vertrieb", "Max Mustermann");
        Department vertriebB2C = new Department("Vertrieb Privatkunden", "Angela Musterfrau");
        Department vertriebB2B = new Department("Vertrieb Firmenkunden", "Alfons Muste");

        Department einkauf = new Department("Einkauf", "Alois Kufmann");
        Department einkaufMech = new Department("Einkauf Mechanik", "Herlinde Gunz");
        Department einkaufKT = new Department("Einkauf Kleinteile", "Friedrich Hermann");
        Department einkaufGT = new Department("Einkauf Großteile", "Hannelore Peter");
        Department einkaufEU = new Department("Einkauf Europa", "Moritz But");

        Staff hansMeier = new Staff("Hans Meier", vertriebB2C);
        Staff karlMeister = new Staff("Karl Meister", vertriebB2C);
        Staff georgBerger = new Staff("Georg Berger", vertriebB2B);
        Staff lisaVorwerk = new Staff("Lisa Vorwerk", vertriebB2B);
        Staff haneloreGrosskopf = new Staff("Hanelore Großkopf", vertriebB2B);
        Staff fritzGutensohn = new Staff("Fritz Gutensohn", einkaufEU);
        Staff ernstKlein = new Staff("Ernst Klein", einkaufKT);
        Staff hildeRitter = new Staff("Hilde Ritter", einkaufKT);



        // Vertrieb
        vertriebB2B.connectToParentDepartment(vertieb);
        vertriebB2C.connectToParentDepartment(vertieb);

        //Einkauf (bottom Up)
        einkaufEU.connectToParentDepartment(einkaufGT);
        einkaufGT.connectToParentDepartment(einkaufMech);
        einkaufKT.connectToParentDepartment(einkaufMech);
        einkaufMech.connectToParentDepartment(einkauf);

        //C-Ebene
        einkauf.connectToParentDepartment(vorstand);
        vertieb.connectToParentDepartment(vorstand);

        //Ausgeben
        vorstand.printCompany("");

        //Homework: class staff, add staff to department, department knows staff, staff knows department
        // let staff change department (add to new dep., del. at old dep.)
        // Zoo! Zoo(name) - Gehege(name) - Tier(name, gattung) jeweils ein PrintStructure

    }
}
