package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView player;
    ImageView cpu;
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
        player = (ImageView) findViewById(R.id.player);
        cpu = (ImageView) findViewById(R.id.cpu);
        result = (TextView)findViewById(R.id.result);
        player2 = (TextView)findViewById(R.id.player2);
        cpu2 = (TextView)findViewById(R.id.cpu2);
        playerpoint = 0;
        cpupoint = 0;
    }

    public void goo(View view) {
        //player.setText("Your hand is ROCK.");
        player.setImageResource(R.drawable.goo2);
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            //cpu.setText("The enemy's hand is ROCK.");
            cpu.setImageResource(R.drawable.goo2);
            result.setText("You are draw.");

        }else if(number==1){

            //cpu.setText("The enemy's hand is SCISSOR.");
            cpu.setImageResource(R.drawable.choki2);
            result.setText("You win.");
            playerpoint = playerpoint + 1;
            player2.setText("Your point is"+playerpoint);
            if (playerpoint >=5){
                Intent intent = new Intent(this,WinActivity.class);
                startActivity(intent);
            }

        }else if(number==2){

            //cpu.setText("The enemy's hand is PAPER.");
            cpu.setImageResource(R.drawable.paa2);
            result.setText("You lose.");
            cpupoint = cpupoint + 1;
            cpu2.setText("The enemy's point is"+cpupoint);
            if (cpupoint >= 5){
                Intent intent = new Intent(this,DefeatActivity.class);
                startActivity(intent);
            }

        }
    }

    public void choki(View view) {
        //player.setText("Your hand is SCISSOR.");
        player.setImageResource(R.drawable.choki2);
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            //cpu.setText("The enemy's hand is ROCK.");
            cpu.setImageResource(R.drawable.goo2);
            result.setText("You lose.");
            cpupoint = cpupoint + 1;
            cpu2.setText("The enemy's point is"+cpupoint);
            if (cpupoint >= 5){
                Intent intent = new Intent(this,DefeatActivity.class);
                startActivity(intent);
            }

        }else if(number==1){

            //cpu.setText("The enemy's hand is SCISSOR.");
            cpu.setImageResource(R.drawable.choki2);
            result.setText("You are draw.");

        }else if(number==2){

            //cpu.setText("The enemy's hand is PAPER.");
            cpu.setImageResource(R.drawable.paa2);
            result.setText("You win.");
            playerpoint = playerpoint + 1;
            player2.setText("Your point is"+playerpoint);
            if (playerpoint >=5){
                Intent intent = new Intent(this,WinActivity.class);
                startActivity(intent);
            }

        }
    }

    public void paa(View view) {
        //player.setText("Your hand is PAPER.");
        player.setImageResource(R.drawable.paa2);
        Random random = new Random();
        number = random.nextInt(3);

        if(number==0){

            //cpu.setText("The enemy's hand is ROCK.");
            cpu.setImageResource(R.drawable.goo2);
            result.setText("You win.");
            playerpoint = playerpoint + 1;
            player2.setText("Your point is"+playerpoint);
            if (playerpoint >=5){
                Intent intent = new Intent(this,WinActivity.class);
                startActivity(intent);
            }

        }else if(number==1){

            //cpu.setText("The enemy's hand is SCISSOR.");
            cpu.setImageResource(R.drawable.choki2);
            result.setText("You lose.");
            cpupoint = cpupoint + 1;
            cpu2.setText("The enemy's point is"+cpupoint);
            if (cpupoint >= 5){
                Intent intent = new Intent(this,DefeatActivity.class);
                startActivity(intent);
            }

        }else if(number==2){

            //cpu.setText("The enemy's hand is PAPER.");
            cpu.setImageResource(R.drawable.paa2);
            result.setText("You are draw.");

        }
    }

}
