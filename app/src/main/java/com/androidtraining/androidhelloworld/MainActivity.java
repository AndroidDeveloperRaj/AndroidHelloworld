package com.androidtraining.androidhelloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.androidtraining.androidhelloworld.fragments.MainFragment;
import com.androidtraining.androidhelloworld.fragments.SecondFragment;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    RadioButton btn1, btn2;
    CheckBox checkBox1,checkBox2;
    ImageButton imagebutton;
    ProgressBar progressBar;
    Switch switchComponent;
    EditText editText;
    SeekBar seekBarId;
    WebView webView;

    ConstraintLayout parentView;
    public static String dataKey = "dataKey";

    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ActivityTag"," Activity1 onCreate()");

        sharedPreferences = getSharedPreferences("Dummy", Context.MODE_PRIVATE);
       /* getSupportFragmentManager().beginTransaction().add(R.id.fragment_container1,new MainFragment())
                .commit();*/

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container2,new SecondFragment())
                .commit();

        /* Step by step procedure to add a fragment */
       /* FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = new MainFragment();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,mainFragment).commit();*/

       /* parentView = findViewById(R.id.parent);
        helloworldText = findViewById(R.id.hello_world_text);
        buttonBottom = findViewById(R.id.button_bottom);
        btn1 = findViewById(R.id.radio_btn1);
        btn2 = findViewById(R.id.radio_btn2);
        radioGroup = findViewById(R.id.radio_group);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        imagebutton = findViewById(R.id.imageButton);

        progressBar = findViewById(R.id.progress);

        switchComponent = findViewById(R.id.switchComponent);
        editText = findViewById(R.id.editText);
        seekBarId = findViewById(R.id.seekBarId);
        webView = findViewById(R.id.webView);
        subtitle = findViewById(R.id.subtitle);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://developer.android.com/reference/android/widget/Adapter");
*/
        /*webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                webView.loadUrl("https://developer.android.com/reference/android/widget/Adapter");
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }

        });*/

//        checkBox1.setOnCheckedChangeListener(this);
//        checkBox2.setOnCheckedChangeListener(this);
//
//        buttonBottom.setOnClickListener(this);
//        imagebutton.setOnClickListener(this);
//        helloworldText.setOnClickListener(this);
//        progressBar.setOnClickListener(this);
//        parentView.setOnClickListener(this);
//
//        switchComponent.setOnCheckedChangeListener(this);
//
//        seekBarId.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//               Log.d("seekbar","progress"+ progress);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//                Log.d("seekbar","start Tracking");
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//                Log.d("seekbar","stop Tracking");
//            }
//        });
//
//        //editText.setOnClickListener(this);
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                Log.d("editText","Before Text Change");
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                Log.d("editText","On Text Change");
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                Log.d("editText","After Text Change");
//                helloworldText.setText("Hello World");
//            }
//        });
//
//        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if(hasFocus) {
//                    Toast.makeText(MainActivity.this,"In Focus",Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(MainActivity.this,"Not In Focus",Toast.LENGTH_LONG).show();
//                }
//            }
//        });

        /*checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox2.setChecked(false);
                    Toast.makeText(MainActivity.this,"Checkbox2 unselected",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,"Checkbox1 unselected by itself",T oast.LENGTH_LONG).show();
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
/*
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_btn1 :
                      //  Toast.makeText(MainActivity.this,"button2 unselected",Toast.LENGTH_LONG).show();
                        Snackbar.make(parentView,"\"button2 unselected", Snackbar.LENGTH_SHORT).show();
                        break;

                    case R.id.radio_btn2  :
                      //  Toast.makeText(MainActivity.this,"button1 unselected",Toast.LENGTH_LONG).show();
                        break;
                    default: Toast.makeText(MainActivity.this,"not satisfied the condition",Toast.LENGTH_LONG).show();
                     break;
                }
            }
        });
*/

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
        Log.d("ActivityTag","Activity1  onRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityTag"," Activity1 onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityTag","Activity1  onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityTag"," Activity1 onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityTag"," Activity1 onStop()");

    }

    @Override
    public void onBackPressed() {
        Log.d("tag"," Activity1 onBackPressed()");
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // helloworldText.setOnClickListener(null);
        Log.d("ActivityTag"," Activity1 onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
       // Log.d("tag"," Activity1 onSaveInstanceState()");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //Log.d("tag"," Activity1 onRestoreInstanceState()");
    }


    @SuppressLint("ResourceType")
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.checkbox1 :
                    checkBox2.setChecked(false);
                    editText.setFocusable(false);
                    Log.d("checkbox","checkbox2 unselected");
                   // Toast.makeText(MainActivity.this,"checkbox2 unselected",Toast.LENGTH_LONG).show();

                /*Replacing the Toast message with SnackBar */

               Snackbar.make(parentView,"checkbox2 unselected",Snackbar.LENGTH_SHORT)
                       .setTextColor(getResources().getColor(R.color.white))
                       .setBackgroundTint(getResources().getColor(R.color.black))
                       .setAction("Android",MainActivity.this)
                       .setActionTextColor(getResources().getColor(R.color.purple_700))
                       .show();
                break;

            case R.id.checkbox2 :
                    checkBox1.setChecked(false);
                    editText.requestFocus();
                    editText.setFocusable(true);
                    Log.d("radio","checkbox1 unselected");
                    Toast.makeText(MainActivity.this,"checkbox1 unselected",Toast.LENGTH_LONG).show();
               break;

            case R.id.switchComponent :
                Toast.makeText(MainActivity.this,"switch is" + isChecked,Toast.LENGTH_LONG).show();
                break;

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_bottom :
                btn1.setChecked(false);
                Log.d("radio","button1 unselected");

                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
             //   Toast.makeText(MainActivity.this,"button1 unselected",Toast.LENGTH_LONG).show();
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
            case R.id.editText  :
                editText.setBackgroundColor(getResources().getColor(R.color.purple_700));
                break;




        }
    }
}