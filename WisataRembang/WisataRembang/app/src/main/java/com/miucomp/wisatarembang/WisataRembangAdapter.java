package com.miucomp.wisatarembang;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class WisataRembangAdapter extends RecyclerView.Adapter<WisataRembangAdapter.PlayerViewHolder> {
    private Context MyContext;
    private ArrayList<WisataRembang> dataWisata;
    public WisataRembangAdapter(ArrayList<WisataRembang> list, Context context){
        this.MyContext= context;
        this.dataWisata = list;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_main,viewGroup,false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PlayerViewHolder holder, int position) {
        WisataRembang wisataRembang = dataWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisataRembang.getFotoW())
                .fitCenter()
//                .apply(new RequestOptions().override(55,55))
                .into(holder.tfoto);
        final String nama = wisataRembang.getNamaW();
        final String lokasi = wisataRembang.getLokasiW();
        final String harga = wisataRembang.getHargaW();
        final String foto = String.valueOf(wisataRembang.getFotoW());
        final String detail = wisataRembang.getDetailW();
        holder.tnama.setText(nama);
        holder.tLokasi.setText(lokasi);
        holder.tHarga.setText(harga);
//        holder.tDetail.setText(detail);
        holder.btnSelengkapnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), DetailActivity.class).putExtra("nama",nama).putExtra("lokasi",lokasi).putExtra("harga",harga).putExtra("foto",foto).putExtra("detail",detail));
//                Toast.makeText(holder.itemView.getContext(), "sukses", Toast.LENGTH_SHORT).show();
                ((MainActivity)MyContext).finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataWisata.size();
    }

    class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView tnama,tLokasi,tHarga ,tDetail;
        ImageView tfoto;
        Button btnSelengkapnya;

        public PlayerViewHolder(@NonNull View view){
            super(view);
            tnama =  view.findViewById(R.id.txtNama);
            tLokasi =  view.findViewById(R.id.lokasi);
            tHarga =  view.findViewById(R.id.harga);
            tDetail = view.findViewById(R.id.detail);
            tfoto =  view.findViewById(R.id.foto_wisata);
            btnSelengkapnya = view.findViewById(R.id.btnSelengkapnya);
        }
    }
}