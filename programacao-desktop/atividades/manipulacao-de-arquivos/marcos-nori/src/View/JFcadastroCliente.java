/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TxtCliente;
import Controller.CreateBinCliente;
import Controller.GsonCliente;
import Controller.ReadBinFile;
import Object.Cliente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class JFcadastroCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFcadastroCliente
     */
    public JFcadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ccliente = new javax.swing.JLabel();
        ccpf = new javax.swing.JLabel();
        cendereco = new javax.swing.JLabel();
        ccidade = new javax.swing.JLabel();
        cemail = new javax.swing.JLabel();
        clientNome = new javax.swing.JTextField();
        clienteEnd = new javax.swing.JTextField();
        clienteCidade = new javax.swing.JTextField();
        clienteEmail = new javax.swing.JTextField();
        ctelefone = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        clienteCpf = new javax.swing.JFormattedTextField();
        clienteTelefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jToggleButtonSalvarArqTxt = new javax.swing.JToggleButton();
        jToggleButtonSalvarArqBin = new javax.swing.JToggleButton();
        jToggleButtonRecuperarArqTxt = new javax.swing.JToggleButton();
        jToggleButtonSalvarArqGson = new javax.swing.JToggleButton();
        jToggleButtonRecuperarArqBin = new javax.swing.JToggleButton();
        jToggleButtonRecuperarArqGson1 = new javax.swing.JToggleButton();

        jLabel6.setText("jLabel6");

        jTextField6.setText("jTextField6");

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        ccliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccliente.setText("Nome");

        ccpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccpf.setText("CPF");

        cendereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cendereco.setText("Endereço");

        ccidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccidade.setText("Cidade");

        cemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cemail.setText("Email");

        clientNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clientNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNomeActionPerformed(evt);
            }
        });

        clienteEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        clienteCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clienteCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteCidadeActionPerformed(evt);
            }
        });

        clienteEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ctelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ctelefone.setText("Telefone");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Voltar Menu");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cart.png"))); // NOI18N
        jLabel9.setText("SUPERMERCADOS SUPER NOSSSO  CADASTRE-SE E RECEBA DESCONTOS VARIADOS");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToggleButton1.setText("SALVAR");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/comprasFuturo.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        try {
            clienteCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        clienteCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteCpfActionPerformed(evt);
            }
        });

        try {
            clienteTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)###-##-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delivery.png"))); // NOI18N
        jLabel8.setText("ENTREGAMOS SUAS COMPRAS COM RAPIDES ");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToggleButtonSalvarArqTxt.setText("Salvar Arquivo Texto");
        jToggleButtonSalvarArqTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonSalvarArqTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSalvarArqTxtActionPerformed(evt);
            }
        });

        jToggleButtonSalvarArqBin.setText("Salvar Arquivo Bin");
        jToggleButtonSalvarArqBin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonSalvarArqBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSalvarArqBinActionPerformed(evt);
            }
        });

        jToggleButtonRecuperarArqTxt.setText("Recuperar Arquivo Texto");
        jToggleButtonRecuperarArqTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonRecuperarArqTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRecuperarArqTxtActionPerformed(evt);
            }
        });

        jToggleButtonSalvarArqGson.setText("Salvar Arquivo Gson");
        jToggleButtonSalvarArqGson.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonSalvarArqGson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSalvarArqGsonActionPerformed(evt);
            }
        });

        jToggleButtonRecuperarArqBin.setText("Recuperar Arquivo Bin");
        jToggleButtonRecuperarArqBin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonRecuperarArqBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRecuperarArqBinActionPerformed(evt);
            }
        });

        jToggleButtonRecuperarArqGson1.setText("Recuperar Arquivo Gson");
        jToggleButtonRecuperarArqGson1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonRecuperarArqGson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRecuperarArqGson1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ccpf)
                            .addComponent(ccliente)
                            .addComponent(cendereco)
                            .addComponent(ccidade)
                            .addComponent(cemail)
                            .addComponent(ctelefone))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clienteEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clientNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(clienteTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(clienteEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButtonSalvarArqTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRecuperarArqTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonSalvarArqGson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonSalvarArqBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRecuperarArqBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRecuperarArqGson1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(159, 159, 159))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jToggleButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccliente)
                    .addComponent(clientNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccpf)
                    .addComponent(clienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cendereco)
                    .addComponent(clienteEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccidade)
                    .addComponent(clienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cemail)
                    .addComponent(clienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctelefone)
                    .addComponent(clienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jToggleButtonSalvarArqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonRecuperarArqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jToggleButtonSalvarArqGson, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonRecuperarArqGson1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jToggleButtonSalvarArqBin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonRecuperarArqBin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jToggleButton1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteCidadeActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(clientNome.getText().equals("")){
             JOptionPane.showMessageDialog(ccliente, "O campo NOME está vazio");
        }if(clienteCpf.getText().equals("")){
            JOptionPane.showMessageDialog(ccpf, "O campo CPF está vazio");
        }if(clienteCidade.getText().equals("")){
            JOptionPane.showMessageDialog(ccidade, "O campo CIDADE está vazio");  
        }if(clienteEnd.getText().equals("")){
            JOptionPane.showMessageDialog(cendereco, "O campo ENDERECO está vazio");
        }if(clienteEmail.getText().equals("")){
             JOptionPane.showMessageDialog(cemail, "O campo EMAIL está vazio");
        }if(clienteTelefone.getText().equals("")){
             JOptionPane.showMessageDialog(ctelefone, "O campo TELEFONE está vazio");
        }
        JOptionPane.showConfirmDialog(null, "VOCE DESEJA SALVAR CADASTRO ");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void clienteCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteCpfActionPerformed

    private void jToggleButtonSalvarArqTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSalvarArqTxtActionPerformed
         Cliente c = new Cliente();
        c = getValoresFront();
         TxtCliente be = new TxtCliente();
        try {
            be.salvaTexto(c);
            limparCampos();
        } catch (IOException ex) {
            Logger.getLogger(JFcadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonSalvarArqTxtActionPerformed

    private void jToggleButtonSalvarArqBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSalvarArqBinActionPerformed
        // TODO add your handling code here:
        CreateBinCliente binCliente = new CreateBinCliente();
        Cliente cli = new Cliente();
        cli = getValoresFront();
        binCliente.addRecords(cli);
        limparCampos();
    }//GEN-LAST:event_jToggleButtonSalvarArqBinActionPerformed

    private void jToggleButtonRecuperarArqTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRecuperarArqTxtActionPerformed
        Cliente c = new Cliente();
        TxtCliente be = new TxtCliente();
        try {
            limparCampos();
            c = be.lerTexto();
            setValoresFront(c);
            
        } catch (IOException ex) {
            Logger.getLogger(JFcadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonRecuperarArqTxtActionPerformed

    private void jToggleButtonSalvarArqGsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSalvarArqGsonActionPerformed
         GsonCliente cl = new GsonCliente();
        String convertJSON = cl.convertToJSON(getValoresFront());
        cl.saveJSON("./JsonEvento.json", convertJSON);
        limparCampos();        
    }//GEN-LAST:event_jToggleButtonSalvarArqGsonActionPerformed

    private void jToggleButtonRecuperarArqBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRecuperarArqBinActionPerformed
        // TODO add your handling code here:
        limparCampos();
        ReadBinFile readBin = new ReadBinFile();
        Cliente cli = new Cliente();
        try {
            cli = readBin.readRecords();
            setValoresFront(cli);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(JFcadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonRecuperarArqBinActionPerformed

    private void clientNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFMenu_principal frame = new JFMenu_principal();

        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButtonRecuperarArqGson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRecuperarArqGson1ActionPerformed
        GsonCliente cl = new GsonCliente();
        Cliente c =  new Cliente();
        c = cl.converToPerson(cl.loadJSON("./JsonEvento.json"));
        limparCampos();
        setValoresFront(c);        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonRecuperarArqGson1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ccidade;
    private javax.swing.JLabel ccliente;
    private javax.swing.JLabel ccpf;
    private javax.swing.JLabel cemail;
    private javax.swing.JLabel cendereco;
    private javax.swing.JTextField clientNome;
    private javax.swing.JTextField clienteCidade;
    private javax.swing.JFormattedTextField clienteCpf;
    private javax.swing.JTextField clienteEmail;
    private javax.swing.JTextField clienteEnd;
    private javax.swing.JFormattedTextField clienteTelefone;
    private javax.swing.JLabel ctelefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButtonRecuperarArqBin;
    private javax.swing.JToggleButton jToggleButtonRecuperarArqGson1;
    private javax.swing.JToggleButton jToggleButtonRecuperarArqTxt;
    private javax.swing.JToggleButton jToggleButtonSalvarArqBin;
    private javax.swing.JToggleButton jToggleButtonSalvarArqGson;
    private javax.swing.JToggleButton jToggleButtonSalvarArqTxt;
    // End of variables declaration//GEN-END:variables

    public void limparCampos()
    {
        clientNome.setText("");
        clienteCpf.setText("");
        clienteCidade.setText("");
        clienteEnd.setText("");
        clienteEmail.setText("");
        clienteTelefone.setText("");
    }
    public void setValoresFront(Cliente c)
    {
        clientNome.setText(c.getNome());
        clienteCpf.setText(c.getCpf());
        clienteCidade.setText(c.getCidade());
        clienteEnd.setText(c.getEndereco());
        clienteEmail.setText(c.getEmail());
        clienteTelefone.setText(c.getTelefone());
    }
    public Cliente getValoresFront()
    {
        Cliente c = new Cliente();
        c.setNome(clientNome.getText());
        c.setCpf(clienteCpf.getText());
        c.setCidade(clienteCidade.getText());
        c.setEndereco(clienteEnd.getText());
        c.setEmail(clienteEmail.getText());
        c.setTelefone(clienteTelefone.getText());
        return c;
        
    }
}
