import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo! Qual o seu nome?");
        String name = sc.next();
        System.out.printf("%s Qual o seu peso em kg? ", name);
        double peso = sc.nextDouble();
        System.out.printf("%s Qual o seu altura? ", name);
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Você está abaixo do peso");
        }else if(imc > 18.6 && imc < 24.9){
            System.out.println("Você está no seu peso ideal");
        }else if (imc > 25.0 && imc < 29.9) {
            System.out.println("Você está levemente acima do peso");
        }else if (imc > 30.0 && imc < 34.9) {
            System.out.println("Você está com obesidade grau I");
        }else if (imc > 35.0 && imc < 39.9) {
            System.out.println("Você está com obesidade grau II (Sevéra)");
        }else if (imc >= 40.0) {
            System.out.println("Você está com obesidade grau III (Mórbida)");
        }
    }
}
