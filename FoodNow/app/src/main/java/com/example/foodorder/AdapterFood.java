package com.example.foodorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterFood extends BaseAdapter {
    public AdapterFood(List<Foodlist> foodlistList) {
        this.foodlistList = foodlistList;
    }

    List<Foodlist> foodlistList;
    @Override
    public int getCount() {
        return foodlistList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodlistList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_contact,null);

        TextView tvName = view.findViewById(R.id.tv_NameR);
        TextView tvMota = view.findViewById(R.id.tv_Mota);
        TextView tvMota1 = view.findViewById(R.id.tv_Mota1);
        TextView tvMota2 = view.findViewById(R.id.tv_Mota2);
        ImageView imgPic = view.findViewById(R.id.imgPicTure);

        Foodlist foodlist = foodlistList.get(position);

        tvName.setText(foodlist.getNameFood());
        tvMota.setText(foodlist.getMoTa());
        tvMota1.setText(foodlist.getMoTa1());
        tvMota2.setText(foodlist.getMoTa2());

        imgPic.setImageResource(foodlist.getImga());
        return view;
    }
}
