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

import DAO.ClienteDAO;
import DAO.FormapagtoDAO;
import DAO.ItemDAO;
import DAO.ProdutoDAO;
import DAO.VendaDAO;
import DAO.VendedorDAO;
import control.ClienteControl;
import control.FormapagtoControl;
import control.ProdutoControl;
import control.VendaControl;
import control.VendedorControl;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import model.Item;
import model.Venda;

/**
 * @author Michele Barcelos
 */
public class Vendas extends javax.swing.JFrame {

    private final VendaControl vendaControl;
    private final DefaultTableModel modelo;
    private VendedorControl vendedorControl;
    private ProdutoControl produtoControl;
    private ClienteControl clienteControl;
    private FormapagtoControl formapagtoControl;

    Item item = new Item();
    ProdutoDAO produtoDao = new ProdutoDAO();
    ClienteDAO clienteDao = new ClienteDAO();
    VendedorDAO vendedorDao = new VendedorDAO();
    VendaDAO vendaDao = new VendaDAO();
    ItemDAO itemDao = new ItemDAO();
    FormapagtoDAO formaDao = new FormapagtoDAO();
    Date data = new Date();
    Venda venda = new Venda();
    SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");

    String preco = null;
    float valorTotal = 0;
    int quant = 0;
    String codProd = null, produto = null;
    String codVend = null, codForm;
    String codCli = null;
    int aux = 0;
    DefaultTableModel model;
    float soma = 0;

    public Vendas() {
        initComponents();
        desabilitar();
        vendaControl = new VendaControl(tabelaVenda);
        this.modelo = (DefaultTableModel) tabelaPesquisa.getModel();
        this.model = (DefaultTableModel) tabelaVenda.getModel();
        textoData.setText(dataFormato.format(data));
        this.setResizable(false);
        limpar();
    }

    public void setItemvenda(Item item) {
        this.item = item;
        this.textoPesqProduto.setText(String.valueOf(item.getProduto().getDescricao()));
        this.textoQuant.setText(String.valueOf(item.getQuant()));
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
        this.textoData.setText(String.valueOf(venda.getDataVenda()));

    }

    public void desabilitar() {
        textoValor.setEditable(false);
        textoTroco.setEditable(false);
        textoTotal.setEditable(false);
        textoRecheio.setEditable(false);
        textoData.setEditable(false);
        textoComissao1.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        icone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoPesquisa = new javax.swing.JButton();
        labelProduto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textoQuant = new javax.swing.JTextField();
        dataVenda = new javax.swing.JLabel();
        botaoAddVendedor = new javax.swing.JButton();
        botaoAddCliente = new javax.swing.JButton();
        botaoAdd = new javax.swing.JButton();
        botaoAddProduto = new javax.swing.JButton();
        labelVendedor = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        textoPesqVendedor = new javax.swing.JTextField();
        textoPesqCliente = new javax.swing.JTextField();
        textoPesqProduto = new javax.swing.JTextField();
        textoData = new javax.swing.JTextField();
        textoRecheio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        textoTotal = new javax.swing.JTextField();
        botaoExcluir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        itens = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        textoValor = new javax.swing.JTextField();
        textoDesconto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoRecebido = new javax.swing.JTextField();
        recebido = new javax.swing.JLabel();
        troco = new javax.swing.JLabel();
        textoTroco = new javax.swing.JTextField();
        textoComissao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textoForma = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        botaoForma = new javax.swing.JButton();
        textoComissao1 = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/vendas.png"))); // NOI18N
        getContentPane().add(icone, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoPesquisa.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/page_search.png"))); // NOI18N
        botaoPesquisa.setText("Pesquisar");
        botaoPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        botaoPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPesquisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        labelProduto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelProduto.setText("Produto:");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Quantidade:");

        textoQuant.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textoQuant.setText("1");

        dataVenda.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        dataVenda.setText("Data Venda:");

        botaoAddVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/adicionar16x16.png"))); // NOI18N
        botaoAddVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddVendedorActionPerformed(evt);
            }
        });

        botaoAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/adicionar16x16.png"))); // NOI18N
        botaoAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddClienteActionPerformed(evt);
            }
        });

        botaoAdd.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/adicionar.png"))); // NOI18N
        botaoAdd.setText("Incluir");
        botaoAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddActionPerformed(evt);
            }
        });

        botaoAddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/adicionar16x16.png"))); // NOI18N
        botaoAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddProdutoActionPerformed(evt);
            }
        });

        labelVendedor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelVendedor.setText("Vendedor:");

        labelCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelCliente.setText("Cliente:");

        textoPesqVendedor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        textoPesqCliente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        textoPesqProduto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        textoData.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        textoRecheio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Recheio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelVendedor)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoPesqVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAddVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelProduto))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisa, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAdd)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelVendedor)
                                    .addComponent(textoPesqVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoAddVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoAddCliente)
                                    .addComponent(textoPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAddProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textoPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelProduto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textoRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textoQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        tabelaVenda.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Recheio", "Quantidade", "Preço Unitario", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 475, 120));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Total a Pagar:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 100, 20));

        textoTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        getContentPane().add(textoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 90, -1));

        botaoExcluir.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 500, -1, -1));

        botaoSalvar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/accept.png"))); // NOI18N
        botaoSalvar.setText("Finalizar");
        botaoSalvar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        botaoSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        botaoSair.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/sair.png"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 73, -1));

        itens.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        itens.setText("Itens:");
        getContentPane().add(itens, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        tabelaPesquisa.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaPesquisa);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 475, 90));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Pesquisa:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Venda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

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
        getContentPane().add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 500, -1, -1));

        textoValor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 90, -1));

        textoDesconto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textoDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoDescontoKeyReleased(evt);
            }
        });
        getContentPane().add(textoDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 90, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Valor da Venda:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 120, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Desconto: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, 20));

        textoRecebido.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textoRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoRecebidoKeyReleased(evt);
            }
        });
        getContentPane().add(textoRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 90, -1));

        recebido.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        recebido.setText("Recebido:");
        getContentPane().add(recebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 70, 20));

        troco.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        troco.setText("Troco:");
        getContentPane().add(troco, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, 20));

        textoTroco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        getContentPane().add(textoTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 90, -1));

        textoComissao.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textoComissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoComissaoKeyReleased(evt);
            }
        });
        getContentPane().add(textoComissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 40, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Comissão:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText(" %");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 30, -1));

        textoForma.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textoForma, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 200, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Forma de Pagamento");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        botaoForma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/adicionar16x16.png"))); // NOI18N
        botaoForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFormaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoForma, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 30, -1));

        textoComissao1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textoComissao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 60, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        new PesquisaVenda().setVisible(true);
    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void botaoAddVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddVendedorActionPerformed
        aux = 1;
        if (textoPesqVendedor.getText().equals("")) {
            textoPesqVendedor.setEditable(true);
            vendedorControl = new VendedorControl(tabelaPesquisa);
            textoPesqVendedor.setText("");
        } else {
            textoPesqVendedor.setEditable(true);
            String nome = textoPesqVendedor.getText();
            vendedorControl.pesquisarVendedor(nome);
            textoPesqVendedor.setText("");
        }
    }//GEN-LAST:event_botaoAddVendedorActionPerformed

    private void botaoAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddClienteActionPerformed
        aux = 2;
        if (textoPesqCliente.getText().equals("")) {
            textoPesqCliente.setEditable(true);
            clienteControl = new ClienteControl(tabelaPesquisa);

            textoPesqCliente.setText("");

        } else {
            textoPesqCliente.setEditable(true);
            String nome = textoPesqCliente.getText();
            clienteControl.pesquisarCliente(nome);
            textoPesqCliente.setText("");
        }

    }//GEN-LAST:event_botaoAddClienteActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        vendaControl.excluirVenda();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        limpar();
        setVisible(false);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String comissao = textoComissao.getText();
        String desconto = textoDesconto.getText();
        itemDao.inserir(item);
        venda.setCliente(clienteDao.findById(Integer.parseInt(codCli)));
        venda.setVendedor(vendedorDao.findById(Integer.parseInt(codVend)));
        venda.setDataVenda(data);
        venda.setValorVenda(BigDecimal.valueOf(Float.parseFloat(textoTotal.getText())));
        venda.setComissao(BigDecimal.valueOf(Float.parseFloat(comissao)));
        venda.setDesconto(Integer.valueOf(desconto));
        venda.setFormapagto(formaDao.findById(Integer.valueOf(codForm)));
        vendaDao.inserir(venda);

        JOptionPane.showMessageDialog(null, "Venda Finalizada!");
        limpar();

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddActionPerformed
        quant = Integer.parseInt(textoQuant.getText());
        int quantAux = quant;
        quant = 0;
        botaoAddVendedor.setEnabled(false);
        textoPesqVendedor.setEditable(false);
        botaoAddCliente.setEnabled(false);
        textoPesqCliente.setEditable(false);

        modelo.setNumRows(0);
        produto = textoPesqProduto.getText();
        String rec = textoRecheio.getText();
        textoPesqProduto.setText(null);
        textoRecheio.setText(null);
        soma = Float.parseFloat(preco) * quantAux;

        Object[] linha = new Object[]{produto, rec, quantAux, preco, soma};
        model.addRow(linha);
        textoPesqProduto.setEditable(true);
        valorTotal += soma;
        textoValor.setText(String.valueOf(valorTotal));
        item.setQuant(quantAux);
        item.setProduto(produtoDao.findById(Integer.parseInt(codProd)));
        textoQuant.setText("1");

    }//GEN-LAST:event_botaoAddActionPerformed

    private void botaoAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddProdutoActionPerformed
        aux = 3;

        if (textoPesqProduto.getText().equals("")) {
            textoPesqProduto.setEditable(true);
            produtoControl = new ProdutoControl(tabelaPesquisa);
            textoPesqProduto.setText("");

        } else {
            textoPesqProduto.setEditable(true);
            String nome = textoPesqProduto.getText();
            produtoControl.pesquisarProduto(nome);
            textoPesqProduto.setText("");
        }
    }//GEN-LAST:event_botaoAddProdutoActionPerformed

    private void tabelaPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisaMouseClicked
        if (aux == 1) {
            String vendedor = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 1);
            codVend = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0);
            textoPesqVendedor.setText(vendedor);
            textoPesqVendedor.setEditable(false);
        } else if (aux == 2) {
            String cliente = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 1);
            codCli = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0);
            textoPesqCliente.setText(cliente);
            textoPesqCliente.setEditable(false);
        } else if (aux == 3) {
            produto = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 1);
            textoPesqProduto.setText(produto);
            String recheio = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 2);
            codProd = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0);
            textoRecheio.setText(recheio);
            textoRecheio.setEditable(false);
            preco = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 3);
        } else if (aux == 4) {
            String forma = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 1);
            codForm = "" + tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0);
            textoForma.setText(forma);
            textoForma.setEditable(false);
        }

    }//GEN-LAST:event_tabelaPesquisaMouseClicked

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void textoDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoDescontoKeyReleased
        textoTotal.setText(String.valueOf(Float.parseFloat(textoValor.getText()) - Float.parseFloat(textoDesconto.getText())));
    }//GEN-LAST:event_textoDescontoKeyReleased

    private void textoRecebidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoRecebidoKeyReleased
        textoTroco.setText(String.valueOf(Float.parseFloat(textoRecebido.getText()) - Float.parseFloat(textoTotal.getText())));
    }//GEN-LAST:event_textoRecebidoKeyReleased

    private void botaoFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFormaActionPerformed
        aux = 4;
        if (textoForma.getText().equals("")) {
            formapagtoControl = new FormapagtoControl(tabelaPesquisa);

        } else {
            textoForma.setEditable(true);
            String nome = textoForma.getText();
            formapagtoControl.pesquisarFormapagto(nome);
        }
    }//GEN-LAST:event_botaoFormaActionPerformed

    private void textoComissaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoComissaoKeyReleased
        textoComissao1.setText(String.valueOf((Float.parseFloat(textoValor.getText()) * Float.parseFloat(textoComissao.getText())) / 100));
    }//GEN-LAST:event_textoComissaoKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoAddCliente;
    private javax.swing.JButton botaoAddProduto;
    private javax.swing.JButton botaoAddVendedor;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoForma;
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel dataVenda;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel itens;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelVendedor;
    private javax.swing.JLabel recebido;
    private javax.swing.JTable tabelaPesquisa;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField textoComissao;
    private javax.swing.JTextField textoComissao1;
    private javax.swing.JTextField textoData;
    private javax.swing.JTextField textoDesconto;
    private javax.swing.JTextField textoForma;
    private javax.swing.JTextField textoPesqCliente;
    private javax.swing.JTextField textoPesqProduto;
    private javax.swing.JTextField textoPesqVendedor;
    private javax.swing.JTextField textoQuant;
    private javax.swing.JTextField textoRecebido;
    private javax.swing.JTextField textoRecheio;
    private javax.swing.JTextField textoTotal;
    private javax.swing.JTextField textoTroco;
    private javax.swing.JTextField textoValor;
    private javax.swing.JLabel troco;
    // End of variables declaration//GEN-END:variables

    public void limpar() {
        botaoAddVendedor.setEnabled(true);
        botaoAddCliente.setEnabled(true);
        modelo.setNumRows(0);
        model.setNumRows(0);
        textoPesqProduto.setText(null);
        textoRecheio.setText(null);
        textoPesqCliente.setText(null);
        textoPesqVendedor.setText(null);
        textoTotal.setText(null);
        textoQuant.setText("1");
        textoPesqCliente.setEditable(true);
        textoPesqVendedor.setEditable(true);
        textoComissao.setText(null);
        textoComissao1.setText(null);
        textoForma.setText(null);
        textoDesconto.setText(null);
        textoValor.setText(null);
        textoRecebido.setText(null);
        textoTroco.setText(null);
    }
}
