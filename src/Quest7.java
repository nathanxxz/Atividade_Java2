
import java.util.Scanner;

public class Quest7 {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME O 1 NUMERO");
        int num= sc.nextInt();
        System.out.println("INFORME O 2 NUMERO");
        int num2= sc.nextInt();
        System.out.println("INFORME O 3 NUMERO");
        int num3= sc.nextInt();
        if(num>num2 && num>num3){
            System.out.println("Numero 1 é maior");
        }
        else if (num2>num && num2>num3) {
            System.out.println("Numero 2 é maior");
        }
        else if (num3>num && num3>num2) {
            System.out.println("Numero 3 é maior");

        }
        else{
            System.out.println("Sao iguais");
        }

        }

    }


