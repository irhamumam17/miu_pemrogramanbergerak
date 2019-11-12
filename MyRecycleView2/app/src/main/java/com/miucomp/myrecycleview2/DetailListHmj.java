package com.miucomp.myrecycleview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListHmj extends AppCompatActivity {
    private int hmjId;
    TextView tNama,tDesk;
    ImageView imgDetail;
    private ArrayList<Hmj> listHmj = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_hmj);

        hmjId = getIntent().getIntExtra("id",0);

        tNama = findViewById(R.id.namaHmj);
        tDesk = findViewById(R.id.desHmj);
        imgDetail = findViewById(R.id.imgDetail);

        listHmj.addAll(HmjData.getListData());
        setLayout();
    }

    private void setLayout() {
        tNama.setText(listHmj.get(hmjId).getNama());
        tDesk.setText(listHmj.get(hmjId).getDeskripsi());
        Glide.with(this)
                .load(listHmj.get(hmjId).getFoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
