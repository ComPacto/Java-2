/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

/**
 * @author Thiago Cury
 * @version 1.0 beta
 * @since 07/04/2014
 */
public class GUICadProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadProduto
     */
    public GUICadProduto() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlValorCusto = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtValorCusto = new javax.swing.JTextField();
        jtQuantidade = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("cadastro de produto");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");
        jLayeredPane1.add(jlNome);
        jlNome.setBounds(20, 30, 60, 14);

        jlValorCusto.setText("Valor Custo");
        jLayeredPane1.add(jlValorCusto);
        jlValorCusto.setBounds(20, 80, 100, 14);

        jlQuantidade.setText("Quantidade");
        jLayeredPane1.add(jlQuantidade);
        jlQuantidade.setBounds(20, 130, 100, 14);

        jtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeFocusLost(evt);
            }
        });
        jLayeredPane1.add(jtNome);
        jtNome.setBounds(110, 20, 170, 30);

        jtValorCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtValorCustoFocusLost(evt);
            }
        });
        jLayeredPane1.add(jtValorCusto);
        jtValorCusto.setBounds(110, 70, 170, 30);

        jtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtQuantidadeFocusLost(evt);
            }
        });
        jLayeredPane1.add(jtQuantidade);
        jtQuantidade.setBounds(110, 120, 170, 30);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbCadastrar);
        jbCadastrar.setBounds(30, 20, 110, 23);

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbLimpar);
        jbLimpar.setBounds(160, 20, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar() {
        try {
            ProdutoVO pVO = new ProdutoVO();
            pVO.setNome(jtNome.getText());
            pVO.setValorCusto(Double.parseDouble(jtValorCusto.getText()));
            pVO.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
            
            /* Aqui você deve colocar o código para 
             * inserir o objeto no banco de dados */
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();
            ps.cadastrarProduto(pVO);
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Produto cadastrado com sucesso!");
            
            jtNome.setBackground(Color.white);
            jtQuantidade.setBackground(Color.white);
            jtValorCusto.setBackground(Color.white);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! "+e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }//fecha catch
        
    }//fecha método cadastrar

    private void limpar() {
        jtNome.setText("");
        jtValorCusto.setText("");
        jtQuantidade.setText("");
    }//fecha método limpar

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
        jtNome.grabFocus();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost
        if (jtNome.getText().isEmpty()) {
            jtNome.setBackground(Color.RED);
        } else {
            jtNome.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jtNomeFocusLost

    private void jtValorCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtValorCustoFocusLost
        if (jtValorCusto.getText().isEmpty()) {
            jtValorCusto.setBackground(Color.RED);
        } else {
            jtValorCusto.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jtValorCustoFocusLost

    private void jtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtQuantidadeFocusLost
        if (jtQuantidade.getText().isEmpty()) {
            jtQuantidade.setBackground(Color.RED);
        } else {
            jtQuantidade.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jtQuantidadeFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlValorCusto;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtValorCusto;
    // End of variables declaration//GEN-END:variables
}
