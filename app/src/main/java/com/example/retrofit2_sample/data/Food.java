package com.example.retrofit2_sample.data;


public class Food {
    private String foodCode;
    private String foodName;
    private FoodCategory foodCategory;

    private String foodDescription;

    private double foodCalorie;
    private double carbon;
    private double protein;
    private double fat;
    private double sodium;
    private double sugar;

    public Food(String foodCode, String foodName, FoodCategory foodCategory, String foodDescription, double foodCalorie, double carbon, double protein, double fat, double sodium, double sugar) {
        this.foodCode = foodCode;
        this.foodName = foodName;
        this.foodCategory = foodCategory;
        this.foodDescription = foodDescription;
        this.foodCalorie = foodCalorie;
        this.carbon = carbon;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.sugar = sugar;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public double getFoodCalorie() {
        return foodCalorie;
    }

    public void setFoodCalorie(double foodCalorie) {
        this.foodCalorie = foodCalorie;
    }

    public double getCarbon() {
        return carbon;
    }

    public void setCarbon(double carbon) {
        this.carbon = carbon;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodCode='" + foodCode + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodCategory=" + foodCategory +
                ", foodDescription='" + foodDescription + '\'' +
                ", foodCalorie=" + foodCalorie +
                ", carbon=" + carbon +
                ", protein=" + protein +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", sugar=" + sugar +
                '}';
    }
}
