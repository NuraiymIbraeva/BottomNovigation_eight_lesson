package com.nurayim.bottomnovigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nurayim.bottomnovigation.ImageFragment.ImageFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().
                beginTransaction().replace(R.id.fragment_cont, new ListFragment())
                .commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {

                case R.id.list_item:
                    selectedFragment = new ListFragment();
                    break;

                case R.id.list_item_two:
                    selectedFragment = new ImageFragment();
                    break;
                case R.id.list_item_third:
                    selectedFragment = new TextFragment();
                    break;


            }
            getSupportFragmentManager().
                    beginTransaction().replace(R.id.fragment_cont, selectedFragment)
                    .commit();

            return true;
        }
    };

}



