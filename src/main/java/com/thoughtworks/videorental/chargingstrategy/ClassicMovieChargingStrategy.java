package com.thoughtworks.videorental.chargingstrategy;

public class ClassicMovieChargingStrategy implements ChargingStrategy {

    public static final double DAILY_RENT = 0.5;
    public static final double BASE_RENT = 3.0;
    public static final int BASE_PERIOD = 7;

    @Override
    public double calculateRental(int rentedDays) {
        if (rentedDays == BASE_PERIOD) {
            return BASE_RENT;
        }
        if (rentedDays > BASE_PERIOD) {
            return BASE_RENT + rentForRemainingDays(rentedDays - BASE_PERIOD, DAILY_RENT);
        }

        return DAILY_RENT * rentedDays;
    }

    private double rentForRemainingDays(int extendedPeriod, double extendedDaysRent) {
        return extendedPeriod * extendedDaysRent;
    }
}
