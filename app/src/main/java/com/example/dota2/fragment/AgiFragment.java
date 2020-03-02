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
import com.example.dota2.adapter.AgiAdapter;
import com.example.dota2.adapter.OnItemClickListener;
import com.example.dota2.model.Hero;
import com.example.dota2.viewmodel.AgiHeroViewModel;

import java.util.ArrayList;

public class AgiFragment extends Fragment {

    ArrayList<Hero> agiHeroes;
    RecyclerView recyclerViewAgi;
    AgiAdapter adapter;
    AgiHeroViewModel viewModel;
    GridLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hero_agi, container, false);
        recyclerViewAgi = view.findViewById(R.id.recyclerViewAgi);
        layoutManager = new GridLayoutManager(getActivity(),2,RecyclerView.VERTICAL,false);
        agiHeroes = new ArrayList<>();
        viewModel = new AgiHeroViewModel(agiHeroes);
        viewModel.addAgiHeroes();
        adapter = new AgiAdapter(agiHeroes);
        recyclerViewAgi.setLayoutManager(layoutManager);
        recyclerViewAgi.setAdapter(adapter);
        onItemClick();
        return view;
    }

    private void onItemClick(){
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int position) {
                Intent intent = new Intent(getActivity(), HeroesDetailsActivity.class);
                intent.putExtra("agiType",agiHeroes.get(position).getHeroType());
                intent.putExtra("agiName",agiHeroes.get(position).getHeroName());
                intent.putExtra("agiImage",agiHeroes.get(position).getHeroImage());
                startActivity(intent);
            }
        });
    }
}
