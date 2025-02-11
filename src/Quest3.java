import java.util.Scanner;

public class Quest3 {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME SUA IDADE");
        int idade= sc.nextInt();
        if(idade>=18){
            System.out.println("De maior,liberado para fazer cnh");
        }
        else
            System.out.println("De menor, se divirta no lol");
    }

}
