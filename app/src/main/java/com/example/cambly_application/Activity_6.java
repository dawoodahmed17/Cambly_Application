package com.example.cambly_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_6 extends AppCompatActivity  implements View.OnClickListener {
        Button b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        b8 = (Button) findViewById(R.id.button6);
        b8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button6:
                Intent o = new Intent(Activity_6.this, Activity_7.class);
                this.startActivity(o);
                break;
        }
    }
}
