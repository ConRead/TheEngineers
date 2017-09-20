package com.example.faithanalie.conread;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);

        setupCancelButton();
    }

    private void setupCancelButton(){
        Button btn = (Button) findViewById(R.id.cancel);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //I wanna do is kung mupislit sha, mangutana kung cancel sha? Second: option kay lahos sya sa Sign in Page
                //Destination activity           //Current
                //Intent fpass_intent = Sign_in.makeIntent(ForgotPassword.this);
                //startActivity(fpass_intent);
                finish();
            }
        });

    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, ForgotPassword.class);

    }
}