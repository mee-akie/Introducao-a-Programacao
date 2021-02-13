public class lista5ex12f {
    static final int AQUI = 0;  //cada numero equivale ao numero do indice da matriz Tabela
    static final int LA = 1;
    static final int ACOLA = 2;
    static final int PORAI = 3;

    static final int JANEIRO = 0;
    static final int FEVEREIRO = 1;
    static final int MARCO = 2;
    static final int ABRIL = 3;
    static final int MAIO = 4;
    static final int JUNHO = 5;

    static double [][] conta(double[][]tabela){
        double [][] subtabela = new double [4][3];

        for(int i = 0; i < subtabela.length; i++){
            for(int j = 0; j < subtabela[0].length; j++){
                subtabela[i][j] = tabela[i][j];
            }
        }

        return subtabela;
    }

    public static void main(String[]args){
        double [][] tabela = {{20000, 35000, 2000.20, 20832, 10500, 12000},
                              {15453, 5300, 42000, 135832, 18580.36, 85200},
                              {14320, 55800, 12356, 2563, 100000, 62325},
                               {12345, 44823, 15863.25, 56483.55, 93000, 4852.33}};

        System.out.println("Sub-tabela do primeiro trimestre : ");

        for(int i = 0; i < conta(tabela).length; i++){
            for(int j = 0; j < conta(tabela)[0].length; j++){
                System.out.print(conta(tabela)[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
