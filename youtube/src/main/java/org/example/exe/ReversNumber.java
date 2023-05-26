package org.example.exe;

public class ReversNumber {
    public static void main(String[] args) {
        int num=1234567, revers=0;
        while (num!=0){
            int remainder=num%10;
            revers=revers*10+remainder;
            num=num/10;
            System.out.println(revers);
        }
    }
}
