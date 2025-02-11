import java.util.Scanner;

public class Quest2 {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int num= sc.nextInt();
        if(num % 2==0){
            System.out.println("Ele é par");
        }
        else
            System.out.println("Ele é impar");
    }
}
