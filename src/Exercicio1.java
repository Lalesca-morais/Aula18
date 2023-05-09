import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio1 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            int elementos, indice;
            List<Integer> numero = new ArrayList<>();

            System.out.println("Digite quantos elementos deseja colocar na lista: ");
            elementos = entrada.nextInt();
            for(int i=0; i<elementos; i++) {
                System.out.println("Digite um número: ");
                numero.add(entrada.nextInt());
            }
            System.out.println(numero);
            System.out.println("Digite o índice que deseja remover: ");
            indice = entrada.nextInt();

            numero.remove(indice);

            System.out.println("índice removido com sucesso!");
            System.out.println(numero);
        }
}


