package com.storware.utilies;

public enum CalculatorOperation {
    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLY("multiply"),
    DIVIDE("divide"),
    EXPONENTIATION("pow"),
    MODULO("mod"),
    APPLY("apply");

    CalculatorOperation(String accordingKeywordInFile) {
        this.accordingKeywordInFile = accordingKeywordInFile;
    }

    private String accordingKeywordInFile;

    public String getAccordingKeywordInFile() {
        return accordingKeywordInFile;
    }

    public static CalculatorOperation getAccordingOperationToKeyword(String keyword) {
        if (keyword.equals(ADD.getAccordingKeywordInFile()))
            return ADD;
        else if (keyword.equals(SUBTRACT.getAccordingKeywordInFile()))
            return SUBTRACT;
        else if (keyword.equals(MULTIPLY.getAccordingKeywordInFile()))
            return MULTIPLY;
        else if (keyword.equals(DIVIDE.getAccordingKeywordInFile()))
            return DIVIDE;
        else if (keyword.equals(EXPONENTIATION.getAccordingKeywordInFile()))
            return EXPONENTIATION;
        else if (keyword.equals(MODULO.getAccordingKeywordInFile()))
            return MODULO;
        return APPLY;
    }
}
