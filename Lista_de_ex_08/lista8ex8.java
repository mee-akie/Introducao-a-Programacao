public class lista8ex8 {

    boolean busca(int[]a, int x){  //busca binaria
        int fim = a.length - 1;
        int ini = 0;

        while(ini <= fim){
            int meio = (ini + fim) / 2;
            if(a[meio] > x){
                fim = meio - 1;
            }
            else if(a[meio] < x){
                ini = meio + 1;
            }
            else{    //a[meio] == x
                return true;
            }
        }

        return false;
    }

    public static void main(String[]args){
        lista8ex8 x1 = new lista8ex8();
        int x = 6;
        int[]array = {987,65,2,89,0,165,4,11};
        System.out.println("O valor " + x + " se encontra no arranjo?");
        System.out.println(x1.busca(array, 6));

    }
}
