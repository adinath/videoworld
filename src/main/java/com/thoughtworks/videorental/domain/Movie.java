package com.thoughtworks.videorental.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Movie {
    private MovieType type;
    private String title;

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.type = movieType;
    }

    public Movie(String title) {
        this.title = title;
        this.type = MovieType.NORMAL;
    }

    public String getTitle() {
        return title;
    }

    public boolean isNew() {
        return this.type == MovieType.NEW;
    }

    public boolean isClassic() {
        return this.type == MovieType.CLASSIC;
    }

    public MovieType getType() {
        return type;
    }
}
