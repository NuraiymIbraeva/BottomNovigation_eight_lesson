package com.nurayim.bottomnovigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class TextFragment extends Fragment {

    WebView webView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        webView = view.findViewById(R.id.web_view_item);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://ru.wikihow.com/%D0%B7%D0%B0%D0%B1%D0%BE%D1%82%D0%B8%D1%82%D1%8C%D1%81%D1%8F-%D0%BE-%D0%BA%D0%BE%D1%88%D0%BA%D0%B5");


    }



}