package com.directi.training.dip.exercise_answer;

public class DBWriter implements WriterInterface
{
    @Override
    public void write(String input)
    {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}