package com.Ramish.f200433;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);
    }
    public void Homepage(View view){
        Intent intent=new Intent(
                ForgotPasswordActivity.this,
                MainActivity.class);
        startActivity(intent);
    }
}