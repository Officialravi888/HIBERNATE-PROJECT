package org.example.lambda.exe1;

public class M {
    public static void main(String[] args) {
        Sayable s=()->{
            return "java";
        };
        System.out.println(s.stay());
    }
}
