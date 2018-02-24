package com.enumType;

enum Spi {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

public class Spiciness {
    public static void main(String[] args) {
        Spi howhot = Spi.MEDIUM;
        System.out.println(howhot);

//        遍历enum类型,ordinal是枚举声明的顺序
        for (Spi s : Spi.values()) {
            System.out.println(s + ", ordinal" + s.ordinal());
        }
    }
}
