package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView userIdView,passwordIdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void dClick(View v)
    {
        Intent dIntent = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(dIntent);

    }
    public void cClick(View v)
    {
        Intent cIntent = new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(cIntent);

    }
    public void kClick(View v)
    {
        Intent dIntent = new Intent(Main2Activity.this,Main5Activity.class);
        startActivity(dIntent);

    }
}
