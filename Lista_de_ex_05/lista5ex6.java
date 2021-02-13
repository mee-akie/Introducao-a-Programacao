public class lista5ex6 {

    static void conta(int[][]m1,int[][]m2){
        int [][] resultado = new int [m1.length][m2[0].length];
        if(m1[0].length != m2.length){
            System.out.println("O numero de colunas da matriz m1 nao é igual ao numero de linhas da matriz m2 ");
        }
        else{

            int soma = 0;
            int mult = 0;
            int contador = 0;
            for(int i = 0; i < m1.length; i++) {  //lê as linhas de m1 e as colunas de m2

                while (contador < m2[0].length) {  //enquanto nao forem feitas as multiplicaçoes de uma linha de m1 com TODAS as colunas de m2
                    for (int j = 0; j < m2.length; j++) {  //lê as colunas de m1 e as linhas de m2
                        mult = m1[i][j] * m2[j][contador];
                        soma = soma + mult;
                        if (j == m1[0].length - 1) { //quando acabar de somar as multiplicaçoes de uma coluna, coloca o resultado na matriz resultado
                            resultado[i][contador] = soma;
                            soma = 0; //soma reinicia ao pular para a proxima coluna de m2
                        }
                    }
                    contador++;
                }
                contador = 0; //contador reinicia para fazer as multiplicaçoes com a proxima linha da matriz m1
            }

            for(int i = 0; i < resultado.length; i++){
                for(int j = 0; j < resultado[0].length; j++){
                    System.out.print(resultado[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[]args){
        int [][] m1 = {{0,2,4},
                       {1,3,5}};

        int [][] m2 = {{1,3},
                       {-2,2},
                        {0,4}};

        conta(m1,m2);
    }
}
