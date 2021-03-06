package visao;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Produto;

/**
 *
 * @author Müller Gonçalves
 * @since 24/04/2018 - 16:45
 * @version 1.0
 */
public class UiCadProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form UiCadProduto
     */
    public UiCadProduto() {
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
        jlNomeProduto = new javax.swing.JLabel();
        jlSerialProduto = new javax.swing.JLabel();
        jlAnoLancamento = new javax.swing.JLabel();
        jtNomeProduto = new javax.swing.JTextField();
        jtSerialProduto = new javax.swing.JTextField();
        jtAnoLancamento = new javax.swing.JTextField();
        jlNomeProdutoErro = new javax.swing.JLabel();
        jlSerialProdutoErro = new javax.swing.JLabel();
        jlAnoLancamentoErro = new javax.swing.JLabel();
        jlConfirmacao = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produto");

        jlDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNomeProduto.setText("Nome do produto:");

        jlSerialProduto.setText("Serial do produto:");

        jlAnoLancamento.setText("Ano de lançamento:");

        jtNomeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeProdutoFocusLost(evt);
            }
        });
        jtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeProdutoKeyPressed(evt);
            }
        });

        jtSerialProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtSerialProdutoFocusLost(evt);
            }
        });
        jtSerialProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtSerialProdutoKeyPressed(evt);
            }
        });

        jtAnoLancamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtAnoLancamentoFocusLost(evt);
            }
        });
        jtAnoLancamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAnoLancamentoKeyPressed(evt);
            }
        });

        jlDados.setLayer(jlNomeProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlSerialProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlAnoLancamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtNomeProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtSerialProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtAnoLancamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlNomeProdutoErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlSerialProdutoErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlAnoLancamentoErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlDadosLayout = new javax.swing.GroupLayout(jlDados);
        jlDados.setLayout(jlDadosLayout);
        jlDadosLayout.setHorizontalGroup(
            jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAnoLancamento)
                    .addComponent(jlSerialProduto)
                    .addComponent(jlNomeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtSerialProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtAnoLancamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNomeProdutoErro, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jlSerialProdutoErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlAnoLancamentoErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jlDadosLayout.setVerticalGroup(
            jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeProduto)
                    .addComponent(jtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomeProdutoErro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSerialProduto)
                    .addComponent(jtSerialProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSerialProdutoErro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnoLancamento)
                    .addComponent(jtAnoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAnoLancamentoErro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jlConfirmacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarKeyPressed(evt);
            }
        });

        jlConfirmacao.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlConfirmacaoLayout = new javax.swing.GroupLayout(jlConfirmacao);
        jlConfirmacao.setLayout(jlConfirmacaoLayout);
        jlConfirmacaoLayout.setHorizontalGroup(
            jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jlConfirmacaoLayout.setVerticalGroup(
            jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDados)
                    .addComponent(jlConfirmacao))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cadastrarProduto(){
        try {
            Produto objProduto = new Produto();
            objProduto.setNomeProduto(jtNomeProduto.getText());
            objProduto.setSerialProduto(jtSerialProduto.getText());
            objProduto.setAnoLancamento(Integer.parseInt(jtAnoLancamento.getText()));
            
            JOptionPane.showMessageDialog(this,
                    "Dados: \n" + objProduto.toString(),
                    "Relatório",
                    JOptionPane.PLAIN_MESSAGE);
            limpar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage(),
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println("Próximo");
        }
    }
    
    private void limpar(){
        jtNomeProduto.setText(null);
        jtNomeProduto.setBackground(Color.white);
        jlNomeProdutoErro.setIcon(null);
        jtSerialProduto.setText(null);
        jtSerialProduto.setBackground(Color.white);
        jlSerialProdutoErro.setIcon(null);
        jtAnoLancamento.setText(null);
        jtAnoLancamento.setBackground(Color.white);
        jlAnoLancamentoErro.setIcon(null);
    }
    
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrarProduto();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtNomeProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtSerialProduto.grabFocus();
        }
    }//GEN-LAST:event_jtNomeProdutoKeyPressed

    private void jtSerialProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSerialProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtAnoLancamento.grabFocus();
        }
    }//GEN-LAST:event_jtSerialProdutoKeyPressed

    private void jtAnoLancamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnoLancamentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCadastrar.grabFocus();
        };
    }//GEN-LAST:event_jtAnoLancamentoKeyPressed

    private void jbCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastrarKeyPressed
        cadastrarProduto();
        limpar();
        jtNomeProduto.grabFocus();
    }//GEN-LAST:event_jbCadastrarKeyPressed

    private void jtNomeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeProdutoFocusLost
        if (jtNomeProduto.getText().isEmpty()) {
            jtNomeProduto.setBackground(Color.RED);
            jlNomeProdutoErro.setIcon(new ImageIcon(getClass().getResource("/imagens/incorreto.png")));
        } else {
            jtNomeProduto.setBackground(Color.GREEN);
            jlNomeProdutoErro.setIcon(new ImageIcon(getClass().getResource("/imagens/correto.png")));
        }
    }//GEN-LAST:event_jtNomeProdutoFocusLost

    private void jtSerialProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtSerialProdutoFocusLost
        if (jtSerialProduto.getText().isEmpty()) {
            jtSerialProduto.setBackground(Color.RED);
            jlSerialProdutoErro.setIcon(new ImageIcon(getClass().getResource("/imagens/incorreto.png")));
        } else {
            jtSerialProduto.setBackground(Color.GREEN);
            jlSerialProdutoErro.setIcon(new ImageIcon(getClass().getResource("/imagens/correto.png")));
        }
    }//GEN-LAST:event_jtSerialProdutoFocusLost

    private void jtAnoLancamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAnoLancamentoFocusLost
        if (jtAnoLancamento.getText().isEmpty()) {
            jtAnoLancamento.setBackground(Color.RED);
            jlAnoLancamentoErro.setIcon(new ImageIcon(getClass().getResource("/imagens/incorreto.png")));
        } else {
            jtAnoLancamento.setBackground(Color.GREEN);
            jlAnoLancamentoErro.setIcon(new ImageIcon(getClass().getResource("/imagens/correto.png")));
        }
    }//GEN-LAST:event_jtAnoLancamentoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JLabel jlAnoLancamento;
    private javax.swing.JLabel jlAnoLancamentoErro;
    private javax.swing.JLayeredPane jlConfirmacao;
    private javax.swing.JLayeredPane jlDados;
    private javax.swing.JLabel jlNomeProduto;
    private javax.swing.JLabel jlNomeProdutoErro;
    private javax.swing.JLabel jlSerialProduto;
    private javax.swing.JLabel jlSerialProdutoErro;
    private javax.swing.JTextField jtAnoLancamento;
    private javax.swing.JTextField jtNomeProduto;
    private javax.swing.JTextField jtSerialProduto;
    // End of variables declaration//GEN-END:variables
}
