package org.example.container;

import java.util.Scanner;

public class Sc {
    private static Scanner sc;
    public static void init(){
        sc = new Scanner(System.in);
    }
    public static void close(){
        if(sc != null)
            sc.close();
    }

    public static Scanner get(){
        if(sc == null)
            init();
        return sc;
    }
}
