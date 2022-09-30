package org.example.SkillsPool;

import org.example.Champion;

public class Skill {
    private String name;
    private int normalDmg;


    public Skill(SkillBuilder skillBuilder){

    }

    public Skill(String name, int normalDmg, int magickDmg) {
    }

    public void setNormalDmg(int normalDmg) {
        this.normalDmg = normalDmg;
    }

    public void setMagickDmg(int magickDmg) {
        this.magickDmg = magickDmg;
    }

    public String getName() {
        return name;
    }

    public int getNormalDmg() {
        return normalDmg;
    }

    public int getMagickDmg() {
        return magickDmg;
    }

    private int magickDmg;



}
