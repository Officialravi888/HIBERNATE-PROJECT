package org.example.exe;

public class PrimeNo {
    public static void main(String[] args) {
    int num=24;
    if(num==1){
        System.out.println("no prime");
    }
    for (int i=2; i<num/2; i++){
        if (num%i==0) {
            System.out.println("not peime");
            return;
        }
    }
    System.out.println("prime");
    }
}
