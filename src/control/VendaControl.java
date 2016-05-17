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

import DAO.VendaDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Venda;

/**
 * @author Michele Barcelos
 */
public class VendaControl {

    private final JTable tabelaVenda;
    private DefaultTableModel modelo;

    public VendaControl(JTable tabelaVenda) {

        this.tabelaVenda = tabelaVenda;
        this.modelo = (DefaultTableModel) tabelaVenda.getModel();
        carregarTabela();
    }

    public void carregarTabela() {
        modelo.setNumRows(0);
        VendaDAO vendaDAO = new VendaDAO();
        for (Venda c : vendaDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCliente().getNome(), c.getDataVenda(), c.getValorVenda()});
        }
    }

    public void editarVenda() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaVenda.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idVenda = (int) tabelaVenda.getValueAt(linhaSelecionada, 0);
            VendaDAO dao = new VendaDAO();
            Venda venda = dao.findById(idVenda);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Venda");
        }
    }

    public void excluirVenda() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaVenda.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idVenda = (int) tabelaVenda.getValueAt(linhaSelecionada, 0);
            VendaDAO dao = new VendaDAO();
            dao.deleteById(idVenda);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Venda");
        }
        carregarTabela();
    }

    public void pesquisarVenda(String nome) {
        modelo.setNumRows(0);
        VendaDAO vendaDAO = new VendaDAO();
        for (Venda c : vendaDAO.findByNome(nome)) {
            Object[] vendaObj = new Object[]{c.getCliente().getNome(), c.getDataVenda(), c.getValorVenda()};
            modelo.addRow(vendaObj);
        }
    }
}
