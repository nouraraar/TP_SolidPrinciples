package com.directi.training.srp.exercise;

public class Car
{
    private final String id;
    private final String model;
    private final String brand;

    public Car(String id, String model, String brand)
    {
        id = id;
        model = model;
        brand = brand;
    }

    public String getId()
    {
        return id;
    }

    public String getModel()
    {
        return model;
    }

    public String getBrand()
    {
        return brand;
    }
}
