package com.directi.training.srp.exercise_answer;

import java.util.Arrays;
import java.util.List;

public class CarManager
{   
    private final CarDao carDao;
    private final CarFormatter carFormatter;
    private final CarCompare carCompare;

    public CarManager(CarDao carDao, CarFormatter carFormatter, CarCompare carCompare)
    {
        this.carDao = carDao;
        this.carFormatter = carFormatter;
        this.carCompare = carCompare;
    }


    public Car getFromDb(final String carId)
    {
        for (Car car : carDao.findAll()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
    
    public String getCarsNames()
    {
        return carFormatter.getCarsNames(carDao.findAll());
    }

    public Car getBestCar()
    {
        return carCompare.getBestCar(carDao.findAll());
    }


}
