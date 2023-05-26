package org.example.exe;

public class Plandrom {
//    public static void main(String[] args) {
//        int num = 202, rev = 0;
//        int temp=num;
//        while (temp != 0) {
//            int remainder = temp % 10;
//            rev = rev * 10 + remainder;
//            temp /= 10;
//        }
//        if (num == rev)
//            System.out.println("plandrom:"+num);
//        else
//            System.out.println("not plandrom:"+num);
//    }

    static boolean reversno(int num) {
        int temp = num,
                revers = 0;
        while (temp != 0) {
            int remain = temp % 10;
            revers = revers * 10 + remain;
             temp /= 10;
        }
        return  (num == revers);
//            System.out.println("plandrom:" + num);
//        else
//            System.out.println("not plandrom:" + num);

    }
    public static void main(String[] args) {
        int num=292;
        System.out.println(reversno(num));
    }

}
