public class lista5ex12c {
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


    static int [][] conta(double[][]tabela){
        int [][] guarda = new int [1][6];  //linha = filial   coluna = mes de venda
        double valor = 0;
        double maior = tabela[0][0];
        int indiceL = 0;
        int contagem = 0;


        for(int i = 0; i < tabela[0].length; i++){  //fixa a coluna
            for(int j = 0; j < tabela.length; j++){
                valor = tabela[j][i];

                if(valor > maior) {
                    maior = valor;
                    indiceL = j;
                }
                if(valor==maior){
                    indiceL = j;
                }
                guarda[0][i] = indiceL;
            }
            maior = tabela[0][contagem];
            contagem++;
        }
        return guarda;
    }


    public static void main(String[]args){
        double [][] tabela = {{20000, 35000, 2000.20, 20832, 10500, 12000},
                              {15453, 5300, 42000, 135832, 18580.36, 85200},
                              {14320, 55800, 12356, 2563, 100000, 62325},
                              {12345, 44823, 15863.25, 56483.55, 93000, 4852.33}};

        System.out.print("Janeiro: ");
        if(conta(tabela)[0][JANEIRO] == AQUI){
            System.out.println("Aqui");
        }
        if(conta(tabela)[0][JANEIRO] == LA){
            System.out.println("Lá");
        }
        if(conta(tabela)[0][JANEIRO] == ACOLA){
            System.out.println("Acolá");
        }
        if(conta(tabela)[0][JANEIRO] == PORAI){
            System.out.println("Por Aí");
        }


        System.out.print("Fevereiro: ");
        if(conta(tabela)[0][FEVEREIRO] == LA){
            System.out.println("Lá");
        }
        if(conta(tabela)[0][FEVEREIRO] == ACOLA){
            System.out.println("Acolá");
        }
        if(conta(tabela)[0][FEVEREIRO] == AQUI){
            System.out.println("Aqui");
        }
        if(conta(tabela)[0][FEVEREIRO] == PORAI){
            System.out.println("Por Aí");
        }

        System.out.print("Março: ");
            if(conta(tabela)[0][MARCO] == LA){
                System.out.println("Lá");
            }
            if(conta(tabela)[0][MARCO] == ACOLA){
                System.out.println("Acolá");
            }
            if(conta(tabela)[0][MARCO] == AQUI){
                System.out.println("Aqui");
            }
            if(conta(tabela)[0][MARCO] == PORAI){
                System.out.println("Por Aí");
            }

        System.out.print("Abril: ");
            if(conta(tabela)[0][ABRIL] == LA){
                System.out.println("Lá");
            }
            if(conta(tabela)[0][ABRIL] == ACOLA){
                System.out.println("Acolá");
            }
            if(conta(tabela)[0][ABRIL] == AQUI){
                System.out.println("Aqui");
            }
            if(conta(tabela)[0][ABRIL] == PORAI){
                System.out.println("Por Aí");
            }

        System.out.print("Maio: ");
        if(conta(tabela)[0][MAIO] == LA){
            System.out.println("Lá");
        }
        if(conta(tabela)[0][MAIO] == ACOLA){
            System.out.println("Acolá");
        }
        if(conta(tabela)[0][MAIO] == AQUI){
            System.out.println("Aqui");
        }
        if(conta(tabela)[0][MAIO] == PORAI){
            System.out.println("Por Aí");
        }

        System.out.print("Junho: ");
        if(conta(tabela)[0][JUNHO] == LA){
            System.out.println("Lá");
        }
        if(conta(tabela)[0][JUNHO] == ACOLA){
            System.out.println("Acolá");
        }
        if(conta(tabela)[0][JUNHO] == AQUI){
            System.out.println("Aqui");
        }
        if(conta(tabela)[0][JUNHO] == PORAI){
            System.out.println("Por Aí");
        }
    }
}
