import java.util.Scanner;

public class Quest8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME SEU PESO");
        double peso= sc.nextDouble();
        System.out.println("INFORME SUA ALTURA");
        double altura= sc.nextDouble();
        double imc= peso/(altura*altura);
        if(imc<18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc>=18.5 && imc<25) {
            System.out.println("Peso normal");
        }
        else if (imc>=25 && imc<30) {
            System.out.println("Sobrepeso");
            
        }
        else {
            System.out.println("Obeso");

        }
    }
    }
