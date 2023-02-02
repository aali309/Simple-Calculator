package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView display;
    Button pl_btn;
    Button div_btn;
    Button min_btn;
    Button mul_btn;
    Button cl_btn;
    Button eq_btn;
    Button one_btn;
    Button two_btn;
    Button three_btn;
    Button four_btn;
    Button five_btn;
    Button six_btn;
    Button seven_btn;
    Button eight_btn;
    Button nine_btn;
    Button ze_btn;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.displayText);

        ze_btn = findViewById(R.id.buttonZero);
        ze_btn.setOnClickListener(this);

        one_btn = findViewById(R.id.buttonOne);
        one_btn.setOnClickListener(this);

        two_btn = findViewById(R.id.buttonTwo);
        two_btn.setOnClickListener(this);

        three_btn = findViewById(R.id.buttonThree);
        three_btn.setOnClickListener(this);

        four_btn = findViewById(R.id.buttonFour);
        four_btn.setOnClickListener(this);

        five_btn = findViewById(R.id.buttonFive);
        five_btn.setOnClickListener(this);

        six_btn = findViewById(R.id.buttonSix);
        six_btn.setOnClickListener(this);

        seven_btn = findViewById(R.id.buttonSeven);
        seven_btn.setOnClickListener(this);

        eight_btn = findViewById(R.id.buttonEight);
        eight_btn.setOnClickListener(this);

        nine_btn = findViewById(R.id.buttonNine);
        nine_btn.setOnClickListener(this);

        pl_btn = findViewById(R.id.buttonPlus);
        pl_btn.setOnClickListener(this);

        div_btn = findViewById(R.id.buttonDivide);
        div_btn.setOnClickListener(this);

        min_btn = findViewById(R.id.buttonMinus);
        min_btn.setOnClickListener(this);

        mul_btn = findViewById(R.id.buttonMultiply);
        mul_btn.setOnClickListener(this);

        cl_btn = findViewById(R.id.buttonClear);
        cl_btn.setOnClickListener(this);

        eq_btn = findViewById(R.id.buttonEqual);
        eq_btn.setOnClickListener(this);

        calculator = new Calculator();

    }
    @Override
    public void onClick (View view) {
        int id = view.getId();
        String value;
        int result;

        Log.d("button id clicked", "Button with ID " + id + " clicked");

        display.setTextColor(ContextCompat.getColor(this, R.color.white));

        if (display.getText().toString().contains("=") || id == R.id.buttonClear){
            calculator.characters.clear();
            display.setText("");
        }
        if (id == R.id.buttonZero){
            value = ze_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonOne){
            value = one_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonTwo){
            value = two_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonThree){
            value = three_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonFour){
            value = four_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if (id == R.id.buttonFive){
            value = five_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonSix){
            value = six_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonSeven){
            value = seven_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonEight){
            value = eight_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonNine){
            value = nine_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonPlus){
            value = pl_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if (id == R.id.buttonDivide){
            value = div_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if (id == R.id.buttonMinus){
            value = min_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if (id == R.id.buttonMultiply){
            value = mul_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        }else if(id == R.id.buttonEqual){
            value = eq_btn.getText().toString();
            result = calculator.evaluateInput();
            display.append(" " + value);

            if(result == -999) {
                display.append(" Error!");
                display.setTextColor(ContextCompat.getColor(this,R.color.purple_200));
            }else{
                display.append(" " + result);
            }
        }
    }
}