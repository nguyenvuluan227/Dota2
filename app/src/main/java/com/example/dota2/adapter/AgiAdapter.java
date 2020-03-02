package com.example.dota2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dota2.R;
import com.example.dota2.model.Hero;

import java.util.ArrayList;

public class AgiAdapter extends RecyclerView.Adapter<AgiAdapter.AgiViewHolder> {

    ArrayList<Hero> heroes;
    OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public AgiAdapter(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    @NonNull
    @Override
    public AgiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_hero_agi, parent, false);
        return new AgiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AgiViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        holder.imgAgi.setImageResource(hero.getHeroImage());
        holder.tvAgi.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class AgiViewHolder extends RecyclerView.ViewHolder {

        TextView tvAgi;
        ImageView imgAgi;

        public AgiViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgAgi = itemView.findViewById(R.id.imgAgi);
            tvAgi = itemView.findViewById(R.id.tvHeroAgi);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onItemClick(itemView, getLayoutPosition());
                    }
                }
            });
        }
    }
}

