package com.innerclasses;

//匿名内部类工厂模式

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
//   注意这里的构造器是private的。没必要取创建工厂的具名类
    private Implementation1() {}
    public void method1() {}
    public void method2() {}
//    外部调用的工厂方法
    public static ServiceFactory factory = new ServiceFactory() {
//        提供获取service的方法，返回匿名对象
                public Service getService() {
                    return new Implementation1();
                }
            };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
    }
}
