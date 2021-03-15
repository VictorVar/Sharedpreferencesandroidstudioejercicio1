package com.example.sharedpreferenceseejercicio1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email= findViewById(R.id.email);
        SharedPreferences weas=getSharedPreferences("datos",Context.MODE_PRIVATE);
        email.setText(weas.getString("email",""));
    }
    public void suanfonson(View v){
        SharedPreferences cosas=getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=cosas.edit();
        editor.putString("email",email.getText().toString());
        editor.commit();
        finish();
        }
    }
