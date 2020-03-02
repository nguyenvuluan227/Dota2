package com.example.dota2.model;

public class Hero {

    public static final int TYPE_STRENGTH = 1;
    public static final int TYPE_AGI = 2;
    public static final int TYPE_INTEL = 3;

    private int heroType;
    private String heroName;
    private int heroImage;

    public Hero(int heroType, String heroName, int heroImage) {
        this.heroType = heroType;
        this.heroName = heroName;
        this.heroImage = heroImage;
    }

    public int getHeroType() {
        return heroType;
    }

    public void setHeroType(int heroType) {
        this.heroType = heroType;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(int heroImage) {
        this.heroImage = heroImage;
    }
}
