import java.util.*;

public class Main {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaOrdenada();
        exemploListaComValoresSimples();
        exemploListaComValoresOrdenados();
    }
    private static void exemploListaComValoresOrdenados() {
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
    private static void exemploListaComValoresSimples() {
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
            System.out.println(lista);
        }
    }
    private static void exemploListaOrdenada(){
        Scanner s = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        System.out.println("Digite o nome das pessoa desta lista com ordenação, separando cada um com (,):");
        String resposta = s.nextLine();
        lista.addAll(Arrays.asList(resposta.split(",")));
        Collections.sort(lista);
        System.out.println(lista);
    }
    private static void exemploListaSimples(){
        Scanner s = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Digite o nome das pessoa desta lista, separando cada um com (,):");
        String resposta = s.nextLine();
        lista.addAll(Arrays.asList(resposta.split(",")));
        System.out.println(lista);
        System.out.println(lista);
    }
}