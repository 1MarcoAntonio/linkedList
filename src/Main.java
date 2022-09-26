import lista.Encadeada;

public class Main {
    public static void main(String[] args) {

        Encadeada lista = new Encadeada();
        lista.add(777);
        lista.add(21312);
        System.out.println(lista.get(1).getElement());


    }
}
