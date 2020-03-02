package com.example.dota2.herodetail.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.dota2.R;
import com.example.dota2.herodetail.model.Abilities;
import com.example.dota2.herodetail.model.HeroDetail;
import com.example.dota2.herodetail.model.Talents;
import com.example.dota2.model.Hero;

import java.util.ArrayList;

public class HeroDetailViewModel extends ViewModel {

    ArrayList<HeroDetail> heroDetails;
    Hero heroes;
    Talents talents;
    Abilities abilities;

    public HeroDetailViewModel(ArrayList<HeroDetail> heroDetails) {
        this.heroDetails = heroDetails;
    }

    public void addDescription() {
        heroDetails.add(new HeroDetail(heroes, 1, "Abaddon, the Lord of Avernus, is a melee strength hero known as one of the most versatile characters in Dota due to his rather low mana dependence, short spell cooldowns and a large number of viable item choices. His ability to help sustain his allies and himself plus his strong tower diving capacity give him solid lane presence. Many of his abilities offer a large sum of utility, which makes him a strong support hero. Mist Coil serves as both a single target nuke and heal that helps shift the sustainability of both allied and enemy heroes in a lane at his will, though sacrificing a portion of his own health. Aphotic Shield holds as one of the most useful abilities in the game, able to shield a target from some damage while also able to reflect said damage to a huge area. The most important aspect is how it is able to dispel many status effects such as slows and stuns. His other abilities allow him to become a mix between a semi-carry and tank. Abaddon's passive, Curse of Avernus, allows his attacks to not only slow down his enemy, but also increase the attack speed of any ally attacking the same target. With his ultimate, Borrowed Time, Abaddon is able to shift all non-HP-removal damage he receives into health. When not on cooldown, Borrowed Time may activate passively when his health falls under a certain threshold, even under the most dire situations. Due to his powerful spells and versatility, Abaddon is an excellent addition to any team.", abilities, talents));

    }

    public void addAbility(){
       Abilities abilities1 = new Abilities("",R.drawable.mistcoil);
       Abilities abilities2 = new Abilities("",R.drawable.aphoticshield);
       Abilities abilities3= new Abilities("",R.drawable.curseofavenus);
       Abilities abilities4 = new Abilities("",R.drawable.borrowedtime);
       heroDetails.add(new HeroDetail(heroes,2,"",abilities1,talents));
       heroDetails.add(new HeroDetail(heroes,2,"",abilities2,talents));
       heroDetails.add(new HeroDetail(heroes,2,"",abilities3,talents));
       heroDetails.add(new HeroDetail(heroes,2,"",abilities4,talents));
    }

}
