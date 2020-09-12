package controller;

import dao.CidadeDao;
import java.util.ArrayList;
import model.Cidade;

public class CidadeControl {

    CidadeDao cidadeDao;
    Cidade cidade;

    public CidadeControl() throws Exception {
        cidadeDao = CidadeDao.getInstance();
        cidade = Cidade.getInstancia();
    }
    
    public boolean criarSetor(int opcao, String nome)throws Exception{
        return cidade.criarSetor(opcao,nome);
    }
    
    public void setorpavimentado(int opcao)throws Exception{
        cidade.setorpavimentado(opcao);
    }

    public void incluirCidade(Cidade objeto) throws Exception {
        cidadeDao.incluir(objeto);
    }
    
    public ArrayList<Cidade> recuperar ()throws Exception{
        return cidadeDao.recuperar();
    }

}
