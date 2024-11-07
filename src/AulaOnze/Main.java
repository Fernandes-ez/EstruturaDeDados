package AulaOnze;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int valores [] = {5,6,2,3,8,1,4,1};
        //selectionSort(valores);
        insertionSort(valores);
        System.out.println(Arrays.toString(valores));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move os elementos de arr[0..i-1] que são
               maiores que key para uma posição à frente
               de sua posição atual */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private static void selectionSort(int[] valores) {
        //imprimir o menor valor
        for (int j = 0; j < valores.length ; j++) {
            int menor = Integer.MAX_VALUE;
            int posMenor = 0;
            for (int i = j; i < valores.length ; i++) {
                if (valores[i] < menor) {
                    menor = valores[i];
                    posMenor=i;
                }
            }
            //troca
            valores[posMenor] = valores[j];
            valores[j] = menor;
        }
    }

}
