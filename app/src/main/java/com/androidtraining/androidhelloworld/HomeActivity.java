package com.androidtraining.androidhelloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.androidtraining.androidhelloworld.adapter.RecyclerAdapter;
import com.androidtraining.androidhelloworld.helpers.MyListData;

public class HomeActivity extends AppCompatActivity {

    TextView welcome_text;

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcome_text =findViewById(R.id.welcome_text);


        /*Here we are specifying the data that need to be displayed in the RecyclerView*/
        MyListData[] myListData = new MyListData[] {
                new MyListData("Email", android.R.drawable.ic_dialog_email),
                new MyListData("Info", android.R.drawable.ic_dialog_info),
                new MyListData("Delete", android.R.drawable.ic_delete),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert),
                new MyListData("Map", android.R.drawable.ic_dialog_map),
        };

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        /* RecyclerView will show the data on screen using Layout manager */
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 6264285810
        // brian zhang
        /*Adapter links the data to the RecyclerView */
        RecyclerAdapter adapter = new RecyclerAdapter(myListData);

        /*After setting up data into adapter we have to set the adapter to the RecyclerView*/
        recyclerView.setAdapter(adapter);

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