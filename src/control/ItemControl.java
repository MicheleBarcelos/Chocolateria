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

import DAO.ItemDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Item;

/**
 * @author Michele Barcelos
 */
public class ItemControl {

    private final JTable tabelaItemVenda;
    private DefaultTableModel modelo;

    public ItemControl(JTable tabelaItemVenda) {
        this.tabelaItemVenda = tabelaItemVenda;
        this.modelo = (DefaultTableModel) tabelaItemVenda.getModel();
        carregarTabela();
    }

    public void carregarTabela() {

        modelo.setNumRows(0);
        ItemDAO itemDAO = new ItemDAO();
        for (Item c : itemDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCodItem(), c.getProduto().getDescricao(), c.getQuant(), c.getVendas()});
        }
    }

    public void excluirItemVenda() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaItemVenda.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idItemVenda = (int) tabelaItemVenda.getValueAt(linhaSelecionada, 0);
            ItemDAO dao = new ItemDAO();
            dao.deleteById(idItemVenda);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Item");
        }
        carregarTabela();
    }

    public void pesquisarItemVenda(String nome) {
        modelo.setNumRows(0);
        ItemDAO itemDAO = new ItemDAO();
        for (Item c : itemDAO.findByNome(nome)) {
            Object[] itemObj = new Object[]{c.getCodItem(), c.getProduto().getDescricao(), c.getQuant(), c.getVendas()};
            modelo.addRow(itemObj);
        }
    }
}
