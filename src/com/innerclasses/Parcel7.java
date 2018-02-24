package com.innerclasses;
//匿名内部类
public class Parcel7 {
    class Contents {
        private int i = 11;
        public int value() { return  i; }
    }
//      原本是：class MyContents implements Contents {
//      int i = xxx;
//    }
    public Contents contents() {

//     return new MyContents();
        return new Contents() {
            private int i = 11;
            public int vlaue() { return i; }
        };
    }
    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());
    }
}
