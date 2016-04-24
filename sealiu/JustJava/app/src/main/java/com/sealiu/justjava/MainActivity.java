package com.sealiu.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int numberOfCoffee = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTotalPrice("Nice day!\nBuy a cup of coffee!");
    }

    public void submitOrder(View view) {
        if (numberOfCoffee == 0) {
            displayTotalPrice("You should order at least one cup of coffee!");
        }else {
            double price = numberOfCoffee * 5;
            String priceMessage = "Total: " + NumberFormat.getCurrencyInstance().format(price) + "\nThank you!";
            displayTotalPrice(priceMessage);
        }
    }

    public void displayTotalPrice(String priceMessage){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(priceMessage);
    }

    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(number));
    }


    public void increment(View view) {
        display(++numberOfCoffee);
    }

    public void decrement(View view) {
        numberOfCoffee--;
        if (numberOfCoffee < 0) {
            Toast.makeText(this, "Quantity can't be minus!", Toast.LENGTH_SHORT).show();
            numberOfCoffee = 0;
        }
        display(numberOfCoffee);
    }
}
