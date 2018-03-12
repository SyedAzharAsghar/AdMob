package com.example.azhar.admob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Button bann,inter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bann = (Button)findViewById(R.id.Banner);
        inter =(Button)findViewById(R.id.Inter);

        bann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,MainActivity.class);
                startActivity(intent);
            }
        });

        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this,IntersitialActivity.class);
                startActivity(intent);
            }
        });
    }
}
