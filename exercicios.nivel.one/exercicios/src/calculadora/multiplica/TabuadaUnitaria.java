package calculadora.multiplica;

import java.util.Scanner;

public class TabuadaUnitaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("A tabuada do: " + numero + " e ");
        for(int i = 1; i <= 10; i++) {
            System.out.println("O numero " + i + " x " + numero + " e " + (i * numero));
        }

    }
}
