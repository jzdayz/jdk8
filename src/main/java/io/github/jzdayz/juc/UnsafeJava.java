package io.github.jzdayz.juc;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeJava {
    public final static Unsafe UNSAFE;

    static {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            Object o = theUnsafe.get(null);
            UNSAFE = (Unsafe) o;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
