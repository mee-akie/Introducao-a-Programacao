import java.util.Scanner;
public class lista8ex9 {

    static void descubra(String resposta){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero qualquer que seja maior que X");
        int fim = sc.nextInt();
        System.out.println("Agora um numero qualquer menor que X");
        int ini = sc.nextInt();

        int meio = (ini + fim) / 2;
        System.out.println("X = " + meio + " ?");
        String resp1 = sc.next();

        if(resp1.equals("sim")){
            System.out.println("******ENCONTREI SEU NUMERO*****");
        }

        else{
            while(resposta.equals("nao")){
                meio = (ini + fim) / 2;

                System.out.println("X é maior, menor ou igual a " + meio + " ??");
                String resp2 = sc.next();

                if(resp2.equals("igual")){
                    resposta = "sim";
                }
                else if(resp2.equals("maior")){
                    ini = meio + 1;
                    System.out.println("X = " + ini + " ?");
                    resposta = sc.next();
                }
                else{
                    fim = meio + 1;
                    System.out.println("X = " + fim + " ?");
                    resposta = sc.next();
                }
            }
            System.out.println("******ENCONTREI SEU NUMERO*****");
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pense em um numero X, do qual  0 <= X\n");
        String resposta = "nao";
        descubra(resposta);
    }
}
