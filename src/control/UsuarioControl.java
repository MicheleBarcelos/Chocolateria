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

import DAO.UsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import view.CadastroUsuario;

/**
 * @author Michele Barcelos
 */
public class UsuarioControl {

    private final JTable tabelaUsuario;
    private DefaultTableModel modelo;
    public static final int usuarioLogin = 0;

    public UsuarioControl(JTable tabelaUsuario) {
        this.tabelaUsuario = tabelaUsuario;
        this.modelo = (DefaultTableModel) tabelaUsuario.getModel();
        carregarTabela();
    }

    public void carregarTabela() {

        modelo.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        for (Usuario c : usuarioDAO.findAll()) {
            modelo.addRow(new Object[]{c.getCodUsuario(), c.getNome(), c.getSenha()});
        }
    }

    public void novoUsuario() {
        CadastroUsuario cadastro = new CadastroUsuario(this, CadastroUsuario.CriarUsuario);
        cadastro.setVisible(true);
    }

    public void editarUsuario() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaUsuario.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idUsuario = (int) tabelaUsuario.getValueAt(linhaSelecionada, 0);
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuario = dao.findById(idUsuario);
            CadastroUsuario cadastro = new CadastroUsuario(this, CadastroUsuario.EditarUsuario, usuario);
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Usuario");
        }
    }

    public void excluirUsuario() {
        int linhaSelecionada = -1;
        linhaSelecionada = tabelaUsuario.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idUsuario = (int) tabelaUsuario.getValueAt(linhaSelecionada, 0);
            UsuarioDAO dao = new UsuarioDAO();
            dao.deleteById(idUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar um Usuario");
        }
        carregarTabela();
    }

    public void pesquisarUsuario(String nome) {
        modelo.setNumRows(0);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        for (Usuario c : usuarioDAO.findByNome(nome)) {
            Object[] usuarioObj = new Object[]{c.getCodUsuario(), c.getNome(), c.getSenha()};
            modelo.addRow(usuarioObj);
        }
    }

}
