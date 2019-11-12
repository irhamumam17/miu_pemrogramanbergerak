package com.miucomp.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHmj;
    private ArrayList<Hmj> list= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHmj = findViewById(R.id.rv_hmj);
        if (getSupportActionBar()!=null){
//            getSupportActionBar().setDisplayShowTitleEnabled(true);
//            getSupportActionBar().setHomeAsUpIndicator(R.drawable.polines_logo);
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setIcon();
            getSupportActionBar().setTitle("HM & UKM Polines");
            getSupportActionBar().setSubtitle("By Muhammad Irhamul Umam");
        }
        list.addAll(getListHmj());
        showRecycleList();
    }
    public ArrayList<Hmj> getListHmj(){
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        String[] dataPhoto = getResources().getStringArray(R.array.photo);
        ArrayList<Hmj> listHmj = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++){
            Hmj hmj = new Hmj();
            hmj.setName(dataName[i]);
            hmj.setDescription(dataDescription[i]);
            hmj.setPhoto(dataPhoto[i]);
            listHmj.add(hmj);
        }
        return listHmj;
    }
    private void showRecycleList() {
        rvHmj.setLayoutManager(new LinearLayoutManager(this));
        ListHmjAdapter listHmjAdapter = new ListHmjAdapter(list);
        rvHmj.setAdapter(listHmjAdapter);
    }
}
