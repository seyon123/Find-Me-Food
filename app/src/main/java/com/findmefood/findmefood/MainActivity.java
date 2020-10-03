package com.findmefood.findmefood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CardView button_takeout, button_dinein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_takeout = (CardView) findViewById(R.id.takeout_btn);
        button_takeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDietaryRestrictions();
            }
        });

        button_dinein = (CardView) findViewById(R.id.dinein_btn);
        button_dinein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDisabledMessage();
            }
        });
    }

    public void openDietaryRestrictions() {
        Intent intent = new Intent(this, FoodType.class);
        startActivity(intent);
    }

    public void displayDisabledMessage() {
        Intent intent = new Intent(this, FoodType.class);
        startActivity(intent);
    }
}