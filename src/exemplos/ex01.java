package exemplos;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Digite quantos centímetros tem um lado do quadradado: ");
        float lado = Scanner.nextFloat();

        float area = lado * lado;

        System.out.printf("A área do seu quadrado é %s", area);
    }
}
