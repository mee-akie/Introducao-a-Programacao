import java.util.Scanner;
public class Ex_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o valor da altura em metros: ");
        double S = sc.nextDouble(); //altura

        System.out.println();

        System.out.print("Digite o valor da aceleracao constante em metros/segundo ao quadrado: ");
        double aceleracao = sc.nextDouble(); //aceleracao constante

        double tempo = Math.sqrt((S * 2) / aceleracao); //calculo do tempo

        //Ira retornar apenas duas casas decimais do tempo:
        System.out.printf("Levara %.2f segundos para o corpo cair.\n", tempo);
    }
}
