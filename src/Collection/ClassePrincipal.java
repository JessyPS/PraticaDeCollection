package Collection;

import java.util.ArrayList;
import java.util.List;


public class ClassePrincipal {

    public static void main(String[] args) {

    //Para criar ArrayList
    List<String> listaExemplo = new ArrayList<>();

    //Para adicionar valores
    listaExemplo.add("A1");
    listaExemplo.add("B2");
    listaExemplo.add("C3");
    listaExemplo.add("D4");

    //Para removermos por índice
    listaExemplo.remove(2);

    //Para consultar por índice
    String valorDeObtencao = listaExemplo.get(1);
//    String valorDeColeta = listaExemplo.get(3); //obs esse foi removido

    //Para apresentar todos os valores cadastrados
    for(String valorBuscado:listaExemplo){
        System.out.println(valorBuscado);
    }
//    for(String valorASerObtido:listaExemplo){
//        System.out.println(valorASerObtido);
//    }

    }
}
