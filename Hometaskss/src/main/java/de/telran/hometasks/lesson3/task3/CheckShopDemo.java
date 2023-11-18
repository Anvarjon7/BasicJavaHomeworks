package de.telran.hometasks.lesson3.task3;

import de.telran.hometasks.lesson3.task3.CheckShop;

public class CheckShopDemo {
    public static void main(String[] args) {
        CheckShop goShopping = new CheckShop();


        System.out.println("Can i go to shop? -->> " + goShopping.canBuy(true,false));

    }
}
