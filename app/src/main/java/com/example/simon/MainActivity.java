package com.example.simon;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnjn;
    ArrayList <Integer> pattern;
    ArrayList <Integer> uPattern;
    Random randomValue;
    Boolean perder;
    int counter;
    int uCounter;

    String uText;
    String cText;

    TextView textComputer;
    TextView textUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializa();
        buttons();
    }

    private void inicializa(){
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btnjn = (Button) findViewById(R.id.btnjuegonuevo);

        textComputer = (TextView) findViewById(R.id.textComp);
        textUser = (TextView) findViewById(R.id.textUser);

        randomValue = new Random();

        enableButtons();
    }

    public void nextTurn (){
        computerPattern();
    }

    public void buttons(){
        btnjn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //resetButtons();
                pattern = new ArrayList<Integer>();
                randomValue = new Random();
                textComputer.setText("");
                textUser.setText("");
                computerPattern();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(1);
                userPattern();
                comparison();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(2);
                userPattern();
                comparison();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(3);
                userPattern();
                comparison();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(4);
                userPattern();
                comparison();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(5);
                userPattern();
                comparison();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(6);
                userPattern();
                comparison();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(7);
                userPattern();
                comparison();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(8);
                userPattern();
                comparison();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uPattern.add(9);
                userPattern();
                comparison();
            }
        });
    }

    public void comparison (){
        perder = false;
        uCounter = 0;
        while (uCounter < uPattern.size()){
            if (pattern.get(uCounter) == uPattern.get(uCounter)){
            }
            else {
                textUser.setText("Perdiste");
                perder = true;
            }
            uCounter = uCounter + 1;
        }
        if (!perder && uPattern.size() == pattern.size()) {
            nextTurn();
        }
    }

    public void userPattern (){
        uCounter = 0;
        uText = "";
        while (uCounter < uPattern.size()){
            uText = uText + Integer.toString(uPattern.get(uCounter)) + ", ";
            uCounter = uCounter + 1;
        }
        textUser.setText(uText);
    }

    public void computerPattern(){
        //disableButtons();
        pattern.add(randomValue.nextInt(9) + 1);
        counter = 0;
        cText = "";
        while (counter < pattern.size()){
            cText = cText + Integer.toString(pattern.get(counter)) + ", ";
            counter = counter + 1;
        }
        textComputer.setText(cText);
            /*printButton(pattern.get(counter));
            //btn1.setText("1");
            try { Thread.sleep(5000); }
            catch (InterruptedException ex) { android.util.Log.d("YourApplicationName", ex.toString()); }
            //btn1.setText("2");
             new CountDownTimer(2000, 1000) {
                public void onTick(long millisUntilFinished) {
                    // millisUntilFinished    The amount of time until finished.
                }
                public void onFinish() {
                    // When timer is finished
                    // Execute your code here

                }
            }.start();
*/

            //counter = counter+1;
            //resetButtons();
        //}
        //enableButtons();
        uPattern = new ArrayList<Integer>();
        textUser.setText("");
    }

    public void printButton(int x){
        if (x == 1){
            btn1.setText("X");
        }
        else if (x == 2){
            btn2.setText("X");
        }
        else if (x == 3){
            btn3.setText("X");
        }
        else if (x == 4){
            btn4.setText("X");
        }
        else if (x == 5){
            btn5.setText("X");
        }
        else if (x == 6){
            btn6.setText("X");
        }
        else if (x == 7){
            btn7.setText("X");
        }
        else if (x == 8){
            btn8.setText("X");
        }
        else if (x == 9){
            btn9.setText("X");
        }

    }

    public void resetButtons(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    public void disableButtons(){
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        btn5.setClickable(false);
        btn6.setClickable(false);
        btn7.setClickable(false);
        btn8.setClickable(false);
        btn9.setClickable(false);
    }

    public void enableButtons(){
        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
        btn4.setClickable(true);
        btn5.setClickable(true);
        btn6.setClickable(true);
        btn7.setClickable(true);
        btn8.setClickable(true);
        btn9.setClickable(true);
    }
}
