package com.hanzla.i190515;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen3 extends AppCompatActivity {
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        but=(Button)findViewById(R.id.buttonscreen3);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInsideActivityscreen4();
            }
        });
    }
    public void openInsideActivityscreen4(){
        Intent intent=new Intent(this,screen5.class);
        startActivity(intent);
    }

}