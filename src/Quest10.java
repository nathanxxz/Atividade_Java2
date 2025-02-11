import java.util.Objects;
import java.util.Scanner;

public class Quest10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("QUAL COMBUSTIVEL DESEJA? GASOLINA (G) ALCOOL (A) ");
        String resp= sc.next();
        System.out.println("INFORME A QUANTIDADE EM LITROS");
        double petro= sc.nextDouble();
        if(Objects.equals(resp, "A")){
            System.out.println("Alcool");
            double alcool=4.00*petro;
            System.out.println(alcool);
        }
        else {
            System.out.println("Gasolina");
            double gaso=5.50*petro;
            System.out.println(gaso);
        }
}}
