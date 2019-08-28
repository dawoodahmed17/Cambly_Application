package com.example.cambly_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Activity_2 extends AppCompatActivity implements View.OnClickListener {

    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actictity_2);
        b4 = (Button) findViewById(R.id.button2);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                Intent l = new Intent(Activity_2.this, Activity_3.class);
                this.startActivity(l);
                break;
        }
    }
}
