package com.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {


        CompaniesRetriever companiesRetriever = new CompaniesRetriever();
        CompaniesRepository companiesRepository = new CompaniesRepository(companiesRetriever.retrieve());


        OrderRequest orderRequest = new OrderRequest();
        orderRequest.addProduct(new Shop(new Product("Apple", 20), 8));
        orderRequest.addProduct(new Shop(new Product("Orange", 20), 3));
        orderRequest.addProduct(new Shop(new Product("Bread", 10), 12));
        orderRequest.addProduct(new Shop(new Product("Banana", 4), 5));


        OrderProcessor orderProcessor = new OrderProcessor(companiesRepository);
        orderProcessor.processOrder(orderRequest);
    }
}
