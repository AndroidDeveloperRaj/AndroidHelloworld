package com.androidtraining.androidhelloworld;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androidtraining.androidhelloworld.services.ServiceExample;

public class MainActivity extends AppCompatActivity {

    TextView helloworldText;
    Button buttonBottom;
    public static String dataKey = "dataKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag"," Activity1 onCreate()");

        helloworldText = findViewById(R.id.hello_world_text);
        buttonBottom = findViewById(R.id.button_bottom);

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("dataKey","I came from MainActivity");
                startActivity(intent);
               /* Intent intent = new Intent(MainActivity.this,ServiceExample.class);
                startService(intent);
                stopService(intent);*/
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag","Activity1  onRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag"," Activity1 onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","Activity1  onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag"," Activity1 onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag"," Activity1 onStop()");

    }

    @Override
    public void onBackPressed() {
        Log.d("tag"," Activity1 onBackPressed()");
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        helloworldText.setOnClickListener(null);
        Log.d("tag"," Activity1 onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("tag"," Activity1 onSaveInstanceState()");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("tag"," Activity1 onRestoreInstanceState()");
    }
}