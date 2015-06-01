package com.jkorang.forceofwilllifecounter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    //Top buttons
    Button topUp500;
    Button topUp100;
    Button topUp1000;
    Button topDown100;
    Button topDown500;
    Button topDown1000;

    //Bot buttons
    Button botUp500;
    Button botUp100;
    Button botUp1000;
    Button botDown100;
    Button botDown500;
    Button botDown1000;

    //Top Life
    TextView topLife;

    //Bot Life
    TextView botLife;

    //Option Buttons
    ImageButton resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Top Buttons
        topUp100 = (Button) findViewById(R.id.TopUp100);
        topUp500 = (Button) findViewById(R.id.TopUp500);
        topUp1000 = (Button) findViewById(R.id.TopUp1000);
        topDown100 = (Button) findViewById(R.id.TopDown100);
        topDown500 = (Button) findViewById(R.id.TopDown500);
        topDown1000 = (Button) findViewById(R.id.TopDown1000);

        //Bot Buttons
        botUp100 = (Button) findViewById(R.id.botUp100);
        botUp500 = (Button) findViewById(R.id.botUp500);
        botUp1000 = (Button) findViewById(R.id.botUp1000);
        botDown100 = (Button) findViewById(R.id.botDown100);
        botDown500 = (Button) findViewById(R.id.botDown500);
        botDown1000 = (Button) findViewById(R.id.botDown1000);

        //Top Life
        topLife = (TextView) findViewById(R.id.topHP);

        //Bot Life
        botLife = (TextView) findViewById(R.id.botHP);

        //Option Buttons
        resetButton = (ImageButton) findViewById(R.id.resetScores);

        //Click Listeners for Days
        topUp100.setOnClickListener(this);
        topUp500.setOnClickListener(this);
        topUp1000.setOnClickListener(this);
        topDown100.setOnClickListener(this);
        topDown500.setOnClickListener(this);
        topDown1000.setOnClickListener(this);
        botUp100.setOnClickListener(this);
        botUp500.setOnClickListener(this);
        botUp1000.setOnClickListener(this);
        botDown100.setOnClickListener(this);
        botDown500.setOnClickListener(this);
        botDown1000.setOnClickListener(this);
        resetButton.setOnClickListener(this);

        resetHP();

    }

    public void resetHP() {
        topLife.setText("4000");
        botLife.setText("4000");
    }

    @Override
    public void onClick(View v) {
        int topLifeInt = Integer.parseInt(topLife.getText().toString());
        int botLifeInt = Integer.parseInt(botLife.getText().toString());

        switch (v.getId()) {

            //Top Case
            case R.id.TopUp100:
                topLife.setText(String.valueOf(topLifeInt + 100));
                break;
            case R.id.TopUp500:
                topLife.setText(String.valueOf(topLifeInt + 500));
                break;
            case R.id.TopUp1000:
                topLife.setText(String.valueOf(topLifeInt + 1000));
                break;
            case R.id.TopDown100:
                topLife.setText(String.valueOf(topLifeInt - 100));
                break;
            case R.id.TopDown500:
                topLife.setText(String.valueOf(topLifeInt - 500));
                break;
            case R.id.TopDown1000:
                topLife.setText(String.valueOf(topLifeInt - 1000));
                break;

            //Bot Case
            case R.id.botUp100:
                botLife.setText(String.valueOf(botLifeInt + 100));
                break;
            case R.id.botUp500:
                botLife.setText(String.valueOf(botLifeInt + 500));
                break;
            case R.id.botUp1000:
                botLife.setText(String.valueOf(botLifeInt + 1000));
                break;
            case R.id.botDown100:
                botLife.setText(String.valueOf(botLifeInt - 100));
                break;
            case R.id.botDown500:
                botLife.setText(String.valueOf(botLifeInt - 500));
                break;
            case R.id.botDown1000:
                botLife.setText(String.valueOf(botLifeInt - 1000));
                break;

            //Options
            case R.id.resetScores:
                resetHP();
                break;

        }
    }
}
