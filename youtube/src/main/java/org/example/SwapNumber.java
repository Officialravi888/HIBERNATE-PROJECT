package org.example;

public class SwapNumber {
    public static void main(String[] args) {
        int a=10, b=20;
        int temp=0;
        System.out.println(a+":a original b:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+":a or b:"+b);
    }
}
