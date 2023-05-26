package org.example.oops;

public class Test extends Thread{
    @Override
    public void run() {
        try {
            sleep(20900);
        }catch (Exception e){

        }
        System.out.println("this is ravikant");
    }
}
class M1{
    public static void main(String[] args) {
        Test obj=new Test();
        obj.run();
        Thread o=new Thread(obj);
        o.start();
    }
}
