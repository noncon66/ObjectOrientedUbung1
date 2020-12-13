package com.Klaus.Zoo;

public class Animal {
    private String name;
    private String species;
    private int foodDemand;
    private Food favoriteFood;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animal(String name, String species, Cage cage) {
        this.name = name;
        this.species = species;
        cage.addAnimal(this);
    }

    public Animal (Zoo zoo, String cagename, String animalname, String species, String favoriteFood, int foodDemand){
        this.name = animalname;
        this.species = species;
        this.foodDemand = foodDemand;
        this.favoriteFood = zoo.searchAndCreateFood(favoriteFood);
        zoo.searchAndCreateCage(cagename).addAnimal(this);
        //dailyFoodDemand vom Food erhöhen
        this.favoriteFood.addToDailyFoodDemand(foodDemand);


    }




    public void setFoodDemand(int foodDemand) {
        this.foodDemand = foodDemand;
    }

    public void addToCage(Cage cage){
        cage.addAnimal(this);
    }

    public void printStructure(String prefix){
        System.out.printf("%s%s (%s) braucht %d %s %s%n",
                prefix,
                name,
                species,
                foodDemand,
                favoriteFood.getUnit(),
                favoriteFood.getName());
    }


}
