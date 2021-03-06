package com.thoughtworks.videorental.domain;

import lombok.EqualsAndHashCode;

import java.security.Principal;
import java.util.Set;

@EqualsAndHashCode
public class Customer implements Principal {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String statement(final Set<Rental> newRentals) {
        String result = "Rental Record for " + getName() + "\n";

        double totalAmount = 0;
        for (Rental rental : newRentals) {
            // show figures for this rental
            result += "  " + rental.getMovie().getTitle() + "  -  $"
                    + String.valueOf(rental.getCharge()) + "\n";

            totalAmount += rental.getCharge();
        }

        // add footer lines
        result += "Amount charged is $" + String.valueOf(totalAmount);
        return result;
    }
}
