package com.nurayim.bottomnovigation.ImageFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nurayim.bottomnovigation.R;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    ArrayList<ImageModel> list = new ArrayList<>();


    public void  addData(ArrayList<ImageModel> data){
       list = data;
       notifyDataSetChanged();

    }




    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.image_item,parent,false);
        return  new ImageViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.onBind(list.get(position),holder.itemView.getContext());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
