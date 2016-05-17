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

import DAO.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * @author Michele Barcelos
 */
public class Login extends javax.swing.JFrame {

    String nome, senha;

    public Login() {
        initComponents();
    }

    private Boolean verifica() {
        UsuarioDAO dao = new UsuarioDAO();
        nome = textoUsuario.getText();
        senha = textoSenha.getText();

        if (!nome.equals("") && !senha.equals("")) {

            for (model.Usuario usuario : dao.findByNome(nome)) {

                if (usuario.getNome().equalsIgnoreCase(nome) && usuario.getSenha().equals(senha)) {
                    return true;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Falta prencher usuário ou senha!");
        }

        return false;
    }

    public Boolean ver(String nome, String senha) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<model.Usuario> usuario = usuarioDAO.findByNome(nome);

        for (model.Usuario c : usuarioDAO.findByNome(nome)) {

        }
        JOptionPane.showMessageDialog(
                null, "Usuario ou senha errada!");

        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        textoSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Login do Sistema");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        botaoEntrar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/next.png"))); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botaoEntrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 110, 30));

        botaoCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botaoCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 120, 30));

        textoSenha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/imgLogin.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 157));

        setSize(new java.awt.Dimension(425, 276));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        textoUsuario.setText(null);//Seleciona todo o texto do campo de login.
        textoSenha.setText(null);
        textoSenha.removeAll();    //Limpa os dados do campo da senha.
        textoUsuario.requestFocus(); //Coloca o foco no campo de login.

    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar o sistema", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        nome = textoUsuario.getText();
        senha = textoSenha.getText();
        if (verifica()) {

            if (nome.equalsIgnoreCase("adm")) {

                new Principal(1).setVisible(true);
                // principal.principalAdm();
                this.dispose();
            } else {
                new Principal(2).setVisible(true);
                // principal.principalUsuario();
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha errada!");
            textoUsuario.setText(null);//Seleciona todo o texto do campo de login.
            textoSenha.setText(null);
            textoSenha.removeAll();    //Limpa os dados do campo da senha.
            textoUsuario.requestFocus(); //Coloca o foco no campo de login.
        }
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField textoSenha;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
