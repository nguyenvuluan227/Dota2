package com.example.dota2.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.dota2.R;
import com.example.dota2.model.Hero;

import java.util.ArrayList;

public class StrengthHeroViewModel extends ViewModel {

    ArrayList<Hero> strengthHeroes;

    public StrengthHeroViewModel(ArrayList<Hero> strengthHeroes) {
        this.strengthHeroes = strengthHeroes;
    }

    public void addStrengthHeroes() {
        strengthHeroes.add(new Hero(1, "Abaddon", R.drawable.abaddon));
        strengthHeroes.add(new Hero(1, "Earth Shaker", R.drawable.es));
        strengthHeroes.add(new Hero(1, "Kunkka", R.drawable.kk));
        strengthHeroes.add(new Hero(1, "Spirit Breaker", R.drawable.sb));
        strengthHeroes.add(new Hero(1, "Sven", R.drawable.sven));
    }
}
