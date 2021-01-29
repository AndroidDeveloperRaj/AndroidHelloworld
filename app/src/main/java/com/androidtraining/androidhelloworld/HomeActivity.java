package com.androidtraining.androidhelloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView welcome_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcome_text =findViewById(R.id.welcome_text);

        Log.d("tag"," Activity2 onCreate()");
      //  getIntent().getExtras();
        if(getIntent().hasExtra(MainActivity.dataKey)){
            //Log.d("print","" +getIntent().getStringExtra("data1"));
            welcome_text.setText(getIntent().getStringExtra(MainActivity.dataKey));
        } else {
            Log.d("print","You didn't received any data.");
        }

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag"," Activity2 onRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag"," Activity2 onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag"," Activity2 onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","Activity2  onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag"," Activity2 onStop()");

    }

    @Override
    public void onBackPressed() {
        Log.d("tag"," Activity2 onBackPressed()");
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag"," Activity2 onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("tag","Activity2  onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("tag","Activity2  onRestoreInstanceState()");
    }

}