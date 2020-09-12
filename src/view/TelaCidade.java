package view;

import controller.CidadeControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cidade;

public class TelaCidade extends javax.swing.JFrame {

    Cidade cidade;
    CidadeControl controle;

    public TelaCidade() throws Exception {
        try {
            initComponents();
            cidade = Cidade.getInstancia();
            controle = new CidadeControl();
            
            jCombCriarSetor.removeAllItems();
            String[] opcaoDeCriarSetor = {"Selecione aqui a opção", "( S ) - Sim", "( N ) - Não)"};
            for (int i = 0; i < opcaoDeCriarSetor.length; i++) {
                jCombCriarSetor.addItem(opcaoDeCriarSetor[i]);
            }
            
            jCombPavimentar.removeAllItems();
            String[] opcaoDePavimentar = {"Selecione aqui a opção", "( S ) - Sim", "( N ) - Não)"};
            for (int i = 0; i < opcaoDePavimentar.length; i++) {
                jCombPavimentar.addItem(opcaoDePavimentar[i]);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela!\n" + ex);
        }
        
        imprimirDadosTabela(controle.recuperar());
    }

    public void imprimirDadosTabela (ArrayList<Cidade> lista)throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTableCidadeSetor.getModel();
        model.setRowCount(0);
        Collections.sort(lista);
        
        for (int pos = 0; pos < lista.size(); pos++) {
            String[] linha = new String[6];
            Cidade aux = lista.get(pos);
            linha[0] = aux.getIdCidade()+ "";
            linha[1] = aux.getNomeDaCidade().toUpperCase();
            linha[2] = aux.getUf().toUpperCase();
            linha[3] = aux.getRegiaoDoEstado().toUpperCase();
            linha[4] = aux.getSetor();
            linha[5] = aux.getSetorPavimentado().toUpperCase();
            model.addRow(linha);
        }        
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCidadeSingleton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricaoSetor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonExecutar = new javax.swing.JButton();
        jCombCriarSetor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCombPavimentar = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCidadeSetor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Padrão de Projeto Singleton");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Controle de Criação de Setores");

        jLabel2.setText("Nome do setor");

        jLabel4.setText("Criar Setor ?");

        jButtonExecutar.setText("Executar");
        jButtonExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecutarActionPerformed(evt);
            }
        });

        jCombCriarSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione aqui a opção" }));
        jCombCriarSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCombCriarSetorMouseClicked(evt);
            }
        });

        jLabel3.setText("Pavimentar ?");

        jCombPavimentar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione aqui a opção" }));

        jTableCidadeSetor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cidade", "UF", "Região", "Setor Criado", "Pavimentado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCidadeSetor.setEnabled(false);
        jScrollPane2.setViewportView(jTableCidadeSetor);
        if (jTableCidadeSetor.getColumnModel().getColumnCount() > 0) {
            jTableCidadeSetor.getColumnModel().getColumn(0).setMinWidth(50);
            jTableCidadeSetor.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableCidadeSetor.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableCidadeSetor.getColumnModel().getColumn(1).setMinWidth(200);
            jTableCidadeSetor.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableCidadeSetor.getColumnModel().getColumn(1).setMaxWidth(200);
            jTableCidadeSetor.getColumnModel().getColumn(2).setMinWidth(30);
            jTableCidadeSetor.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableCidadeSetor.getColumnModel().getColumn(2).setMaxWidth(30);
            jTableCidadeSetor.getColumnModel().getColumn(3).setMinWidth(80);
            jTableCidadeSetor.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTableCidadeSetor.getColumnModel().getColumn(3).setMaxWidth(80);
            jTableCidadeSetor.getColumnModel().getColumn(4).setMinWidth(150);
            jTableCidadeSetor.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTableCidadeSetor.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        javax.swing.GroupLayout jPanelCidadeSingletonLayout = new javax.swing.GroupLayout(jPanelCidadeSingleton);
        jPanelCidadeSingleton.setLayout(jPanelCidadeSingletonLayout);
        jPanelCidadeSingletonLayout.setHorizontalGroup(
            jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDescricaoSetor)
                                    .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                                        .addComponent(jCombPavimentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 306, Short.MAX_VALUE)))
                                .addGap(93, 93, 93))
                            .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jCombCriarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(jButtonExecutar)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanelCidadeSingletonLayout.setVerticalGroup(
            jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCombCriarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricaoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombPavimentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExecutar)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCidadeSingleton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCidadeSingleton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecutarActionPerformed
       try{
        if (jCombCriarSetor.getSelectedIndex() != 1) {
            JOptionPane.showMessageDialog(null, "A opção selecionada não criará o setor");
        } else {
            
          controle.criarSetor(jCombCriarSetor.getSelectedIndex(), jTextFieldDescricaoSetor.getText());
          controle.setorpavimentado(jCombPavimentar.getSelectedIndex());
          controle.incluirCidade(cidade);
          imprimirDadosTabela(controle.recuperar());
            
        }
            jCombCriarSetor.setSelectedItem("Selecione aqui a opção");
            jCombPavimentar.setSelectedItem("Selecione aqui a opção");
            jTextFieldDescricaoSetor.setText("");
       }catch(Exception erro){
           JOptionPane.showMessageDialog(null, erro.getMessage());
       }
    }//GEN-LAST:event_jButtonExecutarActionPerformed

    private void jCombCriarSetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCombCriarSetorMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jCombCriarSetorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCidade().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaCidade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExecutar;
    private javax.swing.JComboBox<String> jCombCriarSetor;
    private javax.swing.JComboBox<String> jCombPavimentar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCidadeSingleton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCidadeSetor;
    private javax.swing.JTextField jTextFieldDescricaoSetor;
    // End of variables declaration//GEN-END:variables
}
