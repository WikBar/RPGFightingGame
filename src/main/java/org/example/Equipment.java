package org.example;

import org.example.ItemPool.Item;

public class Equipment {
    private final int SLOTS = 6;
    private final Item[] items = new Item[SLOTS];
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


    public void addItemToEq(Item item) {
        int hp = 0,mp=0,ad=0,ap=0,ms=0,def=0,mr=0,range=0,as=0,crt=0;
        for (int i = 0; i < SLOTS; i++) {
            if (this.items[i] == null) {
                this.items[i] = item;
                break;
            }
        }

        for(int i = 0; i<SLOTS;i++){
            if(this.items[i] != null){

                hp+=items[i].getHp();
                mp+=items[i].getMp();
                ad+=items[i].getAd();
                ap+=items[i].getAp();
                ms+=items[i].getMs();
                def+=items[i].getDef();
                mr+=items[i].getMr();
                range+=items[i].getRange();
                as+=items[i].getAs();
                crt+=items[i].getCrt();
            }

            this.hp=hp;
            this.mp=mp;
            this.ad=ad;
            this.ap=ap;
            this.ms=ms;
            this.def=def;
            this.mr=mr;
            this.range=range;
            this.as=as;
            this.crt=crt;
        }


    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String slot;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                slot = "Slot " + (i + 1) + " is empty\n";
                sb.append(slot);

            } else {
                slot = "In slot " + (i + 1) + " is " + items[i].getName() + "\n";
                sb.append(slot);
            }

        }
        return sb.toString();
    }
    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAd() {
        return ad;
    }

    public int getAp() {
        return ap;
    }

    public int getMs() {
        return ms;
    }

    public int getDef() {
        return def;
    }

    public int getMr() {
        return mr;
    }

    public int getRange() {
        return range;
    }

    public int getAs() {
        return as;
    }

    public int getCrt() {
        return crt;
    }
}



