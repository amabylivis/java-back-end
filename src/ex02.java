import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);

        System.out.println("Escreva a altura do seu retângulo em cm: ");
        float altura = Scanner.nextFloat();
        System.out.println("Escreva a base do seu retângulo em cm: ");
        float base = Scanner.nextFloat();

        float area = base * altura;

        System.out.printf("A área do seu retângulo é %s", area);

    }
}
