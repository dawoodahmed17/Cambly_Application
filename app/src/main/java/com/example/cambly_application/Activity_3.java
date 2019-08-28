package com.example.cambly_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity_3 extends AppCompatActivity implements View.OnClickListener {
        Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        b5 = (Button) findViewById(R.id.button);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent m = new Intent(Activity_3.this, Activity_4.class);
                this.startActivity(m);
                break;
        }
    }
}
