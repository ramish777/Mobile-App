package com.Ramish.f200433;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
    }
    public void Homepage(View view){
        Intent intent=new Intent(
                RegistrationActivity.this,
                MainActivity.class);
        startActivity(intent);
    }
}