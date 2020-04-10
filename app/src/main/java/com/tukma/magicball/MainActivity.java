package com.tukma.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shakeButton = findViewById(R.id.btn_shakeit);

        final ImageView magicBall = findViewById(R.id.iv_ball);

        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomAnswerGenerator = new Random();

                int answer = randomAnswerGenerator.nextInt(5);

                magicBall.setImageResource(ballArray[answer]);
            }
        });

    }
}
