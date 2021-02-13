import java.util.Scanner;
public class Ex_10 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro a ser invertido: ");
        int num = sc.nextInt(); //numero a ser invertido

        int primeiro = num / 100;

        int segundo = (num - (primeiro*100)) / 10;

        int terceiro = num - (primeiro*100) - (segundo*10);

        System.out.println("\nNumero: " + num);
        System.out.printf("Inverso: " + terceiro + "" + segundo + "" + primeiro);
    }
}
