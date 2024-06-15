
package com.example.loja_online;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Market extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
    }


    /* public void cleanInputs() {
        EditText value1 = (EditText) findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);

        value1.setText("");
        value2.setText("");

    }


    public boolean checkValues() {
        EditText value1 = (EditText) findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);

        boolean isCorrect = true;

        try {

            double valor2 = Double.parseDouble(value2.getText().toString());

        } catch (Exception e) {

            isCorrect = false;
        }


        return isCorrect;
    } */
}


