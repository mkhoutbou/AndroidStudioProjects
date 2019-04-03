package com.example.application0;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button btns=findViewById(R.id.btnSms);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"+Uri.encode("+221774309004")));
                intent.putExtra("sms_body","hi it's me");
                startActivity(intent);
            }
        });

        Button btnc=findViewById(R.id.btnPhone);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:774309004"));
                startActivity(intent);
            }
        });

        Button btnm=findViewById(R.id.btnMap);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String geoUri=String.format("geo:38.899533,-77.036476");
                Uri geo=Uri.parse(geoUri);
                Intent geoMap=new Intent(Intent.ACTION_VIEW,geo);
                startActivity(geoMap);

            }
        });

        Button btnw=findViewById(R.id.btnWeb);
        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itw=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                startActivity(itw);
            }
        });

        Button btnsh=findViewById(R.id.btnShare);
        btnsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itsh=new Intent(Intent.ACTION_SEND);
                itsh.setType("text/plain");
                itsh.putExtra(Intent.EXTRA_SUBJECT,"CS639");
                itsh.putExtra(Intent.EXTRA_TEXT,"join CS639");
                startActivity(Intent.createChooser(itsh,"it your round to share"));
            }
        });

        Button btnac=findViewById(R.id.btnac);
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itact=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(itact);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
