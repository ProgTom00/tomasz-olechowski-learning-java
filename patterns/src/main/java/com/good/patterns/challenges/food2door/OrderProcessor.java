package com.good.patterns.challenges.food2door;

public class OrderProcessor {

    private final CompaniesRepository companiesRepository;

    public OrderProcessor(CompaniesRepository companiesRepository) {
        this.companiesRepository = companiesRepository;
    }


    public void processOrder(OrderRequest orderRequest) {

        boolean canBuy = false;
        for (Company company : companiesRepository.getCompanyList()) {
            System.out.println("Processing order " + company.getCompanyName());
            canBuy = company.process(orderRequest);
            if (!canBuy) {
                System.out.println("Process order interrupted");
            }
        }
    }
}

