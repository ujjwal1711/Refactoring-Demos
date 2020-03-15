package com.refactoring.tutorial.movierenter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The rental class represents a customer renting a movie.
 */
@AllArgsConstructor
@Getter
public class Rental {
    private Movie movie;
    private int noOfDaysRented;
}