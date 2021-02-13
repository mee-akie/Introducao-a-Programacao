public class lista5ex1b {
    static void conta(int[][]x,int[]resultado){
        int valor = 0;
        int maior = 0;
        int analiza = 0;
        int maiorL = 0;
        int maiorC = 0;
        for(int i = 0; i < x.length; i++){   //linha da matriz
            for(int j = 0; j < x[i].length; j++){    //coluna da matriz
                if(x[i][j] > x[maiorL][maiorC]) {
                    maiorL = i;
                    maiorC = j;
                }
                if(x[i][j] == x[maiorL][maiorC]){
                    maiorL = maiorL;
                    maiorC = maiorC;
                }
            }
        }

        resultado[0] = maiorL;
        resultado[1] = maiorC;
        System.out.print("Resultado = ("+resultado[0]+", "+resultado[1]+")");
    }

    public static void main(String[]args){
        int [][] x = {{1,2,3,4,5},
                     {6,7,1,20,10},
                     {11,20,13,14,15}};

        int [] resultado = new int [2];
        conta(x,resultado);
    }
}
