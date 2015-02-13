package com.thoughtworks.videorental.domain;

import com.thoughtworks.videorental.chargingstrategy.ChargingStrategy;
import com.thoughtworks.videorental.chargingstrategy.NewMovieChargingStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NewMovieChargingStrategyTest {

    @Test
    public void shouldGetChargeFor2Days(){
        ChargingStrategy chargingStrategy = new NewMovieChargingStrategy();

        assertEquals(3.0, chargingStrategy.calculateRental(2),0.0);

    }

    @Test
    public void shouldGetChargeFor5Days(){
        ChargingStrategy chargingStrategy = new NewMovieChargingStrategy();

        assertEquals(9.0, chargingStrategy.calculateRental(5),0.0);

    }

}
