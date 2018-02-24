package com.innerclasses;
//局部内部类
//方法的作用域内创建内部类
public class Parcel5 {
    class Contents {
        private int i = 11;
        public int value() { return  i; }
    }
    interface Destination {
        String readLabel();
    }

    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("ta");
        System.out.println(d.readLabel());
    }
}
