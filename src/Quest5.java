import java.util.Scanner;

public class Quest5 {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME UM NUMERO DE 1 A 7");
        int num= sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor invalido");

        }
    }
}
