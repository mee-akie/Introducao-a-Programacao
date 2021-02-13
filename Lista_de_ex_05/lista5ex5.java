public class lista5ex5 {
    static void conta(int[][]m1,int[][]m2){
        int [][] resultado = new int[m1.length][m1[0].length];


        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                resultado[i][j] = m1[i][j]+m2[i][j];
            }
        }

        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[0].length; j++){
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[]args){
        int [][] m1 = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        int [][] m2 = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};

        conta(m1,m2);
    }
}
