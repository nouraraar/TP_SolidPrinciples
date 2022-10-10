package com.directi.training.srp.exercise_answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDao
{
    private List<Car> _carsDb = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));


    public List<Car> findAll()
    {
        return new ArrayList<>(_carsDb);
    }

}