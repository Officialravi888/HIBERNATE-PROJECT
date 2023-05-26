package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class Apple {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class StreamApple{
    public static void main(String[] args) {
        List<Apple>list=new ArrayList<>();
        list.add(new Apple(12,"java"));
        for (Apple apple:list){
        }
        System.out.println("apple"+list);
    }
}
