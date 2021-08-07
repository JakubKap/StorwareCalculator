package com.storware.logic;

import com.storware.utilies.CalculatorOperation;

import java.util.LinkedHashMap;
import java.util.Map;

public class Calculator {
    private int appliedNumber;
    private Map<CalculatorOperation, Integer> operationsToCalculate;

    public Calculator() {
        appliedNumber = 0;
        operationsToCalculate = new LinkedHashMap<>();
    }

    public void addOperationsToCalculate(CalculatorOperation calculatorOperation,
                                         Integer valueToCalculate){
        operationsToCalculate.put(calculatorOperation, valueToCalculate);
    }

    public void setAppliedNumber(int appliedNumber) {
        this.appliedNumber = appliedNumber;
    }

    public int generateFinalResult(){
        for (Map.Entry<CalculatorOperation, Integer> operationAndNumber : operationsToCalculate.entrySet()) {

            CalculatorOperation calculatorOperation = operationAndNumber.getKey();
            Integer number = operationAndNumber.getValue();

            executeOperationOnAppliedNumber(calculatorOperation, number);
        }

        System.out.println("Output = " + appliedNumber);
        return appliedNumber;
    }

    private void executeOperationOnAppliedNumber(CalculatorOperation calculatorOperation, Integer number){
        switch(calculatorOperation){
            case ADD:
                appliedNumber = sum(appliedNumber, number);
                break;
            case SUBTRACT:
                appliedNumber = subtract(appliedNumber, number);
                break;
            case MULTIPLY:
                appliedNumber = multiply(appliedNumber, number);
                break;
            case DIVIDE:
                appliedNumber = divide(appliedNumber, number);
                break;
            case EXPONENTIATION:
                appliedNumber = pow(appliedNumber, number);
                break;
            case MODULO:
                appliedNumber = mod(appliedNumber, number);
                break;
        }
    }

    public int sum(int firstValue, int secondValue){
        return firstValue + secondValue;
    }

    public int subtract(int firstValue, int secondValue){
        return firstValue - secondValue;
    }

    public int multiply(int firstValue, int secondValue){
        return firstValue * secondValue;
    }

    public int divide(int firstValue, int secondValue){
        return firstValue / secondValue;
    }

    public int pow(int firstValue, int secondValue){
        return (int) Math.pow(firstValue, secondValue);
    }

    public int mod(int firstValue, int secondValue){
        return firstValue % secondValue;
    }
}
