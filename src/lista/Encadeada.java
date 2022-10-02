package lista;

public class Encadeada {
    private Node head;
    private Node tail;

    private int tamanho;

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

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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
        this.tamanho++;
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

    public void addNaOrdem(int element){
        Node novo = new Node(element);
        if (novo.getElement()<this.head.getElement()){
            novo.setNext(this.head);
            this.tail = this.head;
            this.head = novo;
            tamanho++;

        }else {
            Node p;
            p = this.head;
            while (p!=null){
                if (novo.getElement()>=p.getElement() && novo.getElement()<=p.getNext().getElement()){
                    novo.setNext(p.getNext());
                    p.setNext(novo);
                    break;
                }else{
                    p = p.getNext();
                }



            }
        }
    }

    public void retorno(){
        Node atual = this.head;
        while (atual!=null){
            System.out.println(atual.getElement());
            atual = atual.getNext();
        }

    }

    public void removerPar(){
        Node anterior = null;
        Node atual = this.head;
        while (atual!=null){
            if (atual.getElement()%2==0){
                anterior.setNext(atual.getNext());


            }
            anterior = atual;
            atual = atual.getNext();

        }
    }


}
