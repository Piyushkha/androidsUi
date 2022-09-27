package com.example.firstappinoffice;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class Signupbtn extends AppCompatActivity {
    private static final String HttpURL = "https://dailyupdatework.in/billapp/api/ragister.php?name=pawan&email=pawan@gmail.com&password=1234&city=jaipur&hobby=cricket&gender=male";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EditText suuserName = findViewById(R.id.nameEd);
        EditText suEmail = findViewById(R.id.Emailed);
        EditText supassword = findViewById(R.id.passwoed);
        EditText surepassword = findViewById(R.id.rePassward);
        RadioGroup rg = findViewById(R.id.rg);
        RadioButton rdbtn1 = findViewById(R.id.rdBtn1);
        RadioButton rdbtn2 = findViewById(R.id.rdBtn2);
        TextView Backlogin = findViewById(R.id.loginActivity);
        Button SignUpBtn = findViewById(R.id.signupBtn);
        ImageView backBtn = findViewById(R.id.backbtn);





        Spinner dropdown = findViewById(R.id.spinner1);

        String[] items = new String[]{"City", "Jaipur", "Jodhpur", "Udaipur"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);


    }
}