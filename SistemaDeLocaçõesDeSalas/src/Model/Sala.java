
package Model;


public class Sala {
    
    private int id_sala;
    private int id_bloco;
    private int capacidade;
    private int andar;
    private String descricao;

    public Sala(int id_sala, int id_bloco, int capacidade, int andar, String descricao) {
        this.id_sala = id_sala;
        this.id_bloco = id_bloco;
        this.capacidade = capacidade;
        this.andar = andar;
        this.descricao = descricao;
    }

    public Sala() {
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public int getId_bloco() {
        return id_bloco;
    }

    public void setId_bloco(int id_bloco) {
        this.id_bloco = id_bloco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
    
}
