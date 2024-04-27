package src;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        imprimirCandidatos();
    }

    public static void imprimirCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana"};

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("Candidato: " + candidatos[i]);
        }
    }

    public static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana"};

        int candidatosSelecionados = 0;
        int candidatoAtual= 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosSelecionados < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPrentedido();

            System.out.println("Candidato: " + candidato + " - Salário Pretendido: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){;
            System.out.println("o candidato " + candidato + " foi selecionado");
            candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    public static double valorPrentedido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        } else {
            System.out.println("DESCULPE, NÃO PASSOU");
        }
    }
}
