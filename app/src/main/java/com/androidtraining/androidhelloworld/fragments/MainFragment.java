package com.androidtraining.androidhelloworld.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.androidtraining.androidhelloworld.R;

public class MainFragment extends Fragment {


    private ProgressBar progress;
    private SharedPreferences sharedPreferences;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("ActivityTag","onAttach()");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("ActivityTag","onCreateView()");
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        progress = rootView.findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // progress.setVisibility(View.GONE);
                sharedPreferences = getActivity().getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
                Toast.makeText(getActivity(),"Value From SharedPreferences:   " +
                        sharedPreferences.getString("hello",null),Toast.LENGTH_LONG)
                        .show();
            }
        });
       // linearLayout = (LinearLayout) rootView.findViewById(R.id.linearlayout);
        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("ActivityTag","onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("ActivityTag","onActivityCreated()");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("ActivityTag","onViewCreated()");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        Log.d("ActivityTag","onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("ActivityTag","onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("ActivityTag","onStop()");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("ActivityTag","onDestroyView()");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("ActivityTag","onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("ActivityTag","onDetach()");

    }
}
