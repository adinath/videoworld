package com.thoughtworks.videorental.chargingstrategy;

import com.thoughtworks.videorental.domain.MovieType;


public class ChargingStrategyFactory {

    public static final double DAILY_RENT = 1.0;

    public static ChargingStrategy getStrategy(MovieType movieType) {
        switch (movieType){
            case NEW: return new NewMovieChargingStrategy();
            case CLASSIC: return new ClassicMovieChargingStrategy();
            default: return new ChargingStrategy() {
                @Override
                public double calculateRental(int rentedDays) {
                    return rentedDays * DAILY_RENT;
                }
            };
        }
    }
}
