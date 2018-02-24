package com.innerclasses;
//简单内部类
public class Parcell {
    class Contents {
        private int i = 11;
        public int value() { return  i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents() {
        return new Contents();
    }
    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("Tasmania");
        Parcell q = new Parcell();
        Parcell.Contents c = q.contents();
        Parcell.Destination d = q.to("bbb");
    }

}
