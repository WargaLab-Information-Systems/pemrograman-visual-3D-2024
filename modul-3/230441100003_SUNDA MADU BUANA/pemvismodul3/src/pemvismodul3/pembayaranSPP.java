/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;

import javax.swing.JOptionPane;

public class pembayaranSPP extends javax.swing.JFrame {

    private boolean[] bulan = new boolean[12];
    int total = 0;

    public pembayaranSPP() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        namasiswa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nisnsiswa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pilihkelas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bayarspp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jan = new javax.swing.JCheckBox();
        feb = new javax.swing.JCheckBox();
        mar = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        nov = new javax.swing.JCheckBox();
        jun = new javax.swing.JCheckBox();
        agst = new javax.swing.JCheckBox();
        sep = new javax.swing.JCheckBox();
        okt = new javax.swing.JCheckBox();
        apr = new javax.swing.JCheckBox();
        jul = new javax.swing.JCheckBox();
        des = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        hitung = new javax.swing.JButton();
        bayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(203, 96, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(203, 96, 64));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel3.setText("Nama :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel3, gridBagConstraints);

        namasiswa.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(namasiswa, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel4.setText("NISN :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel4, gridBagConstraints);

        nisnsiswa.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(nisnsiswa, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel5.setText("Kelas :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel5, gridBagConstraints);

        pilihkelas.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        pilihkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "X", "XI", "XII" }));
        pilihkelas.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(pilihkelas, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel6.setText("Pembayaran :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel6, gridBagConstraints);

        bayarspp.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(bayarspp, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel7.setText("Bulan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel7, gridBagConstraints);

        jan.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jan.setText("Januari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jan, gridBagConstraints);

        feb.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        feb.setText("Februari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(feb, gridBagConstraints);

        mar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        mar.setText("Maret");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(mar, gridBagConstraints);

        mei.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        mei.setText("Mei");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(mei, gridBagConstraints);

        nov.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        nov.setText("November");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(nov, gridBagConstraints);

        jun.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jun.setText("Juni");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jun, gridBagConstraints);

        agst.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        agst.setText("Agustus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(agst, gridBagConstraints);

        sep.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        sep.setText("September");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(sep, gridBagConstraints);

        okt.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        okt.setText("Oktober");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(okt, gridBagConstraints);

        apr.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        apr.setText("April");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(apr, gridBagConstraints);

        jul.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jul.setText("Juli");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jul, gridBagConstraints);

        des.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        des.setText("Desember");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(des, gridBagConstraints);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 450, 250));

        jPanel4.setBackground(new java.awt.Color(242, 229, 191));

        detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "NISN", "Kelas", "Pembayaran", "Bulan", "Status"
            }
        ));
        jScrollPane1.setViewportView(detail);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 670, 190));

        jPanel2.setBackground(new java.awt.Color(242, 229, 191));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\karasuno.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel2.setText("KARASUNO HIGH SCHOOL");

        jLabel8.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel8.setText("Sendai City Gymnasium");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel8)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, -1));

        jPanel5.setBackground(new java.awt.Color(242, 229, 191));

        hitung.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel5.add(hitung);

        bayar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        bayar.setText("Bayar");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        jPanel5.add(bayar);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 670, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        int spp = 275000;

        if (jan.isSelected() && !bulan[0]) {
            total += spp;
        } if (feb.isSelected() && !bulan[1]) {
            total += spp;
        } if (mar.isSelected() && !bulan[2]) {
            total += spp;
        } if (apr.isSelected() && !bulan[3]) {
            total += spp;
        } if (mei.isSelected() && !bulan[4]) {
            total += spp;
        } if (jun.isSelected() && !bulan[5]) {
            total += spp;
        } if (jul.isSelected() && !bulan[6]) {
            total += spp;
        } if (agst.isSelected() && !bulan[7]) {
            total += spp;
        } if (sep.isSelected() && !bulan[8]) {
            total += spp;
        } if (okt.isSelected() && !bulan[9]) {
            total += spp;
        } if (nov.isSelected() && !bulan[10]) {
            total += spp;
        } if (des.isSelected() && !bulan[11]) {
            total += spp;
        }
        // hasil total pembayaran
        bayarspp.setText(String.valueOf(total));

        JOptionPane.showMessageDialog(this, "Total Pembayaran: Rp " + total);
    }//GEN-LAST:event_hitungActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        String nama = namasiswa.getText();  // Mengambil nama siswa
        String nisn = nisnsiswa.getText();  // Mengambil NISN siswa
        String kelas = (String) pilihkelas.getSelectedItem();  // Mengambil kelas siswa
        int pembayaranSPP = Integer.parseInt(bayarspp.getText());  // Mengambil jumlah pembayaran
        
        int spp = 275000;
        int totalHarusDibayar = 0;

        // memilih bulan untuk bayar spp
        String bulanBayar = "";
        if (jan.isSelected()) {
            bulanBayar += "Januari ";
            totalHarusDibayar += spp;
            bulan[0] = true;
        } if (feb.isSelected()) {
            bulanBayar += "Februari ";
            totalHarusDibayar += spp;
            bulan[1] = true;
        } if (mar.isSelected()) {
            bulanBayar += "Maret ";
            totalHarusDibayar += spp;
            bulan[2] = true;
        } if (apr.isSelected()) {
            bulanBayar += "April ";
            totalHarusDibayar += spp;
            bulan[3] = true;
        } if (mei.isSelected()) {
            bulanBayar += "Mei ";
            totalHarusDibayar += spp;
            bulan[4] = true;
        } if (jun.isSelected()) {
            bulanBayar += "Juni ";
            totalHarusDibayar += spp;
            bulan[5] = true;
        } if (jul.isSelected()) {
            bulanBayar += "Juli ";
            totalHarusDibayar += spp;
           bulan[6] = true;
        } if (agst.isSelected()) {
            bulanBayar += "Agustus ";
            totalHarusDibayar += spp;
            bulan[7] = true;
        } if (sep.isSelected()) {
            bulanBayar += "September ";
            totalHarusDibayar += spp;
            bulan[8] = true;
        } if (okt.isSelected()) {
            bulanBayar += "Oktober ";
            totalHarusDibayar += spp;
            bulan[9] = true;
        } if (nov.isSelected()) {
            bulanBayar += "November ";
            totalHarusDibayar += spp;
            bulan[10] = true;
        } if (des.isSelected()) {
            bulanBayar += "Desember ";
            totalHarusDibayar += spp;
            bulan[11] = true;
        }

        // Menentukan status pembayaran
        String status;
        int kembalian = pembayaranSPP - totalHarusDibayar;  // Menghitung kembalian

        if (kembalian >= 0) {
            status = "Lunas";  // Jika jumlah bayar sesuai atau lebih dari total
            if (kembalian > 0) {
                JOptionPane.showMessageDialog(this, "Pembayaran berhasil!\nStatus: " + status + "\nUang Kembalian: Rp " + kembalian);
            } else {
                JOptionPane.showMessageDialog(this, "Pembayaran berhasil!\nStatus: " + status);
            }
        } else {
            status = "Belum Lunas";  // Jika jumlah bayar kurang dari total
            JOptionPane.showMessageDialog(this, "Pembayaran berhasil!\nStatus: " + status);
        }
        
        // Tambahkan data ke tabel
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) detail.getModel();
        model.addRow(new Object[]{nama, nisn, kelas, pembayaranSPP, bulanBayar, status});
        
        namasiswa.setText("");
        nisnsiswa.setText("");
        pilihkelas.setSelectedIndex(0);
        bayarspp.setText("");
        jan.setSelected(false);
        feb.setSelected(false);
        mar.setSelected(false);
        apr.setSelected(false);
        mei.setSelected(false);
        jun.setSelected(false);
        jul.setSelected(false);
        agst.setSelected(false);
        sep.setSelected(false);
        okt.setSelected(false);
        nov.setSelected(false);
        des.setSelected(false);
    }//GEN-LAST:event_bayarActionPerformed

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
            java.util.logging.Logger.getLogger(pembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaranSPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agst;
    private javax.swing.JCheckBox apr;
    private javax.swing.JButton bayar;
    private javax.swing.JTextField bayarspp;
    private javax.swing.JCheckBox des;
    private javax.swing.JTable detail;
    private javax.swing.JCheckBox feb;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jan;
    private javax.swing.JCheckBox jul;
    private javax.swing.JCheckBox jun;
    private javax.swing.JCheckBox mar;
    private javax.swing.JCheckBox mei;
    private javax.swing.JTextField namasiswa;
    private javax.swing.JTextField nisnsiswa;
    private javax.swing.JCheckBox nov;
    private javax.swing.JCheckBox okt;
    private javax.swing.JComboBox<String> pilihkelas;
    private javax.swing.JCheckBox sep;
    // End of variables declaration//GEN-END:variables
}
