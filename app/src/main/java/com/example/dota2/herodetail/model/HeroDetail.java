package com.example.dota2.herodetail.model;

import com.example.dota2.model.Hero;

public class HeroDetail {

    public static final int ITEM_DESCRIPTION = 1;
    public static final int ITEM_ABILITY = 2;
    public static final int ITEM_TALENT = 3;

    private Hero hero;
    private int viewType;
    private String description;
    private Abilities abilities;
    private Talents talents;

    public HeroDetail(Hero hero, int viewType, String description, Abilities abilities, Talents talents) {
        this.hero = hero;
        this.viewType = viewType;
        this.description = description;
        this.abilities = abilities;
        this.talents = talents;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }

    public Talents getTalents() {
        return talents;
    }

    public void setTalents(Talents talents) {
        this.talents = talents;
    }
}
