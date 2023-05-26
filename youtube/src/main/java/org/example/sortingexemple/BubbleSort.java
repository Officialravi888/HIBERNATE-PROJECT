package org.example.sortingexemple;

import org.example.Main;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int array[]){
        int size= array.length;
        for (int i=0; i<size-1; i++)
            for (int j=0; j<size-i-1;j++)
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
    }

    public static void main(String[] args) {
        int[]data={2,5,7,9,4,5,7,8};
        BubbleSort.bubbleSort(data);
        System.out.println("sorted Array in Ascending order");
        System.out.println(Arrays.toString(data));
    }
}
