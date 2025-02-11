
import java.util.Scanner;

public class Quest4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME DOIS NUMEROS");
        int num= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("SOMA(1)  SUBTRACAO(2)  MULTIPLICACAO(3)  DIVISAO(4) ");
        int op= sc.nextInt();
        switch (op){
            case 1:
             int soma=num+num2;
             System.out.println("O RESULTADO É");
             System.out.println(soma);
             break;

            case 2:
                int sub=num-num2;
                System.out.println("O RESULTADO É");
                System.out.println(sub);
                break;

            case 3:
                int mut=num*num2;
                System.out.println("O RESULTADO É");
                System.out.println(mut);
                break;

            case 4:
                int div=num/num2;
                System.out.println("O RESULTADO É");
                System.out.println(div);
                break;
            default:
                System.out.println("VALOR INVALIDO");



        }



    }
}
