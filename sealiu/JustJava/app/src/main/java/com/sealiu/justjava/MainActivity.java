package com.sealiu.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

import javax.xml.datatype.Duration;


public class MainActivity extends AppCompatActivity {

    int numberOfCoffee = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        EditText editText = (EditText) findViewById(R.id.customer_name_edit_text);
        CheckBox creamCheckBox = (CheckBox) findViewById(R.id.need_cream_checkbox);
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.need_chocolate_checkbox);
        String name = editText.getText().toString();
        boolean isNeedCream = creamCheckBox.isChecked();
        boolean isNeedChocolate = chocolateCheckBox.isChecked();

        if (numberOfCoffee == 0) {
            String toast = "Hi, " + name + ". You should order at least one cup of coffee!";
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }else {
            double price = 5;
            if (isNeedCream) price += 1;
            if (isNeedChocolate) price += 2;
            String priceMessage = "Hi, " + name + "!\n";
            priceMessage += "Quantity: " + numberOfCoffee + ".\n";
            priceMessage += "Need whipped cream? " + isNeedCream + ".\n";
            priceMessage += "Need chocolate? " + isNeedChocolate + ".\n";
            priceMessage += "Total: " + NumberFormat.getCurrencyInstance().format(price * numberOfCoffee);

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Coffee Order");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }

    // display quantity
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
