package com.nurayim.bottomnovigation.ImageFragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nurayim.bottomnovigation.R;

public class ImageViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;




    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
    }

     public  void  onBind(ImageModel model, Context context){
         Glide.with(context)
                 .load(model.imageF)
                 .circleCrop()
                 .into(imageView);




     }
}
