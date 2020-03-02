package com.example.dota2.herodetail.model;

public class Abilities {

    private String abilitiesName;
    private int abilitiesImage;

    public Abilities(String abilitiesName, int abilitiesImage) {
        this.abilitiesName = abilitiesName;
        this.abilitiesImage = abilitiesImage;
    }

    public String getAbilitiesName() {
        return abilitiesName;
    }

    public void setAbilitiesName(String abilitiesName) {
        this.abilitiesName = abilitiesName;
    }

    public int getAbilitiesImage() {
        return abilitiesImage;
    }

    public void setAbilitiesImage(int abilitiesImage) {
        this.abilitiesImage = abilitiesImage;
    }
}
