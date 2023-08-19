package aula3;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCadastro = new javax.swing.JPanel();
        svButton = new javax.swing.JButton();
        cadastro = new javax.swing.JLabel();
        nmCompleto = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        obs = new javax.swing.JLabel();
        setTelefone = new javax.swing.JTextField();
        setEmail = new javax.swing.JTextField();
        setNmCompleto = new javax.swing.JTextField();
        setEndereco = new javax.swing.JTextField();
        setObs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        svButton.setText("Gravar");
        svButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svButtonActionPerformed(evt);
            }
        });

        cadastro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadastro.setText("CADASTRO");

        nmCompleto.setText("Nome Completo:");

        endereco.setText("Endereço: ");

        email.setText("E-mail:");

        telefone.setText("Telefone:");

        obs.setText("Observações:");

        setTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTelefoneActionPerformed(evt);
            }
        });

        setEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setEmailActionPerformed(evt);
            }
        });

        setNmCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNmCompletoActionPerformed(evt);
            }
        });

        setEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setEnderecoActionPerformed(evt);
            }
        });

        setObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setObsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
        telaCadastro.setLayout(telaCadastroLayout);
        telaCadastroLayout.setHorizontalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastro)
                    .addGroup(telaCadastroLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email)
                            .addComponent(endereco)
                            .addComponent(telefone)
                            .addComponent(obs))
                        .addGap(6, 6, 6)
                        .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(setEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(setEmail)
                            .addComponent(setTelefone)
                            .addComponent(setObs, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(telaCadastroLayout.createSequentialGroup()
                        .addComponent(nmCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setNmCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(svButton)
                .addGap(82, 82, 82))
        );
        telaCadastroLayout.setVerticalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNmCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(setEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(40, 40, 40)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone))
                .addGap(40, 40, 40)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obs))
                .addGap(33, 33, 33)
                .addComponent(svButton)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void svButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svButtonActionPerformed
        // TODO add your handling code here:

        JOptionPane.showConfirmDialog(telaCadastro, "Informações gravada com sucesso", "", 2);
        setEndereco.setText("");
        setNmCompleto.setText("");
        setTelefone.setText("");
        setObs.setText("");
        setEmail.setText("");

        setNmCompleto.grabFocus();
    }//GEN-LAST:event_svButtonActionPerformed

    private void setTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTelefoneActionPerformed
        // TODO add your handling code here:

        setTelefone.getText();
        setTelefone.grabFocus();
        setTelefone.transferFocus();
    }//GEN-LAST:event_setTelefoneActionPerformed

    private void setEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setEmailActionPerformed
        // TODO add your handling code here:

        setEmail.getText();
        setEmail.grabFocus();
        setEmail.transferFocus();
    }//GEN-LAST:event_setEmailActionPerformed

    private void setNmCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNmCompletoActionPerformed
        // TODO add your handling code here:
        setNmCompleto.getText();
        setNmCompleto.grabFocus();
        setNmCompleto.transferFocus();
    }//GEN-LAST:event_setNmCompletoActionPerformed

    private void setEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setEnderecoActionPerformed
        // TODO add your handling code here:
        setEndereco.getText();
        setEndereco.grabFocus();
        setEndereco.transferFocus();
    }//GEN-LAST:event_setEnderecoActionPerformed

    private void setObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setObsActionPerformed
        // TODO add your handling code here:

        setObs.getText();
        setObs.grabFocus();
        setObs.transferFocus();
    }//GEN-LAST:event_setObsActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastro;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel nmCompleto;
    private javax.swing.JLabel obs;
    private javax.swing.JTextField setEmail;
    private javax.swing.JTextField setEndereco;
    private javax.swing.JTextField setNmCompleto;
    private javax.swing.JTextField setObs;
    private javax.swing.JTextField setTelefone;
    private javax.swing.JButton svButton;
    private javax.swing.JPanel telaCadastro;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}
