package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageView sajek,risang,panchari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        sajek = (ImageView) findViewById(R.id.sajek);
        risang = (ImageView) findViewById(R.id.risang);
        panchari = (ImageView) findViewById(R.id.panchari);
        sajek.setOnClickListener(this);
        risang.setOnClickListener(this);
        panchari.setOnClickListener(this);
    }
    public void dClick(View v)
    {
        Intent dIntent = new Intent(Main5Activity.this,Main2Activity.class);
        startActivity(dIntent);

    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sajek)
        {
            sajek.setVisibility(v.GONE);
            risang.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.risang)
        {
            risang.setVisibility(v.GONE);
            panchari.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.panchari)
        {
            panchari.setVisibility(v.GONE);
            sajek.setVisibility(v.VISIBLE);
        }

    }
}
