package org.example.checkedexception;

public class Interrupt extends Thread {
    public void run() {
        System.out.println("success");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Interrupt" + ex);
        }
    }
}
    class m {
        public static void main(String[] args) throws InterruptedException{
            Interrupt i = new Interrupt();
            i.start();
        }
}
