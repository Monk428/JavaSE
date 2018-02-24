package com;

//import com.*;


import com.concurrency.MainThread;
import com.holding.ApplesAndOrangesWithGenerics;
import com.holding.HoldingMain;
import com.innerclasses.InnerClassesMain;
import com.sessionComplex.SsComplexMain;
import com.Interface.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main args " + args);
//        SsComplexMain ss = new SsComplexMain();
//        SsComplexMain.main(args);

//        InterfaceMain im = new InterfaceMain();
//        im.main(args);

//        InnerClassesMain icm = new InnerClassesMain();
//        icm.main(args);

//        HoldingMain hm = new HoldingMain();
//        hm.main(args);

        MainThread mt = new MainThread();
        mt.main(args);
    }
}
