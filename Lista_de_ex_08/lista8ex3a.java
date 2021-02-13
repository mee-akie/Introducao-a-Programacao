import java.util.Scanner;
public class lista8ex3a {

    static void ordena(int[]v) {  //Selection Sort
        for (int i = 0; i < v.length - 1; i++) {
            int posMenor = i;  //inicio

            for (int p = i + 1; p < v.length; p++) {
                if (v[p] < v[posMenor]) {
                    posMenor = p;
                    int aux = v[i];
                    v[i] = v[posMenor];
                    v[posMenor] = aux;
                }
            }
        }

        System.out.print("Arranjo ordenado: ");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + "  ");
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
