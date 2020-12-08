package com.Klaus.Company;

import java.util.Vector;

public class Department {
    private String description;
    private String headOfDepartment;
    private Department parentDepartment;
    private Vector<Department> childDepartment;
    private Vector<Staff> staff;

    //constuctor ohne parent und child; verknüpfungen müssen manuell erstellt werden (connectToParentDepartment)
    public Department(String description, String headOfDepartment) {
        this.description = description;
        this.headOfDepartment = headOfDepartment;
        this.parentDepartment = null;
        this.childDepartment = new Vector<>();
        this.staff = new Vector<>();
    }

    //verbindet ein Department mit einem Parent und setzt gelichzeitig die Abteilung als Child im Parent
    public void connectToParentDepartment(Department parent) {
        if (this.parentDepartment != null) {
            System.out.println(this.description + "ist schon Unterablteilung von " + this.parentDepartment);
        } else {
            //legt den Parent an
            parentDepartment = parent;
            //legt das aktuelle als Child beim Parent an
            parent.childDepartment.add(this);
        }
    }

    public void addStuff(Staff staff) {
        this.staff.add(staff);
        //staff.addToDepartment(this);
    }

    public void removeStaff(Staff staff){
        this.staff.remove(staff);
    }

    @Override
    public String toString() {
        return description + " (" + headOfDepartment + ")";
    }

    public void printCompany(String prefix) {
        System.out.println(prefix + "- " + description + " (" + headOfDepartment + ")");
        for (int i = 0; i < childDepartment.size(); i++) {
            childDepartment.get(i).printCompany("    " + prefix);
        }
    }


}


