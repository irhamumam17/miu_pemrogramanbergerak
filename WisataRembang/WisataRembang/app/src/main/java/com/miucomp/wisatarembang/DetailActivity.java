package com.miucomp.wisatarembang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    TextView tnama,tLokasi,tHarga ,tDetail,tJudul,btnOpenMaps;
    ImageView imgFoto;
    RecyclerView rvGrid;
    Button btnBack;
    private ArrayList<WisataRembang> playersList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        tnama =  findViewById(R.id.txtNama);
        tLokasi =  findViewById(R.id.txtLokasi);
        tHarga =  findViewById(R.id.txtHarga);
        tDetail = findViewById(R.id.detail);
        tJudul = findViewById(R.id.txtJudul);
        imgFoto = findViewById(R.id.imgProfilnya);
        rvGrid = findViewById(R.id.rvGrid);
        btnBack = findViewById(R.id.btnBack);
        btnOpenMaps = findViewById(R.id.btnOpenMaps);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailActivity.this,MainActivity.class));
                finish();
            }
        });
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final String nama = getIntent().getStringExtra("nama");
        String lokasi = getIntent().getStringExtra("lokasi");
        String harga = getIntent().getStringExtra("harga");
        String foto = getIntent().getStringExtra("foto");
        String detail = getIntent().getStringExtra("detail");
        btnOpenMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCityMaps(nama);
            }
        });
        tnama.setText(nama);
        tLokasi.setText("Lokasi : "+lokasi);
        tHarga.setText("Biaya : "+harga);
        tDetail.setText(detail);
        tJudul.setText(nama);
        Resources res = getResources();
        int resID = res.getIdentifier(foto,"drawable",getPackageName());
        Drawable drawable = res.getDrawable(resID);
        imgFoto.setImageDrawable(drawable);

        rvGrid.setHasFixedSize(true);
        playersList.addAll(WisataRembangData.getListData());
        showRecyclerGrid();
    }
    private void showRecyclerGrid(){
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),1, LinearLayoutManager.HORIZONTAL,false);
        rvGrid.setLayoutManager(gridLayoutManager);
        GridWisataRembangAdapter gridHeroAdapter = new GridWisataRembangAdapter(playersList,DetailActivity.this);
        rvGrid.setAdapter(gridHeroAdapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(DetailActivity.this,MainActivity.class));
        finish();
    }
    public void openCityMaps(String location){
        if(Geocoder.isPresent()){
            try {
                Geocoder gc = new Geocoder(this);
                List<Address> addresses= gc.getFromLocationName(location, 5); // get the found Address Objects

                List<LatLng> ll = new ArrayList<LatLng>(addresses.size()); // A list to save the coordinates if they are available
                for(Address a : addresses){
                    if(a.hasLatitude() && a.hasLongitude()){
                        ll.add(new LatLng(a.getLatitude(), a.getLongitude()));
                    }else {
                        Toast.makeText(this, "You don't have a maps applications!!", Toast.LENGTH_SHORT).show();
                    }
                }
                String latt =String.valueOf(ll.get(0).latitude);
                String longi = String.valueOf(ll.get(0).longitude);
                openMaps(latt,longi);
            } catch (IOException e) {
                Toast.makeText(this, "You don't have a maps applications!!", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }
    }
    public void openMaps(String lat,String lon){
        try {
            Uri uri = Uri.parse("geo:"+lat+","+lon);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Toast.makeText(this, "You don't have a maps applications!!", Toast.LENGTH_SHORT).show();
        }
    }
}
