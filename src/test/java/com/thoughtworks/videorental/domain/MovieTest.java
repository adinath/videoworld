package com.thoughtworks.videorental.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldBeAbleToAddNewMovie(){
        Movie newMovie = new Movie("Up in the Air", MovieType.NEW);
        assertTrue(newMovie.isNew());
    }

    @Test
    public void shouldBeAbleToAddClassicMovie(){
        Movie newMovie = new Movie("Up in the Air", MovieType.CLASSIC);
        assertTrue(newMovie.isClassic());
    }
}