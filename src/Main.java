
import SIG.Sig;

public class Main{

    public static void main(String[] args) {
        Sig uepb = new Sig();
/*
  */
        uepb.addEntrevita(2022, 12, 3, 11, 0);
        uepb.addEntrevita(2022,11,14, 11, 0);
        
        uepb.criarAluno("Thiago");
        uepb.criarAluno("Renan");

        uepb.criarProfessor("Sabrina");

        uepb.criarDisciplina("MAP", 2022, 12, 3, 11, 0);

        uepb.addPessoaEntrevista(0, uepb.getAlunos().get(0));
        uepb.addPessoaEntrevista(0, uepb.getProfessores().get(0));
        
        uepb.addPessoaReuniao(1, uepb.getAlunos().get(1));
        uepb.addPessoaReuniao(1, uepb.getProfessores().get(0));

        uepb.verReunioes();

        uepb.addPagamento(uepb.getProfessores().get(0), 140000);
        uepb.custoTotal();
        uepb.verFolhaPagamento();
       
        uepb.addDisciplinaProfessor(uepb.getProfessores().get(0), uepb.getDisciplinas().get(0));

        System.out.println(uepb.getDisciplinas().get(0).getProfessor());

        uepb.getProfessores().get(0).setTempoDeCasa((float) 10.00);
        
         uepb.getProfessores().get(0).toString();
        // Relacionada aos alunos (histórico e RDM);

        uepb.getDisciplinas().get(0).setAlunos(uepb.getAlunos());

        uepb.getAlunos().get(0).getGrade();

        //Ao almoxarifado (estoque, pedido de compra);
        uepb.addItem(1, "Sabão", 10);
        uepb.addItem(0, "Detergetegente", 15);

        System.out.println(uepb.getAlmo().getItens());

        //À infra-estrutura (alocação de salas).
        
        uepb.addSala(110);
        uepb.addSala(120);
        System.out.println(uepb.getCct().getSalas());    
    }
}

