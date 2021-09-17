package Collection;

import java.util.HashMap;
import java.util.Map;


public class MainEx03 {
    public static void main(String[] args) {

        //Para criar o dicionário
        Map<Integer, String> map01 = new HashMap<>();

        //Para adicionar por chave e valor
        map01.put(1,"Placa de vídeo");
        map01.put(2,"Processador");
        map01.put(3,"HD");
        map01.put(4,"SSD");
        map01.put(5,"Fonte de energia");

        //Para consultarmos por chave
        String value = map01.get(3);
        String value02 = map01.get(1);
        System.out.println(value);
        System.out.println(value02);

        map01.remove(5);
        map01.remove(4);

        //Percorremos todos os valores, percorrendo todas as chaves (keys)
        for(Integer chaveDePesquisa : map01.keySet()){
            String valorDeOutput = map01.get(chaveDePesquisa);
            System.out.println(valorDeOutput);
        }
    }
}


//package arrayListEx01;
//
//        import java.util.HashSet;
//        import java.util.Set;
//
//public class MainEx02 {
//    public static void main(String[] args) {
//        // Passo C - Hora da revisão - Nível 02
//        // Item 02 - Hash Set
//
//        // Para criarmos o conjunto
//        Set<String> conjuntoDoMinerador = new HashSet<>();
//
//        // Para adicionarmos valores ao "set" (Conjunto)
//        conjuntoDoMinerador.add("Corda");
//        conjuntoDoMinerador.add("Lanterna");
//        conjuntoDoMinerador.add("Picareta");
//        conjuntoDoMinerador.add("Garrafa de água");
//
//        // Para remover um item por valor
//        conjuntoDoMinerador.remove("Corda");
//
//        // Para checarmos e apresentarmos todos os valores do "HashSet" (Conjunto Hash)
//        for(String valorAnalisado: conjuntoDoMinerador){
//            System.out.println(valorAnalisado);
//        }
//
//        // Passo D - Acompanhamento do exercício 01 de HashSet
//
//        // Exercício 01 (Exercise 01)
//        // A nossa nova missão é para automatizarmos uma fila de doações que está recebendo
//        // uma alta quantidade de pessoas.
//        // Para garantir que todos recebam pelo menos 01 doação, temos algumas regras:
//        Set<String> listaDeDoacao = new HashSet<>();
//
//        // Adicionando itens de doação a lista
//        // Itens do tipo "Comida"
//        listaDeDoacao.add("Pacote de biscoito");
//        listaDeDoacao.add("Macarrão");
//        listaDeDoacao.add("Banana");
//        listaDeDoacao.add("Arroz");
//        listaDeDoacao.add("Carne");
//
//        // Itens do tipo "Abrigo"
//        listaDeDoacao.add("Roupa moletom");
//        listaDeDoacao.add("Cachecol");
//        listaDeDoacao.add("Gorro");
//        listaDeDoacao.add("Jaqueta");
//        listaDeDoacao.add("Calças grossas");
//
//        // 01 - Precisamos cadastrar 05 produtos do tipo "Comida" sem foco obrigatório em ordem.
//        // 02 - Agora, vamos cadastrar 05 produtos do tipo "Abrigo" seguindo a não-obrigação de ordenação.
//
//        // 03 - Tendo em vista que 01 item de cada tipo não foi doado, vamos remover 01 item
//        // de cada tipo antes de mostrarmos o relatório de doações arrecadadas.
//
//        // Removendo 01 item do tipo "Comida"
//        listaDeDoacao.remove("Macarrão");
//
//        // Removendo 01 item do tipo "Abrigo"
//        listaDeDoacao.remove("Jaqueta");
//
//        // 04 - Fase final: Vamos criar uma forma de mostrar todos os itens que recebemos
//        // e que foram doados conforme o plano da iniciativa de doação.
//        for(String valorRemovido:listaDeDoacao){
//            System.out.println(valorRemovido);
//        }
//
//        // Observação: Não é necessário apresentar os itens que foram removidos.
//
//        // Exercício 02 (Exercise 02) - Novamente, deixo com vocês!
//
//       }}