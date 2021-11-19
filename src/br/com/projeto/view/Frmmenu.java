/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Zezerino
 */
public class Frmmenu extends javax.swing.JFrame {
    
    public String usuariologado;

    public Frmmenu() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/fundo.jpg"));
        Image image = icon.getImage();
        painel_desktop = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(),getHeight(),this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_controlefuncionarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menu_posicaododia = new javax.swing.JMenuItem();
        menu_controledevendas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Estoque");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Usuário Logado:");

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(0, 51, 255));
        lblusuario.setText("Zezerino Mattos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(734, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblusuario))
                .addContainerGap())
        );

        painel_desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                .addGap(0, 337, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes.png"))); // NOI18N
        jMenu1.setText("Clientes");

        jMenuItem1.setText("Controle de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/funcionarios.png"))); // NOI18N
        jMenu2.setText("Funcionários");

        menu_controlefuncionarios.setText("Controle de Funcionários");
        menu_controlefuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_controlefuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(menu_controlefuncionarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fornecedores.png"))); // NOI18N
        jMenu3.setText("Fornecedores");

        jMenuItem3.setText("Controle de Fornecedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/produtos.png"))); // NOI18N
        jMenu6.setText("Produtos");

        jMenuItem4.setText("Controle de Estoque");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Consulta de Produtos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vendas.png"))); // NOI18N
        jMenu4.setText("Vendas");

        jMenuItem6.setText("Abrir PDV");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        menu_posicaododia.setText("Posição do Dia");
        menu_posicaododia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_posicaododiaActionPerformed(evt);
            }
        });
        jMenu4.add(menu_posicaododia);

        menu_controledevendas.setText("Histórico de Vendas");
        menu_controledevendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_controledevendasActionPerformed(evt);
            }
        });
        jMenu4.add(menu_controledevendas);
        jMenu4.add(jSeparator1);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configuracoes.png"))); // NOI18N
        jMenu5.setText("Configurações");

        jMenuItem9.setText("Trocar de Usuário");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sair.png"))); // NOI18N
        jMenu7.setText("Sair");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // ABRIR TELA MAXIMIZADO
        this.setExtendedState(Frmmenu.MAXIMIZED_BOTH);
        lblusuario.setText(usuariologado);
        this.setVisible(true);
        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // EFETUAR O LOGOUT
        FrmLogin telalogin = new FrmLogin();
        this.dispose();
        
        telalogin.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // BOTAO SAIR
        int op;
        op = JOptionPane.showConfirmDialog(null, "VOCÊ REALMENTE DESEJA SAIR DO SISTEMA?");
        
        if(op == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // MENU CONSULTA DE PRODUTOS
        FrmProdutos tela = new FrmProdutos();
        tela.jTabbedPane2.setSelectedIndex(1);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //CONTROLE DE CLIENTES
        FrmClientes telacli = new FrmClientes();
        telacli.jTabbedPane3.setSelectedIndex(1);
        telacli.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menu_controlefuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_controlefuncionariosActionPerformed
        //CONTROLE DE FUNCIONARIOS
        FrmFuncionarios telafun = new FrmFuncionarios();
        telafun.setVisible(true);
    }//GEN-LAST:event_menu_controlefuncionariosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //CONTROLE DE FORNECEDOR
        FrmFornecedores telafor = new FrmFornecedores();
        telafor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // ABRIR PDV
        FrmVendas telapdv = new FrmVendas();
        telapdv.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menu_posicaododiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_posicaododiaActionPerformed
        // ABRIR POSICAO DO DIA
        FrmTotalVenda telaposd = new FrmTotalVenda();
        telaposd.setVisible(true);
    }//GEN-LAST:event_menu_posicaododiaActionPerformed

    private void menu_controledevendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_controledevendasActionPerformed
         // ABRIR CONTROLE DE VENDAS
        FrmHistorico telacont = new FrmHistorico();
        telacont.setVisible(true);
    }//GEN-LAST:event_menu_controledevendasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // CONTROLE DE ESTOQUE
        FrmControleDeEstoque tela = new FrmControleDeEstoque();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblusuario;
    public javax.swing.JMenuItem menu_controledevendas;
    public javax.swing.JMenuItem menu_controlefuncionarios;
    public javax.swing.JMenuItem menu_posicaododia;
    private javax.swing.JDesktopPane painel_desktop;
    // End of variables declaration//GEN-END:variables
}
