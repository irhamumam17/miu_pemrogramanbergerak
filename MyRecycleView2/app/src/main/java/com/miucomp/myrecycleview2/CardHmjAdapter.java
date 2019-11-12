package com.miucomp.myrecycleview2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CardHmjAdapter extends RecyclerView.Adapter<CardHmjAdapter.ListViewHolder> {
    private ArrayList<Hmj> listHmj;
    private Context context;

    public CardHmjAdapter(Context context,ArrayList<Hmj> listHmj){
        this.listHmj = listHmj;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_hmj,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Hmj hmj = listHmj.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hmj.getFoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgFoto);
        holder.tnama.setText(hmj.getNama());
        holder.tdeskripsi.setText(hmj.getDeskripsi());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,DetailListHmj.class)
                        .putExtra("id",hmj.getId())
//                        .putExtra("nama",hmj.getNama())
                );
            }
        });
    }
    @Override
    public int getItemCount() {
        return listHmj.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tnama,tdeskripsi;
        CardView cardView;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            tnama =  itemView.findViewById(R.id.txtNama);
            tdeskripsi = itemView.findViewById(R.id.txtDeskripsi);
            cardView = itemView.findViewById(R.id.cardView_item);
        }
    }
}
