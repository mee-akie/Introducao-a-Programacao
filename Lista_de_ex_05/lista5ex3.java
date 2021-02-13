public class lista5ex3 {
    static boolean conta(int[][]quadrada){
        int checkNumero = 0;
        int zeros = 0;
        int uns = 0;
        int contagem = 0;
        for(int i = 0; i < quadrada.length; i++) {  //verifica se ha apenas numeros 1 e 0 na matriz
            for (int j = 0; j < quadrada[i].length; j++) {
                checkNumero = quadrada[i][j];
                if (checkNumero != 0 && checkNumero != 1) {
                    return false;
                }
            }
        }

        for(int i = 0; i < quadrada.length; i++) {
            for (int j = 0; j < quadrada[i].length; j++) {
                checkNumero = quadrada[i][j];
                if(checkNumero == 0){
                    zeros++;
                }
                if(checkNumero == 1){
                    uns++;
                }
            }
            if(uns == 1){
                contagem++;
            }
            zeros = 0;
            uns = 0;
        }

        if(contagem == quadrada.length){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[]args){
        int [][] quadrada = {{1,0,0},
                             {0,0,1},
                             {-1,1,0}};

        System.out.println(conta(quadrada));
    }
}
