package classes;

public class Setor {

    private String nomeDoSetor;
    private boolean pavimentar = false;

    public Setor() {
    }

    public Setor(String descricao) {
        this.nomeDoSetor = descricao;

    }

    public Setor(String descricao, boolean pavimentar) {
        this.nomeDoSetor = descricao;
        this.pavimentar = pavimentar;

    }

    public String getNomeDoSetor() {
        return nomeDoSetor;
    }

    public void setNomeDoSetor(String nomeDoSetor) {
        this.nomeDoSetor = nomeDoSetor;
    }

    public boolean isPavimentado() {
        return pavimentar;
    }

    public void setPavimentado(boolean pavimentado) {
        this.pavimentar = pavimentado;
    }

}
