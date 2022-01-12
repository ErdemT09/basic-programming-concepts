package com.spiralgo;

public class Robot {

    int age;
    String name;

    Robot(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void speak()
    {
        System.out.println(getStatement());
    }
    
    private String getStatement()
    {
        String statement = String.format("I'm a robot: [age: %s, name: %s]", age, name);
        return statement;
    }
}

