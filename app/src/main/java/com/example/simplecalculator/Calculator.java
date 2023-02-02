package com.example.simplecalculator;
import java.util.ArrayList;


public class Calculator {
   public ArrayList<String> characters = new ArrayList<>(20);
     void push(String value) {

        characters.add(value);
   }
    public int calculate(int leftOperand, String operator, int rightOperand) {
        int result;

        switch (operator) {
            case "+":
                result = leftOperand + rightOperand;
                break;
            case "/":
                result = leftOperand / rightOperand;
                break;
            case "-":
                result = leftOperand - rightOperand;
                break;
            case "*":
                result = leftOperand * rightOperand;
                break;
            default:
                result = -999;
        }
        return result;
     }


    int evaluateInput() {
        int result = -999;
        if (characters.size() == 3) {
            for (int i = 0; i < characters.size(); i++) {
                if (i == 0) {
                    String leftChar = characters.remove(0);
                    String middleChar = characters.remove(0);
                    String rightChar = characters.remove(0);
               if (leftChar.matches(("[0-9]")) && middleChar.matches("[+\\-*/%]")&& rightChar.matches("[0-9]")) {
        int leftOperand = Integer.parseInt(leftChar);
        int rightOperand = Integer.parseInt(rightChar);
        result = calculate(leftOperand, middleChar, rightOperand);
        } else {
            return result;
        }
        } else {
                    String middleChar = characters.remove(0);
                    String rightChar = characters.remove(0);

                    if (middleChar.matches("[+\\-*/%]") && rightChar.matches("[0-9]")) {
                        int rightOperand = Integer.parseInt(rightChar);
                        result = calculate(result, middleChar, rightOperand);
                    } else {
                        return result;
                    }
                }
            }
        }
       characters.clear();
        return result;
     }

}



