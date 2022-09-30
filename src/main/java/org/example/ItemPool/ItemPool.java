package org.example.ItemPool;

import java.util.ArrayList;

public class ItemPool {
    ArrayList<Item> itemsPool=new ArrayList<>();

    public void newItemToPool(Item item){
        this.itemsPool.add(item);
    }

    public void itemRemove(Item item){
        itemsPool.removeIf(elem -> elem.getName().equals(item.getName()));
    }
    public Item takeItemFromPool(String name){
        for(Item elem:itemsPool){
            if(elem.getName().equals(name)){
                return elem;
            }
        }
        System.out.println("No item in a pool");
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(Item elem:itemsPool){
            sb.append(elem.getName()).append(" \n");
        }
        return sb.toString();
    }
}
