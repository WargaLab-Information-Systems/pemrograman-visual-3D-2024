/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulir.pendaftaran;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class formulir extends javax.swing.JFrame {

    
    private Tampilanformulir tampilanformulir;
    
    public formulir() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Lnama = new javax.swing.JLabel();
        Ltempatlahir = new javax.swing.JLabel();
        Ltanggallahir = new javax.swing.JLabel();
        Ljeniskelamin = new javax.swing.JLabel();
        Lalamat = new javax.swing.JLabel();
        Lnotlp = new javax.swing.JLabel();
        Lemail = new javax.swing.JLabel();
        Lprodi = new javax.swing.JLabel();
        Lfakultas = new javax.swing.JLabel();
        Txtnama = new javax.swing.JTextField();
        Txttempatlahir = new javax.swing.JTextField();
        Txttanggallahir = new javax.swing.JTextField();
        Txtalamat = new javax.swing.JTextField();
        Txtnotelp = new javax.swing.JTextField();
        Txtemail = new javax.swing.JTextField();
        Txtprodi = new javax.swing.JTextField();
        btnlakilaki = new javax.swing.JRadioButton();
        btnperempuan = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnbatal = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("FORMULIR PENDAFTARAN MAHASISWA");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("UNIVERSITAS TRUNOJOYO MADURA");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Jl. Raya Telang PO. Box. 2 Kamal, Bangkalan-Madura");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Telp : (031) 3011146, Fax. (031) 3011506");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulir/pendaftaran/logo_warga_lab-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Lnama.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Lnama.setForeground(new java.awt.Color(255, 255, 255));
        Lnama.setText("Nama :");

        Ltempatlahir.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Ltempatlahir.setForeground(new java.awt.Color(255, 255, 255));
        Ltempatlahir.setText("Tempat Lahir :");

        Ltanggallahir.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Ltanggallahir.setForeground(new java.awt.Color(255, 255, 255));
        Ltanggallahir.setText("Tanggal Lahir :");

        Ljeniskelamin.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Ljeniskelamin.setForeground(new java.awt.Color(255, 255, 255));
        Ljeniskelamin.setText("Jenis Kelamin :");

        Lalamat.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Lalamat.setForeground(new java.awt.Color(255, 255, 255));
        Lalamat.setText("Alamat :");

        Lnotlp.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Lnotlp.setForeground(new java.awt.Color(255, 255, 255));
        Lnotlp.setText("No. Telp. :");

        Lemail.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Lemail.setForeground(new java.awt.Color(255, 255, 255));
        Lemail.setText("Email :");

        Lprodi.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Lprodi.setForeground(new java.awt.Color(255, 255, 255));
        Lprodi.setText("Prodi :");

        Lfakultas.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        Lfakultas.setForeground(new java.awt.Color(255, 255, 255));
        Lfakultas.setText("Fakultas :");

        Txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtnamaActionPerformed(evt);
            }
        });

        Txttempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxttempatlahirActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnlakilaki);
        btnlakilaki.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        btnlakilaki.setForeground(new java.awt.Color(255, 255, 255));
        btnlakilaki.setText("Laki-Laki");
        btnlakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlakilakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnperempuan);
        btnperempuan.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        btnperempuan.setForeground(new java.awt.Color(255, 255, 255));
        btnperempuan.setText("Perempuan");
        btnperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperempuanActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Data Yang Saya Masukkan Sudah Benar.");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnbatal.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnsimpan.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fakulats Teknik", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnbatal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnreset))
                                .addComponent(jCheckBox1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                            .addComponent(btnsimpan))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Lnama, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Ltempatlahir)
                                        .addComponent(Ltanggallahir)
                                        .addComponent(Ljeniskelamin))
                                    .addGap(26, 26, 26))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Lalamat)
                                    .addGap(64, 64, 64)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnlakilaki)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnperempuan)
                                    .addGap(101, 101, 101))
                                .addComponent(Txtnama)
                                .addComponent(Txttempatlahir)
                                .addComponent(Txttanggallahir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Lnotlp)
                                    .addGap(49, 49, 49))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Lemail)
                                    .addGap(68, 68, 68))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Lprodi)
                                    .addGap(68, 68, 68)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lfakultas)
                                .addGap(53, 53, 53)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txtprodi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(Txtnotelp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Txtalamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnama)
                    .addComponent(Txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ltempatlahir)
                    .addComponent(Txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ltanggallahir)
                    .addComponent(Txttanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ljeniskelamin)
                    .addComponent(btnlakilaki)
                    .addComponent(btnperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lalamat)
                    .addComponent(Txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnotlp)
                    .addComponent(Txtnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lemail)
                    .addComponent(Txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lprodi)
                    .addComponent(Txtprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lfakultas)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbatal)
                    .addComponent(btnreset)
                    .addComponent(btnsimpan))
                .addGap(0, 93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxttempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxttempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxttempatlahirActionPerformed

    private void btnlakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlakilakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlakilakiActionPerformed

    private void btnperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnperempuanActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void TxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtnamaActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
    dispose();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    Txtnama.setText(""); 
    Txttempatlahir.setText("");
    Txttanggallahir.setText("");
    buttonGroup1.clearSelection();
    Txtalamat.setText("");
    jComboBox1.setSelectedIndex(0);
    Txtnotelp.setText("");
    Txtemail.setText("");
    Txtprodi.setText(""); 
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
    if (jCheckBox1.isSelected()){
        String nama =Txtnama.getText();
        String tempatlahir =Txttempatlahir.getText();
        String tanggallahir=Txttanggallahir.getText();
        String jeniskelamin= btnlakilaki.isSelected() ? "laki laki" : "perempuan";
        String alamat=Txtalamat.getText();
        String notelp=Txtnotelp.getText();
        String email=Txtemail.getText();
        String prodi=Txtprodi.getText();
        String fakultas=jComboBox1.getSelectedItem().toString();
        
        
        tampilanformulir = new Tampilanformulir(nama,tempatlahir,tanggallahir,jeniskelamin,alamat,notelp,email,prodi,fakultas);
        tampilanformulir.setVisible(true);
        
    }else{
        JOptionPane.showMessageDialog(this, "Harap konfirmasi Kebenaran Data Dengan Mencentang Kotak.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lalamat;
    private javax.swing.JLabel Lemail;
    private javax.swing.JLabel Lfakultas;
    private javax.swing.JLabel Ljeniskelamin;
    private javax.swing.JLabel Lnama;
    private javax.swing.JLabel Lnotlp;
    private javax.swing.JLabel Lprodi;
    private javax.swing.JLabel Ltanggallahir;
    private javax.swing.JLabel Ltempatlahir;
    private javax.swing.JTextField Txtalamat;
    private javax.swing.JTextField Txtemail;
    private javax.swing.JTextField Txtnama;
    private javax.swing.JTextField Txtnotelp;
    private javax.swing.JTextField Txtprodi;
    private javax.swing.JTextField Txttanggallahir;
    private javax.swing.JTextField Txttempatlahir;
    private javax.swing.JButton btnbatal;
    private javax.swing.JRadioButton btnlakilaki;
    private javax.swing.JRadioButton btnperempuan;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
