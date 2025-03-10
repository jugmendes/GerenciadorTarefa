package controle;

import org.junit.jupiter.api.Test;
import tarefa.Tarefa;

import static org.junit.jupiter.api.Assertions.*;

public class ControleTarefaTeste {

    @Test
    public void testAdicionarTarefa(){
        Tarefa tarefa = new Tarefa(1,"Estudar para avaliação");
        ControleTarefa.getInstance().adicionarTarefa(tarefa);

        assertTrue(ControleTarefa.getInstance().getTarefas().contains(tarefa));
    }

    @Test
    public void testBuscarTarefaPorId() {
        ControleTarefa controle = ControleTarefa.getInstance();
        Tarefa tarefa = new Tarefa(1, "Fazer exercício");
        controle.adicionarTarefa(tarefa);

        Tarefa encontrada = controle.buscarTarefaPorId(1);

        assertNotNull(encontrada);
    }
}
