package com.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class CalcController {
    Calculator calculator = new Calculator();
    @FXML
    private TextField input;

    @FXML
    protected void onNumButtonClick(ActionEvent event) {
        String num = ((Button)event.getSource()).getText();
        String oldText = input.getText();
        input.setText(oldText+num);
    }
    @FXML
    protected void onCButtonClick() {
        input.setText("");
    }
    @FXML
    protected void onPlusButtonClick() {
        double n = Double.parseDouble(input.getText());
        calculator.setOperand1(n);
        calculator.setOperator('+');
        input.setText("");
    }
    @FXML
    protected void onMinusButtonClick() {
        String num = input.getText();
        double n = Double.parseDouble(num);
        calculator.setOperand1(n);
        calculator.setOperator('-');
        input.setText("");
    }
    @FXML
    protected void onMultiplicationButtonClick() {
        String num = input.getText();
        double n = Double.parseDouble(num);
        calculator.setOperand1(n);
        calculator.setOperator('*');
        input.setText("");
    }
    @FXML
    protected void onDivisionButtonClick() {
        String num = input.getText();
        double n = Double.parseDouble(num);
        calculator.setOperand1(n);
        calculator.setOperator('/');
        input.setText("");
    }
    @FXML
    protected void onEqualButtonClick() throws Exception{
        String num = input.getText();
        try {
            double n = Double.parseDouble(num);
            calculator.setOperand2(n);
            calculator.calculate();
            String result = String.valueOf(calculator.getResult());
            input.setText(result);
        } catch (DivisionByZeroException e) {
            input.setText("ERROR");
            System.out.println(e.toString());
        }
    }
}