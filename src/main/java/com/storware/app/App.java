package com.storware.app;

import com.storware.logic.Calculator;
import com.storware.logic.FileReader;

public class App
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        new FileReader(calculator).readDataFromFile();

        calculator.generateFinalResult();
    }
}
