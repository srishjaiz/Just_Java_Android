package com.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int q = 0;


    public void submitOrder(View view) {
        displayPrice(q * 15);
    }
    public void minusQuantity(View view) {
        disChangeQ(--q);
    }
    public void plusQuantity(View view) {
        disChangeQ(++q);
    }

    private void disChangeQ(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.changeQ);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}