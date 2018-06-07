package com.example.jokeviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class joke_viewer extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_viewer);

        Intent intent = getIntent();
        String value = intent.getStringExtra("joke");
        textView= (TextView) findViewById(R.id.textView);
        textView.setText(value);
        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
    }
}
