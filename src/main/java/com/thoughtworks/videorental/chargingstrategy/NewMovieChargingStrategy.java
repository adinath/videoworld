package com.thoughtworks.videorental.chargingstrategy;

public class NewMovieChargingStrategy implements ChargingStrategy {

    public static final int BASE_PERIOD = 2;
    public static final double BASE_RENT = 3.0;
    public static final double DAILY_RENT = 2.0;

    @Override
    public double calculateRental(int rentedDays) {
        if (rentedDays <= BASE_PERIOD && rentedDays > 0) {
            return BASE_RENT;
        }
        if (rentedDays > BASE_PERIOD) {
            return BASE_RENT + rentForRemainingDays(rentedDays - BASE_PERIOD, DAILY_RENT);
        }
        return 0.0;
    }

    private double rentForRemainingDays(int extendedPeriod, double extendedDaysRent) {
        return extendedPeriod * extendedDaysRent;
    }
}
