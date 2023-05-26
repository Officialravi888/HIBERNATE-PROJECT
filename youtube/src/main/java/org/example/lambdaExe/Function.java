package org.example.lambdaExe;

public interface Function {
    void abstractFun(int x);
    default  void normal(){
        System.out.println("hello world!");
    }
}
class Test{
    public static void main(String[] args) {
        Function obj=(int x)->System.out.println(2*x);
        obj.abstractFun(7);
    }
}
