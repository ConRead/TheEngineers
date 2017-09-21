package com.example.faithanalie.conread;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;


public class ElectricCon extends Fragment {
    Spinner spinneruse;
    Spinner spinneruse2;
    Spinner spinneruse3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View rootView= inflater.inflate(R.layout.electricconsumption, container, false);
      View rootView= inflater.inflate(R.layout.electriccon, container, false);

        spinneruse=(Spinner) rootView.findViewById(R.id.month_spinner);
       spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               switch (position)
               {
                   case 0:

                       break;
                   case 1:
                       break;
                   case 2:
                       break;
                   case 3:
                       break;
                   case 4:
                       break;
                   case 5:
                       break;
                   case 6:
                       break;
                   case 7:
                       break;
                   case 8:
                       break;
                   case 9:
                       break;
                   case 10:
                       break;
                   case 11:
                       break;



               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
        spinneruse2=(Spinner)rootView.findViewById(R.id.date_spinner);
        spinneruse2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
       spinneruse3 =(Spinner)rootView.findViewById(R.id.year_spinner);
    spinneruse3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });

    return rootView;
    }
}
