package com.example.cambly_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_5 extends AppCompatActivity implements View.OnClickListener {
        Button b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        b7 = (Button) findViewById(R.id.button4);
        b7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Intent n = new Intent(Activity_5.this, Activity_6.class);
                this.startActivity(n);
                break;
        }
    }
}
