package Collection;

import java.util.ArrayList;
import java.util.List;

public class MainEx01 {
    public static void main(String[] args) {
        List<String> listaDaLoja = new ArrayList<>();

        listaDaLoja.add("Banana");
        listaDaLoja.add("Maça");
        listaDaLoja.add("Morango");
        listaDaLoja.add("Uva");
        listaDaLoja.add("Mamão");

        listaDaLoja.remove(1);
        listaDaLoja.remove(2);

        for (String valorPesquisado : listaDaLoja) {
            System.out.println(valorPesquisado);
        }



    }
}
