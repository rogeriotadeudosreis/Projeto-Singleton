package classes;

public class Cidade {

    private static Cidade instancia;
    private static final String nomeDaCidade = "São Paulo";
    private static final String uf = "SP";
    private static final String regiaoDoEstado = "Sudoeste";
    private Setor setorCriado = null;
    private String setorPavimentado = "";

    private Cidade() {

    }

    public static Cidade getInstancia() {
        if (instancia == null) {
            instancia = new Cidade();
        }
        return instancia;
    }

    public  Setor getSetorCriado() {
        return setorCriado;
    }

    public void setSetorCriado(Setor setorCriado) {
        setorCriado = setorCriado;
    }

    @Override
    public String toString() {
        String saida = "---------------------------- Dados da Cidade / Setores ----------------------------\n\n";
        saida += "Nome da Cidade......................." + nomeDaCidade + "\n";
        saida += "UF da Cidade............................." + uf + "\n";
        saida += "Região do estado Cidade......." + regiaoDoEstado + "\n";
        saida += "Nome do setor criado..............." + setorCriado.getNomeDoSetor() + "\n";
        saida += "Setor pavimentado ?................." + this.setorPavimentado + "\n";
        saida += "--------------------------------------------------------------------------------------------";
        return saida;
    }

    public Setor criarSetor(Setor objeto) {
        setorCriado = objeto;
        return setorCriado;
    }

    public void getSetorPavimentado(Setor setor) {
        if (setor.isPavimentado()) {
            this.setorPavimentado = "Sim";
        } else {
            this.setorPavimentado = "Não";
        }
    }
}
