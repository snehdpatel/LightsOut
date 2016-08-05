package com.example.sneh.lights_out;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Lights_out extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights_out);

        final TextView text_3x3 = (TextView) findViewById(R.id.textView2);
        final TextView text_4x4 = (TextView) findViewById(R.id.textView5);
        final TextView text_5x5 = (TextView) findViewById(R.id.textView6);
        final TextView exit = (TextView) findViewById(R.id.textView9);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        text_3x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Lights_out.this, Lights_3x3.class));
            }
        });

        text_4x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Lights_out.this, Lights_4x4.class));
            }
        });

        text_5x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Lights_out.this, Lights_5x5.class));
            }
        });
    }
}
