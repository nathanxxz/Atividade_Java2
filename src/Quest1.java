import java.util.Scanner;

public class Quest1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME SEU NOME");
        String nome=sc.nextLine();
        System.out.println("INFORME SUA IDADE");
        int idade= sc.nextInt();
        System.out.printf("Seja bem vindo %s sua idade é %d",nome,idade);
    }
}
