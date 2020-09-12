package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.Cidade;
import model.Util_GeradorIdentificador;

public class CidadeDao {
    
    private static CidadeDao instance = null;
    public final String nomeDoArquivo = "CIDADE.TXT";

    private CidadeDao() throws Exception {
        
    }
    
    public static CidadeDao getInstance()throws Exception{
        if (instance == null) {
            instance = new CidadeDao();
        }
        return instance;               
    }

    public void incluir(Cidade objeto) throws Exception {
        try {
            verificarArquivo();
            Util_GeradorIdentificador idCidade;
            idCidade = new Util_GeradorIdentificador();
            objeto.setIdCidade(idCidade.getID());
            FileWriter fw = new FileWriter(nomeDoArquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();
            idCidade.finalize();
        } catch (Exception erro) {
            throw new Exception("Erro ao incluir registro de cidaded!\n", erro);
        }
    }

    public ArrayList<Cidade> recuperar() throws Exception {
        try {
            verificarArquivo();
            ArrayList<Cidade> lista;
            lista = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Cidade cidade = new Cidade(linha);
                lista.add(cidade);
            }
            br.close();
            return lista;

        } catch (Exception erro) {
            throw new Exception("Erro ao recuperar dados da cidade singleton!\n" + erro);
        }
    }

    public void verificarArquivo() throws Exception {
        File arquivo = new File(nomeDoArquivo);
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
    }

}
