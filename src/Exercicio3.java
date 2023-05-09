import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o tamanho da lista desejada: ");
        int tamanhoLista = entrada.nextInt();
        List<Integer> numero = retornoListaNumeros(tamanhoLista);

        AdicionarMetodos(numero, tamanhoLista);
        System.out.println("A média dos valores armazenados da lista é " +mediaValores(numero));

    }
    public static List<Integer> retornoListaNumeros (int tamanhoLista) {
        List<Integer> lista = new ArrayList<>(tamanhoLista);
        return lista;
    }
    public static Boolean AdicionarMetodos (List<Integer> lista, int tamanhoLista) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Digite o " +(i + 1)+ "valor : ");
            lista.add(entrada.nextInt());
        }
        return true;
    }
    public static double mediaValores (List<Integer> lista) {
        double media = 0;
        for (int i = 0; i < lista.size(); i++){
            media = media + lista.get(i);
        }
        media = media / lista.size();
        return media;
    }
}
