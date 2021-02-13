public class lista5ex11 {
    static boolean conta(int[][]m){
        int somaL = 0; //soma linha
        int somaC = 0; //soma coluna
        int somaD = 0; //soma diagonal
        int somaDI = 0; //soma diagonal invertida
        int contagem = 0;
        int contagem2 = 0;
        int somaAnterior = 0;

        for(int i = 0; i < m.length; i++) { //conta para soma de linha e soma de coluna
            for (int j = 0; j < m[0].length; j++) {
                somaL = somaL + m[i][j];
                somaC = somaC + m[j][i];
            }

            if (somaAnterior == somaC && somaC == somaL) {
                    contagem++;   //conta quantas vezes a soma de linhas e a soma de colunas foram iguais
                }
                somaAnterior = somaL;
                somaL = 0;
                somaC = 0;
            }


        if(contagem != m.length - 1){  //(-1) pq somaAnterior inicia com zero e portanto a primeira condiçao é falsa
            return false;
        }
        else{
            for(int i = 0; i < m.length; i++) {  //conta para soma da Diagonal
                somaD = somaD + m[i][i];
            }

            for(int j = m.length - 1; j >= 0; j--){  //conta para a soma da Diagonal Inversa
                somaDI = somaDI + m[j][j];
            }

            if(somaD == somaDI){
                contagem2 = 1;
            }

            if(contagem2 != 1){
                return false;
            }

            if(contagem2 == 1 && contagem == m.length - 1){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[]args){
        int [][] m = {{8,0,7},
                      {4,5,6},
                      {3,10,2}};

        System.out.println(conta(m));

    }
}
