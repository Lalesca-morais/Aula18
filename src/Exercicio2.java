import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int elementos, indice, valor;
        List<Integer> numero = new ArrayList<>();

        System.out.println("Digite quantos elementos deseja colocar na lista: ");
        elementos = entrada.nextInt();
        for(int i=0; i<elementos; i++) {
            System.out.println("Digite um número: ");
            numero.add(entrada.nextInt());
        }
        System.out.println(numero);
        System.out.println("Digite o índice que deseja inserir: ");
        indice = entrada.nextInt();

        System.out.println("Digite o valor que deseja inserir: ");
        valor = entrada.nextInt();

        numero.add(indice, valor);

        System.out.println("ìndice adicionado com sucesso!");
        System.out.println(numero);
    }
}
