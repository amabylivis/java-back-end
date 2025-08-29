package Aulas.aula09.candidaturas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processSelective {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        selecaoCandidatos();
        List<String> aprovados = selecaoCandidatos();
        entrandoEmContato(aprovados);

    }

    static List<String> selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        List<String> candidatosSelecionadosLista = new ArrayList<>();// cria uma lista

        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionadosLista.size() < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretend();

            System.out.println("O candidado " + candidato + " solicitou este valor de salário " + String.format("%.2f", salarioPretendido)); // limita a dois depois do ponto

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionadosLista.add(candidato); //adicionando o selecionado a lista
            }
            candidatosAtual++;
        }
        System.out.println("Lista de candidatos: ");
        for (int i = 0; i < candidatosSelecionadosLista.size(); i++) {
            System.out.println("O candidato de n° " + (i + 1) + " é o " + candidatosSelecionadosLista.get(i));
        }
        System.out.println("------------------------------------");
        /*for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);}
             sem indice */
        return candidatosSelecionadosLista;
    }

    static double valorPretend() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void entrandoEmContato(List<String> candidatos) {
        for(String candidato : candidatos){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
            if (atendeu){
                System.out.println("Conseguimos contatos com " + candidato + " na " + (tentativasRealizadas + 1) + "ª tentativa");
            }else {
                System.out.println("Não conseguimos contato com " + candidato);
            }
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}

    /*public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DO DEMAIS CANDIDATOS");
        }*/


