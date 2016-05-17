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
import DAO.RecheioDAO;
import view.CadastroRecheio;
import model.Recheio;

/**
 * @author Michele Barcelos
 */
public class RecheioControl {

    private final JTable tabelaRecheio;
    private DefaultTableModel modelo;

    public RecheioControl(JTable tabelaRecheio) {
        this.tabelaRecheio = tabelaRecheio;
        this.modelo = (DefaultTableModel) tabelaRecheio.getModel();
        carregarTabela();
    }

    public void carregarTabela() {

        modelo.setNumRows(0);
        RecheioDAO recheioDAO = new RecheioDAO();
        for (Recheio c : recheioDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCodRecheio(), c.getDescricao()});
        }
    }

    public void novoRecheio() {
        CadastroRecheio cadastro = new CadastroRecheio(this, CadastroRecheio.CriarRecheio);
        cadastro.setVisible(true);
    }

    public void editarRecheio() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaRecheio.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idRecheio = (int) tabelaRecheio.getValueAt(linhaSelecionada, 0);
            RecheioDAO dao = new RecheioDAO();
            Recheio recheio = dao.findById(idRecheio);
            CadastroRecheio cadastro = new CadastroRecheio(this, CadastroRecheio.EditarRecheio, recheio);
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Recheio");
        }
    }

    public void excluirRecheio() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaRecheio.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idRecheio = (int) tabelaRecheio.getValueAt(linhaSelecionada, 0);
            RecheioDAO dao = new RecheioDAO();
            dao.deleteById(idRecheio);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Recheio");
        }
        carregarTabela();
    }

    public void pesquisarRecheio(String nome) {
        modelo.setNumRows(0);
        RecheioDAO recheioDAO = new RecheioDAO();
        for (Recheio c : recheioDAO.findByNome(nome)) {
            Object[] recheioObj = new Object[]{c.getCodRecheio(), c.getDescricao()};
            modelo.addRow(recheioObj);
        }
    }

}
