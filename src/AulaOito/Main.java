package AulaOito;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        System.out.println("\nInício "+fila.inicio());


        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        Object info = fila.desenfileirar();
        while (info != null){
            System.out.println(info);
            info = fila.desenfileirar();
        }
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        System.out.println("\nInício "+fila.inicio());

        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.enfileirar(6);
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        System.out.println("\nInício "+fila.inicio());

        info = fila.desenfileirar();
        while (info != null){
            System.out.println(info);
            info = fila.desenfileirar();
        }
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        System.out.println("\nInício "+fila.inicio());




    }

}
