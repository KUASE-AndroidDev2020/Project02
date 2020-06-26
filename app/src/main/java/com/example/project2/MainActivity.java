package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView player;
    TextView cpu;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = (TextView)findViewById(R.id.player);
        cpu = (TextView)findViewById(R.id.cpu);
    }

    public void goo(View view) {
        player.setText("Your hand is ROCK.");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            cpu.setText("The enemy's hand is ROCK.");

        }else if(number==1){

            cpu.setText("The enemy's hand is SCISSOR");

        }else if(number==2){

            cpu.setText("The enemy's hand is PAPER");

        }
    }

    public void choki(View view) {
        player.setText("Your hand is SCISSOR.");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            cpu.setText("The enemy's hand is ROCK.");

        }else if(number==1){

            cpu.setText("The enemy's hand is SCISSOR");

        }else if(number==2){

            cpu.setText("The enemy's hand is PAPER");

        }
    }

    public void paa(View view) {
        player.setText("Your hand is PAPER");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            cpu.setText("The enemy's hand is ROCK.");

        }else if(number==1){

            cpu.setText("The enemy's hand is SCISSOR");

        }else if(number==2){

            cpu.setText("The enemy's hand is PAPER");

        }
    }
}
