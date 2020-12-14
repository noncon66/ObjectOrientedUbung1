package com.Klaus.Zoo;

public class Animal {
    private String name;
    private String species;
    private int foodDemand;
    private Food favoriteFood;

    public Animal (Zoo zoo, String cagename, String animalname, String species, String favoriteFood, int foodDemand){
        this.name = animalname;
        this.species = species;
        this.foodDemand = foodDemand;
        this.favoriteFood = zoo.searchAndCreateFood(favoriteFood);
        zoo.searchAndCreateCage(cagename).addAnimal(this);
        //dailyFoodDemand vom Food erhöhen
        this.favoriteFood.addToDailyFoodDemand(foodDemand);


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

    public String getName() { return name; }

    public int getFoodDemand() { return foodDemand; }

    public String getFavoriteFoodName() {
        return favoriteFood.getName();
    }
}
