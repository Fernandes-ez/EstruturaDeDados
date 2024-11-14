package AulaDoze;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] valores = {5,3,4,6,8,1,9};
        mergeSort(valores);
        System.out.println(Arrays.toString(valores));

    }

    private static void mergeSort(int[] valores) {
    int length = valores.length;
    if (length == 1){
        return;
    }
    int[] left = new int[length / 2];
    int[] right = new int[length - length/2];

    System.arraycopy(valores, 0,left,0,left.length);
    System.arraycopy(valores,length/2,right,0,right.length);
    mergeSort(right);
    mergeSort(left);
    merge(left,right, valores);
    }
    private static void merge(int [] left, int [] right, int [] valores) {
        int il = 0, ir = 0, iv = 0;
        while (il<left.length && ir<right.length){
            if (left[il]<right[ir]){
                valores[iv++] = left[il++];
            }else{
                valores[iv++] = right[ir++];
            }
        }
        while (il<left.length){
            valores[iv++] = left[il++];
        }
        while (ir<right.length){
            valores[iv++] = right[ir++];
        }
    }
}
