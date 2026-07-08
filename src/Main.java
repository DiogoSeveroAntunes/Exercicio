import java.util.*;

public class Main {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaOrdenada();
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
    private static void exemploListaOrdenada(){
    Scanner s = new Scanner(System.in);
    List<String> lista = new ArrayList<>();

    System.out.println("Digite o nome das pessoa desta lista com ordenação, separando cada um com (,):");
    String resposta = s.nextLine();
    lista.addAll(Arrays.asList(resposta.split(",")));
    Collections.sort(lista);

    System.out.println(lista);
    }
}