
package VIEW;

import DAO.DespesaDAO;
import DTO.DespesaDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmDespesa extends javax.swing.JFrame {

    /**
     * Creates new form frmDespesa
     */
    public frmDespesa() {
        initComponents();
        listarDespesas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jList1tipoDespesa = new javax.swing.JList<>();
        jLabelTipoDespesa = new javax.swing.JLabel();
        jTextFieldContaDespesa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDespesas = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1tipoDespesa = new javax.swing.JList<>();
        jButtonCadastrarDespesa = new javax.swing.JButton();
        jLabelIdDespesa = new javax.swing.JLabel();
        jButtonVoltarDespesa = new javax.swing.JButton();
        jTextFieldIdDespesa = new javax.swing.JTextField();
        jButtonCarregarCamposDespesa = new javax.swing.JButton();
        jLabelValorDespesa = new javax.swing.JLabel();
        jTextFieldValorDespesa = new javax.swing.JTextField();
        jLabelDataPagamentoDespesa = new javax.swing.JLabel();
        jTextFieldDataPagementoDespesa = new javax.swing.JTextField();
        jLabelDataPagementoEsperadoDespesa = new javax.swing.JLabel();
        jTextFieldDataPagamentoEsperadoDespesa = new javax.swing.JTextField();
        jButtonLimparCamposDespesa = new javax.swing.JButton();
        jButtonAlterarDespesa = new javax.swing.JButton();
        jButtonExcluirDespesa = new javax.swing.JButton();
        jLabelContaDespesa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1tipoDespesa.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Alimentação", "Educação", "Lazer", "Moradia", "Roupa", "Saúde", "Transporte", "Outros"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jLabelTipoDespesa.setText("Tipo Despesa");

        jTableDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Valor", "Data Recebimento", "Data Recebimento Esperado", "Descrição", "Conta", "Tipo Receita"
            }
        ));
        jScrollPane2.setViewportView(jTableDespesas);

        jList1tipoDespesa.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Alimentação", "Educação", "Lazer", "Moradia", "Roupa", "Saúde", "Transporte", "Outros"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jButtonCadastrarDespesa.setText("Cadastrar");
        jButtonCadastrarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarDespesaActionPerformed(evt);
            }
        });

        jLabelIdDespesa.setText("Código");

        jButtonVoltarDespesa.setText("Voltar");

        jTextFieldIdDespesa.setEnabled(false);

        jButtonCarregarCamposDespesa.setText("Carregar Campos");
        jButtonCarregarCamposDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCamposDespesaActionPerformed(evt);
            }
        });

        jLabelValorDespesa.setText("Valor");

        jLabelDataPagamentoDespesa.setText("Data Pagamento");

        jTextFieldDataPagementoDespesa.setToolTipText("");

        jLabelDataPagementoEsperadoDespesa.setText("Data Pagamento Esperado");

        jButtonLimparCamposDespesa.setText("Limpar Campos");
        jButtonLimparCamposDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposDespesaActionPerformed(evt);
            }
        });

        jButtonAlterarDespesa.setText("Alterar");
        jButtonAlterarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarDespesaActionPerformed(evt);
            }
        });

        jButtonExcluirDespesa.setText("Excluir");
        jButtonExcluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirDespesaActionPerformed(evt);
            }
        });

        jLabelContaDespesa.setText("Conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataPagementoEsperadoDespesa)
                                    .addComponent(jLabelDataPagamentoDespesa)
                                    .addComponent(jLabelValorDespesa)
                                    .addComponent(jLabelIdDespesa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDataPagementoDespesa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldValorDespesa)
                                    .addComponent(jTextFieldIdDespesa)
                                    .addComponent(jTextFieldDataPagamentoEsperadoDespesa, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelContaDespesa)
                                    .addComponent(jLabelTipoDespesa))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldContaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jList1tipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrarDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltarDespesa)
                        .addGap(114, 114, 114)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAlterarDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparCamposDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarregarCamposDespesa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdDespesa)
                            .addComponent(jTextFieldIdDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelValorDespesa)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldValorDespesa)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDataPagamentoDespesa)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldDataPagementoDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataPagementoEsperadoDespesa)
                            .addComponent(jTextFieldDataPagamentoEsperadoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelContaDespesa)
                                    .addComponent(jTextFieldContaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTipoDespesa)
                                    .addComponent(jList1tipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarDespesa)
                    .addComponent(jButtonCadastrarDespesa)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonLimparCamposDespesa)
                        .addComponent(jButtonAlterarDespesa)
                        .addComponent(jButtonExcluirDespesa)
                        .addComponent(jButtonCarregarCamposDespesa)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarDespesaActionPerformed
        cadastrarDespesa();
        listarDespesas();    //Evento do botão "Cadastrar", onde faz a inserção, atualiza a lista e limpa os campos
        limparCamposDespesa();
    }//GEN-LAST:event_jButtonCadastrarDespesaActionPerformed

    private void jButtonCarregarCamposDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposDespesaActionPerformed
        carregarCamposDespesa();   //Evento do botão "Carregar Campos", onde seta os TextFields com os registros selecionados
    }//GEN-LAST:event_jButtonCarregarCamposDespesaActionPerformed

    private void jButtonLimparCamposDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposDespesaActionPerformed
        limparCamposDespesa();    //Evento do botão "Limpar Campos", onde deixa em branco os TextFields
    }//GEN-LAST:event_jButtonLimparCamposDespesaActionPerformed

    private void jButtonAlterarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarDespesaActionPerformed
        alterarDespesa();
        listarDespesas(); //Evento do botão "Alterar", onde substitui os dados da tabela
        limparCamposDespesa();
    }//GEN-LAST:event_jButtonAlterarDespesaActionPerformed

    private void jButtonExcluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirDespesaActionPerformed
        excluirDespesa();  //Evento do botão "Excluir", onde exclui os registros selecionados
        listarDespesas();
        limparCamposDespesa();
    }//GEN-LAST:event_jButtonExcluirDespesaActionPerformed

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
            java.util.logging.Logger.getLogger(frmDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarDespesa;
    private javax.swing.JButton jButtonCadastrarDespesa;
    private javax.swing.JButton jButtonCarregarCamposDespesa;
    private javax.swing.JButton jButtonExcluirDespesa;
    private javax.swing.JButton jButtonLimparCamposDespesa;
    private javax.swing.JButton jButtonVoltarDespesa;
    private javax.swing.JLabel jLabelContaDespesa;
    private javax.swing.JLabel jLabelDataPagamentoDespesa;
    private javax.swing.JLabel jLabelDataPagementoEsperadoDespesa;
    private javax.swing.JLabel jLabelIdDespesa;
    private javax.swing.JLabel jLabelTipoDespesa;
    private javax.swing.JLabel jLabelValorDespesa;
    private javax.swing.JList<String> jList1tipoDespesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDespesas;
    private javax.swing.JTextField jTextFieldContaDespesa;
    private javax.swing.JTextField jTextFieldDataPagamentoEsperadoDespesa;
    private javax.swing.JTextField jTextFieldDataPagementoDespesa;
    private javax.swing.JTextField jTextFieldIdDespesa;
    private javax.swing.JTextField jTextFieldValorDespesa;
    // End of variables declaration//GEN-END:variables
private void listarDespesas() {
        try {
            DespesaDAO objdespesadao = new DespesaDAO();

            DefaultTableModel model = (DefaultTableModel) jTableDespesas.getModel();
            model.setNumRows(0);

            ArrayList<DespesaDTO> lista = objdespesadao.PesquisarDespesa();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_despesa(),
                    lista.get(num).getValor_despesa(),
                    lista.get(num).getDataPagamento_despesa(),
                    lista.get(num).getDataPagamentoEsperado_despesa(),
                    lista.get(num).getConta_despesa(),
                    lista.get(num).getTipo_despesa()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Despesas View" + erro);

        }
    }
    private void carregarCamposDespesa(){
        
        int setar = jTableDespesas.getSelectedRow();
        jTextFieldIdDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 0).toString());
        jTextFieldValorDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 1).toString());
        jTextFieldDataPagementoDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 2).toString());
        jTextFieldDataPagamentoEsperadoDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 3).toString());
        jTextFieldContaDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 4).toString());
    }
    private void cadastrarDespesa(){
        String dataPagamentoDespesa, dataPagamentoEsperadoDespesa, tipoDespesa;
        Float valorDespesa;
        int contaDespesa;

        dataPagamentoDespesa = jTextFieldDataPagementoDespesa.getText();
        dataPagamentoEsperadoDespesa = jTextFieldDataPagamentoEsperadoDespesa.getText();
        tipoDespesa = jList1tipoDespesa.getSelectedValue();
        valorDespesa = Float.parseFloat(jTextFieldValorDespesa.getText());
        contaDespesa = Integer.parseInt(jTextFieldContaDespesa.getText());

        DespesaDTO objdespesadto = new DespesaDTO();

        objdespesadto.setConta_despesa(contaDespesa);
        objdespesadto.setValor_despesa(valorDespesa);
        objdespesadto.setDataPagamento_despesa(dataPagamentoDespesa);
        objdespesadto.setDataPagamentoEsperado_despesa(dataPagamentoEsperadoDespesa);
        objdespesadto.setTipo_despesa(tipoDespesa);

        DespesaDAO objdespesadao = new DespesaDAO();
        objdespesadao.cadastrarDespesa(objdespesadto);
    }
    private void limparCamposDespesa(){
        jTextFieldIdDespesa.setText("");
        jTextFieldValorDespesa.setText("");
        jTextFieldDataPagementoDespesa.setText("");
        jTextFieldDataPagamentoEsperadoDespesa.setText("");
        jTextFieldContaDespesa.setText("");

   }
    private void alterarDespesa(){
        String dataPagamentoDespesa, dataPagamentoEsperadoDespesa, tipoDespesa;
        Float valorDespesa;
        int contaDespesa, idDespesa;
        idDespesa = Integer.parseInt(jTextFieldIdDespesa.getText());
        dataPagamentoDespesa = jTextFieldDataPagementoDespesa.getText();
        dataPagamentoEsperadoDespesa = jTextFieldDataPagamentoEsperadoDespesa.getText();
        tipoDespesa = jList1tipoDespesa.getSelectedValue();
        valorDespesa = Float.parseFloat(jTextFieldValorDespesa.getText());
        contaDespesa = Integer.parseInt(jTextFieldContaDespesa.getText());
        
        DespesaDTO objdespesadto = new DespesaDTO();
        objdespesadto.setId_despesa(idDespesa);
        objdespesadto.setConta_despesa(contaDespesa);
        objdespesadto.setDataPagamentoEsperado_despesa(dataPagamentoEsperadoDespesa);
        objdespesadto.setDataPagamento_despesa(dataPagamentoDespesa);
        objdespesadto.setTipo_despesa(tipoDespesa);;
        objdespesadto.setValor_despesa(valorDespesa);
        
        DespesaDAO objdespesadao = new DespesaDAO();
        objdespesadao.alterarDespesa(objdespesadto);
        
    }
    private void excluirDespesa(){
        int idDespesa;
        
        idDespesa = Integer.parseInt(jTextFieldIdDespesa.getText());
        
        DespesaDTO objdespesadto = new DespesaDTO();
        objdespesadto.setId_despesa(idDespesa);
        DespesaDAO objdespesadao = new DespesaDAO();
        objdespesadao.excluirDespesa(objdespesadto);
    }
}
