package com.example.dota2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dota2.herodetail.HeroesDetailsActivity;
import com.example.dota2.R;
import com.example.dota2.adapter.OnItemClickListener;
import com.example.dota2.adapter.StrengthAdapter;
import com.example.dota2.model.Hero;
import com.example.dota2.viewmodel.StrengthHeroViewModel;

import java.util.ArrayList;

public class StrengthFragment extends Fragment {
    ArrayList<Hero> strengthHeroes;
    RecyclerView recyclerViewStrength;
    StrengthAdapter adapter;
    StrengthHeroViewModel viewModel;
    GridLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hero_strength, container, false);
        recyclerViewStrength = view.findViewById(R.id.recyclerViewStrength);
        layoutManager = new GridLayoutManager(getActivity(), 2, RecyclerView.VERTICAL, false);
        strengthHeroes = new ArrayList<>();
        viewModel = new StrengthHeroViewModel(strengthHeroes);
        viewModel.addStrengthHeroes();
        adapter = new StrengthAdapter(strengthHeroes);
        recyclerViewStrength.setLayoutManager(layoutManager);
        recyclerViewStrength.setAdapter(adapter);
        onItemClick();
        return view;
    }

    private void onItemClick() {
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int position) {
                Intent intent = new Intent(getActivity(), HeroesDetailsActivity.class);
                intent.putExtra("strengthType",strengthHeroes.get(position).getHeroType());
                intent.putExtra("strengthName",strengthHeroes.get(position).getHeroName());
                intent.putExtra("strengthImage",strengthHeroes.get(position).getHeroImage());
                startActivity(intent);
            }
        });
    }

}
