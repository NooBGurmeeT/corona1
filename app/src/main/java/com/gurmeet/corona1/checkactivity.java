package com.gurmeet.corona1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class checkactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkactivity);
        final RadioButton radio1=(RadioButton)findViewById(R.id.radioButton1);
        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView=(TextView)findViewById(R.id.textView);
                textView.setText("You are free from corona,the cough is due to air pollution");
                radio1.setChecked(false);
            }
        });
        final RadioButton radio2=(RadioButton)findViewById(R.id.radioButton2);
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView=(TextView)findViewById(R.id.textView);
                textView.setText("You are free from corona,the cough is common cold");
                radio2.setChecked(false);
            }
        });
        final RadioButton radio3=(RadioButton)findViewById(R.id.radioButton3);
        radio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView=(TextView)findViewById(R.id.textView);
                textView.setText("You are free from corona,the cough is simple flu");
                radio3.setChecked(false);
            }
        });
        final RadioButton radio4=(RadioButton)findViewById(R.id.radioButton4);
        radio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView=(TextView)findViewById(R.id.textView);
                textView.setText("You are having CORONA!!!");
                radio4.setChecked(false);
            }
        });
    }
}
