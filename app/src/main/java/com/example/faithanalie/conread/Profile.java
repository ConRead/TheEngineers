package com.example.faithanalie.conread;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Profile extends Fragment {
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView= inflater.inflate(R.layout.profile, container, false);

        Button butt = (Button) rootView.findViewById(R.id.edit);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case  R.id.edit:
                        Intent int1= new Intent(getActivity(), Edit_Profile.class);
                        startActivity(int1);
                        break;
                }
            }
        });
        return rootView;

    }
}


