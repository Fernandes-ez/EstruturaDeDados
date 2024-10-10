package AulaOito;

public class Fila {
    private int tananho;
    private No inicio;
    private No fim;

    public boolean estaVazia(){
        return this.tananho == 0;
    }

    public Object inicio(){
        if (estaVazia()){
            return null;
        }
        return this.inicio.info;
    }

    public void enfileirar(Object info){
        No no = new No(info);
        if (estaVazia()){
            inicio = no;
        }
        fim = no;
        tananho++;
    }

    public Object desenfileirar(){
        if (estaVazia()){
            return null;
        }
        Object info = inicio.info;
        inicio.info = inicio.prox;
        tananho--;
        if (tananho == 0){
            fim = null;
        }
        return info;
    }

}
