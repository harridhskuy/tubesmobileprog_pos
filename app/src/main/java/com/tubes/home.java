package com.tubes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    ImageButton btncashier;
    ImageButton btnhistory;
    ImageButton btnedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btncashier = (ImageButton) findViewById(R.id.btncashier);
        btnhistory = (ImageButton) findViewById(R.id.btnhistory);
        btnedit = (ImageButton) findViewById(R.id.btnedit);

        btncashier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCashier();
            }
        });
        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openhistory(); }
        });
        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openedit(); }
        });
    }

    public void openCashier(){
        Intent intent = new Intent(this,MainMenu.class);
        startActivity(intent);
    }

    public void openhistory(){
        Intent intent = new Intent(this,history.class);
        startActivity(intent);
    }

    public void openedit(){
        Intent intent = new Intent(this,editmenu.class);
        startActivity(intent);
    }
}