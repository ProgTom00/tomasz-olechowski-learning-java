package com.good.patterns.challenges;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderProcessor {

    final private InformationService informationService;
    final private OrderService orderService;
    final private OrderRepository orderRepository;


    public OrderProcessor(final InformationService informationService, final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;

    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean buy = orderService.order(orderRequest.getUser(), orderRequest.getItem());
        log.info("Checking if customer has enough money to buy " + buy);

        if (buy) {
            informationService.inform(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getDateOfSale());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), true, orderRequest.getItem().getPrice());
        } else {
            log.info(orderRequest.getUser().getUserName() + " has insufficient funds");
            return new OrderDto(orderRequest.getUser(), false, 0);
        }
    }
}
