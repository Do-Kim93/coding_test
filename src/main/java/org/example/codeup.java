package org.example;
import java.util.Scanner;

public class codeup {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            String a = Integer.toString(b);
            String[] c = a.split("");
//        System.out.println(c.length);
            for(int i=0; i <= c.length-1; i++){
                System.out.print("["+c[i]);
                for(int l = c.length-2; l >= i; l--){
                    System.out.print(0);
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
