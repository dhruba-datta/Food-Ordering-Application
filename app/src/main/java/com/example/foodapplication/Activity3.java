package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView listView,priceView;
    String list_choice;
    Double price_rupees,price_usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_rupees = bundle.getDouble("price");

        listView.setText(list_choice);
        priceView.setText("Total = "+price_rupees.toString()+" ₹");





    }
}