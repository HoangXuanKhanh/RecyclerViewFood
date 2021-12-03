package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityBack extends AppCompatActivity {
    ListView listV;
    List<Foodlist> foodDemoList;
    Foodlist food01, food02, food03, food04, food05, food06,food07,food08,food09,food10,food11;
    RelativeLayout btnGio;
    TextView tv_Result;
    Button btnOrder;
    Integer so1 = 0;
    Integer so2 = 0;
    Character dau = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_back);
        listV = findViewById(R.id.lvFood);
        btnGio = findViewById(R.id.btn_Gio);
        tv_Result = findViewById(R.id.tv_Results);
        btnOrder = findViewById(R.id.btn_Order);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText().toString() + "0");
                if(dau == null){
                    so1 = Integer.parseInt(tv_Result.getText().toString());
                }else{
                    so2 = Integer.parseInt(tv_Result.getText().toString());
                }
            }
        });

        btnGio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBack.this, MainActivityBackGio.class);
                startActivity(i);
            }
        });

        foodDemoList=new ArrayList<>();

        food01=new Foodlist("Phở Huế","Phở-Mỳ-Cơm,Ẩm thực miền bắc", "Miễn Phí|45Min", "Tối thiểu 50.000đ",R.drawable.ic_hohue);
        food02=new Foodlist("Joma Bakery Cafe","Bánh ngọt,Salad,Sandwitch", "Miễn Phí|40Min", "Tối thiểu 200.000đ",R.drawable.ic_banh);
        food03=new Foodlist("Doner Kebab 1995","Món ăn Thổ Nhĩ Kỳ", "35.000đ|30Min", "Tối thiểu 60.000đ",R.drawable.ic_donerkebab);
        food04=new Foodlist("Cơm Đại Vương","Món ăn Châu Á", "18.000đ|25Min", "Tối thiểu 75.000đ",R.drawable.ic_daivuong);
        food05=new Foodlist("Khô gà","Khô gà cay", "12.000d|15Min", "Tối thiểu 40.000đ",R.drawable.ic_khoga);
        food06=new Foodlist("Sushi Nhật Bản","Ẩm thực Japan", "24.600|45Min", "Tối thiểu 150.000đ",R.drawable.ic_sushinb);
        food07=new Foodlist("Ức gà nướng tỏi và phô mai","Bánh mỳ, phomat parmesan", "Miễn phí|35Min", "Tối thiểu 65.000đ",R.drawable.ic_ucga);
        food08=new Foodlist("Nem Cuốn","Ẩm thực Việt", "22.600|45Min", "Tối thiểu 70.000đ",R.drawable.ic_nemcuon);
        food09=new Foodlist("Bánh quế cổ điển","Waffle cho buổi sáng hoàn hảo", "42.600|45Min", "Tối thiểu 23.000đ",R.drawable.ic_banhque);
        food10=new Foodlist("Mỳ Cay","Ẩm thực Hàn Quốc", "27.800|45Min", "Tối thiểu 55.000đ",R.drawable.ic_mycay);
        food11=new Foodlist("Xúc xích Balls","Xúc xích phomai que ", "12.100|45Min", "Tối thiểu 85.000đ",R.drawable.ic_xucxich);

        foodDemoList.add(food01);
        foodDemoList.add(food02);
        foodDemoList.add(food03);
        foodDemoList.add(food04);
        foodDemoList.add(food05);
        foodDemoList.add(food06);
        foodDemoList.add(food07);
        foodDemoList.add(food08);
        foodDemoList.add(food09);
        foodDemoList.add(food10);
        foodDemoList.add(food11);

        AdapterFood adapterFood = new AdapterFood(foodDemoList);
        listV.setAdapter(adapterFood);
        
    }
}