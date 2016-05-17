/*The MIT License (MIT)

 Copyright (c) 2016 MicheleBarcelos

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.*/
package view;

import DAO.UsuarioDAO;
import DAO.VendedorDAO;
import control.VendedorControl;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import model.Vendedor;

/**
 * @author Michele Barcelos
 */
public class CadastroVendedor extends javax.swing.JFrame {

    public static final int CriarVendedor = 0;
    public static final int EditarVendedor = 1;

    private Vendedor vendedor = new model.Vendedor();
    private VendedorControl control;
    private int salvarComo;

    public CadastroVendedor(VendedorControl control, int salvarComo) {
        initComponents();
        this.control = control;
        this.salvarComo = salvarComo;
        this.setResizable(false);
    }

    public CadastroVendedor(VendedorControl control, int salvarComo, model.Vendedor vendedor) {
        initComponents();
        this.control = control;
        this.salvarComo = salvarComo;
        setVendedor(vendedor);
        this.setResizable(false);
    }

    public void setVendedor(model.Vendedor vendedor) {
        this.vendedor = vendedor;
        this.textoNome.setText(vendedor.getNome());
        this.textoEndereco.setText(vendedor.getEndereco());
        this.textoTelefone.setText(vendedor.getTelefone());
        this.textoUsuario.setText(String.valueOf(vendedor.getUsuario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textoTelefone = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Vendedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 44, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/vendedores.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 23, -1, -1));

        textoNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 22, 315, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Endereço:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 53, -1, -1));

        textoEndereco.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 52, 315, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 83, -1, -1));

        textoTelefone.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 82, 315, -1));

        textoUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 112, 315, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Usuario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 113, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 443, 150));

        botaoCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        botaoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        botaoSalvar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        botaoSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        vendedor.setNome(textoNome.getText());
        vendedor.setEndereco(textoEndereco.getText());
        vendedor.setTelefone(textoTelefone.getText());
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        vendedor.setUsuario(usuarioDAO.findById(Integer.valueOf(textoUsuario.getText())));

        VendedorDAO dao = new VendedorDAO();
        if (salvarComo == CriarVendedor) {
            dao.inserir(vendedor);
        } else {
            dao.atualizar(vendedor);
        }
        control.carregarTabela();
        setVisible(false);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoEndereco;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoTelefone;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
