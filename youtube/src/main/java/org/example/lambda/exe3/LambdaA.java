package org.example.lambda.exe3;

public class LambdaA {
    public static void main(String[] args) {
        Addable s=(a,b)->(a+b);
            System.out.println(s.add(1,56));
        }

}
