import lista.Encadeada;

public class Main {
    public static void main(String[] args) {

        Encadeada lista = new Encadeada();
        lista.add(777);
        lista.add(21312);
        lista.addNaOrdem(1);
        lista.addNaOrdem(3);
        lista.addNaOrdem(5);
        lista.addNaOrdem(10);
        lista.addNaOrdem(2);
        lista.addNaOrdem(55);

        lista.retorno();

    }
}
