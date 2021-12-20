package com.practicals.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView button = findViewById(R.id.txtOld);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(RegisterActivity.this , LoginActivity.class));

            }
        });
    }
}