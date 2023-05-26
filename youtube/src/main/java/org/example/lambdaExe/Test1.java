package org.example.lambdaExe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(2);
        arrayList.forEach(n-> System.out.println(n));
    }
}
