package com.example.firstappinoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Loginbtn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginbtn);
        ImageView btnI= findViewById(R.id.backbtn);
        TextView signupt=findViewById(R.id.SignupActivity);
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Loginbtn.this,Login.class);
                startActivity(intent);
            }
        });
        signupt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singin= new Intent(Loginbtn.this,Signupbtn.class);
                startActivity(singin);
            }
        });

    }
}