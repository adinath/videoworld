package com.thoughtworks.videorental.domain;

import com.thoughtworks.videorental.chargingstrategy.ChargingStrategy;
import com.thoughtworks.videorental.chargingstrategy.ClassicMovieChargingStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adinathshirsath on 13/02/15.
 */
public class ClassicMovieChargingStrategyTest {

    @Test
    public void shouldGetChargeFor2Days(){
        ChargingStrategy chargingStrategy = new ClassicMovieChargingStrategy();

        assertEquals(1.0, chargingStrategy.calculateRental(2),0.0);

    }

    @Test
    public void shouldGetChargeFor7Days(){
        ChargingStrategy chargingStrategy = new ClassicMovieChargingStrategy();

        assertEquals(3.0, chargingStrategy.calculateRental(7),0.0);

    }

    @Test
    public void shouldGetChargeFor9Days(){
        ChargingStrategy chargingStrategy = new ClassicMovieChargingStrategy();

        assertEquals(4.0, chargingStrategy.calculateRental(9),0.0);

    }

    @Test
    public void shouldGetNoChargeFor0Days(){
        ChargingStrategy chargingStrategy = new ClassicMovieChargingStrategy();

        assertEquals(0.0, chargingStrategy.calculateRental(0),0.0);

    }



}
