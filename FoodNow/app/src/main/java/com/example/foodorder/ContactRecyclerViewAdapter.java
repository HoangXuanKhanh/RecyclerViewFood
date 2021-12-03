package com.example.foodorder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactRecyclerViewAdapter extends RecyclerView.Adapter<ContactRecyclerViewAdapter.Viewhoder> {

    List<Foodlist> foodlistList;
    Context context;

    public ContactRecyclerViewAdapter(Context context, List<Foodlist> foodlistList) {
        this.context = context;
        this.foodlistList = foodlistList;
    }
    @NonNull
    @Override
    public ContactRecyclerViewAdapter.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_recyclerview, null);
        Viewhoder viewhoder = new Viewhoder(view);

        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactRecyclerViewAdapter.Viewhoder holder, int position) {

        Foodlist foodlist = foodlistList.get(position);

        holder.tvName.setText(foodlist.getNameFood());
        holder.tvMota.setText(foodlist.getMoTa());
        holder.tvMota1.setText(foodlist.getMoTa1());
        holder.tvMota2.setText(foodlist.getMoTa2());
        holder.imgPic.setImageResource(foodlist.getImga());

        holder.layoutIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClikUserBackGio(foodlist);
            }
            
        });
    }

    private void onClikUserBackGio(Foodlist foodlist) {
        Intent ie = new Intent(context, MainActivityBackGio.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Object_foodlist",foodlist);
        ie.putExtras(bundle);
        context.startActivity(ie);
    }

    @Override
    public int getItemCount() {
        return foodlistList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        LinearLayout layoutIcon;
        TextView tvName;
        TextView tvMota ;
        TextView tvMota1 ;
        TextView tvMota2 ;
        ImageView imgPic;
        public Viewhoder(@NonNull View itemView) {
            super(itemView);
               layoutIcon = itemView.findViewById(R.id.layout_icon);
               tvName = itemView.findViewById(R.id.tv_NameR);
               tvMota = itemView.findViewById(R.id.tv_Mota);
               tvMota1 = itemView.findViewById(R.id.tv_Mota1);
               tvMota2 = itemView.findViewById(R.id.tv_Mota2);
               imgPic = itemView.findViewById(R.id.imgPicTure);
        }
    }
}
