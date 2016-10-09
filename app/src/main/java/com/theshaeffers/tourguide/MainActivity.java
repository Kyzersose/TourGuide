package com.theshaeffers.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dining = (TextView) findViewById(R.id.dining_text_view);
        dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Dining.class);
                startActivity(i);
            }
        });

        TextView lodging = (TextView) findViewById(R.id.lodging_text_view);
        lodging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Lodging.class);
                startActivity(i);
            }
        });

        TextView fun = (TextView) findViewById(R.id.fun_text_view);
        fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Fun.class);
                startActivity(i);
            }
        });

        TextView spooky = (TextView) findViewById(R.id.spooky_text_view);
        spooky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Spooky.class);
                startActivity(i);
            }
        });
    }
}
