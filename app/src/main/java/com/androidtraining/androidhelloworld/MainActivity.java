package com.androidtraining.androidhelloworld;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.androidtraining.androidhelloworld.services.ServiceExample;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    TextView helloworldText;
    Button buttonBottom;
    RadioButton btn1, btn2;
    RadioGroup radioGroup;
    CheckBox checkBox1,checkBox2;
    ImageButton imagebutton;
    ProgressBar progressBar;
    public static String dataKey = "dataKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag"," Activity1 onCreate()");

        helloworldText = findViewById(R.id.hello_world_text);
        buttonBottom = findViewById(R.id.button_bottom);
        btn1 = findViewById(R.id.radio_btn1);
        btn2 = findViewById(R.id.radio_btn2);
        radioGroup = findViewById(R.id.radio_group);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        imagebutton = findViewById(R.id.imageButton);

        progressBar = findViewById(R.id.progress);


        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);

        buttonBottom.setOnClickListener(this);
        imagebutton.setOnClickListener(this);
        helloworldText.setOnClickListener(this);
        progressBar.setOnClickListener(this);

        /*checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox2.setChecked(false);
                    Toast.makeText(MainActivity.this,"Checkbox2 unselected",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,"Checkbox1 unselected by itself",Toast.LENGTH_LONG).show();
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox1.setChecked(false);
                    Toast.makeText(MainActivity.this,"Checkbox1 unselected",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,"Checkbox2 unselected by itself",Toast.LENGTH_LONG).show();
                }
            }
        });*/
        /* To add listener for RadioGroup which may contain number of radio buttons */
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_btn1 :
                        Toast.makeText(MainActivity.this,"button2 unselected",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.radio_btn2  :
                        Toast.makeText(MainActivity.this,"button1 unselected",Toast.LENGTH_LONG).show();
                        break;
                    default: Toast.makeText(MainActivity.this,"not satisfied the condition",Toast.LENGTH_LONG).show();
                     break;
                }
            }
        });

        /*buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                *//*Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("dataKey","I came from MainActivity");
                startActivity(intent);*//*
               *//* Intent intent = new Intent(MainActivity.this,ServiceExample.class);
                startService(intent);
                stopService(intent);*//*

                Toast.makeText(MainActivity.this,btn1.getText(),Toast.LENGTH_LONG).show();
            }
        });*/

        /* To add listener for each Radio button individually */
        /*btn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    btn2.setChecked(false);
                    Log.d("radio","button2 unselected");
                    Toast.makeText(MainActivity.this,"button2 unselected",Toast.LENGTH_LONG).show();
                   // CustomToast.makeText(MainActivity.this,"button2 unselected",Toast.LENGTH_LONG).show();
                }
            }
        });

        btn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    btn1.setChecked(false);
                    Log.d("radio","button1 unselected");
                    Toast.makeText(MainActivity.this,"button1 unselected",Toast.LENGTH_LONG).show();
                }
            }
        });*/
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


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.checkbox1 :
                    checkBox2.setChecked(false);
                    Log.d("checkbox","checkbox2 unselected");
                    Toast.makeText(MainActivity.this,"checkbox2 unselected",Toast.LENGTH_LONG).show();
                break;

            case R.id.checkbox2 :
                    checkBox1.setChecked(false);
                    Log.d("radio","checkbox1 unselected");
                    Toast.makeText(MainActivity.this,"checkbox1 unselected",Toast.LENGTH_LONG).show();
               break;

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_bottom :
                btn1.setChecked(false);
                Log.d("radio","button1 unselected");
                Toast.makeText(MainActivity.this,"button1 unselected",Toast.LENGTH_LONG).show();
                break;

            case R.id.imageButton :
                Toast.makeText(MainActivity.this,"Image button clicked",Toast.LENGTH_LONG).show();
                break;

            case R.id.hello_world_text :
                Toast.makeText(MainActivity.this,"Hello world clicked",Toast.LENGTH_LONG).show();
                 break;

            case R.id.progress :
                progressBar.setVisibility(View.GONE);
                break;
        }
    }
}