package com.bridgelabz;

public class FindMax {
    public static void printInteger(int a, int b, int c) {
        int max = a;
        if(b > max && b > c) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        printInt(a,b,c,max);
        return;
    }

    private static void printInt(int a, int b, int c, int max) {
        System.out.println("maximum value is :"+max);
    }

    public  static void printFloat(double a, double b, double c) {
        double max = a;
        if(b > max && b > c) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        printFlot(a,b,c,max) ;

    }

    private static <E extends  Comparable<E>> void printFlot(double a, double b, double c, double max) {
        System.out.println("maximum double is :"+max);
    }
    public  static void printString(String a, String b, String c) {
        String max = a;
        if(b.compareTo(max)>0) {
            max = b;
        }
        if(c.compareTo(max)>0) {
            max = c;
        }
        printStr(a,b,c,max) ;
    }

    private static <E extends  Comparable<E>> void printStr(String a, String b, String c, String max) {
        System.out.println("maximum double is :"+max);
    }
    /**
     * genric concept is useful in typesafety
     */
    public  static <E extends  Comparable<E>> E printGenric(E a, E b, E c) {
        E max = a;
        if(b.compareTo(max)>0) {
            max = b;
        }
        if(c.compareTo(max)>0) {
            max = c;
        }
        printGenrics(a,b,c,max) ;
        return max;
    }

    private static <E extends  Comparable<E>> void printGenrics(E a, E b, E c, E max) {
        System.out.println("maximum double is :"+max);
    }
}
