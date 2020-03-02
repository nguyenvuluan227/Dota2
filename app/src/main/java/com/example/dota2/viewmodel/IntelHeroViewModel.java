package com.example.dota2.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.dota2.R;
import com.example.dota2.model.Hero;

import java.util.ArrayList;

public class IntelHeroViewModel extends ViewModel {

    ArrayList<Hero> intelHeroes;

    public IntelHeroViewModel(ArrayList<Hero> intelHeroes) {
        this.intelHeroes = intelHeroes;
    }

    public void addIntelHeroes() {
        intelHeroes.add(new Hero(3, "Lina", R.drawable.lina));
        intelHeroes.add(new Hero(3, "Necrophos", R.drawable.necro));
    }
}
