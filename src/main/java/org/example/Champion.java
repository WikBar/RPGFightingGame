package org.example;


import org.example.ItemPool.Item;
import org.example.SkillsPool.SkillPool;

import java.util.Random;

public class Champion {
    private final String name;

    private Equipment eq;
    private SkillPool skills;
    private int hp;
    private int mp;
    private int ad;
    private int ap;
    private int ms;
    private int def;
    private int mr;
    private int range;
    private int as;
    private int crt;

    public int getHp() {
        return hp;
    }

    public Champion(String name, int ad, int hp, int mp, int ap, int ms, int def, int mr, int as, int crt, int range) {
        this.eq=new Equipment();
        this.name = name;
        this.ad = ad;
        this.hp = hp;
        this.mp = mp;
        this.ap = ap;
        this.ms = ms;
        this.def = def;
        this.mr = mr;
        this.range = range;
        this.as = as;
        this.crt = crt;
    }

    public void addingItemsToEquipment(Item item){
        this.eq.addItemToEq(item);
        this.hp+=this.eq.getHp();
        this.mp+=this.eq.getMp();
        this.ap+=this.eq.getAp();
        this.ad+=this.eq.getAd();
        this.ms+=this.eq.getMs();
        this.range+=this.eq.getRange();
        this.crt+=this.eq.getCrt();
        this.mr+=this.eq.getMr();
        this.def+=this.eq.getDef();
        this.as+=this.eq.getAs();
    }

    /*private void statsEquipment(){

        this.hp += eq.getHp();
        this.mp += eq.getMp();
        this.ad += eq.getAd();
        this.ap += eq.getAp();
        this.ms += eq.getMs();
        this.def += eq.getDef();
        this.mr += eq.getMr();
        this.range += eq.getRange();
        this.as += eq.getAs();
        this.crt += eq.getCrt();
    }*/

    public void attackNormal(Champion enemy) {

        if (isCritic(this.crt) && (this.ad-enemy.def)>0) {
            enemy.hp -= 2 * (this.ad-enemy.def);
            System.out.println(this.name + " hit normal attack " + enemy.name + " by " + 2 * (this.ad-enemy.def) + " and it was Critical Hit");

        } else if((this.ad-enemy.def)>0) {
            enemy.hp -= this.ad-enemy.def;
            System.out.println(this.name + " hit normal attack " + enemy.name + " by " + (this.ad-enemy.def));

        }else{
            System.out.println(this.name + " miss normal attack on " + enemy.name );

        }

    }

    private boolean isCritic(int crt) {
        Random rand=new Random();
        return rand.nextInt(100)<=crt;
    }

    public void attackMagick(Champion enemy) {

        this.mp-=10;
        if((this.ap-this.mr)>0) {
            enemy.hp -= (this.ap - this.mr);
            System.out.println(this.name + " hit magick attack " + enemy.name + " by " + (this.ap - this.mr) );
        }else{
            System.out.println(this.name + " miss magick attack on " + enemy.name);
        }

        }

    @Override
    public String toString() {
        if(this.hp<=0) return this.name +" is dead";
        return this.name + " has a " + this.hp + " hp and " + this.mp +" mp "
                + this.ad + " ad " + this.ap + " ap "+ this.def + " def " + this.mr + " mr ";
    }


    public void equipmentToString() {
        System.out.println(this.name + "\n" + this.eq.toString());
    }



}









