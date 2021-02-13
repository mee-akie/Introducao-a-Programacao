import java.util.Scanner;
public class Ex_08 {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dado um equacao do segundo grau do tipo ax^2 + bx + c:");
        System.out.print("\nDigite o valor do coeficiente 'a': ");
        int a = sc.nextInt();   //coeficiente A

        System.out.print("\nDigite o valor do coeficiente 'b': ");
        int b = sc.nextInt();   //coeficiente B

        System.out.print("\nDigite o valor do coeficiente 'c': ");
        int c = sc.nextInt();   //coeficiente C

        double delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c)); //calculo do delta da formula de baskara

        double raiz1 = ((-1)*b + delta) / (2*a);
        double raiz2 = ((-1)*b - delta) / (2*a);

        System.out.println("Primeira raiz: " + raiz1);
        System.out.println("Segunda raiz: " + raiz2);

    }
}
