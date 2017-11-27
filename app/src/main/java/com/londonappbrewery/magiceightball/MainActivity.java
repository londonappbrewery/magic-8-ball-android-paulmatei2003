package com.londonappbrewery.magiceightball;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button someButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//!!!!all added code goes after the default lines, not before
        someButton = findViewById(R.id.askButton);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int [] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        someButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumGen = new Random();
                int num = randomNumGen.nextInt(4);
                ballDisplay.setImageResource(ballArray[num]);
           }
        });
    }
}
