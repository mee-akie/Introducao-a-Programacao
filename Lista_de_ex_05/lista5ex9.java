public class lista5ex9 {
    static void conta(int[][]m){
        int [][] transposta = new int [m[0].length][m.length];

        for(int i = 0; i < transposta.length; i++){
            for(int j = 0; j < transposta[0].length; j++){
                transposta[i][j] = m[j][i];
            }
        }

        for(int i = 0; i < transposta.length; i++){
            for(int j = 0; j < transposta[0].length; j++){
                System.out.print(transposta[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        int [][] m = {{1,2,3,4,5},
                      {6,7,8,9,10}};

        conta(m);
    }
}
