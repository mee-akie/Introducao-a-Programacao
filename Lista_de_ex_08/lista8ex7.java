public class lista8ex7 {

    int[]fusao(int[]a, int[]b){

        int posA = 0;
        int posB = 0;
        int posC = 0;
        int [] c = new int[a.length + b.length];

        while(posA < a.length && posB < b.length){  //pega elementos menores que A e B
            if(b[posB] <= a[posA]){
                c[posC] = b[posB];
                posB++;
            }
            else{
                c[posC] = a[posA];
                posA++;
            }
            posC++;
        }

        while(posA < a.length){  //se ainda houver elementos no arranjo A
            c[posC] = a[posA];
            posA++;
            posC++;
        }

        while(posB < a.length){  //se ainda houver elementos no arranjo b
            c[posC] = b[posB];
            posB++;
            posC++;
        }

        return c;
    }


    public static void main(String[]args){
        int[]array1 = {1,2,3,4,5,6,7};
        int[]array2 = {4,5,6,7,8,9,22};

        lista8ex7 x = new lista8ex7();

        System.out.print("Array C: ");
        for(int i = 0; i < x.fusao(array1, array2).length; i++){
            System.out.print(x.fusao(array1, array2)[i] + "  ");
        }
    }
}
