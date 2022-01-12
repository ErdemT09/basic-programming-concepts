package com.spiralgo;

public class App 
{
    public static void main( String[] args )
    {
        int age = 18;
        String name = "Shannon";
        Robot robot = new Robot(age, name);
        robot.speak();
    }
}
