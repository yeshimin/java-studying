package com.yeshimin.test.java.reflect;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ysm on 17-10-18.
 */
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class c = System.out.getClass();
        ((PrintStream)c.cast(System.out)).println("hello world");

        boolean b;
        Class c2 = boolean.class;
        System.out.println("c2: " + c2.getCanonicalName());

        Class c3 = int[][][].class;
        System.out.println("c3: " + c3.getName());
        int[] ix = new int[3];
        ix.getClass();
        System.out.println("new int[][][].getClass(): " + new int[3][][].getClass());
        System.out.println("new long[][][].getClass(): " + new long[3][][].getClass());

        Class c4 = Class.forName("java.lang.Integer");
        System.out.println("c4: " + c4.getName());
        System.out.println("c4: " + c4.getClass().getName());

        System.out.println("".getClass().getName());
        System.out.println(new String[1].getClass().getName());

        Class c5 = Integer.class;
        System.out.println("c5: " + c5.getName());
        Class c6 = Integer.TYPE;
        System.out.println("c6: " + c6.getName());

        Class c7 = void.class;
        System.out.println("c7: " + c7);
        Class c8 = Void.TYPE;
        System.out.println("c8: " + c8);

        Class c9 = Integer.class.getSuperclass();
        System.out.println("c9: " + c9.getName());

        Class[] c10 = Integer.class.getClasses();
        for (Class c10x : c10) {
            System.out.println("c10x: " + c10x.getName());
        }

        Class[] c11 = Character.class.getClasses();
        for (Class c11x : c11) {
            System.out.println("c11x: " + c11x.getName());
        }

        Class[] c12 = Character.class.getDeclaredClasses();
        for (Class c12x : c12) {
            System.out.println("c12x: " + c12x.getName());
        }

//        Character.class.getConstructors()[0].newInstance("");
//        Character.class.getMethods()[0].invoke(null, null);
        System.out.println("field[0].name: " + Character.class.getFields()[0].getName());

        Field f1 = System.class.getField("out");
        Class c13 = f1.getType();
        Class c14 = f1.getDeclaringClass();
        System.out.println("c13: " + c13.getName());
        System.out.println("c14: " + c14.getName());

        Class c15 = Thread.State.class.getEnclosingClass();
        System.out.println("c15: " + c15.getName());

        Class c16 = Character.class.getDeclaringClass();
        System.out.println("c16: " + c16.getName());
    }
}
