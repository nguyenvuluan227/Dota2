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

public class StrengthAdapter extends RecyclerView.Adapter<StrengthAdapter.StrengthViewHolder> {

    ArrayList<Hero> heroes;
    OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public StrengthAdapter(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    @NonNull
    @Override
    public StrengthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_hero_strength, parent, false);
        return new StrengthViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StrengthViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        holder.imgStrength.setImageResource(hero.getHeroImage());
        holder.tvStrength.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class StrengthViewHolder extends RecyclerView.ViewHolder {

        TextView tvStrength;
        ImageView imgStrength;

        public StrengthViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgStrength = itemView.findViewById(R.id.imgStrength);
            tvStrength = itemView.findViewById(R.id.tvHeroStrength);
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
