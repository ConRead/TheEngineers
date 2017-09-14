package com.example.faithanalie.conread;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Sign_in extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        btn =(Button) findViewById(R.id.sign_up);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Sign_in.this, "Click 'Sign up'. ",Toast.LENGTH_SHORT)
                        .show();

                //Launch sign up
                Intent intent= new Intent(Sign_in.this, Sign_up.class);
                startActivity(intent);
            }
        });

        TextView text= (TextView) findViewById(R.id.forgotpassword);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Sign_in.this, ForgotPassword.class);
                startActivity(int1);
            }
        });

    }

    public void onButtonClick(){
        btn = (Button)findViewById(R.id.login);

        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.faithanalie.conread.Tab_menu");
                        startActivity(intent);
                    }
                }
        );
    }


}
