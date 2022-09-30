package org.example.SkillsPool;

public class SkillBuilder {
    private String name = "No Skill";
    private int normalDmg = 0;
    private int magickDmg = 0;

    public SkillBuilder(String name) {
        this.name = name;
    }

    public SkillBuilder setNormalDmg(int normalDmg) {
        this.normalDmg = normalDmg;
        return this;
    }

    public SkillBuilder setMagickDmg(int magickDmg) {
        this.magickDmg = magickDmg;
        return this;
    }

    public Skill createSkill() {
        return new Skill(name, normalDmg, magickDmg);
    }
}