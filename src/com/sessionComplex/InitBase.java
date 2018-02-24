package com.sessionComplex;

//5.1初始化基类
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class InitBase extends Drawing{
    public InitBase() {
        System.out.println("InitBase constructor");
    }
}
