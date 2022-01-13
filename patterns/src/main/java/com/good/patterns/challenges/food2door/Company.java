package com.good.patterns.challenges.food2door;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Company {

    private final String companyName;
    private final List<Shop> companyGoods;

    public Company(String companyName) {
        this.companyName = companyName;
        this.companyGoods = new ArrayList<>();
    }

    public void addCompanyGoods(Shop shop) {
        companyGoods.add(shop);
    }

    private void calculate(OrderRequest orderRequest) {
        for (Shop order : getCompanyGoods()) {
            for (Shop request2 : orderRequest.getOrderList()) {
                if (order.getProduct().getProductName().equals(request2.getProduct().getProductName())) {
                    if (order.getQuantity() < request2.getQuantity()) {
                        System.out.println("Cannot realize the order, not enough products in stock");
                    } else {
                        int amountStock = order.getQuantity() - request2.getQuantity();
                        double amountToPay = request2.getProduct().getPrice() * request2.getQuantity();
                        System.out.println("You have ordered from " + getCompanyName() +  " " + order.getProduct().getProductName());
                        System.out.println("The order can be fulfilled, amount in stock " + amountStock + " pieces");
                        System.out.println("You have ordered " + request2.getQuantity() + " products.");
                        System.out.println("You have to pay " + amountToPay + "zl" + " for " + request2.getQuantity() + " products");
                    }
                }
            }
        }
    }

    public boolean process(OrderRequest orderRequest) {

        boolean flag = true;
        if (flag) {
            calculate(orderRequest);
        } else {
            System.out.println("nie mozna zrealizowac zamowienia");
            flag = false;
        }

        return flag;
    }
}

