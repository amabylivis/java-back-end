import java.util.Scanner;

public class Aula03 {
   /* public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2? ");
        var result = Scanner.nextInt();
        var isWrong = result !=4;
        System.out.printf("O resultado é 4, você errou? (%s) \n", isWrong);
        //aprendizado com a var boolean */
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem? ");
        int age = Scanner.nextInt();
        System.out.println("Você é emancipado?");
        boolean isEmancipated = Scanner.nextBoolean();
        boolean canDrive = age >=18 || (isEmancipated && age >=16);
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}
