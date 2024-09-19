package AulaSete;

import AulaSete.Estruturas.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        System.out.println(p1.estaVazia() ? "Vazia" : "Não vazia");
        p1.empilhar("aaaaaaaaaaaaaa");
        System.out.println(p1.estaVazia() ? "Vazia" : "Não vazia");
        p1.empilhar("wwwwwww");
        System.out.println("Topo: "+ p1.topo());
        System.out.println("Topo: "+ p1.topo());
        p1.desempilhar();
        System.out.println("Desempilinhando: "+p1.desempilhar());
        System.out.println("Desempilinhando: "+p1.desempilhar());
        System.out.println(p1.estaVazia() ? "Vazia" : "Não vazia");
    }
}
