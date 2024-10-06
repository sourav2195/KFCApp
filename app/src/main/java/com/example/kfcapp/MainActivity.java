package com.example.kfcapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the views
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        signIn = findViewById(R.id.signIn);

        //set a click listener in sign in button
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the value from text editor fields
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                //validation of email and password if empty.
                if(TextUtils.isEmpty(email))
                {
                    Toast.makeText(MainActivity.this,"Please enter your Email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(MainActivity.this,"Please enter your Password",Toast.LENGTH_SHORT).show();
                    return;
                }

                //validation of correct emila and password
                if(!email.equals("kfcapp@gmail.com")){
                    Toast.makeText(MainActivity.this,"Invalid Email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password.equals("kfc123")){
                    Toast.makeText(MainActivity.this,"Invalid Password",Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}