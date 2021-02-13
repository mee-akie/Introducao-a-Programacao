public class lista8ex6a {
    int[]array;

    int[]atribuiArray(int[]a){
        this.array = a;
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

        lista8ex6a a = new lista8ex6a();
        int[]abc = {1,2,2,2,2,2,2,3,3,4};
        a.atribuiArray(abc);
        System.out.println("O numero de repetições é: " + a.nRepetioes(2));

    }
}
