package org.example.streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("Spring");
        List<String> result = list.stream().filter(s->s.startsWith("j")).
                collect(Collectors.toList());
        System.out.println(result);
    }
}
