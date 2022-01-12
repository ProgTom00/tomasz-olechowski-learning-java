package com.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class CompaniesRetriever {


    List<Company> companies;

    public CompaniesRetriever() {
        this.companies = new ArrayList<>();

        Company healthyFood = new HealthyFood("HealthyFood");
        healthyFood.addCompanyGoods(new Shop(new Product("Orange", 20), 10));
        healthyFood.addCompanyGoods(new Shop(new Product("Banana", 4), 5));

        Company extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        extraFoodShop.addCompanyGoods(new Shop(new Product("Apple", 20), 10));

        Company glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");
        glutenFreeShop.addCompanyGoods(new Shop(new Product("Bread", 10), 10));

        companies.add(healthyFood);
        companies.add(extraFoodShop);
        companies.add(glutenFreeShop);
    }

    public List<Company> retrieve() {
        return new ArrayList<>(companies);
    }
}

