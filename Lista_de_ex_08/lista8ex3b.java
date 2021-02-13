import java.util.Scanner;
public class lista8ex3b {

    static void ordena(int[]v){  //Insertion Sort
        for (int i=1; i<v.length; i++) {
            int aux = v[i];
            int j = i;

            while((j > 0) && (aux < v[j-1])){
                v[j] = v[j-1];
                j--;
            }

            v[j] = aux;
        }

        System.out.print("Arranjo ordenado: ");
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i] + "  ");
        }
    }

    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     int [] v = new int[7];
     System.out.println("Digite 7 numeros inteiros: ");
     for(int i = 0; i < v.length; i++){
         v[i] = sc.nextInt();
     }
     ordena(v);
    }
}
