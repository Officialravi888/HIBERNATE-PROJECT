package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(15);
        list.forEach((n)-> System.out.println(n));
    }
}
