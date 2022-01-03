package com.good.patterns.challenges;

import java.time.LocalDate;

interface InformationService {
    void inform(User user, Item item, LocalDate dateOfSale);
}
