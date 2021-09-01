package com.ds.bt;

public interface MyInterface {
    public abstract void m1();
    public abstract void m2();
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}
