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
import com.example.dota2.adapter.IntelAdapter;
import com.example.dota2.adapter.OnItemClickListener;
import com.example.dota2.model.Hero;
import com.example.dota2.viewmodel.IntelHeroViewModel;

import java.util.ArrayList;

public class IntelFragment extends Fragment {

    ArrayList<Hero> intelHeroes;
    RecyclerView recyclerViewIntel;
    IntelAdapter adapter;
    IntelHeroViewModel viewModel;
    GridLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hero_intel, container, false);
        recyclerViewIntel = view.findViewById(R.id.recyclerViewIntel);
        layoutManager = new GridLayoutManager(getActivity(), 2, RecyclerView.VERTICAL, false);
        intelHeroes = new ArrayList<>();
        viewModel = new IntelHeroViewModel(intelHeroes);
        viewModel.addIntelHeroes();
        adapter = new IntelAdapter(intelHeroes);
        recyclerViewIntel.setLayoutManager(layoutManager);
        recyclerViewIntel.setAdapter(adapter);
        onItemClick();
        return view;
    }

    private void onItemClick() {
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int position) {
                Intent intent = new Intent(getActivity(), HeroesDetailsActivity.class);
                intent.putExtra("intelType",intelHeroes.get(position).getHeroType());
                intent.putExtra("intelName",intelHeroes.get(position).getHeroName());
                intent.putExtra("intelImage",intelHeroes.get(position).getHeroImage());
                startActivity(intent);
            }
        });
    }
}
