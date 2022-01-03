package com.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {


        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailInformationService(), new OrderItemService(), new ItemOrderRepository());
        orderProcessor.process(orderRequest);
    }
}