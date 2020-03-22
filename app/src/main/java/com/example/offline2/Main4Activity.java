package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageView cox,mahesh,him;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        cox = (ImageView) findViewById(R.id.cox);
        him = (ImageView) findViewById(R.id.himchori);
        mahesh = (ImageView) findViewById(R.id.maheshkhali);
        cox.setOnClickListener(this);
        him.setOnClickListener(this);
        mahesh.setOnClickListener(this);
    }
    public void dClick(View v)
    {
        Intent dIntent = new Intent(Main4Activity.this,Main2Activity.class);
        startActivity(dIntent);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.cox)
        {
            cox.setVisibility(v.GONE);
            him.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.himchori)
        {
            him.setVisibility(v.GONE);
            mahesh.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.maheshkhali)
        {
            mahesh.setVisibility(v.GONE);
            cox.setVisibility(v.VISIBLE);
        }
    }
}
