package com.example.projet_dev_moibile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class oneGamerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_gamer);
        int random = (int)(Math.random() * 50 + 1);
        EditText x=findViewById(R.id.x);

        //x.setText(random);
    }
}
