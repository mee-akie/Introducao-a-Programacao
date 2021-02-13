public class lista8ex10 {

    static void buscaBinariaBidimensional(int[][]a, int x){

        ///////busca pelas LINHAS/////////

        int indL = -2;
        int indC = -2;
        int contagem = 0;
        int iniC = 0;
        int fimC = a[0].length - 1;

        for(int i = 0; i < a.length; i++) {

            while (contagem < a.length) {
                int meioColuna = (iniC + fimC) / 2;

                if (a[i][meioColuna] > x) {
                    fimC = meioColuna - 1;
                }
                else if (a[i][meioColuna] < x) {
                    fimC = meioColuna + 1;
                }
                else {
                    indC = meioColuna;
                    indL = i;
                }
                contagem++;
            }
            contagem = 0;
            iniC = 0;
            fimC = a.length - 1;
        }

        System.out.println("(" + (indL + 1) + ", " + (indC + 1) + ")");
    }

    public static void main(String[]args){
        int[][]a = {{-55, -50, -42, -33, -30},
                    {-30, -21,  -4,  0,   0},
                    { 3,    5,  18,  33,  34},
                    {39,   45,  59,  87, 122}};

        int x = 5;

        buscaBinariaBidimensional(a, x);
    }
}
