import java.util.Objects;
import java.util.Scanner;

public class Quest9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME SEU NOME DE USUARIO");
        String usu= sc.next();
        System.out.print("INFORME SUA SENHA");
        String senha= sc.next();
        if(Objects.equals(usu, "admin") && Objects.equals(senha, "1234")){
            System.out.println("Login bem sucedido");
        }
        else {
            System.out.println("Login interrompido");
        }

        }
    }
