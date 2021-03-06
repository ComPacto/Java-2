package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Müller Gonçalves
 * @since 18/04/2018 - 16:02
 * @version 1.0
 */
public class UICadCliente extends javax.swing.JFrame
{

    /**
     * Creates new form UICadCliente
     */
    public UICadCliente()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        bgSexo = new javax.swing.ButtonGroup();
        bgPossuiCartao = new javax.swing.ButtonGroup();
        jlDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlSexo = new javax.swing.JLabel();
        jrMasculino = new javax.swing.JRadioButton();
        jrFeminino = new javax.swing.JRadioButton();
        jlPossuiCartao = new javax.swing.JLabel();
        jrSim = new javax.swing.JRadioButton();
        jrNao = new javax.swing.JRadioButton();
        jlQtd = new javax.swing.JLabel();
        jtQtd = new javax.swing.JTextField();
        jlBandeira = new javax.swing.JLabel();
        jlDadosBandeira = new javax.swing.JLayeredPane();
        jcVisa = new javax.swing.JCheckBox();
        jcElo = new javax.swing.JCheckBox();
        jcBanriCompras = new javax.swing.JCheckBox();
        jcMasterCard = new javax.swing.JCheckBox();
        jcHipercard = new javax.swing.JCheckBox();
        jcAmericanExpress = new javax.swing.JCheckBox();
        jlBancos = new javax.swing.JLabel();
        jlOpcao2 = new javax.swing.JLayeredPane();
        jcItau = new javax.swing.JCheckBox();
        jcBradesco = new javax.swing.JCheckBox();
        jcBanrisul = new javax.swing.JCheckBox();
        jcSantander = new javax.swing.JCheckBox();
        jlConfirmacao = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome:");

        jlSexo.setText("Sexo:");

        bgSexo.add(jrMasculino);
        jrMasculino.setText("Masculino");

        bgSexo.add(jrFeminino);
        jrFeminino.setText("Feminino");

        jlPossuiCartao.setText("O cliente possui cartão?");

        bgPossuiCartao.add(jrSim);
        jrSim.setText("Sim");

        bgPossuiCartao.add(jrNao);
        jrNao.setText("Não");

        jlQtd.setText("Quantos?");

        jlBandeira.setText("Qual(is) bandeira(s)?");

        jlDadosBandeira.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcVisa.setText("Visa");

        jcElo.setText("Elo");

        jcBanriCompras.setText("BanriCompras");

        jcMasterCard.setText("MasterCard");

        jcHipercard.setText("Hipercard");

        jcAmericanExpress.setText("American Express");

        jlDadosBandeira.setLayer(jcVisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDadosBandeira.setLayer(jcElo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDadosBandeira.setLayer(jcBanriCompras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDadosBandeira.setLayer(jcMasterCard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDadosBandeira.setLayer(jcHipercard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDadosBandeira.setLayer(jcAmericanExpress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlDadosBandeiraLayout = new javax.swing.GroupLayout(jlDadosBandeira);
        jlDadosBandeira.setLayout(jlDadosBandeiraLayout);
        jlDadosBandeiraLayout.setHorizontalGroup(
            jlDadosBandeiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosBandeiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlDadosBandeiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcVisa)
                    .addComponent(jcMasterCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jlDadosBandeiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcElo)
                    .addComponent(jcHipercard))
                .addGap(26, 26, 26)
                .addGroup(jlDadosBandeiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcBanriCompras)
                    .addComponent(jcAmericanExpress))
                .addContainerGap())
        );
        jlDadosBandeiraLayout.setVerticalGroup(
            jlDadosBandeiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosBandeiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlDadosBandeiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcVisa)
                    .addComponent(jcElo)
                    .addComponent(jcBanriCompras))
                .addGap(18, 18, 18)
                .addGroup(jlDadosBandeiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMasterCard)
                    .addComponent(jcHipercard)
                    .addComponent(jcAmericanExpress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlBancos.setText("Qual(is) banco(s) sedia(am) a(s) conta(s)?");

        jlOpcao2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcItau.setText("Itaú");

        jcBradesco.setText("Bradesco");

        jcBanrisul.setText("Banrisul");

        jcSantander.setText("Santander");

        jlOpcao2.setLayer(jcItau, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlOpcao2.setLayer(jcBradesco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlOpcao2.setLayer(jcBanrisul, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlOpcao2.setLayer(jcSantander, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlOpcao2Layout = new javax.swing.GroupLayout(jlOpcao2);
        jlOpcao2.setLayout(jlOpcao2Layout);
        jlOpcao2Layout.setHorizontalGroup(
            jlOpcao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlOpcao2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlOpcao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcBanrisul)
                    .addComponent(jcItau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jlOpcao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcSantander)
                    .addComponent(jcBradesco))
                .addContainerGap())
        );
        jlOpcao2Layout.setVerticalGroup(
            jlOpcao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlOpcao2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlOpcao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcItau)
                    .addComponent(jcBradesco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlOpcao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcBanrisul)
                    .addComponent(jcSantander))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jlDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jrMasculino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jrFeminino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlPossuiCartao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jrSim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jrNao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlQtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jtQtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlBandeira, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlDadosBandeira, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlBancos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlDados.setLayer(jlOpcao2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlDadosLayout = new javax.swing.GroupLayout(jlDados);
        jlDados.setLayout(jlDadosLayout);
        jlDadosLayout.setHorizontalGroup(
            jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlDadosLayout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNome))
                    .addGroup(jlDadosLayout.createSequentialGroup()
                        .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlDadosLayout.createSequentialGroup()
                                .addComponent(jlQtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlDadosLayout.createSequentialGroup()
                                .addComponent(jlPossuiCartao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrNao))
                            .addGroup(jlDadosLayout.createSequentialGroup()
                                .addComponent(jlSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrFeminino))
                            .addGroup(jlDadosLayout.createSequentialGroup()
                                .addComponent(jlBancos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlDadosLayout.createSequentialGroup()
                                .addComponent(jlBandeira)
                                .addGap(18, 18, 18)
                                .addComponent(jlDadosBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jlDadosLayout.setVerticalGroup(
            jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlDadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo)
                    .addComponent(jrMasculino)
                    .addComponent(jrFeminino))
                .addGap(18, 18, 18)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPossuiCartao)
                    .addComponent(jrSim)
                    .addComponent(jrNao))
                .addGap(18, 18, 18)
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQtd)
                    .addComponent(jtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlDadosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jlBandeira))
                    .addGroup(jlDadosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jlDadosBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlBancos)
                        .addGap(55, 55, 55))
                    .addGroup(jlDadosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jlOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jlConfirmacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbLimparActionPerformed(evt);
            }
        });

        jbRelatorio.setText("Relatório");
        jbRelatorio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbRelatorioActionPerformed(evt);
            }
        });

        jlConfirmacao.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlConfirmacao.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlConfirmacao.setLayer(jbRelatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlConfirmacaoLayout = new javax.swing.GroupLayout(jlConfirmacao);
        jlConfirmacao.setLayout(jlConfirmacaoLayout);
        jlConfirmacaoLayout.setHorizontalGroup(
            jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlConfirmacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlConfirmacaoLayout.setVerticalGroup(
            jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlConfirmacaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jlConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar)
                    .addComponent(jbRelatorio)))
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
    Cliente objCliente = new Cliente();
    
    private void cadastrar(){    
        objCliente.setNome(jtNome.getText());
        objCliente.setSexo(bgSexo.getSelection().getActionCommand());
        objCliente.setPossuiCartao(Boolean.parseBoolean(bgPossuiCartao.getSelection().getActionCommand()));
        ArrayList<String> cartoes = new ArrayList();
        ArrayList<String> contas = new ArrayList();
        
        {
            objCliente.setQuantidadeDeCartoes(Byte.parseByte(jtQtd.getText()));
            
            if (jcVisa.isSelected()){
                cartoes.add(jcVisa.getText());
            }
            if (jcElo.isSelected()){
                cartoes.add(jcElo.getText());
            }
            if (jcBanriCompras.isSelected()){
                cartoes.add(jcBanriCompras.getText());
            }
            if (jcMasterCard.isSelected()){
                cartoes.add(jcMasterCard.getText());
            }
            if (jcHipercard.isSelected()){
                cartoes.add(jcHipercard.getText());
            }
            if (jcAmericanExpress.isSelected()){
                cartoes.add(jcAmericanExpress.getText());
            }
            
            if (jcItau.isSelected()){
                contas.add(jcItau.getText());
            }
            
            if (jcBradesco.isSelected()){
                contas.add(jcBradesco.getText());
            }
            
            if (jcBanrisul.isSelected()){
                contas.add(jcBanrisul.getText());
            }
            
            if (jcSantander.isSelected()){
                contas.add(jcSantander.getText());
            }
        }
        
        objCliente.setCartoes(cartoes);
        objCliente.setContas(contas);
        
        JOptionPane.showMessageDialog(this,
                                        "Cliente cadastrado com sucesso!",
                                        "Informação",
                                        JOptionPane.PLAIN_MESSAGE);
    }
    
    private void limpar(){
        jtNome.setText(null);
        bgSexo.clearSelection();
        bgPossuiCartao.clearSelection();
        jtQtd.setText(null);
        
        jcVisa.setSelected(false);
        jcElo.setSelected(false);
        jcBanriCompras.setSelected(false);
        jcMasterCard.setSelected(false);
        jcHipercard.setSelected(false);
        jcAmericanExpress.setSelected(false);
        jcItau.setSelected(false);
        jcBradesco.setSelected(false);
        jcBanrisul.setSelected(false);
        jcSantander.setSelected(false);
    }
    
    private void relatorio(){
        JOptionPane.showMessageDialog(this,
                                        "Dados: " + objCliente.toString(),
                                        "Relatório",
                                        JOptionPane.PLAIN_MESSAGE);
    }
    
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbCadastrarActionPerformed
    {//GEN-HEADEREND:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbLimparActionPerformed
    {//GEN-HEADEREND:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbRelatorioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbRelatorioActionPerformed
    {//GEN-HEADEREND:event_jbRelatorioActionPerformed
        relatorio();
    }//GEN-LAST:event_jbRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(UICadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(UICadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(UICadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(UICadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new UICadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPossuiCartao;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbRelatorio;
    private javax.swing.JCheckBox jcAmericanExpress;
    private javax.swing.JCheckBox jcBanriCompras;
    private javax.swing.JCheckBox jcBanrisul;
    private javax.swing.JCheckBox jcBradesco;
    private javax.swing.JCheckBox jcElo;
    private javax.swing.JCheckBox jcHipercard;
    private javax.swing.JCheckBox jcItau;
    private javax.swing.JCheckBox jcMasterCard;
    private javax.swing.JCheckBox jcSantander;
    private javax.swing.JCheckBox jcVisa;
    private javax.swing.JLabel jlBancos;
    private javax.swing.JLabel jlBandeira;
    private javax.swing.JLayeredPane jlConfirmacao;
    private javax.swing.JLayeredPane jlDados;
    private javax.swing.JLayeredPane jlDadosBandeira;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLayeredPane jlOpcao2;
    private javax.swing.JLabel jlPossuiCartao;
    private javax.swing.JLabel jlQtd;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JRadioButton jrFeminino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JRadioButton jrNao;
    private javax.swing.JRadioButton jrSim;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQtd;
    // End of variables declaration//GEN-END:variables
}
