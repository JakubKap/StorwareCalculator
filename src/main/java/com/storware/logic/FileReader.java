package com.storware.logic;

import com.storware.utilies.CalculatorOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {
    private static final String LINE_SEPARATOR = "\\s+";
    private static final String FILE_NAME = "inputData.txt";

    private String filePath;
    private Calculator calculator;

    public FileReader(Calculator calculator) {
        filePath = prepareInputFileAbsolutePath();
        this.calculator = calculator;
    }

    public void readDataFromFile(){
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(LINE_SEPARATOR);
                CalculatorOperation calculatorOperation =
                        CalculatorOperation.getAccordingOperationToKeyword(values[0]);
                int value = Integer.parseInt(values[1]);

                if(isItAnApplyInstruction(calculatorOperation))
                    calculator.setAppliedNumber(value);
                    else
                        calculator.addOperationsToCalculate(calculatorOperation, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isItAnApplyInstruction(CalculatorOperation calculatorOperation){
        return calculatorOperation == CalculatorOperation.APPLY;
    }

    private String prepareInputFileAbsolutePath(){
        return new File(FILE_NAME).getAbsolutePath();
    }

}
