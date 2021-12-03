package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivityBackGio extends AppCompatActivity {
    RelativeLayout btnBack;
    TextView tvBackGio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_back_gio);
        btnBack = findViewById(R.id.btn_Back);
        tvBackGio = findViewById(R.id.tv_GioHangRec);

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }
        Foodlist foodlist = (Foodlist) bundle.get("Object_foodlist");
        tvBackGio.setText(foodlist.getNameFood());

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBackGio.this, RecycleViewActivity.class);
                startActivity(i);
            }
        });
    }
}