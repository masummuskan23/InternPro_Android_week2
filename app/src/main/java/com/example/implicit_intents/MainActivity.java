package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import android.content.Intent;
import android.net.Uri;

import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openWeb = findViewById(R.id.web_button);
        Button dialPhone = findViewById(R.id.phone_button);


        openWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        dialPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone_Number = "tel:+917295882313";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(phone_Number));
                startActivity(intent);
            }
        });
    }
}
