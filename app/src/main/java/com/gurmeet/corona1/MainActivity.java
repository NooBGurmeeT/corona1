package com.gurmeet.corona1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button info=(Button)findViewById(R.id.button1);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,infoactivity.class);
                startActivity(intent1);
            }
        });
        Button check=(Button)findViewById(R.id.button2);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,checkactivity.class);
                startActivity(intent2);
            }
        });
        Button live=(Button)findViewById(R.id.button3);
        live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,countactivity.class);
                startActivity(intent3);
            }
        });
    }
}
