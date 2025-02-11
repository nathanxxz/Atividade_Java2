import java.util.Scanner;

public class Quest6 {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME UMA NOTA DE 0 A 10");
        int nota= sc.nextInt();
        if(nota>=7){
            System.out.println("Aprovado");
        }
        else if(nota>=5) {
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Reprovado");
    }}}
