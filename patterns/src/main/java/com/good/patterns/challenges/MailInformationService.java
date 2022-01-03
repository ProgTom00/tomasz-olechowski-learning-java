package com.good.patterns.challenges;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class MailInformationService implements InformationService{


    @Override
    public void inform(User user, Item item, LocalDate dateOfSale) {
            log.info("Good morning, " + user.getUserName() + " you have bought " + item.getName());
            log.info("Date of purchase " + dateOfSale.toString());
            log.info("Price of the product " + item.getPrice() + " zl");

        }

    }

