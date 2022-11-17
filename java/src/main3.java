
//import java.util.Scanner;
//
//public class main3 {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-14s %03d \n" ,s1 , x);
//        }
//        System.out.println("================================");
//
//    }
//}

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        System.out.println("enter a no \n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<=10;i++){
            int a = n*i;
            System.out.println("%n X %i = %a\n");
        }

    }
}