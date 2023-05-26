package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Baz1 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(12,32,43,43));
        List<Integer>a=list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(a);


        List<String>name=new ArrayList<>(Arrays.asList("java","php","spring"));
//        List<String>result=name.stream().filter(s -> s.startsWith(collect(Collectors.toList());
//        System.out.println(result);

        List<String>show=name.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        List<Integer>list1=Arrays.asList(2,4,3,4,5,4,35,5,7,5);
        list1.stream().sorted().map(x->x+x).collect(Collectors.toList());
        System.out.println(list1);
    }
}

