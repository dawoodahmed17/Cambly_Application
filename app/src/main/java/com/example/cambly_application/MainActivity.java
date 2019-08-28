package com.example.cambly_application;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    TextView b2;
    CallbackManager callbackManager;
    private View t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button5);
        b1.setOnClickListener(this);
        printHashKey(MainActivity.this);
        b2 = (TextView) findViewById(R.id.txt_1);
        b2.setOnClickListener(this);
        t2=(Button) findViewById(R.id.fb);

        callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback < LoginResult > () {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // Handle success
                    }

                    @Override

                    public void onCancel() {
                    }

                    @Override
                    public void onError(FacebookException exception) {
                    }
                }
        );
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5:
                Intent i = new Intent(MainActivity.this, Activity_2.class);
                this.startActivity(i);
                break;
            case R.id.txt_1:
                Intent j = new Intent(getApplicationContext(), Activity_8.class);
                this.startActivity(j);
                break;
        }
        if (v == t2) {
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("user_photos", "email", "user_birthday", "public_profile")
            );
        }

    }
    public void printHashKey(Context pContext) {
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String hashKey = new String(Base64.encode(md.digest(), 0));
                Log.i("yes", "printHashKey() Hash Key: " + hashKey);
            }
        } catch (NoSuchAlgorithmException e) {
            Log.e("no", "printHashKey()", e);
        } catch (Exception e) {
            Log.e("also", "printHashKey()", e);
        }
    }
}
