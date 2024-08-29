import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex4Array();

    }

    private static void ex4Array() {
        int[] valores = {4, 6, 2, 8, 9, 1, 7, 3};
        int total = 0;
        double media = 0;
        for (int i = 0; i < valores.length; i++){
            total += valores[i];
            media = total/valores.length;
        }
        for(int i = 0;i < valores.length; i++){
            int[] maiorQAMedia ={};
            if (valores[i]>media){
                i = valores[i];

                System.out.println(valores[i]);
            }
        }

    }



    private static void ex3Fibonaccl() {
        int i = 1, j = 1;
        for (int soma; i<=j;){
            i = j;
            soma = i+j;
            j=soma;
            System.out.print(soma)
            ;
        }
    }

    private static void ex2Pascal() {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número desejado:");
        x = scan.nextInt();
        for (int i = 1; i <= x ; i++)
        {
            for (int j = 1; j <=i;j++){
                System.out.print(j+"\t");
            }System.out.println("\n");
        }

    }

    private static void ex1Tabuada() {
        for(int j = 1; j <= 10; j++){
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * j + "\t");
            }
            System.out.println("\n");

        }
    }
}




