package com.company;

public class Chapter3Test {
    public static void main(String[] args) {
      Chapter3 guy = new Chapter3();
      int cash= guy.getAmount();
        System.out.printf("old amount %d%n",cash);
        guy.setAmount(50);
        cash= guy.getAmount();
        System.out.printf("new amount %d%n",cash);



    }


}

