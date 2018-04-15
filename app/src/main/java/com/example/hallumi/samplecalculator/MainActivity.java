package com.example.hallumi.samplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView screen;
    String Number="",clear="",str, result, sign;
    int a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView)findViewById(R.id.scr);
        screen.setText("");

    }
    public void Clear()
    {
        screen.setText(clear);
    }
    public void onClick(View v)
    {
        Clear();
        Button button = (Button) v;
        Number += button.getText();
        screen.setText(Number);
        str=Number;
        Number = "";

    }
    public void onClickSign(View v)
    {
        Clear();
        Button button = (Button) v;
        sign = button.getText().toString();
        screen.setText(sign);
        a = Integer.parseInt(str);
    }
    public void calculate(View v)
    {
        Button button = (Button) v;
        b= Integer.parseInt(str);
        if (sign.equals("+")) {
            result = a + b + "";
        } else if (sign.equals("-")) {
            result = a - b + "";

        } else if (sign.equals("*")) {
            result = a * b + "";

        } else if (sign.equals("/")) {
            result = a / b + "";

        } else {
            screen.setText("WRONGE INPUT");
        }

        screen.setText(result);
    }
}






