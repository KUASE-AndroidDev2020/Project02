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
    TextView result;
    TextView player2;
    TextView cpu2;
    int number;
    int playerpoint;
    int cpupoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = (TextView)findViewById(R.id.player);
        cpu = (TextView)findViewById(R.id.cpu);
        result = (TextView)findViewById(R.id.result);
        player2 = (TextView)findViewById(R.id.player2);
        cpu2 = (TextView)findViewById(R.id.cpu2);
        playerpoint = 0;
        cpupoint = 0;
    }

    public void goo(View view) {
        player.setText("Your hand is ROCK.");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            cpu.setText("The enemy's hand is ROCK.");
            result.setText("You are draw.");

        }else if(number==1){

            cpu.setText("The enemy's hand is SCISSOR.");
            result.setText("You win.");
            playerpoint = playerpoint + 1;
            player2.setText("Your point is"+playerpoint);

        }else if(number==2){

            cpu.setText("The enemy's hand is PAPER.");
            result.setText("you defeat.");
            cpupoint = cpupoint + 1;
            cpu2.setText("The enemy's point is"+cpupoint);

        }
    }

    public void choki(View view) {
        player.setText("Your hand is SCISSOR.");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            cpu.setText("The enemy's hand is ROCK.");
            result.setText("you defeat.");
            cpupoint = cpupoint + 1;
            cpu2.setText("The enemy's point is"+cpupoint);

        }else if(number==1){

            cpu.setText("The enemy's hand is SCISSOR.");
            result.setText("You are draw.");

        }else if(number==2){

            cpu.setText("The enemy's hand is PAPER.");
            result.setText("You win.");
            playerpoint = playerpoint + 1;
            player2.setText("Your point is"+playerpoint);

        }
    }

    public void paa(View view) {
        player.setText("Your hand is PAPER.");
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            cpu.setText("The enemy's hand is ROCK.");
            result.setText("You win.");
            playerpoint = playerpoint + 1;
            player2.setText("Your point is"+playerpoint);

        }else if(number==1){

            cpu.setText("The enemy's hand is SCISSOR.");
            result.setText("you defeat.");
            cpupoint = cpupoint + 1;
            cpu2.setText("The enemy's point is"+cpupoint);

        }else if(number==2){

            cpu.setText("The enemy's hand is PAPER.");
            result.setText("You are draw.");

        }
    }
}
