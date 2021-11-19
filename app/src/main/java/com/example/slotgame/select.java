package com.example.slotgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);
        Button select1Button = (Button)findViewById(R.id.select1);
        select1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(select.this, kantan.class);
                startActivity(intent);
            }
        });
        Button select2Button = (Button)findViewById(R.id.select2);
        select2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(select.this, hutu.class);
                startActivity(intent);
            }
        });
        Button select3Button = (Button)findViewById(R.id.select3);
        select3Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(select.this, muzukashi.class);
                startActivity(intent);
            }
        });
    }
}