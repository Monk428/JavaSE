package com.holding;

import com.typeinfo.pets.*;
import com.util.Print;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        Print.print(pets);

        Print.print("element " + pets.element());

        Print.print("pets.peek()" + pets.peek());
    }
}
