// Exercício 02 (Exercise 02) - Agora é com vocês, Mestres.

// Para comunicação dos soldados na base naval, alguns comandos ainda estão faltando.
// Crie uma lista de comunicação do tipo arrayList e adicione mais 15 itens a esta lista para completar a fase 01 de comunicação.

package Collection;

import java.util.ArrayList;
import java.util.List;


public class MainEx02 {
    public static void main(String[] args) {

        List<String> listComunicacao = new ArrayList<>();

        listComunicacao.add("ALPHA ");
        listComunicacao.add("BRAVO ");
        listComunicacao.add("CHARLIE ");
        listComunicacao.add("DELTA ");
        listComunicacao.add("ECO ");
        listComunicacao.add("FOXTROT ");
        listComunicacao.add("GOLF ");
        listComunicacao.add("HOTEL ");
        listComunicacao.add("INDIA ");
        listComunicacao.add("JULIET");
        listComunicacao.add("KILO ");
        listComunicacao.add("LIMA ");
        listComunicacao.add("MIKE ");
        listComunicacao.add("NOVEMBER ");
        listComunicacao.add("OSCAR ");


// Por final, para chegarmos a conclusão da comunicação,
// remova 05 comandos do vetor de comunicação e reapresente o vetor
// com estes itens removidos.

        listComunicacao.remove(0);
        listComunicacao.remove(1);
        listComunicacao.remove(2);
        listComunicacao.remove(3);
        listComunicacao.remove(4);


// Para completar o nível 02 de comunicação, crie uma forma de apresentar
// todos os itens enviados ao vetor de comunicação (ArrayList).

        for (String valorEnviado : listComunicacao){
            System.out.println(valorEnviado);
        }

    }
}
