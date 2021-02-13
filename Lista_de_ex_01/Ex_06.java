//Importando a classe Scanner:
import java.util.Scanner;

public class Ex_06 {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double taxaReal_Dolar = 6.0;
        System.out.print("Digite o valor em Real a ser recebido: R$ ");
        double valorRecebido = sc.nextDouble();
        sc.nextLine();
        double valorConvertido = valorRecebido * taxaReal_Dolar;
        System.out.println("Valor recebido: R$ " + valorRecebido + "\nValor convertido: US$ "+valorConvertido);
    }
}
