package com.example.slotgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class muzukashi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muzukashi);
        Button muzukashistartButton = (Button)findViewById(R.id.muzukashistart);
        muzukashistartButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(muzukashi.this, SlotActivity.class);
                startActivity(intent);
            }
        });
    }
}