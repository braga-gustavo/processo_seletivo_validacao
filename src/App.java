import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        selectCanidate();
    }

    public static void selectCanidate(){
        String candidates[] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", 
        "MONICA", "FABRICIO", "MIRELA", "DANIELA, JORGE"};

        Integer selectedCandidates = 0;
        Integer currentCanidates = 0;
        Double baseSalarie = 2000.0; 

        while(selectedCandidates < 5 && currentCanidates < candidates.length){
            String candidate = candidates[currentCanidates];
            Double requestedValue = requestedValue();

            if(baseSalarie >= requestedValue){
                System.out.println("Candidato selecionado para a vaga: " + candidate);
                selectedCandidates++;
            }

            currentCanidates ++;
        }
    }

    public static void analiseCandidate(Double requestedSalarie) {
        Double baseSalarie = 2000.0;

        if (baseSalarie > requestedSalarie) {
            System.out.println("LIGAR PARA O CANDIDATO!");

        } else if (baseSalarie.equals(requestedSalarie)) { // Compraração de Double() precisa ser feita com o metodo
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRTA PROPOSTA");

        } else if (requestedSalarie > baseSalarie) {
            System.out.println("AGUARDANDO O RESULTADO DOS OUTROS CANDIDATOS");
        }
    }

    public static Double requestedValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
