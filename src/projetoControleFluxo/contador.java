package Aulas.projetoControleFluxo;
import Aulas.projetoControleFluxo.Exceptions.ParametrosInvalidosException;
import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        String continuar = "";
        do {
            try {
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = terminal.nextInt();

                contar(parametroUm, parametroDois);

            } catch (
                    ParametrosInvalidosException exception) { //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            } catch (java.util.InputMismatchException exception) {
                System.out.println("Erro: Você deve digitar um número inteiro");
                terminal.next();
            }

            System.out.println("Deseja executar novamente? (S/N) ");
            continuar = terminal.next();

        } while (continuar.equalsIgnoreCase("S"));
        System.out.println("Programa finalizado");
        terminal.close();
    }
        static void contar ( int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) { //condição para validar
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                //Lançamento de exceção
            }

            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }

}
