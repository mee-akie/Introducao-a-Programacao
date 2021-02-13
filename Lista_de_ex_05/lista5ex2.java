public class lista5ex2 {
    static int conta(int[][]x){
        int soma = 0;
        int contagem = x.length - 1;
        int pegaNumero = 0;
        for(int i = 0; i < x.length; i++){  //linha
            pegaNumero = x[i][contagem];
            soma = soma + pegaNumero;
            contagem--;
            }
        return soma;
    }
    public static void main(String[]args){
        int [][] x = {{2,5,10,4},
                      {-3,8,1,5},
                      {4,0,7,11},
                      {3,-4,1,2}};
        System.out.println("Soma = "+conta(x));
    }
}
