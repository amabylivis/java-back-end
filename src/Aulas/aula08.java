package Aulas;

import java.util.Scanner;

public class aula08 {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        var name = "";
        while (!name.equalsIgnoreCase("exit")){
            System.out.println("Digite um nome: ");
            name = Scanner.next();
            System.out.println(name);
        };
    }
}
