package com.example.countingapp;

import static com.example.countingapp.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome_text,counter_text,textView;
    Button btn,btn1;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        welcome_text=findViewById(id.welcome_text);
        counter_text=findViewById(R.id.counter_text);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        textView=findViewById(id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counter_text.setText(""+counter);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                textView.setText(""+counter);
            }
        });


    }
    public  int increaseCounter()
    {
        return counter++;
    }



}
