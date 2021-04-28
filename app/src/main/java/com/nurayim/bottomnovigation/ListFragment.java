package com.nurayim.bottomnovigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.nurayim.bottomnovigation.ImageFragment.ImageAdapter;
import com.nurayim.bottomnovigation.ImageFragment.ImageModel;

import java.util.ArrayList;


public class ListFragment extends Fragment {


    RecyclerView recyclerView;
    ImageAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new ImageAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(manager);

        ArrayList<ImageModel> list = new ArrayList<>();
        list.add(0,new ImageModel("https://avatars.mds.yandex.net/get-zen_doc/98844/pub_5c1a6812d07efb00a93f2ec9_5c1a7184ea7bd400aa320f16/scale_1200"));
        list.add(1,new ImageModel("https://million-wallpapers.ru/wallpapers/4/62/15269010987929219683/kisa.jpg"));
        list.add(2,new ImageModel("https://avatars.mds.yandex.net/get-zen_doc/1108934/pub_5b88e9e54e6bec00ae07e736_5b88eaeed6e1a500a9c2b3f2/scale_1200"));
        list.add(3,new ImageModel("https://on-desktop.com/wps/Animals___Cats_Bengal_cat_posing_on_a_brown_background_045462_.jpg"));
        list.add(4,new ImageModel("https://on-desktop.com/wps/Animals___Cats_Bengal_cat_posing_on_a_brown_background_045462_.jpg"));
        list.add(5,new ImageModel("https://on-desktop.com/wps/Animals___Cats_Bengal_cat_posing_on_a_brown_background_045462_.jpg"));
        list.add(6,new ImageModel("https://on-desktop.com/wps/Animals___Cats_Bengal_cat_posing_on_a_brown_background_045462_.jpg"));
        list.add(7,new ImageModel("https://on-desktop.com/wps/Animals___Cats_Bengal_cat_posing_on_a_brown_background_045462_.jpg"));


        adapter.addData(list);
    }
}