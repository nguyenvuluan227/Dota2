package com.example.dota2.herodetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dota2.R;
import com.example.dota2.herodetail.adapter.HeroDetailAdapter;
import com.example.dota2.herodetail.model.HeroDetail;
import com.example.dota2.herodetail.viewmodel.HeroDetailViewModel;

import java.util.ArrayList;

public class HeroDetailFragment extends Fragment {
    ArrayList<HeroDetail> heroesdetails;
    RecyclerView recyclerViewHeroDetail;
    HeroDetailAdapter adapter;
    HeroDetailViewModel viewModel;
    LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_heroes_details_hero_detail, container, false);
        recyclerViewHeroDetail = view.findViewById(R.id.recyclerViewHeroDetail);
        layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        heroesdetails = new ArrayList<>();
        viewModel = new HeroDetailViewModel(heroesdetails);
        viewModel.addDescription();
        viewModel.addAbility();
        adapter = new HeroDetailAdapter(heroesdetails);
        recyclerViewHeroDetail.setLayoutManager(layoutManager);
        recyclerViewHeroDetail.setAdapter(adapter);
        return view;
    }
}
