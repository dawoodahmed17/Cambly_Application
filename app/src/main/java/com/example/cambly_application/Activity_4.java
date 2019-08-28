package com.example.cambly_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_4 extends AppCompatActivity implements View.OnClickListener {
    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        b6 = (Button) findViewById(R.id.button3);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                Intent m = new Intent(Activity_4.this, Activity_5.class);
                this.startActivity(m);
                break;
        }
    }
}
