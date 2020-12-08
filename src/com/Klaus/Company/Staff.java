package com.Klaus.Company;

public class Staff {
    private String name;
    private Department currentDepartment;

    public Staff(String name, Department currentDepartment) {
        this.name = name;
        this.currentDepartment = currentDepartment;
    }

    public void addToDepartment(Department department){
        currentDepartment = department;
        department.addStuff(this);
    }

    public void changeDepartment(Department newDepartment){
        if (currentDepartment.equals(newDepartment)){
            System.out.println("Der Mitarbeiter " + name + " ist schon in Abteilung " + currentDepartment );
        } else {
            currentDepartment.removeStaff(this);
            currentDepartment = newDepartment;
            newDepartment.addStuff(this);
        }
    }

}
