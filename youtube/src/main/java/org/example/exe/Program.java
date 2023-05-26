package org.example.exe;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//How do you find the middle element of a LinkedList?

public class Program {
    public static void main(String[] args) {
        Integer arr[]={3,5,8,4,5};
        LinkedList<Integer>linkedList=new LinkedList<>(List.of(arr));
        Integer middle = linkedList.size()/2;
        Integer a=linkedList.stream()
                .filter(i -> linkedList.indexOf(i)==middle)
                .collect(Collectors.toList()).get(0);
        System.out.println(a);
    }
}
