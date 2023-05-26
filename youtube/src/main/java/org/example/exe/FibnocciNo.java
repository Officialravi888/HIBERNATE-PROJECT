package org.example.exe;

public class FibnocciNo {
    public static void main(String[] args) {
        int a=0, b=1, c=0;
        System.out.println(a+":"+b);
        for (int i=0; i<5; i++){
            c=a+b;
            System.out.println(":"+c);
            a=b;
            b=c;
        }
    }
}
