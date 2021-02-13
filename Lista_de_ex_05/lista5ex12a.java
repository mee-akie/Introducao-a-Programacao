public class lista5ex12a {
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

    static double conta(double[][]tabela){
        double soma = 0;
        int indice = 0;
        double maior = tabela[0][0];

        for(int i = 0; i < tabela.length; i++){
            for(int j = 0; j < tabela[0].length; j++) {  //soma os valores da linha
                soma = soma + tabela[i][j];
            }
            if(soma > maior){
                maior = soma;
                indice = i;
            }
            if(soma == maior){
                indice = i;

            }
            soma = 0;
        }
        return indice;
    }

    public static void main(String[]args){
        double [][] tabela = {{20000, 35000, 2000.20, 20832, 10500, 12000},
                              {15453, 5300, 42000, 135832, 18580.36, 85200},
                              {14320, 55800, 12356, 2563, 100000, 62325},
                              {12345, 44823, 15863.25, 56483.55, 93000, 4852.33}};

        System.out.println("A filial que mais vendeu durante o semestre é a :");
        conta(tabela);

        double resultado = conta(tabela);
        if(resultado == 0){
            System.out.println("Filial Aqui");
        }
        if(resultado == 1){
            System.out.println("Filial Lá");
        }
        if(resultado == 2){
            System.out.println("Filial Acolá");
        }
        if(resultado == 3){
            System.out.println("Filial Por Aí");
        }
    }
}
