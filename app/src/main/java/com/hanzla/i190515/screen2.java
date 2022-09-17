package com.hanzla.i190515;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen2 extends AppCompatActivity {
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        but=(Button)findViewById(R.id.buttonscreen2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInsideActivityscreen3();
            }
        });
    }
    public void openInsideActivityscreen3()
    {
        Intent intent = new Intent(this,screen3.class);
        startActivity(intent);
    }
}