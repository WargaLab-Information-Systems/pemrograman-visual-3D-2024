package pemvismodul3;

import javax.swing.JOptionPane;
public class spp extends javax.swing.JFrame {

    private boolean[] bulan = new boolean[12];
    int total = 0;

    public spp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        namasiswa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nisnsiswa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pilihkelas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pembayaran = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jan = new javax.swing.JCheckBox();
        feb = new javax.swing.JCheckBox();
        mar = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        ap = new javax.swing.JCheckBox();
        jun = new javax.swing.JCheckBox();
        jul = new javax.swing.JCheckBox();
        agst = new javax.swing.JCheckBox();
        sep = new javax.swing.JCheckBox();
        okt = new javax.swing.JCheckBox();
        nov = new javax.swing.JCheckBox();
        des = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        bayar = new javax.swing.JButton();
        hitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(225, 172, 172));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(202, 135, 135));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PEMBAYARAN SPP KARASUNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 60));

        jPanel2.setBackground(new java.awt.Color(202, 135, 135));

        detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "NISN", "Kelas", "Pembayaran SPP", "Bulan", "Status"
            }
        ));
        detail.setToolTipText("");
        jScrollPane1.setViewportView(detail);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 630, 200));

        jPanel3.setBackground(new java.awt.Color(202, 135, 135));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel2, gridBagConstraints);

        namasiswa.setPreferredSize(new java.awt.Dimension(300, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        jPanel3.add(namasiswa, gridBagConstraints);

        jLabel3.setText("NISN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel3, gridBagConstraints);

        nisnsiswa.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        jPanel3.add(nisnsiswa, gridBagConstraints);

        jLabel4.setText("Kelas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel4, gridBagConstraints);

        pilihkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih", "X", "XI", "XII" }));
        pilihkelas.setPreferredSize(new java.awt.Dimension(75, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(pilihkelas, gridBagConstraints);

        jLabel5.setText("Pembayaran");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel5, gridBagConstraints);

        pembayaran.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(pembayaran, gridBagConstraints);

        jLabel6.setText("Bulan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel6, gridBagConstraints);

        jan.setText("Januari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jan, gridBagConstraints);

        feb.setText("Februari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(feb, gridBagConstraints);

        mar.setText("Maret");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(mar, gridBagConstraints);

        mei.setText("Mei");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(mei, gridBagConstraints);

        ap.setText("April");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(ap, gridBagConstraints);

        jun.setText("Juni");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jun, gridBagConstraints);

        jul.setText("Juli");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jul, gridBagConstraints);

        agst.setText("Agustus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(agst, gridBagConstraints);

        sep.setText("September");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(sep, gridBagConstraints);

        okt.setText("Oktober");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(okt, gridBagConstraints);

        nov.setText("November");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(nov, gridBagConstraints);

        des.setText("Desember");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(des, gridBagConstraints);

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 630, 260));

        jPanel5.setBackground(new java.awt.Color(202, 135, 135));

        bayar.setText("Bayar");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        jPanel5.add(bayar);

        hitung.setText("hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel5.add(hitung);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 630, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        int spp = 275000;

        if (jan.isSelected() && !bulan[0]) {
            total += spp;
        }
        if (feb.isSelected() && !bulan[1]) {
            total += spp;
        }
        if (mar.isSelected() && !bulan[2]) {
            total += spp;
        }
        if (ap.isSelected() && !bulan[3]) {
            total += spp;
        }
        if (mei.isSelected() && !bulan[4]) {
            total += spp;
        }
        if (jun.isSelected() && !bulan[5]) {
            total += spp;
        }
        if (jul.isSelected() && !bulan[6]) {
            total += spp;
        }
        if (agst.isSelected() && !bulan[7]) {
            total += spp;
        }
        if (sep.isSelected() && !bulan[8]) {
            total += spp;
        }
        if (okt.isSelected() && !bulan[9]) {
            total += spp;
        }
        if (nov.isSelected() && !bulan[10]) {
            total += spp;
        }
        if (des.isSelected() && !bulan[11]) {
            total += spp;
        }

        // hasil total pembayaran
        pembayaran.setText(String.valueOf(total));

        JOptionPane.showMessageDialog(this, "Total Pembayaran: Rp " + total);
    }//GEN-LAST:event_hitungActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        String nama = namasiswa.getText();  // Mengambil nama siswa
        String nisn = nisnsiswa.getText();  // Mengambil NISN siswa
        String kelas = (String) pilihkelas.getSelectedItem();  // Mengambil kelas siswa
        int pembayaranSPP = Integer.parseInt(pembayaran.getText());  // Mengambil jumlah pembayaran
        
        int spp = 275000;
        int totalHarusDibayar = 0;

        // memilih bulan untuk bayar spp
        String bulanBayar = "";
        if (jan.isSelected()) {
            bulanBayar += "Januari ";
            totalHarusDibayar += spp;
            bulan[0] = true;
        }
        if (feb.isSelected()) {
            bulanBayar += "Februari ";
            totalHarusDibayar += spp;
            bulan[1] = true;
        }
        if (mar.isSelected()) {
            bulanBayar += "Maret ";
            totalHarusDibayar += spp;
            bulan[2] = true;
        }
        if (ap.isSelected()) {
            bulanBayar += "April ";
            totalHarusDibayar += spp;
            bulan[3] = true;
        }
        if (mei.isSelected()) {
            bulanBayar += "Mei ";
            totalHarusDibayar += spp;
            bulan[4] = true;
        }
        if (jun.isSelected()) {
            bulanBayar += "Juni ";
            totalHarusDibayar += spp;
            bulan[5] = true;
        }
        if (jul.isSelected()) {
            bulanBayar += "Juli ";
            totalHarusDibayar += spp;
           bulan[6] = true;
        }
        if (agst.isSelected()) {
            bulanBayar += "Agustus ";
            totalHarusDibayar += spp;
            bulan[7] = true;
        }
        if (sep.isSelected()) {
            bulanBayar += "September ";
            totalHarusDibayar += spp;
            bulan[8] = true;
        }
        if (okt.isSelected()) {
            bulanBayar += "Oktober ";
            totalHarusDibayar += spp;
            bulan[9] = true;
        }
        if (nov.isSelected()) {
            bulanBayar += "November ";
            totalHarusDibayar += spp;
            bulan[10] = true;
        }
        if (des.isSelected()) {
            bulanBayar += "Desember ";
            totalHarusDibayar += spp;
            bulan[11] = true;
        }

        // Menentukan status pembayaran
        String status;
        if (pembayaranSPP >= totalHarusDibayar) {
            status = "Lunas";  // Jika jumlah bayar sesuai atau lebih dari total
        } else {
            status = "Belum Lunas";  // Jika jumlah bayar kurang dari total
        }
        JOptionPane.showMessageDialog(this, "Pembayaran berhasil!\nStatus: " + status);
        
        // Tambahkan data ke tabel
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) detail.getModel();
        model.addRow(new Object[]{nama, nisn, kelas, pembayaranSPP, bulanBayar, status});
        
        namasiswa.setText("");
        nisnsiswa.setText("");
        pilihkelas.setSelectedIndex(0);
        pembayaran.setText("");
        jan.setSelected(false);
        feb.setSelected(false);
        mar.setSelected(false);
        ap.setSelected(false);
        mei.setSelected(false);
        jun.setSelected(false);
        jul.setSelected(false);
        agst.setSelected(false);
        sep.setSelected(false);
        okt.setSelected(false);
        nov.setSelected(false);
        des.setSelected(false);
    }//GEN-LAST:event_bayarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agst;
    private javax.swing.JCheckBox ap;
    private javax.swing.JButton bayar;
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
    private javax.swing.JTextField pembayaran;
    private javax.swing.JComboBox<String> pilihkelas;
    private javax.swing.JCheckBox sep;
    // End of variables declaration//GEN-END:variables
}
