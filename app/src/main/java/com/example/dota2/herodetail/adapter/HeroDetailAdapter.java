package com.example.dota2.herodetail.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dota2.R;
import com.example.dota2.herodetail.model.HeroDetail;

import java.util.ArrayList;

import static com.example.dota2.herodetail.model.HeroDetail.ITEM_ABILITY;
import static com.example.dota2.herodetail.model.HeroDetail.ITEM_DESCRIPTION;
import static com.example.dota2.herodetail.model.HeroDetail.ITEM_TALENT;

public class HeroDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<HeroDetail> heroDetails;

    public HeroDetailAdapter(ArrayList<HeroDetail> heroDetails) {
        this.heroDetails = heroDetails;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == ITEM_DESCRIPTION) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            view = layoutInflater.inflate(R.layout.item_heroes_details_description, parent, false);
            return new DesciptionViewHolder(view);
        } else if (viewType == ITEM_ABILITY) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            view = layoutInflater.inflate(R.layout.item_heroes_details_ability, parent, false);
            return new AbilityViewHolder(view);
        } else return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == ITEM_DESCRIPTION) {
            HeroDetail heroDetail = heroDetails.get(position);
            DesciptionViewHolder viewHolder = (DesciptionViewHolder) holder;
            viewHolder.tvdescription.setText(heroDetail.getDescription());
        } else if (getItemViewType(position) == ITEM_ABILITY) {
            HeroDetail heroDetail = heroDetails.get(position);
            AbilityViewHolder viewHolder = (AbilityViewHolder) holder;
            viewHolder.tvAbilityName.setText(heroDetail.getAbilities().getAbilitiesName());
            viewHolder.imgAbility.setImageResource(heroDetail.getAbilities().getAbilitiesImage());
            viewHolder.tvAbility.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return heroDetails.size();
    }

    @Override
    public int getItemViewType(int position) {
        switch (heroDetails.get(position).getViewType()) {
            case 1:
                return ITEM_DESCRIPTION;
            case 2:
                return ITEM_ABILITY;
            case 3:
                return ITEM_TALENT;
            default:
                return -1;
        }
    }

    class DesciptionViewHolder extends RecyclerView.ViewHolder {

        TextView tvdescription;

        public DesciptionViewHolder(@NonNull View itemView) {
            super(itemView);
            tvdescription = itemView.findViewById(R.id.tvDescription);
        }
    }

    class AbilityViewHolder extends RecyclerView.ViewHolder {

        TextView tvAbility, tvAbilityName;
        ImageView imgAbility;

        public AbilityViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAbility = itemView.findViewById(R.id.tvAbility);
            tvAbilityName = itemView.findViewById(R.id.tvAbilityName);
            imgAbility = itemView.findViewById(R.id.imgAbility);
        }
    }
}
