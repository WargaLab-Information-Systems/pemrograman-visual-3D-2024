
package tugaspraktikum3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PembayaranSPP extends javax.swing.JFrame {
boolean[] statusPembayaranBulan = new boolean[12];
    // Tambahkan variabel global untuk menyimpan data siswa
    private String namaSiswa = "";
    private String kelasSiswa = "";
    private String nisnSiswa = "";
    
    
    

    public PembayaranSPP() {
        initComponents();
        tfpmbyrn.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                penghitungan();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        maret = new javax.swing.JCheckBox();
        pAtas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pBawah = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        tfkelas = new javax.swing.JTextField();
        tfnisn = new javax.swing.JTextField();
        btndata = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelstatus = new javax.swing.JTable();
        btnstatus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        januari = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        maaret = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        tftotal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfpmbyrn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfkembali = new javax.swing.JTextField();
        btnpmbyrn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taRiwayat = new javax.swing.JTextArea();
        btnriwayat = new javax.swing.JButton();

        maret.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maret.setForeground(new java.awt.Color(0, 0, 0));
        maret.setText("Maret");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pAtas.setBackground(new java.awt.Color(102, 0, 0));
        pAtas.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran SPP");
        pAtas.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SD Pamekasan ");
        pAtas.add(jLabel2);

        getContentPane().add(pAtas, java.awt.BorderLayout.PAGE_START);

        pBawah.setBackground(new java.awt.Color(255, 255, 255));
        pBawah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nama :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Kelas :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("NISN :");

        tfnama.setBackground(new java.awt.Color(102, 0, 0));
        tfnama.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfnama.setForeground(new java.awt.Color(255, 255, 255));

        tfkelas.setBackground(new java.awt.Color(102, 0, 0));
        tfkelas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfkelas.setForeground(new java.awt.Color(255, 255, 255));

        tfnisn.setBackground(new java.awt.Color(102, 0, 0));
        tfnisn.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfnisn.setForeground(new java.awt.Color(255, 255, 255));

        btndata.setBackground(new java.awt.Color(102, 0, 0));
        btndata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndata.setForeground(new java.awt.Color(255, 255, 255));
        btndata.setText("Kirim");
        btndata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndataActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Data Siswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addComponent(tfkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addGap(21, 21, 21)
                .addComponent(tfnisn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btndata))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(tfkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(tfnisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btndata, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pBawah.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 260, 161));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Status Pembayaran");

        tabelstatus.setBackground(new java.awt.Color(102, 0, 0));
        tabelstatus.setForeground(new java.awt.Color(255, 255, 255));
        tabelstatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Bulan", "Status Pembayaran"
            }
        ));
        jScrollPane1.setViewportView(tabelstatus);

        btnstatus.setBackground(new java.awt.Color(102, 0, 0));
        btnstatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnstatus.setForeground(new java.awt.Color(255, 255, 255));
        btnstatus.setText("cek Status");
        btnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnstatus)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pBawah.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 12, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(6, 2));

        januari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        januari.setForeground(new java.awt.Color(0, 0, 0));
        januari.setText("Januari");
        jPanel5.add(januari);

        juli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        juli.setForeground(new java.awt.Color(0, 0, 0));
        juli.setText("Juli");
        jPanel5.add(juli);

        februari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        februari.setForeground(new java.awt.Color(0, 0, 0));
        februari.setText("Februari");
        jPanel5.add(februari);

        agustus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agustus.setForeground(new java.awt.Color(0, 0, 0));
        agustus.setText("Agustus");
        jPanel5.add(agustus);

        maaret.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maaret.setForeground(new java.awt.Color(0, 0, 0));
        maaret.setText("Maret");
        jPanel5.add(maaret);

        september.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        september.setForeground(new java.awt.Color(0, 0, 0));
        september.setText("September");
        jPanel5.add(september);

        april.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        april.setForeground(new java.awt.Color(0, 0, 0));
        april.setText("April");
        jPanel5.add(april);

        oktober.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        oktober.setForeground(new java.awt.Color(0, 0, 0));
        oktober.setText("Oktober");
        jPanel5.add(oktober);

        mei.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mei.setForeground(new java.awt.Color(0, 0, 0));
        mei.setText("Mei");
        jPanel5.add(mei);

        november.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        november.setForeground(new java.awt.Color(0, 0, 0));
        november.setText("November");
        jPanel5.add(november);

        juni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        juni.setForeground(new java.awt.Color(0, 0, 0));
        juni.setText("Juni");
        jPanel5.add(juni);

        desember.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        desember.setForeground(new java.awt.Color(0, 0, 0));
        desember.setText("Desember");
        jPanel5.add(desember);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pilihan Bulan ");

        btntotal.setBackground(new java.awt.Color(102, 0, 0));
        btntotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntotal.setForeground(new java.awt.Color(255, 255, 255));
        btntotal.setText("Hitung");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        tftotal.setBackground(new java.awt.Color(102, 0, 0));
        tftotal.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tftotal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tftotal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pBawah.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 12, -1, 323));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pembayaran ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Bayar");

        tfpmbyrn.setBackground(new java.awt.Color(102, 0, 0));
        tfpmbyrn.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfpmbyrn.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Kembalian :");

        tfkembali.setBackground(new java.awt.Color(102, 0, 0));
        tfkembali.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfkembali.setForeground(new java.awt.Color(255, 255, 255));

        btnpmbyrn.setBackground(new java.awt.Color(102, 0, 0));
        btnpmbyrn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnpmbyrn.setForeground(new java.awt.Color(255, 255, 255));
        btnpmbyrn.setText("Kirim ");
        btnpmbyrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpmbyrnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel5))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addComponent(tfpmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(tfkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnpmbyrn))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(tfpmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(tfkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnpmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pBawah.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 179, 258, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        taRiwayat.setBackground(new java.awt.Color(102, 0, 0));
        taRiwayat.setColumns(20);
        taRiwayat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        taRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        taRiwayat.setRows(5);
        jScrollPane2.setViewportView(taRiwayat);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 243;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 7);
        jPanel4.add(jScrollPane2, gridBagConstraints);

        btnriwayat.setBackground(new java.awt.Color(102, 0, 0));
        btnriwayat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnriwayat.setForeground(new java.awt.Color(255, 255, 255));
        btnriwayat.setText("Riwayat Pembayaran");
        btnriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriwayatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 123, 7, 7);
        jPanel4.add(btnriwayat, gridBagConstraints);

        pBawah.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 192, 279, 140));

        getContentPane().add(pBawah, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void penghitungan() {
    
        try {
            double pembayaran = Double.parseDouble(tftotal.getText()); 
            double uangmasuk = Double.parseDouble(tfpmbyrn.getText()); 
            double kembalian = uangmasuk - pembayaran;

            if (kembalian >= 0) {
                tfkembali.setText(String.valueOf(kembalian)); 
            } else {
                tfkembali.setText("Uang Tidak Cukup"); 
            }
        } catch (NumberFormatException e) {
            tfkembali.setText(""); 
        }
    }
    private void btndataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndataActionPerformed

        String nama = tfnama.getText();
        String kelas = tfkelas.getText();
        String nisn = tfnisn.getText();


        if (nama.isEmpty() || kelas.isEmpty() || nisn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap mengisi semua data siswa!");
        } else {
            namaSiswa = nama;
            kelasSiswa = kelas;
            nisnSiswa = nisn;

            tfnama.setText("");
            tfkelas.setText("");
            tfnisn.setText("");

            JOptionPane.showMessageDialog(null, "Data siswa berhasil dikirim!");
        }
    }//GEN-LAST:event_btndataActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed

        if (namaSiswa.isEmpty() || kelasSiswa.isEmpty() || nisnSiswa.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harap mengisi data siswa terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
        }

        // Periksa dan nonaktifkan checkbox untuk bulan yang sudah lunas
        if (statusPembayaranBulan[0]) {
            januari.setEnabled(false);
            januari.setSelected(false); // Deselect jika sudah lunas
        }
        if (statusPembayaranBulan[1]) {
            februari.setEnabled(false);
            februari.setSelected(false);
        }
        if (statusPembayaranBulan[2]) {
            maaret.setEnabled(false);
            maaret.setSelected(false);
        }
        if (statusPembayaranBulan[3]) {
            april.setEnabled(false);
            april.setSelected(false);
        }
        if (statusPembayaranBulan[4]) {
            mei.setEnabled(false);
            mei.setSelected(false);
        }
        if (statusPembayaranBulan[5]) {
            juni.setEnabled(false);
            juni.setSelected(false);
        }
        if (statusPembayaranBulan[6]) {
            juli.setEnabled(false);
            juli.setSelected(false);
        }
        if (statusPembayaranBulan[7]) {
            agustus.setEnabled(false);
            agustus.setSelected(false);
        }
        if (statusPembayaranBulan[8]) {
            september.setEnabled(false);
            september.setSelected(false);
        }
        if (statusPembayaranBulan[9]) {
            oktober.setEnabled(false);
            oktober.setSelected(false);
        }
        if (statusPembayaranBulan[10]) {
            november.setEnabled(false);
            november.setSelected(false);
        }
        if (statusPembayaranBulan[11]) {
            desember.setEnabled(false);
            desember.setSelected(false);
        }

        try {
            double sppPerBulan = 500000; 
            int jumlahBulanDipilih = 0;

            // Cek bulan yang dipilih dan tidak lunas
            if (januari.isSelected() && !statusPembayaranBulan[0]) jumlahBulanDipilih++;
            if (februari.isSelected() && !statusPembayaranBulan[1]) jumlahBulanDipilih++;
            if (maaret.isSelected() && !statusPembayaranBulan[2]) jumlahBulanDipilih++;
            if (april.isSelected() && !statusPembayaranBulan[3]) jumlahBulanDipilih++;
            if (mei.isSelected() && !statusPembayaranBulan[4]) jumlahBulanDipilih++;
            if (juni.isSelected() && !statusPembayaranBulan[5]) jumlahBulanDipilih++;
            if (juli.isSelected() && !statusPembayaranBulan[6]) jumlahBulanDipilih++;
            if (agustus.isSelected() && !statusPembayaranBulan[7]) jumlahBulanDipilih++;
            if (september.isSelected() && !statusPembayaranBulan[8]) jumlahBulanDipilih++;
            if (oktober.isSelected() && !statusPembayaranBulan[9]) jumlahBulanDipilih++;
            if (november.isSelected() && !statusPembayaranBulan[10]) jumlahBulanDipilih++;
            if (desember.isSelected() && !statusPembayaranBulan[11]) jumlahBulanDipilih++;

            // Total yang harus dibayar
            double totalPembayaran = jumlahBulanDipilih * sppPerBulan;
            tftotal.setText(String.valueOf(totalPembayaran));

            // Cek apakah input pembayaran tidak kosong dan valid
            String uangDibayarText = tfpmbyrn.getText().trim();
            if (uangDibayarText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Harap masukkan jumlah uang yang dibayar!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double uangDibayar = Double.parseDouble(uangDibayarText);

            penghitungan();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan jumlah uang yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }                         
    }//GEN-LAST:event_btntotalActionPerformed

    private void btnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatusActionPerformed
    updateStatusPembayaranTabel();
    }//GEN-LAST:event_btnstatusActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
    if (namaSiswa.isEmpty() || kelasSiswa.isEmpty() || nisnSiswa.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Belum ada data siswa yang diinputkan!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
        // Membuat string builder untuk riwayat pembayaran
        StringBuilder riwayat = new StringBuilder();
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        // Tampilkan data siswa dari variabel global
        riwayat.append("Nama: ").append(namaSiswa).append("\n");
        riwayat.append("Kelas: ").append(kelasSiswa).append("\n");
        riwayat.append("NISN: ").append(nisnSiswa).append("\n\n");

        // Tambahkan riwayat pembayaran yang sudah dibayar
        boolean adaPembayaran = false;
        for (int i = 0; i < statusPembayaranBulan.length; i++) {
            if (statusPembayaranBulan[i]) {
                riwayat.append(bulan[i]).append(" sudah dibayar\n");
                adaPembayaran = true;
            }
        }

        // Jika belum ada pembayaran, tampilkan pesan ini
        if (!adaPembayaran) {
            riwayat.append("Belum ada pembayaran yang dilakukan.");
        }

        taRiwayat.setText(riwayat.toString());
        JOptionPane.showMessageDialog(null, riwayat.toString(), "Riwayat Pembayaran", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void btnpmbyrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpmbyrnActionPerformed
        if (tftotal.getText().isEmpty()||tfpmbyrn.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Total pembayaran tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
    return; 
}

// Pastikan pembayaran cukup
        double totalPembayaran = Double.parseDouble(tftotal.getText());
        double uangDibayar = Double.parseDouble(tfpmbyrn.getText());
        if (uangDibayar < totalPembayaran) {
            JOptionPane.showMessageDialog(null, "Pembayaran kurang!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Update status pembayaran bulan yang dipilih
        if (januari.isSelected()) statusPembayaranBulan[0] = true;
        if (februari.isSelected()) statusPembayaranBulan[1] = true;
        if (maaret.isSelected()) statusPembayaranBulan[2] = true;
        if (april.isSelected()) statusPembayaranBulan[3] = true;
        if (mei.isSelected()) statusPembayaranBulan[4] = true;
        if (juni.isSelected()) statusPembayaranBulan[5] = true;
        if (juli.isSelected()) statusPembayaranBulan[6] = true;
        if (agustus.isSelected()) statusPembayaranBulan[7] = true;
        if (september.isSelected()) statusPembayaranBulan[8] = true;
        if (oktober.isSelected()) statusPembayaranBulan[9] = true;
        if (november.isSelected()) statusPembayaranBulan[10] = true;
        if (desember.isSelected()) statusPembayaranBulan[11] = true;

        // Kosongkan semua field setelah data terkirim
        tfpmbyrn.setText("");
        tfkembali.setText("");
        tftotal.setText("");
        januari.setSelected(false);
        februari.setSelected(false);
        maaret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);

        JOptionPane.showMessageDialog(null, "Pembayaran berhasil dan data telah disimpan.");
    }//GEN-LAST:event_btnpmbyrnActionPerformed


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
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembayaranSPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agustus;
    private javax.swing.JCheckBox april;
    private javax.swing.JButton btndata;
    private javax.swing.JButton btnpmbyrn;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btnstatus;
    private javax.swing.JButton btntotal;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox januari;
    private javax.swing.JCheckBox juli;
    private javax.swing.JCheckBox juni;
    private javax.swing.JCheckBox maaret;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private javax.swing.JPanel pAtas;
    private javax.swing.JPanel pBawah;
    private javax.swing.JCheckBox september;
    private javax.swing.JTextArea taRiwayat;
    private javax.swing.JTable tabelstatus;
    private javax.swing.JTextField tfkelas;
    private javax.swing.JTextField tfkembali;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnisn;
    private javax.swing.JTextField tfpmbyrn;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables

    private void updateStatusPembayaranTabel() {
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        DefaultTableModel model = (DefaultTableModel) tabelstatus.getModel();
        model.setRowCount(0);  // Hapus baris lama

        boolean lunasSemua = true;  // Flag untuk cek status lunas semua bulan

        for (int i = 0; i < statusPembayaranBulan.length; i++) {
            String status = statusPembayaranBulan[i] ? "Lunas" : "Belum dibayar";
            model.addRow(new Object[]{bulan[i], status});

            // Cek jika ada bulan yang belum lunas
            if (!statusPembayaranBulan[i]) {
                lunasSemua = false;
            }
        }

        if (lunasSemua) {
            JOptionPane.showMessageDialog(null, "Pembayaran sudah lunas untuk semua bulan.", "Status Pembayaran", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pembayaran belum lunas. Silakan cek bulan yang belum dibayar.", "Status Pembayaran", JOptionPane.WARNING_MESSAGE);
        }
    }
}
