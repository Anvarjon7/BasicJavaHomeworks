package de.telran.hometasks.lesson2;

public class BinarySystem {
    public static void main(String[] args) {

        String hexNum = "333";
        int decNum = Integer.parseInt(hexNum,16);
        System.out.println(decNum);

        int x = 819;
        String y = Integer.toHexString(x);
        System.out.println(y);

        String a = "101101";
        int b = Integer.parseInt(a,2);
        System.out.println(b);

        int decimalNumber = 124;
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println(binaryNumber);

    }
}