package com.example.application0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtget=findViewById(R.id.editText2);
                EditText txtset=findViewById(R.id.editText3);


                LongOperation op = new LongOperation();
                String gt = txtget.getText().toString();
                Log.i(gt,"");
                Integer result=Integer.parseInt(op.execute(gt).toString());
                try {
                    Integer i = op.get();
                    txtset.setText(result);
                    Log.i("THE RESULT IS=",i+"");
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        });
    }
}
