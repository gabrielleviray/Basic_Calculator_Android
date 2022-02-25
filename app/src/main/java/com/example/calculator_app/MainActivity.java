package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Create Method for Add Operation
    public void Addition(View view){

        // Variable Declarations
        EditText textOne = (EditText)findViewById(R.id.editTextNumber);
        EditText textTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText textThree = (EditText)findViewById(R.id.editTextNumber3);


        int numOne = Integer.parseInt(textOne.getText().toString());
        int numTwo = Integer.parseInt(textTwo.getText().toString());
        int result = numOne + numTwo;

        textThree.setText("Addition result: " + result);
    }

    // Create Method for Subtraction Operation
    public void Subtract(View view){

        // Variable Declarations
        EditText textOne = (EditText)findViewById(R.id.editTextNumber);
        EditText textTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText textThree = (EditText)findViewById(R.id.editTextNumber3);


        int numOne = Integer.parseInt(textOne.getText().toString());
        int numTwo = Integer.parseInt(textTwo.getText().toString());
        int result = numOne - numTwo;

        textThree.setText("Subtraction result: " + result);
    }

    // Create Method for Multiplication Operation
    public void Multiplication(View view){

        // Variable Declarations
        EditText textOne = (EditText)findViewById(R.id.editTextNumber);
        EditText textTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText textThree = (EditText)findViewById(R.id.editTextNumber3);


        int numOne = Integer.parseInt(textOne.getText().toString());
        int numTwo = Integer.parseInt(textTwo.getText().toString());
        int result = numOne * numTwo;

        textThree.setText("Multiplication result: " + result);
    }

    // Create Method for Division Operation
    public void Division(View view){

        // Variable Declarations
        EditText textOne = (EditText)findViewById(R.id.editTextNumber);
        EditText textTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText textThree = (EditText)findViewById(R.id.editTextNumber3);


        int numOne = Integer.parseInt(textOne.getText().toString());
        int numTwo = Integer.parseInt(textTwo.getText().toString());
        int result = numOne/numTwo;

        textThree.setText("Division result: " + result);
    }


}