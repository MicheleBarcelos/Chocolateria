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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 * @author Michele Barcelos
 */
public class Principal extends javax.swing.JFrame {

    public Principal(int id) {
        initComponents();
        if (id == 1) {
            principalAdm();
        } else {
            principalUsuario();
        }
        this.setResizable(false);

    }

    public static int principalAdm;
    public static int principalUsuario;

    public void principalAdm() {
        botaoUsuario.setEnabled(true);
        botaoVendedor.setEnabled(true);
        botaoForma.setEnabled(true);

    }

    public void principalUsuario() {
        Produto produto = new Produto();
        Recheio recheio = new Recheio();
        botaoUsuario.setEnabled(false);
        botaoVendedor.setEnabled(false);
        botaoForma.setEnabled(false);
        botaoBackup.setEnabled(false);
        produto.desativar();
        recheio.desativar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoUsuario = new javax.swing.JButton();
        botaoCliente = new javax.swing.JButton();
        botaoVendedor = new javax.swing.JButton();
        botaoRecheio = new javax.swing.JButton();
        botaoVenda = new javax.swing.JButton();
        botaoRelatorio = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        botaoProduto = new javax.swing.JButton();
        botaoForma = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textoData = new javax.swing.JLabel();
        textoHora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoLogof = new javax.swing.JButton();
        botaoSobre = new javax.swing.JButton();
        botaoAjuda = new javax.swing.JButton();
        botaoBackup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        botaoUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/users.png"))); // NOI18N
        botaoUsuario.setText("Usuários");
        botaoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsuarioActionPerformed(evt);
            }
        });

        botaoCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/customers.png"))); // NOI18N
        botaoCliente.setText("Clientes");
        botaoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteActionPerformed(evt);
            }
        });

        botaoVendedor.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/salers.png"))); // NOI18N
        botaoVendedor.setText("Vendedores");
        botaoVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVendedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendedorActionPerformed(evt);
            }
        });

        botaoRecheio.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoRecheio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/recheio58px.png"))); // NOI18N
        botaoRecheio.setText("Recheios");
        botaoRecheio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRecheio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoRecheio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecheioActionPerformed(evt);
            }
        });

        botaoVenda.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/sales2.png"))); // NOI18N
        botaoVenda.setText("Vendas");
        botaoVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendaActionPerformed(evt);
            }
        });

        botaoRelatorio.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/reports.png"))); // NOI18N
        botaoRelatorio.setText("Relatórios");
        botaoRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Logo Chocolateria 500px.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoProduto.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/products2.png"))); // NOI18N
        botaoProduto.setText("Produtos");
        botaoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoActionPerformed(evt);
            }
        });

        botaoForma.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoForma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pagamento (1).png"))); // NOI18N
        botaoForma.setText("Forma de Pagamento");
        botaoForma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoForma.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoForma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFormaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoData.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        textoHora.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textoHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(textoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        botaoLogof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icoLogoff.png"))); // NOI18N
        botaoLogof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogofActionPerformed(evt);
            }
        });

        botaoSobre.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/sobre.png"))); // NOI18N
        botaoSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreActionPerformed(evt);
            }
        });

        botaoAjuda.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/help2.png"))); // NOI18N
        botaoAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAjuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAjudaActionPerformed(evt);
            }
        });

        botaoBackup.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/backup.png"))); // NOI18N
        botaoBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoBackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLogof, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoLogof, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSobre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAjuda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoForma)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(logo)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoForma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCliente)
                        .addGap(7, 7, 7)
                        .addComponent(botaoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRecheio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRelatorio))
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1019, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsuarioActionPerformed
        new Usuario().setVisible(true);
    }//GEN-LAST:event_botaoUsuarioActionPerformed

    private void botaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteActionPerformed
        new Cliente().setVisible(true);
    }//GEN-LAST:event_botaoClienteActionPerformed

    private void botaoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendedorActionPerformed
        new Vendedor().setVisible(true);
    }//GEN-LAST:event_botaoVendedorActionPerformed

    private void botaoRecheioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecheioActionPerformed
        new Recheio().setVisible(true);
    }//GEN-LAST:event_botaoRecheioActionPerformed

    private void botaoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaActionPerformed
        new Vendas().setVisible(true);
    }//GEN-LAST:event_botaoVendaActionPerformed

    private void botaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioActionPerformed

    }//GEN-LAST:event_botaoRelatorioActionPerformed

    private void botaoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAjudaActionPerformed
        new help().setVisible(true);
    }//GEN-LAST:event_botaoAjudaActionPerformed

    private void botaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoActionPerformed
        new Produto().setVisible(true);
    }//GEN-LAST:event_botaoProdutoActionPerformed

    private void botaoFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFormaActionPerformed
        new Formapagto().setVisible(true);
    }//GEN-LAST:event_botaoFormaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o sistema", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        Date data = new Date();
        SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
        textoData.setText(dataFormato.format(data));

        Timer time = new Timer(1000, new hora());
        time.start();
    }//GEN-LAST:event_formWindowOpened

    private void botaoLogofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogofActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair desse usuario e ir para a tela de login?", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            Login Login = new Login();
            Login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoLogofActionPerformed

    private void botaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_botaoSobreActionPerformed

    private void botaoBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBackupActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        JOptionPane.showMessageDialog(null, f.getAbsolutePath());

        Calendar calendar = Calendar.getInstance();
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        int segundo = calendar.get(Calendar.SECOND);

        String novonome = null;
        int numerodobackup = 0;
        File diretorio = new File(f.getAbsolutePath());
        File bck = new File("Backup " + ano + "-" + mes + "-" + dia + " " + hora + "h" + minuto + "m" + segundo + "s.sql");

        // Cria Arquivo de Backup    
        try {

            String comando = "C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\\mysqldump.exe";
            ProcessBuilder pb = new ProcessBuilder(comando, "--user=root", "--password=root", "chocolateria", "--result-file=" + diretorio + "\\" + bck);
            pb.start();
            JOptionPane.showMessageDialog(null, "Cópia de segurança realizada com sucesso", "Backup", JOptionPane.CLOSED_OPTION);

        } catch (IOException ex) {
            ex.printStackTrace();

            JOptionPane.showMessageDialog(null, "Copia de segurança não realizada!", "Backup", JOptionPane.CLOSED_OPTION);
        }

    }//GEN-LAST:event_botaoBackupActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAjuda;
    private javax.swing.JButton botaoBackup;
    private javax.swing.JButton botaoCliente;
    private javax.swing.JButton botaoForma;
    private javax.swing.JButton botaoLogof;
    private javax.swing.JButton botaoProduto;
    private javax.swing.JButton botaoRecheio;
    private javax.swing.JButton botaoRelatorio;
    private javax.swing.JButton botaoSobre;
    private javax.swing.JButton botaoUsuario;
    private javax.swing.JButton botaoVenda;
    private javax.swing.JButton botaoVendedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel textoData;
    private javax.swing.JLabel textoHora;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            Calendar now = Calendar.getInstance();
            textoHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }

    }

}
