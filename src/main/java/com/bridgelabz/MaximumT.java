package com.bridgelabz;

public class MaximumT<T extends  Comparable<T>> {
    T x,y,z;

    public MaximumT(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public  T Maximum() {
        return MaximumT.Maximum(x,y,z);
    }

    private static <T extends  Comparable<T>> T Maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max)>0) {
            max = y;
        }
        if(z.compareTo(max)>0) {
            max = z;
        }
        printMax(x,y,z,max);
        return  max;
    }

    public static String valueMax(String x, String y, String z) {
        String max = x;
        if(y.compareTo(max)>0) {
            max = y;
        }
        if(z.compareTo(max)>0) {
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }
    private static <T extends  Comparable<T>> void printMax(T x, T y, T z, T max) {
        System.out.println("values are :"+x+" "+y+" "+z+"result :"+max);
    }
}
