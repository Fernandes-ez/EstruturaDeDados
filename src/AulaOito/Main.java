package AulaOito;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        System.out.println("\nInício "+fila.inicio());

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        Object info;
        info = fila.desenfileirar();
        while (info != null){
            System.out.println(info);
            info = fila.desenfileirar();
        }
        System.out.printf(fila.estaVazia() ? "Vazia": "Não vazia");
        System.out.println("\nInício "+fila.inicio());


    }

}
