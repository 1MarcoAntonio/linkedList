package lista;

public class Encadeada {
    private Node head;
    private Node tail;

    public Encadeada() {
    }

    public Encadeada(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void add(int element){
        Node no = new Node(element);
        if (this.head==null && this.tail==null){
            this.head = no;
            this.tail = no;
        }else {
            this.tail.setNext(no);
            this.tail = no;
        }
    }

    public void remove(int element){
    }

    public Node get(int posicao){
        Node atual = this.head;
        for (int i=0; i< posicao; i++){
            if (atual.getNext() != null){
                atual = atual.getNext();
            }
        }
        return atual;
    }

    public String pertence(int existe ){
        Node atual = this.head;
        while (atual.getElement() == existe){
            existe = atual.getElement();
            break;
        }
        return"o elemento "+existe+" pertence a lista";
    }

    public void addMantendo(int element){
        Node no = new Node(element);
        while (this.head.getElement()>=no.getElement() &&  )
    }

}
