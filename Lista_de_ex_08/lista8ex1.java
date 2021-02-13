public class lista8ex1 {

    //atributos
    int codProd;
    int codFab;

    //contrutor
    lista8ex1(int fab, int prod){
        this.codProd = prod;
        this.codFab = fab;
    }

    void ordena(lista8ex1[]produtos) {

        for (int ult = produtos.length - 1; ult > 0; ult--) {  //ordena primeiro os codigos do fabricante // **BUBBLE SORT**
            for (int i = 0; i < ult; i++) {
                if (produtos[i].codFab > produtos[i + 1].codFab) {
                    int aux = produtos[i].codFab;
                        produtos[i].codFab = produtos[i + 1].codFab;
                        produtos[i + 1].codFab = aux;

                    }
                }
            }

        System.out.println("Arranjo de produtos ordenado:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("(" + produtos[i].codFab + ", " + produtos[i].codProd + ")  ");
        }

            for (int ult = produtos.length - 1; ult > 0; ult--) {  //ordena os codigos do produto
                for (int i = 0; i < ult; i++) {
                    if ((produtos[i].codFab == produtos[i + 1].codFab)) {
                        if (produtos[i].codProd > produtos[i + 1].codProd) {
                            int aux = produtos[i].codProd;
                            produtos[i].codProd = produtos[i + 1].codProd;
                            produtos[i + 1].codProd = aux;
                        }
                    }
                }
            }


            System.out.println("Arranjo de produtos ordenado:");
            for (int i = 0; i < produtos.length; i++) {
                System.out.print("(" + produtos[i].codFab + ", " + produtos[i].codProd + ")  ");
            }
        }

    public static void main(String[]args){
        lista8ex1[]produtos = new lista8ex1[6];
        produtos[0] = new lista8ex1(1,1);
        produtos[1] = new lista8ex1(1,5);
        produtos[2] = new lista8ex1(1,3);
        produtos[3] = new lista8ex1(2,5);
        produtos[4] = new lista8ex1(2,4);
        produtos[5] = new lista8ex1(2,8);

        produtos[0].ordena(produtos);

    }
}
