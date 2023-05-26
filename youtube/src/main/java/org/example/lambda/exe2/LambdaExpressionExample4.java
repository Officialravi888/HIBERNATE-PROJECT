package org.example.lambda.exe2;

import org.example.lambda.exe1.Sayable;

public class LambdaExpressionExample4 {
    public static void main(String[] args) {
        Sayable s1= () -> {
            return "Hello";
        };
        System.out.println(s1.stay());
        Sayable s2=()->{
            return "java";
        };
        System.out.println(s2.stay());
    }
}
