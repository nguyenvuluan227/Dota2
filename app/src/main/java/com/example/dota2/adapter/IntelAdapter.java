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

public class IntelAdapter extends RecyclerView.Adapter<IntelAdapter.IntelViewHolder> {

    ArrayList<Hero> heroes;
    OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public IntelAdapter(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    @NonNull
    @Override
    public IntelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_hero_intel, parent, false);
        return new IntelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IntelViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        holder.imgIntel.setImageResource(hero.getHeroImage());
        holder.tvIntel.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class IntelViewHolder extends RecyclerView.ViewHolder {

        TextView tvIntel;
        ImageView imgIntel;

        public IntelViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgIntel = itemView.findViewById(R.id.imgIntel);
            tvIntel = itemView.findViewById(R.id.tvHeroIntel);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        listener.onItemClick(itemView,getLayoutPosition());
                    }
                }
            });
        }
    }
}

