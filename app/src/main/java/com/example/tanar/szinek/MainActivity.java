package com.example.tanar.szinek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private Button gomb;
    private TextView szin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gomb = (Button) findViewById(R.id.button);
        szin = (TextView) findViewById(R.id.textView);


        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int r = 0, g = 0, b = 0;
                r = rand.nextInt(255);
                g = rand.nextInt(255);
                b = rand.nextInt(255);

                getWindow().getDecorView().setBackgroundColor(rgb(r,g,b));
                szin.setText("(" + r + "," + g + "," + b + ")");
            }
        });
    }
}
