package com.miucomp.wisatarembang;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridWisataRembangAdapter extends RecyclerView.Adapter<GridWisataRembangAdapter.GridViewHolder> {
    private ArrayList<WisataRembang> listWisata;
    private Context MyContext;
    public GridWisataRembangAdapter(ArrayList<WisataRembang> list, Context context){
        this.MyContext= context;
        this.listWisata = list;
    }
    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_detail_player, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        WisataRembang wisataRembang = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listWisata.get(position).getFotoW())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPlayer);
        holder.namePlayer.setText(listWisata.get(position).getNamaW());
        final String nama = wisataRembang.getNamaW();
        final String lokasi = wisataRembang.getLokasiW();
        final String harga = wisataRembang.getHargaW();
        final String foto = String.valueOf(wisataRembang.getFotoW());
        final String detail = wisataRembang.getDetailW();
        holder.imgPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((DetailActivity)MyContext).finish();
                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), DetailActivity.class).putExtra("nama",nama).putExtra("lokasi",lokasi).putExtra("harga",harga).putExtra("foto",foto).putExtra("detail",detail));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPlayer;
        TextView namePlayer;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPlayer = itemView.findViewById(R.id.itemPlayer);
            namePlayer = itemView.findViewById(R.id.namePlayer);
        }
    }
}
