package com.example.cambly_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_8 extends AppCompatActivity implements View.OnClickListener {

    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
        b3 = (Button) findViewById(R.id.button8);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button8:
                Intent k = new Intent(Activity_8.this, Activity_9.class);
                this.startActivity(k);
                break;
        }
    }
}
