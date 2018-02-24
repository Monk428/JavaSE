package com.holding;

import java.util.ArrayList;

class Apple {
    private static long counter = 1;
    private final long id = counter++;
    public long id() { return id; }
}

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple()); //神奇的是，new出来的元素，counter竟然累加了
        for (int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());
        for (Apple c : apples)
            System.out.println(c.id());
    }
}
