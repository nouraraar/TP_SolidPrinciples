package com.directi.training.lsp.exercise_answer;

public class ElectronicDuck implements DuckInterface
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim() 
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new RuntimeException("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }

}