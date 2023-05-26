package org.example.exe;

//How do you find the middle element of a LinkedList?


import java.util.Arrays;

//public class LinkList {
//    public static void main(String[] args) {
//        Integer arr[]={3,5,8,4,5};
//        LinkedList<Integer>linkedList=new LinkedList<>(List.of(arr));
//        Integer middle = linkedList.size()/2;
//        Integer a=linkedList.stream()
//                .filter(i -> linkedList.indexOf(i)==middle)
//                .collect(Collectors.toList()).get(0);
//        System.out.println(a);
//Find the middle element mid of the array ie. arr[(low + high)/2] =6;
public class LinkList {

// phly length print karta h 0 se jetne no hoge fir un no ko divide karta h;
    public static void main(String[] args) {
        LinkList obj=new LinkList();
        int arr[]={4,9,0,8,9,3,1,};
        for (int i=0; i<=arr.length/2; i++){
            if (arr[i] != arr[i+1]){
            }
            System.out.println(i);
        }
    }
}
