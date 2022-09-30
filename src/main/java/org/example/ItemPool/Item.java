package org.example.ItemPool;


public class Item {
    private final String name;
    private final int hp;
    private final int mp;
    private final int ad;
    private final int ap;
    private final int ms;
    private final int range;
    private final int def;
    private final int mr;
    private final int as;
    private final int crt;


    public Item(ItemBuilder itemBuilder) {
        this.name = itemBuilder.name;
        this.hp = itemBuilder.hp;
        this.mp = itemBuilder.mp;
        this.ad = itemBuilder.ad;
        this.ap = itemBuilder.ap;
        this.ms = itemBuilder.ms;
        this.range = itemBuilder.range;
        this.def = itemBuilder.def;
        this.mr = itemBuilder.mr;
        this.as = itemBuilder.as;
        this.crt = itemBuilder.crt;

    }
    public String getName() {
        return name;
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

    public int getRange() {
        return range;
    }

    public int getDef() {
        return def;
    }

    public int getMr() {
        return mr;
    }

    public int getAs() {
        return as;
    }

    public int getCrt() {
        return crt;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", ad=" + ad +
                ", ap=" + ap +
                ", ms=" + ms +
                ", range=" + range +
                ", def=" + def +
                ", mr=" + mr +
                ", as=" + as +
                ", crt=" + crt +
                '}';
    }

    public static class ItemBuilder {
        private final String name;
        private int hp;
        private int mp;
        private int ad;
        private int ap;
        private int ms;

        private int range;
        private int def;
        private int mr;
        private int as;
        private int crt;

        public Item builder(){
            return new Item(this);
        }



        public ItemBuilder(String name) {
            this.name=name;
        }

        public ItemBuilder hp(int hp){
            this.hp=hp;
            return this;
        }

        public ItemBuilder mp(int mp){
            this.mp=mp;
            return this;
        }

        public ItemBuilder ad(int ad){
            this.ad=ad;
            return this;
        }

        public ItemBuilder ap(int ap){
            this.ap=ap;
            return this;
        }

        public ItemBuilder def(int def){
            this.def=def;
            return this;
        }

        public ItemBuilder ms(int ms){
            this.ms=ms;
            return this;
        }

        public ItemBuilder mr(int mr){
            this.mr=mr;
            return this;
        }
        public ItemBuilder range(int range){
            this.range=range;
            return this;
        }

        public ItemBuilder as(int as) {
            this.as=as;
            return this;
        }

        public ItemBuilder crt(int crt) {
            this.crt=crt;
            return this;
        }

    }


}
