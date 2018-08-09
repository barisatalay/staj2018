package com.brsatalay.staj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText user, password;

    private String user_email = "baris";
    private String user_password = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.login);
        user = findViewById(R.id.email);
        password = findViewById(R.id.password);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(user.getText().toString())){
            user.setError("User field cannot be empty!");
            return;
        }

        if (TextUtils.isEmpty(password.getText().toString())){
            password.setError("Password field cannot be empty!");
            return;
        }

        if (user.getText().toString().trim().equals(user_email) && password.getText().toString().trim().equals(user_password)){
            Toast.makeText(this, "User login process is successful. Please wait redirect for home page.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "User login process is unsuccessful!", Toast.LENGTH_SHORT).show();
        }
    }
}
