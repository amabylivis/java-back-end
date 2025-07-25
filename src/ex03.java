import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Qual o nome da pessoa n° 1? ");
        String name1 = Scanner.next();
        System.out.println("Informe a idade: ");
        int age1 = Scanner.nextInt();
        System.out.println("Qual o nome da pessoa n° 2? ");
        String name2 = Scanner.next();
        System.out.println("Informe a idade: ");
        int age2 = Scanner.nextInt();

        int diferenca;

        if (age1 > age2){
            diferenca = age1 - age2;
        }else{
            diferenca = age2 - age1;
        }
        System.out.printf("A diferença entre as idades de %s e %s é %d",name1, name2, diferenca);
    }
}
