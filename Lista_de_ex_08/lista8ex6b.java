public class lista8ex6b {

    int[]array;

    int[]atribuiArray(int[]a){
        this.array = a;

        for(int ult = array.length - 1; ult > 0; ult--){
            for(int i = 0; i < ult; i++){
                if(array[i] < array[i+1]){
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                }
            }
        }

        return this.array;
    }

    int nRepetioes(int x){
        int soma = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                soma++;
            }
        }

        return soma;
    }

    public static void main(String[]args){

        lista8ex6b a = new lista8ex6b();
        int[]abc = {1,2,3,5,66,22,4};
        a.atribuiArray(abc);
        System.out.println("O numero de repetições é: " + a.nRepetioes(2));

    }
}
