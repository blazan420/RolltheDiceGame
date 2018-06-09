package com.example.kjobrien.rollthedicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    SecureRandom secureRandomNumbers = new SecureRandom();

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int number6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtNumber1 = (TextView)findViewById(R.id.txtNumber1);
        TextView txtNumber2 = (TextView)findViewById(R.id.txtNumber2);
        TextView txtNumber3 = (TextView)findViewById(R.id.txtNumber3);
        TextView txtNumber4 = (TextView)findViewById(R.id.txtNumber4);
        TextView txtNumber5 = (TextView)findViewById(R.id.txtNumber5);
        TextView txtNumber6 = (TextView)findViewById(R.id.txtNumber6);

        ImageView imgDice = (findViewById(R.id.imgDice));
        ImageView imgDiceNumber1 = (findViewById(R.id.imgDiceNumber1));
        ImageView imgDiceNumber2 = (findViewById(R.id.imgDiceNumber2));
        ImageView imgDiceNumber3 = (findViewById(R.id.imgDiceNumber3));
        ImageView imgDiceNumber4 = (findViewById(R.id.imgDiceNumber4));
        ImageView imgDiceNumber5 = (findViewById(R.id.imgDiceNumber5));
        ImageView imgDiceNumber6 = (findViewById(R.id.imgDiceNumber6));

        Button btnRollTheDice = (Button)findViewById(R.id.btnRollTheDice);

        btnRollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int rollTimes = 0; rollTimes <=5000000; rollTimes++) {
                    int faceNumber = 1 + secureRandomNumbers.nextInt(6);

                }
            }
        });


    }
}
