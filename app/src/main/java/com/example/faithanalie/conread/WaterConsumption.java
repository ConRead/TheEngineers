package com.example.faithanalie.conread;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class WaterConsumption extends Fragment {

    Button bUploadImage;
    Button bProcess;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.waterconsumption, container, false);

    }
}
