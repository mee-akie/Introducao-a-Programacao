public class lista5ex10 {
    static String conta(int[][]m){
        int igual = 0;
        int diferente = 0;
        String resultado = "sla";

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i != j && m[i][j]==m[j][i]){
                  igual = igual + 1;
                }
                if(i != j && m[i][j] != m[j][i]){  //i==j é a diagonal da matriz, ñ precisa ser igual a um outro numeor da matriz
                  diferente = diferente + 1;
                }
            }
        }
        if(diferente == 0){
            resultado = "true";
        }
        else{
            resultado = "false";
        }
        return resultado;
    }

    public static void main(String[]args){
        int [][] m = {{5,5,6},
                      {5,2,4},
                      {6,4,8}};

        System.out.println(conta(m));
    }
}
