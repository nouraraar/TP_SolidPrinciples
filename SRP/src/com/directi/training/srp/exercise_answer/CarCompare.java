package com.directi.training.srp.exercise_answer;

public class CarCompare
{

    public Car getBestCar(List<Car> cars)
    {
        Car bestCar = null;
        for (Car car : cars ) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}