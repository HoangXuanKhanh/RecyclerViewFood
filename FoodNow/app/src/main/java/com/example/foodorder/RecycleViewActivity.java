package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {

    RecyclerView rvList;
    List<Foodlist> foodDemoList;
    Foodlist food01, food02, food03, food04, food05, food06,food07,food08,food09,food10,food11;
    ContactRecyclerViewAdapter recyclerViewAdapter;
    Button btnOrder;
    TextView tvReslt;
    RelativeLayout btnGioHang;
    TextView tvNametr;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        rvList = findViewById(R.id.rvContact);
        btnOrder = findViewById(R.id.btn_Order);
        tvReslt = findViewById(R.id.tv_Results);
        btnGioHang = findViewById(R.id.btn_Gio);
        tvNametr = findViewById(R.id.tv_NameTr);
        btnBack = findViewById(R.id.btnback);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUser = tvNametr.getText().toString().trim();
                AppUser.eUser = strUser;
                finish();
                Intent i = new Intent(RecycleViewActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        getSupportActionBar().setTitle("RecycleViewActivity");
        tvNametr.setText(AppUser.eUser);

        btnGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(RecycleViewActivity.this, MainActivityBackGio.class);
                startActivity(i);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvReslt.setText(tvReslt.getText().toString() +"2");
            }
        });

        foodDemoList=new ArrayList<>();

        food01=new Foodlist("Ph??? Hu???","Ph???-M???-C??m,???m th???c mi???n b???c", "Mi???n Ph??|45Min", "T???i thi???u 50.000??",R.drawable.ic_hohue);
        food02=new Foodlist("Joma Bakery Cafe","B??nh ng???t,Salad,Sandwitch", "Mi???n Ph??|40Min", "T???i thi???u 200.000??",R.drawable.ic_banh);
        food03=new Foodlist("Doner Kebab 1995","M??n ??n Th??? Nh?? K???", "35.000??|30Min", "T???i thi???u 60.000??",R.drawable.ic_donerkebab);
        food04=new Foodlist("C??m ?????i V????ng","M??n ??n Ch??u ??", "18.000??|25Min", "T???i thi???u 75.000??",R.drawable.ic_daivuong);
        food05=new Foodlist("Kh?? g??","Kh?? g?? cay", "12.000d|15Min", "T???i thi???u 40.000??",R.drawable.ic_khoga);
        food06=new Foodlist("Sushi Nh???t B???n","???m th???c Japan", "24.600|45Min", "T???i thi???u 150.000??",R.drawable.ic_sushinb);
        food07=new Foodlist("???c g?? n?????ng t???i v?? ph?? mai","B??nh m???, phomat parmesan", "Mi???n ph??|35Min", "T???i thi???u 65.000??",R.drawable.ic_ucga);
        food08=new Foodlist("Nem Cu???n","???m th???c Vi???t", "22.600|45Min", "T???i thi???u 70.000??",R.drawable.ic_nemcuon);
        food09=new Foodlist("B??nh qu??? c??? ??i???n","Waffle cho bu???i s??ng ho??n h???o", "42.600|45Min", "T???i thi???u 23.000??",R.drawable.ic_banhque);
        food10=new Foodlist("M??? Cay","???m th???c H??n Qu???c", "27.800|45Min", "T???i thi???u 55.000??",R.drawable.ic_mycay);
        food11=new Foodlist("X??c x??ch Balls","X??c x??ch phomai que ", "12.100|45Min", "T???i thi???u 85.000??",R.drawable.ic_xucxich);

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


        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(), 2, RecyclerView.VERTICAL,false);

        recyclerViewAdapter = new ContactRecyclerViewAdapter(this,foodDemoList);

        rvList.setLayoutManager(layoutManager);
        rvList.setAdapter(recyclerViewAdapter);
    }
}