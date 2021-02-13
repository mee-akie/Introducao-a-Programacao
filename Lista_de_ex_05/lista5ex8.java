public class lista5ex8 {
    static int conta(int[][]m) {
        int soma = 0;
        int somaAnterior = 0;
        int indice = 0;
        int contagem = 0;

        for (int j = 0; j < m[0].length; j++) {  //fixa a coluna
            while(contagem < m[0].length - 1) {
                for (int i = 0; i < m.length; i++) {
                    soma = soma + m[contagem][j];
                    contagem++;
                }
            }
            if (soma > somaAnterior) {
                somaAnterior = soma;
                indice = j;
            }
            contagem = 0;
            soma = 0;
        }
        return indice;
    }

    public static void main(String[]args){
        int [][] m = {{2,5,4,50},
                      {-3,8,5,1},
                      {4,0,11,7}};

        System.out.println("Índice da coluna = "+conta(m));
    }
}
