package com.example.dota2.herodetail.model;

public class CounterDetail {

    private String badAgainst;
    private String goodAgainst;
    private String workWellWith;

    public CounterDetail(String badAgainst, String goodAgainst, String workWellWith) {
        this.badAgainst = badAgainst;
        this.goodAgainst = goodAgainst;
        this.workWellWith = workWellWith;
    }

    public String getBadAgainst() {
        return badAgainst;
    }

    public void setBadAgainst(String badAgainst) {
        this.badAgainst = badAgainst;
    }

    public String getGoodAgainst() {
        return goodAgainst;
    }

    public void setGoodAgainst(String goodAgainst) {
        this.goodAgainst = goodAgainst;
    }

    public String getWorkWellWith() {
        return workWellWith;
    }

    public void setWorkWellWith(String workWellWith) {
        this.workWellWith = workWellWith;
    }
}
