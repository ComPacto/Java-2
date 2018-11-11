package visao;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Calculo;

/**
 *
 * @author Müller Gonçalves
 * @since 16/04/2018 - 15:46
 * @version 1.0
 */
public class UICadCalculo extends javax.swing.JFrame {

    /**
     * Creates new form UICadCalculo
     */
    public UICadCalculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlDados = new javax.swing.JLayeredPane();
        jlA = new javax.swing.JLabel();
        jlB = new javax.swing.JLabel();
        jlC = new javax.swing.JLabel();
        jtA = new javax.swing.JTextField();
        jtB = new javax.swing.JTextField();
        jtC = new javax.swing.JTextField();
        jlConfirmacao = new javax.swing.JLayeredPane();
        jbVerificar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jlA.setText("A:");

        jlB.setText("B:");

        jlC.setText("C:");

        jtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAKeyPressed(evt);
            }
        });

        jtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtBKeyPressed(evt);
            }
        });

        jtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCKeyPressed(evt);
            }
        });

        jlDados.setLayer(jlA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlDadosLayout = new javax.swing.GroupLayout(jlDados);
        jlDados.setLayout(jlDadosLayout);
        jlDadosLayout.setHorizontalGroup(
            jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlC)
                    .addComponent(jlB)
                    .addComponent(jlA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtC, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jtB)
                    .addComponent(jtA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlDadosLayout.setVerticalGroup(
            jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlA)
                    .addComponent(jtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlB)
                    .addComponent(jtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlC)
                    .addComponent(jtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jlConfirmacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirmação"));

        jbVerificar.setText("Verificar");
        jbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarActionPerformed(evt);
            }
        });
        jbVerificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbVerificarKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        jlConfirmacao.setLayer(jbVerificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlConfirmacao.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlConfirmacaoLayout = new javax.swing.GroupLayout(jlConfirmacao);
        jlConfirmacao.setLayout(jlConfirmacaoLayout);
        jlConfirmacaoLayout.setHorizontalGroup(
            jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlConfirmacaoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jbVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jlConfirmacaoLayout.setVerticalGroup(
            jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlConfirmacaoLayout.createSequentialGroup()
                .addGroup(jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVerificar)
                    .addComponent(jbLimpar))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlConfirmacao)
                    .addComponent(jlDados))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
        verificar();
        limpar();
    }//GEN-LAST:event_jbVerificarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtB.grabFocus();
        }
    }//GEN-LAST:event_jtAKeyPressed

    private void jtBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtC.grabFocus();
        }
    }//GEN-LAST:event_jtBKeyPressed

    private void jtCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verificar();
            limpar();
        }
    }//GEN-LAST:event_jtCKeyPressed

    private void jbVerificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbVerificarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verificar();
            limpar();
        }
    }//GEN-LAST:event_jbVerificarKeyPressed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpar();
        }
    }//GEN-LAST:event_jbLimparKeyPressed

    private void verificar() {
        Calculo objCalculo = new Calculo();

        objCalculo.setA(Double.parseDouble(jtA.getText()));
        objCalculo.setB(Double.parseDouble(jtB.getText()));
        objCalculo.setC(Double.parseDouble(jtC.getText()));

        JOptionPane.showMessageDialog(
                this,
                "Dados: \n" + objCalculo.toString(),
                "Relatório",
                JOptionPane.PLAIN_MESSAGE);
    }

    private void limpar() {
        jtA.setText(null);
        jtB.setText(null);
        jtC.setText(null);
        jtA.grabFocus();
    }

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
            java.util.logging.Logger.getLogger(UICadCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICadCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICadCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICadCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UICadCalculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbVerificar;
    private javax.swing.JLabel jlA;
    private javax.swing.JLabel jlB;
    private javax.swing.JLabel jlC;
    private javax.swing.JLayeredPane jlConfirmacao;
    private javax.swing.JLayeredPane jlDados;
    private javax.swing.JTextField jtA;
    private javax.swing.JTextField jtB;
    private javax.swing.JTextField jtC;
    // End of variables declaration//GEN-END:variables
}