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

import DAO.FormapagtoDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Formapagto;
import view.CadastroFormapagto;

/**
 * @author Michele Barcelos
 */
public class FormapagtoControl {

    private final JTable tabelaFormapagto;
    private DefaultTableModel modelo;

    public FormapagtoControl(JTable tabelaFormapagto) {
        this.tabelaFormapagto = tabelaFormapagto;
        this.modelo = (DefaultTableModel) tabelaFormapagto.getModel();
        carregarTabela();
    }

    public void carregarTabela() {

        modelo.setNumRows(0);
        FormapagtoDAO formapagtoDAO = new FormapagtoDAO();
        for (Formapagto c : formapagtoDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCodPagto(), c.getDescricao()});
        }
    }

    public void novoFormapagto() {
        CadastroFormapagto cadastro = new CadastroFormapagto(this, CadastroFormapagto.CriarFormapagto);
        cadastro.setVisible(true);
    }

    public void editarFormapagto() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaFormapagto.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idFormapagto = (int) tabelaFormapagto.getValueAt(linhaSelecionada, 0);
            FormapagtoDAO dao = new FormapagtoDAO();
            Formapagto formapagto = dao.findById(idFormapagto);
            CadastroFormapagto cadastro = new CadastroFormapagto(this, CadastroFormapagto.EditarFormapagto, formapagto);
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Formapagto");
        }
    }

    public void excluirFormapagto() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaFormapagto.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idFormapagto = (int) tabelaFormapagto.getValueAt(linhaSelecionada, 0);
            FormapagtoDAO dao = new FormapagtoDAO();
            dao.deleteById(idFormapagto);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Formapagto");
        }
        carregarTabela();
    }

    public void pesquisarFormapagto(String nome) {
        modelo.setNumRows(0);
        FormapagtoDAO formapagtoDAO = new FormapagtoDAO();
        for (Formapagto c : formapagtoDAO.findByNome(nome)) {
            Object[] formapagtoObj = new Object[]{c.getCodPagto(), c.getDescricao()};
            modelo.addRow(formapagtoObj);
        }
    }
}
