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

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAO.ClienteDAO;
import view.CadastroCliente;
import model.Cliente;

/**
 * @author Michele Barcelos
 */
public class ClienteControl {

    private final JTable tabelaCliente;
    private DefaultTableModel modelo;

    public ClienteControl(JTable tabelaCliente) {
        this.tabelaCliente = tabelaCliente;
        this.modelo = (DefaultTableModel) tabelaCliente.getModel();
        carregarTabela();
    }

    public void carregarTabela() {

        modelo.setNumRows(0);
        ClienteDAO clienteDAO = new ClienteDAO();
        for (Cliente c : clienteDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCodCli(), c.getNome(), c.getEnd(), c.getTelefone()});
        }
    }

    public void novoCliente() {
        CadastroCliente cadastro = new CadastroCliente(this, CadastroCliente.CriarCliente);
        cadastro.setVisible(true);
    }

    public void editarCliente() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaCliente.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idCliente = (int) tabelaCliente.getValueAt(linhaSelecionada, 0);
            ClienteDAO dao = new ClienteDAO();
            Cliente cliente = dao.findById(idCliente);
            CadastroCliente cadastro = new CadastroCliente(this, CadastroCliente.EditarCliente, cliente);
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Cliente");
        }
    }

    public void excluirCliente() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaCliente.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idCliente = (int) tabelaCliente.getValueAt(linhaSelecionada, 0);
            ClienteDAO dao = new ClienteDAO();
            dao.deleteById(idCliente);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Cliente");
        }
        carregarTabela();
    }

    public void pesquisarCliente(String nome) {
        modelo.setNumRows(0);
        ClienteDAO clienteDAO = new ClienteDAO();
        for (Cliente c : clienteDAO.findByNome(nome)) {
            Object[] clienteObj = new Object[]{c.getCodCli(), c.getNome(), c.getEnd(), c.getTelefone()};
            modelo.addRow(clienteObj);
        }
    }
}
