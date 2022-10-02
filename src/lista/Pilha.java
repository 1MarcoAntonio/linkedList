package lista;
import java.util.Scanner;

public class Pilha {
    private NodeString head;
    private NodeString tail;
    private int tamanho;

    public Pilha(){

    }

    public Pilha(NodeString head, NodeString tail) {
        this.head = head;
        this.tail = tail;
    }

    public NodeString getHead() {
        return head;
    }

    public void setHead(NodeString head) {
        this.head = head;
    }

    public NodeString getTail() {
        return tail;
    }

    public void setTail(NodeString tail) {
        this.tail = tail;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    //add no começo da lista
    public void add(String element){
        NodeString no = new NodeString(element);
        if (this.head==null && this.tail==null){
            this.head = no;
            this.tail = no;
        }else {
            no.setNext(this.head);
            this.head = no.getNext();
        }
        this.tamanho++;
    }

    public NodeString get(int posicao){
        NodeString atual = this.head;
        for (int i=0; i< posicao; i++){
            if (atual.getNext() != null){
                atual = atual.getNext();
            }
        }
        return atual;
    }

    public NodeString reverse(int posicao){
        NodeString atual = this.head;
        for (int i=0; i< posicao; i++){
            if (atual.getNext() != null){
                new StringBuilder(atual.getElement()).reverse().toString();
                atual = atual.getNext();
            }
        }
        return atual;
    }

    public NodeString polindromo(int posicao){
        NodeString atual = this.head;

        for (int i=0; i< posicao; i++){
            if (atual.getNext() != null){
                atual = atual.getNext();

            }
        }
        return atual;
    }

}
