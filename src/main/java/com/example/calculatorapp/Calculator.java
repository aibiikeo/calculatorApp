package com.example.calculatorapp;

public class Calculator {

    private double operand1;
    private double operand2;
    private char operator;
    private double result;

    public void calculate() throws DivisionByZeroException {
        if(this.operator == '+') {
            this.result = this.operand1 + this.operand2;
        }
        else if (this.operator == '-') {
            this.result = this.operand1 - this.operand2;
        }
        else if (this.operator == '*') {
            this.result = this.operand1 * this.operand2;
        }
        else if (this.operator == '/' || this.operand2 != '0') {
            if(this.operand2 != 0)
                this.result = this.operand1 / this.operand2;

            else
                throw new DivisionByZeroException("Division by zero");
        }
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
