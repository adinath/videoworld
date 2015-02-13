package com.thoughtworks.videorental.domain;


import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;


public class RentalTest {

    Customer customer = new Customer("blah");
    LocalDateTime rentedOn = LocalDateTime.fromDateFields(new Date());

    @Test
    public void shouldGetChargeForRentedPeriod() {

        Movie movie = new Movie("blah");
        Period rentedDays = Period.days(2);
        Rental rental = new Rental(customer, movie, rentedDays, rentedOn);

        assertEquals(2.0, rental.getCharge(), 0.0);
    }

    @Test
    public void shouldGet2DaysChargeForNewMovie(){
        Rental rental = getRental(MovieType.NEW,2);

        assertEquals(3.0,rental.getCharge(),0.0);
    }

    @Test
    public void shouldGet4DaysChargeForNewMovie() {
        Rental rental = getRental(MovieType.NEW,4);
        assertEquals(7.0,rental.getCharge(),0.0);
    }

    @Test
    public void shouldGetNoChargeForZeroDayPeriod(){

        Rental rental = getRental(MovieType.NEW,0);

        assertEquals(0.0,rental.getCharge(),0.0);

    }

    @Test
    public void shouldGetChargeForClassicMovieForOneDayRental(){
        Rental rental = getRental(MovieType.CLASSIC, 1);

        assertEquals(0.5,rental.getCharge(),0.0);

    }

    @Test
    public void shouldGetChargeForClassicMovieForWeekRental(){
        Rental rental = getRental(MovieType.CLASSIC, 7);

        assertEquals(3.0,rental.getCharge(),0.0);

    }

    @Test
    public void shouldGetChargeForClassicMovieFor5DaysRental(){
        Rental rental = getRental(MovieType.CLASSIC, 5);

        assertEquals(2.5,rental.getCharge(),0.0);

    }

    @Test
    public void shouldGetChargeForClassicMovieFor8DaysRental(){
        Rental rental = getRental(MovieType.CLASSIC, 8);

        assertEquals(3.5,rental.getCharge(),0.0);

    }




    private Rental getRental(MovieType movieType, int rentedDays) {
        Movie movie = new Movie("blah", movieType);

        Period rentedPeriod = Period.days(rentedDays);

        return new Rental(customer,movie,rentedPeriod,rentedOn);
    }

}