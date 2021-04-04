package com.webcrab.avurudunakath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Back = findViewById(R.id.detailsbutton);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent HOME = new Intent(MainActivity.this,NekathDetails.class);
                startActivity(HOME);
            }
        });
    }
}