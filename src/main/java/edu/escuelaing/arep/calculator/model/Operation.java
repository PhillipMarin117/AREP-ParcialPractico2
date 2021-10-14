package edu.escuelaing.arep.calculator.model;

public class Operation {

    private String operation;
    private Double input;
    private String output;

    public Operation() {}

    public Operation(String operation, Double input, String output) {
        this.operation = operation;
        this.input = input;
        this.output = output;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}