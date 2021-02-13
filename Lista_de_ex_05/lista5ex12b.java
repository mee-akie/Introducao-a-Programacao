public class lista5ex12b {
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

    static int conta(double[][]tabela){
        double soma = 0;
        int contagem = 0;
        double guarda;
        int indice = 0;
        double maior = tabela[0][0];

        for(int i = 0; i < tabela[0].length; i++){
            for(int j = 0; j < tabela.length; j++) {  //soma os valores da coluna
                soma = soma + tabela[j][i];
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

    public static void main (String[]args){
        double [][] tabela = {{20000, 35000, 2000.20, 20832, 10500, 12000},
                {15453, 5300, 42000, 135832, 18580.36, 85200},
                {14320, 55800, 12356, 2563, 100000, 62325},
                {12345, 44823, 15863.25, 56483.55, 93000, 4852.33}};


        System.out.println("O mês em qu houve mais vendas na rede inteira foi: ");

        int resultado = conta(tabela);
        if(resultado == JANEIRO){
            System.out.println("Janeiro");
        }
        if(resultado == FEVEREIRO){
            System.out.println("Fevereiro");
        }
        if(resultado == MARCO){
            System.out.println("Março");
        }
        if(resultado == ABRIL){
            System.out.println("Abril");
        }
        if(resultado == MAIO){
            System.out.println("Maio");
        }
        if(resultado == JUNHO){
            System.out.println("Junho");
        }
    }
}
