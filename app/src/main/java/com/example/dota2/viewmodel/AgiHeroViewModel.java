package com.example.dota2.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.dota2.R;
import com.example.dota2.model.Hero;

import java.util.ArrayList;

public class AgiHeroViewModel extends ViewModel {

    ArrayList<Hero> agiHeroes;

    public AgiHeroViewModel(ArrayList<Hero> agiHeroes) {
        this.agiHeroes = agiHeroes;
    }

    public void addAgiHeroes() {
        agiHeroes.add(new Hero(2, "Phantom Assassin", R.drawable.pa));
        agiHeroes.add(new Hero(2, "Slark", R.drawable.slark));
        agiHeroes.add(new Hero(2, "Templar Assassin", R.drawable.ta));
        agiHeroes.add(new Hero(2, "Terror Blade", R.drawable.tb));
    }
}
