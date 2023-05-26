package org.example.exe1;

public class Const {
    void m() {
        System.out.println("iiiii");
    }

}
class M extends Const{
    @Override
    void m() {
        super.m();
    }

    public static void main(String[] args) {
M obj=new M();
obj.m();
    }
}

