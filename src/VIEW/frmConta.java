/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ContaDAO;
import DTO.ContaDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patri
 */
public class frmConta extends javax.swing.JFrame {

    /**
     * Creates new form frmConta
     */
    public frmConta() {
        initComponents();
        listarcontas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelValorSaldo = new javax.swing.JLabel();
        jButtonCadastrarConta = new javax.swing.JButton();
        jTextFieldSaldo = new javax.swing.JTextField();
        jButtonVoltarConta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConta = new javax.swing.JTable();
        jLabelIdConta = new javax.swing.JLabel();
        jTextFieldIdConta = new javax.swing.JTextField();
        jButtonCarregarCamposConta = new javax.swing.JButton();
        jButtonLimparCamposConta = new javax.swing.JButton();
        jButtonAlterarConta = new javax.swing.JButton();
        jTextFieldInstituicao = new javax.swing.JTextField();
        jButtonExcluirConta = new javax.swing.JButton();
        jLabelInstituicao = new javax.swing.JLabel();
        jLabelTipoConta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1tipoConta = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSaldoTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelValorSaldo.setText("Saldo");

        jButtonCadastrarConta.setText("Cadastrar");
        jButtonCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarContaActionPerformed(evt);
            }
        });

        jButtonVoltarConta.setText("Voltar");

        jTableConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Saldo", "Tipo Conta", "Instituição"
            }
        ));
        jScrollPane2.setViewportView(jTableConta);

        jLabelIdConta.setText("Código Conta");

        jTextFieldIdConta.setEnabled(false);

        jButtonCarregarCamposConta.setText("Carregar Campos");
        jButtonCarregarCamposConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCamposContaActionPerformed(evt);
            }
        });

        jButtonLimparCamposConta.setText("Limpar Campos");
        jButtonLimparCamposConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposContaActionPerformed(evt);
            }
        });

        jButtonAlterarConta.setText("Alterar");
        jButtonAlterarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarContaActionPerformed(evt);
            }
        });

        jButtonExcluirConta.setText("Excluir");
        jButtonExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirContaActionPerformed(evt);
            }
        });

        jLabelInstituicao.setText("Instituição");

        jLabelTipoConta.setText("Tipo Conta");

        jList1tipoConta.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Carteira", "Conta Corrente", "Poupança"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1tipoConta);

        jLabel1.setText("Saldo Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorSaldo)
                            .addComponent(jLabelIdConta))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTextFieldIdConta)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltarConta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoConta)
                            .addComponent(jLabelInstituicao)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldSaldoTotal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAlterarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparCamposConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarregarCamposConta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdConta)
                            .addComponent(jTextFieldIdConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorSaldo)
                            .addComponent(jTextFieldSaldo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoConta)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInstituicao)
                            .addComponent(jTextFieldInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarregarCamposConta)
                    .addComponent(jButtonVoltarConta)
                    .addComponent(jButtonCadastrarConta)
                    .addComponent(jButtonLimparCamposConta)
                    .addComponent(jButtonAlterarConta)
                    .addComponent(jButtonExcluirConta)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarContaActionPerformed
        cadastrarConta();
        listarcontas();    //Evento do botão "Cadastrar", onde faz a inserção, atualiza a lista e limpa os campos
        limparCamposConta();
    }//GEN-LAST:event_jButtonCadastrarContaActionPerformed

    private void jButtonCarregarCamposContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposContaActionPerformed
        carregarCamposConta();   //Evento do botão "Carregar Campos", onde seta os TextFields com os registros selecionados
    }//GEN-LAST:event_jButtonCarregarCamposContaActionPerformed

    private void jButtonLimparCamposContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposContaActionPerformed
        limparCamposConta();    //Evento do botão "Limpar Campos", onde deixa em branco os TextFields
    }//GEN-LAST:event_jButtonLimparCamposContaActionPerformed

    private void jButtonAlterarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarContaActionPerformed
        alterarConta();
        listarcontas(); //Evento do botão "Alterar", onde substitui os dados da tabela
        limparCamposConta();
    }//GEN-LAST:event_jButtonAlterarContaActionPerformed

    private void jButtonExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirContaActionPerformed
        excluirConta();  //Evento do botão "Excluir", onde exclui os registros selecionados
        listarcontas();
        limparCamposConta();
    }//GEN-LAST:event_jButtonExcluirContaActionPerformed

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
            java.util.logging.Logger.getLogger(frmConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarConta;
    private javax.swing.JButton jButtonCadastrarConta;
    private javax.swing.JButton jButtonCarregarCamposConta;
    private javax.swing.JButton jButtonExcluirConta;
    private javax.swing.JButton jButtonLimparCamposConta;
    private javax.swing.JButton jButtonVoltarConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIdConta;
    private javax.swing.JLabel jLabelInstituicao;
    private javax.swing.JLabel jLabelTipoConta;
    private javax.swing.JLabel jLabelValorSaldo;
    private javax.swing.JList<String> jList1tipoConta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConta;
    private javax.swing.JTextField jTextFieldIdConta;
    private javax.swing.JTextField jTextFieldInstituicao;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldSaldoTotal;
    // End of variables declaration//GEN-END:variables
  private void listarcontas() {
    float saldoTotal = 0; 
        try {
            ContaDAO objcontadao = new ContaDAO();

            DefaultTableModel model = (DefaultTableModel) jTableConta.getModel();
            model.setNumRows(0);

            ArrayList<ContaDTO> lista = objcontadao.PesquisarConta();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_conta(),
                    lista.get(num).getSaldo_conta(),
                    lista.get(num).getTipo_conta(),
                    lista.get(num).getInstituicao(),
                });
                    saldoTotal = saldoTotal + lista.get(num).getSaldo_conta();
            }
            jTextFieldSaldoTotal.setText(""+saldoTotal);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Contas View" + erro);

        }
    }
    private void carregarCamposConta(){
        
        int setar = jTableConta.getSelectedRow();
        jTextFieldIdConta.setText(jTableConta.getModel().getValueAt(setar, 0).toString());
        jTextFieldSaldo.setText(jTableConta.getModel().getValueAt(setar, 1).toString());
        jTextFieldInstituicao.setText(jTableConta.getModel().getValueAt(setar, 3).toString());
    }
    private void cadastrarConta(){
        String tipoConta, instituicao;
        Float saldo;


        tipoConta = jList1tipoConta.getSelectedValue();
        saldo = Float.parseFloat(jTextFieldSaldo.getText());
        instituicao = (jTextFieldInstituicao.getText());

        ContaDTO objcontadto = new ContaDTO();

        objcontadto.setTipo_conta(tipoConta);
        objcontadto.setSaldo_conta(saldo);
        objcontadto.setInstituicao(instituicao);

        ContaDAO objcontadao = new ContaDAO();
        objcontadao.cadastrarConta(objcontadto);
    }
    private void limparCamposConta(){
        jTextFieldIdConta.setText("");
        jTextFieldSaldo.setText("");
        jTextFieldInstituicao.setText("");
   }
    private void alterarConta(){
        String tipoConta, instituicao;
        Float saldo;
        int idConta;
        
        idConta = Integer.parseInt(jTextFieldIdConta.getText());
        saldo = Float.parseFloat(jTextFieldSaldo.getText());
        instituicao = jTextFieldInstituicao.getText();
        tipoConta = jList1tipoConta.getSelectedValue();
        
        ContaDTO objcontadto = new ContaDTO();
        objcontadto.setId_conta(idConta);
        objcontadto.setSaldo_conta(saldo);
        objcontadto.setTipo_conta(tipoConta);
        objcontadto.setInstituicao(instituicao);
        ContaDAO objcontadao = new ContaDAO();
        objcontadao.alterarConta(objcontadto);
        
    }
    private void excluirConta(){
        int idConta;
        
        idConta = Integer.parseInt(jTextFieldIdConta.getText());
        
        ContaDTO objcontadto = new ContaDTO();
        objcontadto.setId_conta(idConta);
        ContaDAO objcontadao = new ContaDAO();
        objcontadao.excluirConta(objcontadto);
    }
  

}
