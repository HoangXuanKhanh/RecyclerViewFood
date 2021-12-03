package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDangNhap;
    EditText edNameT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnDangNhap = findViewById(R.id.btn_DangNhap);
        edNameT = findViewById(R.id.ed_UserName);

        getSupportActionBar().setTitle("MainActivity");
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, RecycleViewActivity.class);
                startActivity(in);
                String strUserName = edNameT.getText().toString().trim();
                AppUser.eUser = strUserName;
            }
        });
    }
}