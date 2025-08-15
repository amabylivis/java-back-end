package exemplos;

import java.util.Scanner;
// exibir a tabuada
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número que deseja saber a tabuada: ");
        int number = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = number * i;

            System.out.printf("O resultado da operação %d x %d é: %d \n", number, i, result);
        }
    }
}
