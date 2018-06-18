package com.vk.videoediting18june;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    public void initView()
    {
        Button bcapture =(Button)findViewById(R.id.bcapture);
        bcapture.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
