import lista.Encadeada;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Encadeada lista = new Encadeada();
        lista.add(777);

        lista.add(4);
        lista.add(3);
        lista.removerPar();



        lista.retorno();

    }
}
