package org.example.linklistprogran;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StreamLinkedListRevers {
    public static void main(String[] args) {
        Integer arr[]={2,45,5,7,8,9};
        LinkedList<Integer>linkedList=new LinkedList<>(Arrays.asList(arr));
        linkedList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //System.out.println(linkedList);

    }

}
