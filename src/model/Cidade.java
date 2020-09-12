package model;

public class Cidade implements Comparable<Cidade> {

    private static Cidade instancia;
    private int idCidade;
    private String nomeDaCidade = "São Paulo";
    private String uf = "SP";
    private String regiaoDoEstado = "Sudoeste";
    private String setor = "";
    private String setorPavimentado = "";

    private Cidade() {

    }

    public static Cidade getInstancia() {
        if (instancia == null) {
            instancia = new Cidade();
        }
        return instancia;
    }

    public Cidade(String strDados) throws Exception {
        String[] vetorCidade = strDados.split(";");
        if (vetorCidade.length < 6) {
            throw new Exception("Faltam dados da cidade!\n");
        }
        idCidade = Integer.parseInt(vetorCidade[0]);
        nomeDaCidade = vetorCidade[1];
        uf = vetorCidade[2];
        regiaoDoEstado = vetorCidade[3];
        setor = (vetorCidade[4]);
        setorPavimentado = vetorCidade[5];
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeDaCidade() {
        return nomeDaCidade;
    }

    public void setNomeDaCidade(String nomeDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRegiaoDoEstado() {
        return regiaoDoEstado;
    }

    public void setRegiaoDoEstado(String regiaoDoEstado) {
        this.regiaoDoEstado = regiaoDoEstado;
    }

    public String getSetor() {
        return setor;
    }

    public String getSetorPavimentado() {
        return setorPavimentado;
    }

    public void setSetorPavimentado(String setorPavimentado) {
        this.setorPavimentado = setorPavimentado;
    }

    public boolean criarSetor(int opcao, String nome) throws Exception {
        if (opcao == 1) {
            this.setor = nome;
            return true;
        }
        return false;

    }

    public void setorpavimentado(int opcao) throws Exception {
        if (opcao == 1) {
            setorPavimentado = "Pavimentado";
        } else {
            setorPavimentado = "Não-Pavimentado";
        }
    }

    @Override
    public String toString() {
        String saida = this.idCidade + ";";
        saida += this.nomeDaCidade + ";";
        saida += this.uf + ";";
        saida += this.regiaoDoEstado + ";";
        saida += this.setor + ";";
        saida += this.setorPavimentado + ";";
        return saida;
    }

    @Override
    public int compareTo(Cidade objeto) {
        return setor.compareToIgnoreCase(objeto.setor);
    }

}
