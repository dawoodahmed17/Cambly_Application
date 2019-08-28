package com.example.cambly_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_7 extends AppCompatActivity implements View.OnClickListener {
        Button b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        b9 = (Button) findViewById(R.id.btn_2);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_2:
                Intent p = new Intent(Activity_7.this, home_activity.class);
                this.startActivity(p);
                break;
        }
    }
}
