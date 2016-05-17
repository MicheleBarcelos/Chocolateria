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
package control;

import DAO.ProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import view.CadastroProduto;

/**
 * @author Michele Barcelos
 */
public class ProdutoControl {

    private final JTable tabelaProduto;
    private DefaultTableModel modelo;

    public ProdutoControl(JTable tabelaProduto) {
        this.tabelaProduto = tabelaProduto;
        this.modelo = (DefaultTableModel) tabelaProduto.getModel();
        carregarTabela();
    }

    public void carregarTabela() {

        modelo.setNumRows(0);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        for (Produto c : produtoDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCodProd(), c.getDescricao(), c.getRecheio().getDescricao(), c.getPreco(), c.getPeso()});
        }
    }

    public void novoProduto() {
        CadastroProduto cadastro = new CadastroProduto(this, CadastroProduto.CriarProduto);
        cadastro.setVisible(true);
    }

    public void editarProduto() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaProduto.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idProduto = (int) tabelaProduto.getValueAt(linhaSelecionada, 0);
            ProdutoDAO dao = new ProdutoDAO();
            Produto produto = dao.findById(idProduto);
            CadastroProduto cadastro = new CadastroProduto(this, CadastroProduto.EditarProduto, produto);
            carregarTabela();
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Produto");
        }
    }

    public void excluirProduto() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaProduto.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idProduto = (int) tabelaProduto.getValueAt(linhaSelecionada, 0);
            ProdutoDAO dao = new ProdutoDAO();
            dao.deleteById(idProduto);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Produto");
        }
        carregarTabela();
    }

    public void pesquisarProduto(String nome) {
        modelo.setNumRows(0);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        for (Produto c : produtoDAO.findByNome(nome)) {
            Object[] produtoObj = new Object[]{c.getCodProd(), c.getDescricao(), c.getRecheio().getDescricao(), c.getPreco(), c.getPeso()};
            modelo.addRow(produtoObj);
        }
    }
}
