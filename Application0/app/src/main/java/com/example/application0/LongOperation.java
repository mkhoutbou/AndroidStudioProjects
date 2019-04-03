package com.example.application0;

import android.os.AsyncTask;
import android.util.Log;

public class LongOperation extends AsyncTask<String,Void,Integer> {
    @Override
    protected Integer doInBackground(String... strings) {
        Log.i("LONGOPERATION","Dans AsyncTask");
       Integer deg=Integer.parseInt(strings[0]);
       Integer result=(deg*9)/5+32;
        return result;
    }
}
