package com.holding;

import java.util.*;

public class SimpleCollection {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String> map) {
        map.put("rag", "FUzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        ArrayList d = new ArrayList();
        for (int i = 0; i < 10; i++) {
            c.add(i);
            d.add(i);
        }
        for (Integer i : c) {
            System.out.println(i + ". ");
        }

        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        Integer[] moreInts = { 6, 7, 8};
        collection.addAll(Arrays.asList(moreInts));

        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new HashMap<String,String>()));
    }
}
