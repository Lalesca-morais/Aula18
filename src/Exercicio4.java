import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int primeiroNumero, segundoNumero;
        System.out.println("Digite um número: ");
        primeiroNumero = entrada.nextInt();

        System.out.println("Digite outro número: ");
        segundoNumero = entrada.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("A ordem decrescente é:"+primeiroNumero+","+segundoNumero+".");
        }else {
            System.out.println("A ordem decrescente é:"+segundoNumero+","+primeiroNumero+".");
        }
    }
}