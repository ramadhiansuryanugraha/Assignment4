package com.example.unj.cs.hw4.coffeeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description_Activity extends AppCompatActivity {
    TextView titleDesc;
    TextView descDesc;
    ImageView imageDesc;
    TextView fullDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        getSupportActionBar().hide();

        imageDesc = findViewById(R.id.imagedesc);
        titleDesc = findViewById(R.id.desctittle);
        descDesc = findViewById(R.id.descdesc);
        fullDesc = findViewById(R.id.fulldesc);


        Intent intent = getIntent();
        String title = intent.getExtras().getString("titleDescription");
        String desc = intent.getExtras().getString("descDescription");
        int image = intent.getExtras().getInt("imageDescription");
        String fdesc = intent.getExtras().getString("fullDescription");
        titleDesc.setText(title);
        descDesc.setText(desc);
        fullDesc.setText(fdesc);
        imageDesc.setImageResource(image);


    }
}
