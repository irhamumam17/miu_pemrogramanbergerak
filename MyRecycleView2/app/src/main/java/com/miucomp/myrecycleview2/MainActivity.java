package com.miucomp.myrecycleview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHmj;
    private ArrayList<Hmj> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("HMJ POLINES");
            getSupportActionBar().setSubtitle("By Muhammad Irhamul Umam");
        }

        rvHmj = findViewById(R.id.rv_hmj);
        rvHmj.setHasFixedSize(true);
        list.addAll(HmjData.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvHmj.setLayoutManager(new LinearLayoutManager(this));
        CardHmjAdapter cardHmjAdapter = new CardHmjAdapter(MainActivity.this,list);
        rvHmj.setAdapter(cardHmjAdapter);
    }
}