package Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import SIG.Sig;
import SistemaDeApoio.Item;
import Subsistemas.Aluno;
import Subsistemas.Professor;

public class SigTest {

    private Sig uepb = new Sig();
    private Item item = new Item((float) 14.90, "Detergente");
    private Professor professor = new Professor("Misael");
    private Aluno aluno = new Aluno("Felix");

    //private Reuniao ()

    @Test
    void testAddEstoque() {
        uepb.addItem(1, "Detergente", (float) 14.9);
        
        assertEquals(item.getNome(), uepb.getAlmo().getItem(0));

    }
    @Test
    void testCriarAluno() {
        assertEquals(aluno.getNome(), uepb.criarAluno("Felix").getNome());
    }

    @Test
    void testCriarProfessor() {
        assertEquals(professor.getNome(), uepb.criarProfessor("Misael").getNome());
    }

    @Test
    void testGetSalarioProf() {
        uepb.criarProfessor("Misael");
        uepb.getContabilidade().addPagamento(professor, (float) 64500.50);
        assertEquals((float) 64500.5, uepb.getContabilidade().getFolhaDePagamento().get(0).getValorSalario());
    }

}
