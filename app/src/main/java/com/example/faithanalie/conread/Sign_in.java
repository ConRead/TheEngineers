package com.example.faithanalie.conread;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Sign_in extends AppCompatActivity {


    private EditText usernameText;
    private EditText passwordText;
    private TextView fpasswordTextView;

    Button blogin;
    Button bSignup;

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        btn =(Button) findViewById(R.id.sign_up);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

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

}*/
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sign_in);

    setupSignupButton();
    setupLoginButton();
    setupForgotPassword();
}

    private void setupSignupButton(){
        bSignup = (Button) findViewById(R.id.sign_up);
        bSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Destination activity           //Current
                Intent sign_up_intent = Sign_up.makeIntent(Sign_in.this);
                startActivity(sign_up_intent);
            }
        });

    }
    //First condition ::: Di ka log in kung walay nakainput sa username ug password na textbox
    //Second condition ::: Dili ka log in ug ka proceed sa Home kung di mao ang username ug password
   private void setupLoginButton(){
        blogin= (Button) findViewById(R.id.login);
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(Sign_in.this, "Either no username or password inputed! ", Toast.LENGTH_SHORT).show();
                //Intent log_in_intent = Sign_up.makeIntent(Sign_in.this);
                //startActivity(log_in_intent);
                Intent i_tab_menu = Tab_menu.makeIntent(Sign_in.this);
                startActivity(i_tab_menu);

                finish();
            }
        });

    }
    private void setupForgotPassword(){
        fpasswordTextView = (TextView) findViewById(R.id.forgotpassword);
        fpasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent f_pass_intent = ForgotPassword.makeIntent(Sign_in.this);
                startActivity(f_pass_intent);
            }
        });
    }
    // public static Intent makeIntent(Context context) {
    //     return new Intent(context, Sign_in.class);
    // }

}

