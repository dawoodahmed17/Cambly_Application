package com.example.cambly_application;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_stats extends Fragment implements View.OnClickListener {
    private Button[] btn = new Button[3];
    private Button btn_unfocus;
    private int[] btn_id = {R.id.button15, R.id.button16, R.id.button17};
    View view;
    public Fragment_stats() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_fragment_stats,container,false);
        for(int i = 0; i < btn.length; i++){
            btn[i] = (Button)view. findViewById(btn_id[i]);
            btn[i].setBackgroundColor(Color.rgb(59, 59, 59));
            btn[i].setOnClickListener(this);
        }

        btn_unfocus = btn[0];
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button15 :
                setFocus(btn_unfocus, btn[0]);
                break;

            case R.id.button16 :
                setFocus(btn_unfocus, btn[1]);
                break;

            case R.id.button17 :
                setFocus(btn_unfocus, btn[2]);
                break;
        }
    }
    private void setFocus(Button btn_unfocus, Button btn_focus){
        btn_unfocus.setTextColor(Color.rgb(255, 255, 255));
        btn_unfocus.setBackgroundColor(Color.rgb(59, 59, 59));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(0, 0, 0));
        this.btn_unfocus = btn_focus;
    }
}
