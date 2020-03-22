package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    private ImageView ahsan,lalbag,jatio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ahsan = (ImageView) findViewById(R.id.ahsan);
        lalbag = (ImageView) findViewById(R.id.lalbag);
        jatio = (ImageView) findViewById(R.id.jatiyo);
        jatio.setOnClickListener(this);
        lalbag.setOnClickListener(this);
        ahsan.setOnClickListener(this);
    }
    public void dClick(View v)
    {
        Intent dIntent = new Intent(Main3Activity.this,Main2Activity.class);
        startActivity(dIntent);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ahsan)
        {
            ahsan.setVisibility(v.GONE);
            jatio.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.jatiyo)
        {
            jatio.setVisibility(v.GONE);
            lalbag.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.lalbag)
        {
            lalbag.setVisibility(v.GONE);
            ahsan.setVisibility(v.VISIBLE);
        }

    }
}
