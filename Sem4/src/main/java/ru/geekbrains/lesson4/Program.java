package ru.geekbrains.lesson4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);
        String oldValue = hashMap.put("+79001112233", "AAAAAAAA");
        oldValue = hashMap.put("+79001112231", "BBBBBB");
        oldValue = hashMap.put("+79001112232", "CCCCCC");
        oldValue = hashMap.put("+79001112233", "DDDDDDDD");
        oldValue = hashMap.put("+79001112234", "EEEEEEE");
        oldValue = hashMap.put("+79001112235", "MMMMMM");
        oldValue = hashMap.put("+79001112236", "FFFFF");
        oldValue = hashMap.put("+79001112237", "GGGGG1");
        oldValue = hashMap.put("+79001112238", "GGGGG2");
        oldValue = hashMap.put("+79001112239", "GGGGG3");
        oldValue = hashMap.put("+79001112230", "GGGGG4");

        System.out.println(hashMap);

       


    }

}
