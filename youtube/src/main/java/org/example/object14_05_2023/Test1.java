package org.example.object14_05_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("India", "Rashiya", "Lundan"));
        //list.forEach(x-> System.out.print(list));
        List<String>a=list.stream().map(x->x).collect(Collectors.toList());
        System.out.println(a);
    }
}
