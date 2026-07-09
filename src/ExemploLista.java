import java.util.*;


public class ExemploLista {

    static void exemploListaComValoresOrdenados() {
        Map<String, String> lista = new HashMap<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva o nome e o sexo, se parando os nomes utilizando (,) e o sexo desse modo (nome)+(-) e o sexo(M ou F)");
        String resultado = s.nextLine();
        String[] split = resultado.split(",");
        for (String pessoa : split) {
            String[] dados = pessoa.split("-");
            if (dados.length == 2) {
                String nomes = dados[0];
                String sexo = dados[1];
                lista.put(nomes, sexo);
            }
            Map<String, String> listaOrdenada = new TreeMap<>(lista);
            System.out.println(listaOrdenada);
        }
    }
    static void exemploListaComValoresSimples() {
        Map<String, String> lista = new HashMap<>();
        Map<String, String> listaFeminina = new HashMap<>();
        Map<String, String> listaMasculina = new HashMap<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva o nome e o sexo, se parando os nomes utilizando (,) e o sexo desse modo (nome)+(-) e o sexo(M ou F)");
        String resultado = s.nextLine();
        String[] split = resultado.split(",");
        for (String pessoa : split) {
            String[] dados = pessoa.split("-");
            if (dados.length == 2) {
                String nomes = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();
                lista.put(nomes, sexo);
            }
//            O Map.Entry serve para as Key e os Values de um map, Ele também
//            possibilita a chamada dos getKey, para pegar a chave do map/primeira informação guardada
//            e o getValue,que pega o valor/ segunda informação guardada
//            Já o entrySet, basicamente diz que é para ver todos os Keys e Values dentro daquele map e me passar eles.
//            Quando você chama (Map desejado).entrySet(), você está dizendo:
//            "Java, me dê uma coleção de todos os pares completos que existem aí dentro".
            for(Map.Entry<String, String> i : lista.entrySet()){
                String nome = i.getKey();
                String sexo = i.getValue();
                if(sexo.equals("M")){
                    System.out.println("o Nome " + nome + " é masculino");
                    listaMasculina.put(nome, sexo);
                }else if(sexo.equals("F")){
                    System.out.println("o Nome " + nome + " é Feminino");
                    listaFeminina.put(nome, sexo);
                }
            }
            System.out.println("Lista completa:"+lista);
            System.out.println("Lista feminina:"+listaFeminina);
            System.out.println("Lista masculina:"+listaMasculina);
            s.close();
        }
    }
    static void exemploListaOrdenada(){
        Scanner s = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        System.out.println("Digite o nome das pessoa desta lista com ordenação, separando cada um com (,):");
        String resposta = s.nextLine();
        lista.addAll(Arrays.asList(resposta.split(",")));
        Collections.sort(lista);
        System.out.println(lista);
    }
    static void exemploListaSimples(){
        Scanner s = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Digite o nome das pessoa desta lista, separando cada um com (,):");
        String resposta = s.nextLine();
        lista.addAll(Arrays.asList(resposta.split(",")));
        System.out.println(lista);
        System.out.println(lista);
    }
}