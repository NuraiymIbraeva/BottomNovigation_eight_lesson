package com.nurayim.bottomnovigation.ImageFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.nurayim.bottomnovigation.R;


public class ImageFragment extends Fragment {
    ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = view.findViewById(R.id.image_view1);
        Glide.with(requireContext()).load(
                "https://zagge.ru/wp-content/uploads" +
                        "/2019/06/aHR0cDovL3d3dy5saXZlc2N.jpg")
                .into(imageView);



    }
}