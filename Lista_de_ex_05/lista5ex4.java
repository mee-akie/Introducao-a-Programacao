public class lista5ex4 {
    static void conta(double[][]matriz){
        double valor = 0;
        double maior = 0;
        double [] guardaMaior = new double [matriz[0].length];

        for(int j = 0; j < matriz[0].length; j++){ //lendo uma coluna por vez
            for(int i = 0; i < matriz.length; i++){
                valor = matriz[i][j];
                if(j==0 && i == 0){  //inicia a variavel "maior"
                    maior = matriz[i][j];
                }
                if(matriz[i][j] > maior){  //procura pelo maior valor da coluna
                    maior = matriz[i][j];
                }
            }
            guardaMaior[j] = maior; //guarda no arranjo o maior numero de cada coluna
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = matriz[i][j] / guardaMaior[j];
            }
        }


    }

    public static void main(String[]args){
        double [][] matriz = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        conta(matriz);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("%.3f"+"\t", matriz[i][j]); //imprime 3 casas apos a virgula de cada elemento da matriz
            }
            System.out.println();
        }
    }
}
