package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnW=findViewById(R.id.btnWeb);
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
                startActivity(intent);
            }
        });
        Button btnM=findViewById(R.id.btnMap);
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Intent.ACTION_)
                String geoUri=String.format("geo:38.899533,-77.036476");
                Uri geo=Uri.parse(geoUri);
                Intent geoMap=new Intent(Intent.ACTION_VIEW,geo);
            }
        });

    }
}
