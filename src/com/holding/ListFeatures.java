package com.holding;


import com.typeinfo.pets.*;
import java.util.*;
import com.typeinfo.pets.Hamster;
import com.util.Print;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        Print.print("1: " + pets);

        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("2: " + pets);
        Print.print("3: " +pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        Print.print("4: " + p + " " + pets.indexOf(p));

        Print.print("----------------------------");

        List<Pet> sub = pets.subList(1, 4);
        Print.print("subList: " + sub);//判断sub里面所有的元素是否存在
        Print.print("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        Print.print("sorted subList: " + sub);
        Print.print("11: " + pets.containsAll(sub));

        Print.print("----------------------------");

        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        Print.print("sub: " + sub);



    }
}
