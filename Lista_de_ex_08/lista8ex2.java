import java.util.Scanner;
public class lista8ex2 {

    void ordena(String[]array){

        for (int ult = array.length - 1; ult > 0; ult--) {
            for (int i = 0; i < ult; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    String aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
        }

        System.out.println("Array ordenado: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina o tamanho do arranjo de String: ");
        int x = sc.nextInt();
        String[]a = new String[x];
        System.out.println("Insira as Strings do array de Strings:");

        for(int i = 0; i < a.length; i++){
            a[i] = sc.next();
        }

        lista8ex2 sla = new lista8ex2();
        sla.ordena(a);

    }
}
