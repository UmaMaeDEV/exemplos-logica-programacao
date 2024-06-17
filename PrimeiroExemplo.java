import java.util.Scanner;

public class PrimeiroExemplo {
    public static void main(String[] args) {
        //Receber 2 n[umeros, se o primeiro for multiplo de 2 vamos multiplicar, caso contrario vamos somar

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o primeiro número");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Por favor, insira o segundo número");
        int segundoNumero = scanner.nextInt();
        int resultado = 0;

        if(primeiroNumero %2 == 0){
            resultado = primeiroNumero * segundoNumero;
        } else{
            resultado = primeiroNumero + segundoNumero;
        }

        System.out.println("O resultado é: " + resultado);
    }
}
