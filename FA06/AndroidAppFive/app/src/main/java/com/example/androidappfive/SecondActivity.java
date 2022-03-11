package com.example.androidappfive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity{
    TextView tvMsg;

    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_second);
        tvMsg = (TextView) findViewById(R.id.tvMsg);
        Intent intent = getIntent();
        String msg = ((Intent) intent).getStringExtra("msg");
        tvMsg.setText(msg);
    };

    public void doback(View v){
        finish();
    }
}
