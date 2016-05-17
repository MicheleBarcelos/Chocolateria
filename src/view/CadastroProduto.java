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

import DAO.ProdutoDAO;
import DAO.RecheioDAO;
import control.ProdutoControl;
import control.RecheioControl;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import model.Produto;

/**
 * @author Michele Barcelos
 */
public class CadastroProduto extends javax.swing.JFrame {

    public static final int CriarProduto = 0;
    public static final int EditarProduto = 1;

    private Produto produto = new Produto();
    private ProdutoControl control;
    private int salvarComo;
    RecheioControl recheioControl;

    public CadastroProduto(ProdutoControl control, int salvarComo) {
        initComponents();
        this.control = control;
        this.salvarComo = salvarComo;
        setProduto(produto);
        recheioControl = new RecheioControl(tabelaRecheio);
        this.setResizable(false);
    }

    public CadastroProduto(ProdutoControl control, int salvarComo, Produto produto) {
        initComponents();
        this.control = control;
        this.salvarComo = salvarComo;
        setProduto(produto);
        recheioControl = new RecheioControl(tabelaRecheio);
        this.setResizable(false);
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        this.textoDescricao.setText(produto.getDescricao());
        this.textoPreco.setText(String.valueOf(produto.getPeso()));
        this.textoPeso.setText(produto.getPeso());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textoDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textoPreco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textoPeso = new javax.swing.JTextField();
        botaoRecheio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRecheio = new javax.swing.JTable();
        textoRecheio = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Produto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 37, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/produtos.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Descrição:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        textoDescricao.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 13, 412, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Recheio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 49, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Preço:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, -1, -1));

        textoPreco.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 191, 100, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Peso:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 191, -1, -1));

        textoPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 191, 85, -1));

        botaoRecheio.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        botaoRecheio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/recheio_adicionar.png"))); // NOI18N
        botaoRecheio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecheioActionPerformed(evt);
            }
        });
        jPanel1.add(botaoRecheio, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 48, -1, 24));

        tabelaRecheio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelaRecheio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRecheio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRecheioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRecheio);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 82, 471, 99));

        textoRecheio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(textoRecheio, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 48, 344, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 514, 226));

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
        getContentPane().add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 308, -1, -1));

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
        getContentPane().add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 308, 85, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String codRec = "" + tabelaRecheio.getValueAt(tabelaRecheio.getSelectedRow(), 0);
        produto.setDescricao(textoDescricao.getText());
        RecheioDAO recheioDao = new RecheioDAO();
        produto.setRecheio(recheioDao.findById(Integer.parseInt(codRec)));
        produto.setPreco(BigDecimal.valueOf(Float.parseFloat(textoPreco.getText())));
        produto.setPeso(textoPeso.getText());

        ProdutoDAO dao = new ProdutoDAO();
        if (salvarComo == CriarProduto) {
            dao.inserir(produto);
        } else {
            dao.atualizar(produto);
        }
        control.carregarTabela();
        setVisible(false);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoRecheioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecheioActionPerformed
        String nome = textoRecheio.getText();
        recheioControl.pesquisarRecheio(nome);
        textoRecheio.setText("");

    }//GEN-LAST:event_botaoRecheioActionPerformed

    private void tabelaRecheioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRecheioMouseClicked
        String recheio = "" + tabelaRecheio.getValueAt(tabelaRecheio.getSelectedRow(), 1);
        textoRecheio.setText(recheio);


    }//GEN-LAST:event_tabelaRecheioMouseClicked

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
    private javax.swing.JButton botaoRecheio;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRecheio;
    private javax.swing.JTextField textoDescricao;
    private javax.swing.JTextField textoPeso;
    private javax.swing.JTextField textoPreco;
    private javax.swing.JTextField textoRecheio;
    // End of variables declaration//GEN-END:variables
}
