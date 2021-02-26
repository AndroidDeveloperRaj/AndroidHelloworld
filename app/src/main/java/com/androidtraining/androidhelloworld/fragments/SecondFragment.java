package com.androidtraining.androidhelloworld.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.androidtraining.androidhelloworld.R;

public class SecondFragment extends Fragment {

    private Button button;
    private SharedPreferences sharedPreferences;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        sharedPreferences = getActivity().getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);

        View v = inflater.inflate(R.layout.fragment_second, container, false);
        button = v.findViewById(R.id.button_bottom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert();
            }
        });
        return v;
    }


     void showAlert(){

        AlertDialog.Builder builder1 = new AlertDialog.Builder(getActivity());
       // builder1.setMessage("Do you want to allow call data to be collected.");
        ViewGroup viewGroup = getActivity().findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(getActivity()).inflate(R.layout.alert_dialog_layout, viewGroup, false);
        //dialogView.setVisibility(View.VISIBLE);
        //Button buttton = dialogView.findViewById(R.id.buttonOk);
        builder1.setView(dialogView);
        builder1.setCancelable(true);
      /*  builder1.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });*/
        AlertDialog alert11 = builder1.create();
        alert11.show();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("hello","Android is Confusing");
        editor.putBoolean("isCourseCompleted",true);
        editor.putFloat("floatValue",10.0f);
        editor.putInt("IntValue",11);
        editor.commit();
    }

}