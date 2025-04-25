package indice.corporal;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual sua altura ? ");
        double altura = scanner.nextDouble();

        System.out.println("Qual seu peso? ");
        double peso = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        if(IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Peso ideal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Obsidade grau II (Severa)");
        } else {
            System.out.println("Obsidade III (Morbida)");
        }
    }
}
