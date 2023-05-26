package org.example.oops;
//Inheritance
//ANS-: Inheritance is the important pillar of the oops(object oriented programming language)
//there are define to class one class variable and method define and acces by onother class is called of the
//Inheritance.
public class Animal {
    public void eat(){
        System.out.println("i am hungry");
    }
}
class Dog extends Animal{
    public void pappy(){
        System.out.println("Dog is hungry");
    }
    public static void child(){
        System.out.println("dog is child");
    }
}
class Main{
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.eat();
        Dog obj1=new Dog();
        obj1.pappy();
        Dog.child();
    }
}
