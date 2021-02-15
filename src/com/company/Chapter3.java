package com.company;

public class Chapter3 {
   private int amount;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAmount(int amount) {
        this.amount += amount;
    }
    public int getAmount() {
        return amount;
    }
}
