package com.Ramish.f200433;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class email_verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification);
    }
    public void BackPage(View view){
        Intent intent=new Intent(
                email_verification.this,
                RegistrationActivity.class);
        startActivity(intent);
    }
}