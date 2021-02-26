package com.androidtraining.androidhelloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.androidtraining.androidhelloworld.fragments.MainFragment;
import com.androidtraining.androidhelloworld.fragments.SecondFragment;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HomeActivity extends AppCompatActivity {

    //TextView welcome_text;

   // RecyclerView recyclerView;

   /* URL ImageUrl = null;
    InputStream is = null;
    Bitmap bmImg = null;
    ImageView imageView= null;
    ProgressDialog p;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts_example);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container1,new MainFragment())
                .commit();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container2,new SecondFragment())
                .commit();        /*Button button=findViewById(R.id.asyncTask);
        imageView=findViewById(R.id.image);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncTaskExample asyncTask=new AsyncTaskExample();
                asyncTask.execute("https://www.tutorialspoint.com/images/tp-logo-diamond.png");
            }
        });*/

       /* welcome_text =findViewById(R.id.welcome_text);


        *//*Here we are specifying the data that need to be displayed in the RecyclerView*//*
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
        *//* RecyclerView will show the data on screen using Layout manager *//*
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        *//*Adapter links the data to the RecyclerView *//*
        RecyclerAdapter adapter = new RecyclerAdapter(myListData);

        *//*After setting up data into adapter we have to set the adapter to the RecyclerView*//*
        recyclerView.setAdapter(adapter);

        if(getIntent().hasExtra(MainActivity.dataKey)){
            //Log.d("print","" +getIntent().getStringExtra("data1"));
            welcome_text.setText(getIntent().getStringExtra(MainActivity.dataKey));
        } else {
            Log.d("print","You didn't received any data.");
        }
*/
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

/*
    private class AsyncTaskExample extends AsyncTask<String, String, Bitmap> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            p = new ProgressDialog(HomeActivity.this);
            p.setMessage("Please wait...It is downloading");
            p.setIndeterminate(false);
            p.setCancelable(false);
            p.show();
        }
        @Override
        protected Bitmap doInBackground(String... strings) {
             try {
                ImageUrl = new URL(strings[0]);
                HttpURLConnection conn = (HttpURLConnection) ImageUrl.openConnection();
                conn.setDoInput(true);
                conn.connect();
                is = conn.getInputStream();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                bmImg = BitmapFactory.decodeStream(is, null, options);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bmImg;
        }
        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if(imageView!=null) {
                p.hide();
                imageView.setImageBitmap(bitmap);
            }else {
                p.show();
            }
        }
    }
*/
}