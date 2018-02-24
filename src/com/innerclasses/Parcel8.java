package com.innerclasses;
//匿名内部类构建构造器,通过传参的方式
abstract class Base {
    public Base(int i) {
        System.out.println("base constructor" + i);;
    }
    public abstract void f();
}

public class Parcel8 {
    public static Base getBase(int i) {
        return new Base(i) {
            @Override
            public void f() {
                System.out.println("anonymous f()");
            }
        };
    }
    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
