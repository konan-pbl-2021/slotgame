package com.example.slotgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kantan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kantan);
        Button kantanstartButton = (Button)findViewById(R.id.kantanstart);
        kantanstartButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(kantan.this, Slot_kantan.class);
                startActivity(intent);
            }
        });
    }
}