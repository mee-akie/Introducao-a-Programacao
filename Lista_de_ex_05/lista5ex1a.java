public class lista5ex1a {


    static int conta (int[][]x){
        int valor = 0;
        int maior = 0;

        for(int i = 0; i < x.length; i++){   //linha da matriz
            for(int j = 0; j < x[i].length; j++){    //coluna da matriz
                valor = x[i][j];
                if(i==0 && j==0){  //inicia a variavel "maior"
                    maior = x[i][j];
                }
                else if(x[i][j] > maior){
                    maior = x[i][j];
                }
            }
        }

        return maior;
    }

    public static void main(String[]args){
        int [][] x = {{90,2,3,4,5},
                     {6,7,8,20,10},
                     {11,12,13,14,15}};

        System.out.println("O maior numero da matriz é: " + conta(x));
    }
}
