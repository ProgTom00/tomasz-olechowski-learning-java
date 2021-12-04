package com.learning.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given

        Country Poland = new Country(new BigDecimal("52345678901234567897"));
        Country Spain = new Country(new BigDecimal("62345678901234567867"));
        Country Hungary = new Country(new BigDecimal("62345678901234567867"));
        Country Belgium = new Country(new BigDecimal("62345674901254567867"));

        Continent europe = new Continent();

        europe.addCountry(Poland);
        europe.addCountry(Spain);
        europe.addCountry(Hungary);
        europe.addCountry(Belgium);

        Country Russia = new Country(new BigDecimal("2345678901234567867"));
        Country China = new Country(new BigDecimal("12345678901234567867"));
        Country Japan = new Country(new BigDecimal("234567890123456786723"));
        Country Indonesia = new Country(new BigDecimal("23445678901234567867"));

        Continent asia = new Continent();

        asia.addCountry(Russia);
        asia.addCountry(China);
        asia.addCountry(Japan);
        asia.addCountry(Indonesia);

        Country Chile = new Country(new BigDecimal("2345678901234567867"));
        Country Brazil = new Country(new BigDecimal("234567890123456786732"));
        Country Argentina = new Country(new BigDecimal("234567890123456786754"));
        Country Columbia = new Country(new BigDecimal("234567890123456786754"));

        Continent southAmerica = new Continent();

        southAmerica.addCountry(Chile);
        southAmerica.addCountry(Brazil);
        southAmerica.addCountry(Argentina);
        southAmerica.addCountry(Columbia);

        Country Nigeria = new Country(new BigDecimal("234567890123456786712"));
        Country Egypt = new Country(new BigDecimal("234567890123456786789"));
        Country Morocco = new Country(new BigDecimal("2345678901234567867323"));
        Country Angola = new Country(new BigDecimal("2345678901234567867432"));

        Continent africa = new Continent();

        africa.addCountry(Nigeria);
        africa.addCountry(Egypt);
        africa.addCountry(Morocco);
        africa.addCountry(Angola);

        World world = new World();

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);
        world.addContinent(africa);

        // When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        // Then
        BigDecimal expectedTotalPopulation = new BigDecimal("6378630570419772998185");
        Assertions.assertEquals(expectedTotalPopulation, totalPopulation);


    }


}
