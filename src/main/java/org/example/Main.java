package org.example;

import org.example.ItemPool.Item;
import org.example.ItemPool.ItemPool;
import org.example.SkillsPool.Skill;
import org.example.SkillsPool.SkillBuilder;
import org.example.SkillsPool.SkillPool;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SkillPool skillPool = new SkillPool();
        Skill skill1 = new SkillBuilder("Fire Arrow").setNormalDmg(0).setMagickDmg(0).createSkill();

        Skill skill2 = new SkillBuilder("Frost Arrow").setNormalDmg(0).setMagickDmg(0).createSkill();

        Skill skill3 = new SkillBuilder("Headshot").setNormalDmg(0).setMagickDmg(0).createSkill();

        Skill skill4 = new SkillBuilder("Fire ball").setNormalDmg(0).setMagickDmg(0).createSkill();

        Skill skill5 = new SkillBuilder("Multi Shot").setNormalDmg(0).setMagickDmg(0).createSkill();


//Item Pool
        ItemPool itemPool = new ItemPool();
        Item item = new Item.ItemBuilder("Infinity Edge").ad(75).crt(20).builder();
        Item item2 = new Item.ItemBuilder("Rabadon").ap(120).builder();
        Item item3 = new Item.ItemBuilder("Warmog").hp(800).def(20).mr(20).builder();
        Item item4 = new Item.ItemBuilder("Thornmail").hp(200).def(60).builder();

        itemPool.newItemToPool(item);
        itemPool.newItemToPool(item2);
        itemPool.newItemToPool(item3);
        itemPool.newItemToPool(item4);
        System.out.println(itemPool);

//Champions

        Champion ashe = new Champion("Ashe", 54, 500, 300, 30, 1, 30, 27, 400, 20, 400);
        Champion mf = new Champion("Miss Fortune", 60, 510, 250, 25, 1, 20, 30, 430, 40, 350);
        System.out.println(ashe);
        System.out.println(mf);
        //Adding items to eq of each champion
        ashe.addingItemsToEquipment(itemPool.takeItemFromPool("Rabadon"));
        ashe.addingItemsToEquipment(itemPool.takeItemFromPool("Thornmail"));

        ashe.equipmentToString();

        mf.addingItemsToEquipment(itemPool.takeItemFromPool("Warmog"));
        mf.addingItemsToEquipment(itemPool.takeItemFromPool("Infinity Edge"));

        mf.equipmentToString();

        System.out.println(ashe);
        System.out.println(mf);
        Random rand = new Random();

        while (true) {
            int attack = rand.nextInt(4);

            switch (attack) {
                case 0:
                    ashe.attackNormal(mf);
                    break;
                case 1:
                    mf.attackNormal(ashe);
                    break;
                case 2:
                    mf.attackMagick(ashe);
                    break;
                case 3:
                    ashe.attackMagick(mf);
            }

            System.out.println(ashe);
            System.out.println(mf);
            System.out.println("");


            if (ashe.getHp() <= 0 || mf.getHp() <= 0) {
                break;
            }
        }


    }
}