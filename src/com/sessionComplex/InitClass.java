package com.sessionComplex;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ". j= " + j);
        j = 39;
    }
    private static int x1 = printInit("static insect...");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class InitClass extends Insect{
    private int k = printInit("beet");
    public InitClass() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static bee...");
}
