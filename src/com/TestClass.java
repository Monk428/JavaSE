package com;

import java.util.Arrays;
import java.util.Random;
import static com.util.Print.*;

public class TestClass {
    TestClass() {
        print("aaa");
        TestArray.printArray(new Object[] {"one", "two", "three"});
    }
}

class TestArray {
    static void printArray(Object... args) {
        for (Object obj : args)
            System.out.println(obj + " ");
    }
}
