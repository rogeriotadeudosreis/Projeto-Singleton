package classes;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TelaCidade extends javax.swing.JFrame {

    Cidade cidade;
    Setor setor;

    public TelaCidade() {
        initComponents();

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
    }

    public void imprimirDadosSetor(Cidade setor) {
        String saida = setor.toString() + "\n";
        jTextAreaSaida.setText(saida);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCidadeSingleton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricaoSetor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jButtonExecutar = new javax.swing.JButton();
        jCombCriarSetor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCombPavimentar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Padrão de Projeto Singleton");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Controle de Criação de Setores");

        jLabel2.setText("Descrição do setor");

        jTextFieldDescricaoSetor.setText("ACLIMAÇÃO 2");

        jLabel4.setText("Criar Setor ?");

        jTextAreaSaida.setEditable(false);
        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaSaida.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaSaida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaida);

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

        javax.swing.GroupLayout jPanelCidadeSingletonLayout = new javax.swing.GroupLayout(jPanelCidadeSingleton);
        jPanelCidadeSingleton.setLayout(jPanelCidadeSingletonLayout);
        jPanelCidadeSingletonLayout.setHorizontalGroup(
            jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
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
                                        .addGap(0, 122, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExecutar))
                            .addGroup(jPanelCidadeSingletonLayout.createSequentialGroup()
                                .addGroup(jPanelCidadeSingletonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jCombCriarSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                    .addComponent(jLabel3)
                    .addComponent(jButtonExecutar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanelCidadeSingleton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecutarActionPerformed
        if (jCombCriarSetor.getSelectedIndex() != 1) {
            JOptionPane.showMessageDialog(null, "A opção selecionada não criará o setor");
        } else {

            setor = new Setor();
            setor.setNomeDoSetor(jTextFieldDescricaoSetor.getText());
            cidade = Cidade.getInstancia();
            cidade.criarSetor(setor);

            boolean pavimentar = jCombPavimentar.getSelectedIndex() == 1 ? true : false;
            setor.setPavimentado(pavimentar);
            cidade.getSetorPavimentado(setor);

            imprimirDadosSetor(cidade);
            jCombCriarSetor.setSelectedItem("Selecione aqui a opção");
            jCombPavimentar.setSelectedItem("Selecione aqui a opção");
            jTextFieldDescricaoSetor.setText("");
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
                new TelaCidade().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldDescricaoSetor;
    // End of variables declaration//GEN-END:variables
}
