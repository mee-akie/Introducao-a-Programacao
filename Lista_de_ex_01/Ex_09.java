import java.util.Scanner;
public class Ex_09 {

    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o numero do time: ");
        int time = sc.nextInt(); //numero do time

        System.out.print("\nDigite o numero do jogador: ");
        int jogador = sc.nextInt(); //numero do jogador

        System.out.print("\nDigite o numero de cartoes AMARELOS: ");
        int cAmarelos = sc.nextInt();

        System.out.print("\nDigite o numero de cartoes VERMELHOS: ");
        int cVermelhos = sc.nextInt();

        //valor fixo das multas dos cartoes amerelo e verelho:
        final double multaAmarelo = 1000.20;
        final double multaVermelho = 4523.75;

        double multaTotal = (multaAmarelo * cAmarelos) + (multaVermelho * cVermelhos);

        //printando as informacoes do jogador:
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Time: " + time);
        System.out.println("Jogador: " + jogador);
        System.out.println("Cartoes Amarelos: " + cAmarelos);
        System.out.println("Cartoes Vermelhos: " + cVermelhos);
        System.out.printf("Multa total: R$ %.2f\n", multaTotal);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
