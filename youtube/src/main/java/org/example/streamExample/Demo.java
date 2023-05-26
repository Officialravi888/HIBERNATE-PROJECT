package org.example.streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 8, 9));
        list.forEach(System.out::println);
    }
}
