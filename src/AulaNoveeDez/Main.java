package AulaNoveeDez;

public class Main {
    public static void main(String[] args) {
    int[] valores = {3,1,5,8,7,9,6,2};

    bubbleSort(valores);
    imprime(valores);
    }
    private static void bubbleSort(int[] valores){
        for (int j = 0; j < valores.length; j++){
            boolean trocou = false;
            for (int i = 0; i < valores.length-1; i++){
                if (valores[i+1] <valores[i]){
                    trocou = true;
                    int temp = valores[i];
                    valores[i] = valores[i+1];
                    valores [i+1]=temp;
                }
            }
            if (!trocou){
                return;
            }
        }
    }
    private static void imprime(int[] valores){
        for (int valor : valores){
            System.out.println(valor);
        }


    }

}
