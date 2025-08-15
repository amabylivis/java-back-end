package Aulas;

import java.util.Scanner;

public class aula05 {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = Scanner.next();
        System.out.println("Informe sua idade: ");
        int age = Scanner.nextInt();
        System.out.println("Você é emancinado? (s/n)");
        var isEmancipated = Scanner.next().equalsIgnoreCase ( "s");

        if(age >= 18){
            System.out.printf("Parabéns %s! você pode dirigir.", name);
        }else if (age >= 16 && isEmancipated){
            System.out.printf("Parabéns %s! mesmo você tendo %d, você é emancipado e pode dirigir.", name, age);
        }else{
            System.out.printf("Que pena %s, você não pode dirigir", name);
        }
        Scanner.close();

        /*var canDrive = (age >= 18) || (age >=16 && isEmancipated);
        var message = canDrive ?
            name +", você Rode dirigir \n" :
            name + ", você não pode dirigir \n";
        System.out.println(message);*/
    }
}
