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

import DAO.VendedorDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Vendedor;
import view.CadastroVendedor;

/**
 * @author Michele Barcelos
 */
public class VendedorControl {

    private final JTable tabelaVendedor;
    private DefaultTableModel modelo;

    public VendedorControl(JTable tabelaVendedor) {
        this.tabelaVendedor = tabelaVendedor;
        this.modelo = (DefaultTableModel) tabelaVendedor.getModel();
        carregarTabela();
    }

    public void carregarTabela() {

        modelo.setNumRows(0);
        VendedorDAO vendedorDAO = new VendedorDAO();
        for (Vendedor c : vendedorDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCodVen(), c.getNome(), c.getEndereco(), c.getTelefone(), c.getUsuario()});
        }
    }

    public void novoVendedor() {
        CadastroVendedor cadastro = new CadastroVendedor(this, CadastroVendedor.CriarVendedor);
        cadastro.setVisible(true);
    }

    public void editarVendedor() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaVendedor.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idVendedor = (int) tabelaVendedor.getValueAt(linhaSelecionada, 0);
            VendedorDAO dao = new VendedorDAO();
            Vendedor vendedor = dao.findById(idVendedor);
            CadastroVendedor cadastro = new CadastroVendedor(this, CadastroVendedor.EditarVendedor, vendedor);
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Vendedor");
        }
    }

    public void excluirVendedor() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaVendedor.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idVendedor = (int) tabelaVendedor.getValueAt(linhaSelecionada, 0);
            VendedorDAO dao = new VendedorDAO();
            dao.deleteById(idVendedor);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Vendedor");
        }
        carregarTabela();
    }

    public void pesquisarVendedor(String nome) {
        modelo.setNumRows(0);
        VendedorDAO vendedorDAO = new VendedorDAO();
        for (Vendedor c : vendedorDAO.findByNome(nome)) {
            Object[] vendedorObj = new Object[]{c.getCodVen(), c.getNome(), c.getEndereco(), c.getTelefone(), c.getUsuario()};
            modelo.addRow(vendedorObj);
        }
    }
}
