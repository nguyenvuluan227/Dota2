package com.example.dota2.herodetail.model;

import com.example.dota2.model.Hero;

public class StrategyDetail {

    private Hero hero;
    private String gamePlay;

    public StrategyDetail(Hero hero, String gamePlay) {
        this.hero = hero;
        this.gamePlay = gamePlay;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public String getGamePlay() {
        return gamePlay;
    }

    public void setGamePlay(String gamePlay) {
        this.gamePlay = gamePlay;
    }
}
