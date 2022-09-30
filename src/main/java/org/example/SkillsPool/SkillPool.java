package org.example.SkillsPool;

import java.util.ArrayList;

public class SkillPool {
    ArrayList<Skill> skillsPool=new ArrayList<>();

    public void newSkillToPool(Skill skill){
        skillsPool.add(skill);
    }

    public void skillRemove(Skill skill){
        skillsPool.removeIf(elem -> elem.getName().equals(skill.getName()));
    }

    public Skill takeSkillFromPool(String name){
        for(Skill element:skillsPool){
            if(element.getName().equals(name)){
                return element;
            }
        }
        System.out.println("No skill in a pool");
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(Skill element:skillsPool){
            sb.append(element.getName()).append(" \n");
        }
        return sb.toString();
    }
}
