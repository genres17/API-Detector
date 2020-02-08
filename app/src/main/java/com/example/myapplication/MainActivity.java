package com.example.myapplication;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final TextView text = findViewById(R.id.text);
        final String str;
        final int level = Build.VERSION.SDK_INT;
        final int color;
        if (level >= 26) {
            color = Color.GREEN;
            str = "";
        } else if ((level < 26) & (level >= 16)) {
            color = Color.YELLOW;
            str  = "";

        } else {
            color = Color.RED;
            str = "(API 等级较低)";
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("API level: " + level + " "+str);
                text.setTextColor(color);
            }
        });
    }
}
