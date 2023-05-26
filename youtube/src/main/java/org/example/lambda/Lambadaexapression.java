package org.example.lambda;

public class Lambadaexapression {
    public static void main(String[] args) {
        int withdro=10;
     LambdaExemple lambdaExemple=new LambdaExemple() {
         @Override
         public void drow() {
             System.out.println(":" + withdro);
         }
         };

         lambdaExemple.drow();
    }
}
