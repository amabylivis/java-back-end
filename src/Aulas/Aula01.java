package Aulas;

import java.util.Scanner;

public class Aula01 {
    //constantes, deve ser em maiusculo e antes do exemplos.main
    private final static String WELCOME_MESSAGE = "Olá! Informe o seu nome: ";

    public static void main(String[] args) {

        //declarando variáveis
        Scanner scanner = new Scanner(System.in);

        //tela e comando para receber valores

        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);

        //tipagem estática, declarou uma variável não pode mudar
    }
}
