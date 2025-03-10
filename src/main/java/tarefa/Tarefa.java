package tarefa;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    @Override
    public String toString(){
        return "ID: " + id + " | Descrição: " + descricao + " | Concluída: " + concluida;
    }
}
