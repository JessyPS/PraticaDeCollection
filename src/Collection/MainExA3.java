package Collection;

import java.util.HashSet;
import java.util.Set;

public class MainExA3 {

    public static void main(String[] args) {

        Set<String> listaDeDoacao = new HashSet<>();

        //Adicionando itens de doação na lista

        //Itens do tipo comida
        listaDeDoacao.add("Pacote de biscoito ");
        listaDeDoacao.add("Macarrão");
        listaDeDoacao.add("arroz");
        listaDeDoacao.add("feijão");
        listaDeDoacao.add("farinha");

        //Itens do tipo Abrigo
        listaDeDoacao.add("Calça");
        listaDeDoacao.add("Blusa");
        listaDeDoacao.add("Bermuda");
        listaDeDoacao.add("Casaco");
        listaDeDoacao.add("Moletom");

        //Removento 1 item do tipo "Comida"
        listaDeDoacao.remove("arroz");

        //Removento 1 item do tipo "Abrigo"
        listaDeDoacao.remove("Blusa");

        for(String itensDoados : listaDeDoacao){
            System.out.println(itensDoados);
        }

        Set <String> listaCAC = new HashSet<>();


        listaCAC.add("Cimento");
        listaCAC.add("Argamassa");
        listaCAC.add("Caibros");
        listaCAC.add("Cal");
        listaCAC.add("Pedras");
        listaCAC.add("Caminhão de água");
        listaCAC.add("Betoneira");
        listaCAC.add("Serviço de obras A - Arquiteto");
        listaCAC.add("Serviço de obras B - Chefe de obras");
        listaCAC.add("Serviço de obras C - Pedreiro");

        listaCAC.remove("Serviço de obras A - Arquiteto");
        listaCAC.remove("Argamassa");
        listaCAC.remove("Caminhão de água");

        for(String listaConstrucao : listaCAC){
            System.out.println(listaConstrucao);
        }
    }
}


// Ainda dentro deste projeto de doação, precisamos arrecadar materiais de construção
        // para construirmos um C.A.C. (Conjunto Habitacional Coletivo), onde teremos várias casas
        // construídas com o material arrecadado.
        // Para isto ser um sucesso, temos uma lista de doações necessárias a ser feita:
        // Lista HashSet de doações para construção do C.A.C.
        // A - Criar uma lista HashSet para comportar os itens doados que serão cadastrados
        // Agora, vamos cadastrar os seguintes itens nesta lista:
        // 01 - Cimento
        // 02 - Argamassa
        // 03 - Caibros
        // 04 - Cal
        // 05 - Pedras
        // 06 - Caminhão de água
        // 07 - Betoneira
        // 08 - Serviço de obras A - Arquiteto
        // 09 - Serviço de obras B - Chefe de obras
        // 10 - Serviço de obras C - Pedreiro

        // Infelizmente, alguns itens não puderam ser doados (Serão replanejados):
        // Portanto, por enquanto, precisamos removê-los da lista:
        // 01 - Serviço de obras A - Arquiteto
        // 02 - Argamassa
        // 03 - Caminhão de água

        // E para concretização do planejamento, vamos desenvolver uma parte do sistema
        // que apresenta os itens que puderam ser arrecadados na doação.
        // Dica: Use laços de repetição para esta etapa.
        // Planejamento de ação de apoio social realizado com sucesso!!!
//    }
//}