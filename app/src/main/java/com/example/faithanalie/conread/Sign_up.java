package com.example.faithanalie.conread;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sign_up extends AppCompatActivity {

    private EditText lastNameText;
    private EditText firstNameText;
    private EditText genderText;
    private EditText middleNameText;
    private EditText addressText;
    private EditText passwordText;
    private EditText rwritepasswordText;
    private EditText contactNumberText;
    private Button bSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }

    public static Intent makeIntent(Context context){
        return new Intent(context, Sign_up.class);
    }
}

