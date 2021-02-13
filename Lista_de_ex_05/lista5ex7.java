public class lista5ex7 {

    static int conta(int[][]matriz){
        int mult = 0;     //sempre irá fazer 3 multiplicaçoes
        int soma1 = 0;
        int soma2 = 0;
        int determinante = 0;
        int contaMult = 0;
        int contador = 2;
        int pula1 = 1;
        int pula2 = 2;
        int [][] matrizD = new int[3][5];
        int [][] matrizD2 = new int [3][2];

        for(int i = 0; i < matrizD2.length; i++){  //pedaço fora da matriz
            for(int j = 0; j < matrizD2[0].length; j++){
                matrizD2[i][j] = matriz[i][j];
            }
        }

        for(int i = 0; i < matriz.length; i++) { //carrega os valores da "matriz" para "matrizD"
            for (int j = 0; j < matriz[0].length; j++) {
                matrizD[i][j] = matriz[i][j];
            }
        }

        for(int i = 0; i < matrizD2.length; i++) {  //carrega valores da "matrizD2" para ocupar os lugares vazios de "matrizD"
            for (int j = 0; j < matrizD2[0].length; j++) {
                matrizD[i][matrizD[0].length - contador] = matrizD2[i][j];
                contador--;
            }
            contador = 2;  //reinicia o contador
        }



        for(int i = 0; i <= 0; i++){  //faz as multiplicaçoes "positivas"  //fixa a primeira linha da matriz pq ñ vai repetir o calculo para todas as linhas
            for(int j = 0; j < 3; j++){  // "3" porque pega os primeiros 3 numeros da primeira linha
                    mult = matrizD[i][j] * matrizD[1][pula1] * matrizD[2][pula2];
                    soma1 = soma1 + mult;
                    pula1++;
                    pula2++;
            }
        }

        pula1 = matrizD[0].length - 2;
        pula2 = matrizD[0].length - 3;

        for(int i = 0; i <= 0; i++){  //faz as multiplicaçoes "contrarias"
            for(int j = matrizD[0].length - 1; j > 1; j-- ){
                mult = matrizD[i][j] * matrizD[1][pula1] * matrizD[2][pula2];
                soma2 = soma2 + mult;
                pula1--;
                pula2--;
            }
        }

        System.out.println(soma1);
        soma2 = soma2 * (-1);
        System.out.println(soma2);


        determinante = soma1 + soma2;
        return determinante;
    }

    public static void main(String[]args){
        int [][] matriz = {{2,5,6},
                          {1,6,7},
                          {-1,2,3}};

        System.out.println("Determinante = "+conta(matriz));
    }
}
