/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arno
 * 
 */
public class PembayaranSPP extends javax.swing.JFrame {
    boolean[] statusPembayaranBulan = new boolean[12];

    private String namaSiswa = "";
    private String kelasSiswa = "";
    private String nisnSiswa = "";

    /**
     * Creates new form PembayaranSPP
     */
    
    public PembayaranSPP() {
        initComponents();
        tftotal.setEditable(false);
        tfkembali.setEditable(false);
        tfpmbyrn.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                penghitungan();
            }
        });
        
    }

    
    @SuppressWarnings("unchecked")
    private void penghitungan() {
        try {
            int pembayaran = Integer.parseInt(tftotal.getText()); 
            int uangmasuk = Integer.parseInt(tfpmbyrn.getText()); 
            int kembalian = uangmasuk - pembayaran; 


            if (kembalian >= 0) {
                tfkembali.setText(String.valueOf(kembalian)); 
            } else {
                tfkembali.setText("Uang Tidak Cukup"); 
            }
        } catch (NumberFormatException e) {
            tfkembali.setText(""); 
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel1 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        tfkelas = new javax.swing.JTextField();
        tfnisn = new javax.swing.JTextField();
        btndatasiswa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        panel5 = new javax.swing.JPanel();
        januari = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        maret = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        tfpmbyrn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfkembali = new javax.swing.JTextField();
        btntotal = new javax.swing.JButton();
        tftotal = new javax.swing.JTextField();
        btnpembayaran = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnstatus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelstatus = new javax.swing.JTable();
        btnriwayat = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 0, 0));

        panel3.setBackground(new java.awt.Color(255, 204, 204));
        panel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Nama:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        panel3.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Kelas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        panel3.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("NISN:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        panel3.add(jLabel5, gridBagConstraints);

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 6);
        panel3.add(tfnama, gridBagConstraints);

        tfkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfkelasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 6);
        panel3.add(tfkelas, gridBagConstraints);

        tfnisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnisnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 12, 0, 6);
        panel3.add(tfnisn, gridBagConstraints);

        btndatasiswa.setBackground(new java.awt.Color(153, 153, 153));
        btndatasiswa.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btndatasiswa.setForeground(new java.awt.Color(255, 255, 255));
        btndatasiswa.setText("Kirim");
        btndatasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatasiswaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 228, 0, 6);
        panel3.add(btndatasiswa, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Siswa");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Loket Pembayaran");

        panel4.setBackground(new java.awt.Color(255, 204, 204));

        panel5.setBackground(new java.awt.Color(102, 0, 0));
        panel5.setLayout(new java.awt.GridLayout(6, 2));

        januari.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        januari.setForeground(new java.awt.Color(255, 255, 255));
        januari.setText("Januari");
        panel5.add(januari);

        februari.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        februari.setForeground(new java.awt.Color(255, 255, 255));
        februari.setText("Februari");
        februari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                februariActionPerformed(evt);
            }
        });
        panel5.add(februari);

        maret.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        maret.setForeground(new java.awt.Color(255, 255, 255));
        maret.setText("Maret");
        panel5.add(maret);

        april.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        april.setForeground(new java.awt.Color(255, 255, 255));
        april.setText("April");
        april.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprilActionPerformed(evt);
            }
        });
        panel5.add(april);

        mei.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        mei.setForeground(new java.awt.Color(255, 255, 255));
        mei.setText("Mei");
        mei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meiActionPerformed(evt);
            }
        });
        panel5.add(mei);

        juni.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        juni.setForeground(new java.awt.Color(255, 255, 255));
        juni.setText("Juni");
        juni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juniActionPerformed(evt);
            }
        });
        panel5.add(juni);

        juli.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        juli.setForeground(new java.awt.Color(255, 255, 255));
        juli.setText("Juli");
        panel5.add(juli);

        agustus.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        agustus.setForeground(new java.awt.Color(255, 255, 255));
        agustus.setText("Agustus");
        panel5.add(agustus);

        september.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        september.setForeground(new java.awt.Color(255, 255, 255));
        september.setText("September");
        panel5.add(september);

        oktober.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        oktober.setForeground(new java.awt.Color(255, 255, 255));
        oktober.setText("Oktober");
        panel5.add(oktober);

        november.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        november.setForeground(new java.awt.Color(255, 255, 255));
        november.setText("November");
        november.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novemberActionPerformed(evt);
            }
        });
        panel5.add(november);

        desember.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        desember.setForeground(new java.awt.Color(255, 255, 255));
        desember.setText("Desember");
        panel5.add(desember);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pilihan Bulan");

        tfpmbyrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpmbyrnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pembayaran");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Kembalian");

        tfkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfkembaliActionPerformed(evt);
            }
        });

        btntotal.setBackground(new java.awt.Color(153, 153, 153));
        btntotal.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btntotal.setForeground(new java.awt.Color(255, 255, 255));
        btntotal.setText("Hitung");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        btnpembayaran.setBackground(new java.awt.Color(153, 153, 153));
        btnpembayaran.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnpembayaran.setForeground(new java.awt.Color(255, 255, 255));
        btnpembayaran.setText("Bayar");
        btnpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpembayaranActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Total");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel9))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfpmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(49, 49, 49))))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfpmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(2, 2, 2)
                        .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnpembayaran)
                        .addContainerGap(100, Short.MAX_VALUE))))
        );

        btnstatus.setBackground(new java.awt.Color(153, 153, 153));
        btnstatus.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnstatus.setForeground(new java.awt.Color(255, 255, 255));
        btnstatus.setText("Status Pembayaran");
        btnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatusActionPerformed(evt);
            }
        });

        tabelstatus.setBackground(new java.awt.Color(255, 204, 204));
        tabelstatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
                "Bulan", "Status"
            }
        ));
        jScrollPane2.setViewportView(tabelstatus);

        btnriwayat.setBackground(new java.awt.Color(153, 153, 153));
        btnriwayat.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnriwayat.setForeground(new java.awt.Color(255, 255, 255));
        btnriwayat.setText("Riwayat Pembayaran");
        btnriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriwayatActionPerformed(evt);
            }
        });

        btnbatal.setBackground(new java.awt.Color(153, 153, 153));
        btnbatal.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnbatal.setForeground(new java.awt.Color(255, 255, 255));
        btnbatal.setText("Reset");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnkeluar.setBackground(new java.awt.Color(153, 153, 153));
        btnkeluar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnkeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        jLabel10.setText("PEMBAYARAN SPP SEKOLAH");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnriwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnkeluar))
                            .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(btnriwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnstatus)
                            .addGap(11, 11, 11)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meiActionPerformed

    private void februariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_februariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_februariActionPerformed

    private void novemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novemberActionPerformed

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfnamaActionPerformed

    private void tfkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfkelasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfkelasActionPerformed

    private void tfnisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnisnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfnisnActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        if (namaSiswa.isEmpty() || kelasSiswa.isEmpty() || nisnSiswa.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harap mengisi data siswa terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
        }

        

        
        try {
            int sppPerBulan = 100000; 
            int jumlahBulanDipilih = 0;

            if (januari.isSelected() && !statusPembayaranBulan[0]) jumlahBulanDipilih++;
            if (februari.isSelected() && !statusPembayaranBulan[1]) jumlahBulanDipilih++;
            if (maret.isSelected() && !statusPembayaranBulan[2]) jumlahBulanDipilih++;
            if (april.isSelected() && !statusPembayaranBulan[3]) jumlahBulanDipilih++;
            if (mei.isSelected() && !statusPembayaranBulan[4]) jumlahBulanDipilih++;
            if (juni.isSelected() && !statusPembayaranBulan[5]) jumlahBulanDipilih++;
            if (juli.isSelected() && !statusPembayaranBulan[6]) jumlahBulanDipilih++;
            if (agustus.isSelected() && !statusPembayaranBulan[7]) jumlahBulanDipilih++;
            if (september.isSelected() && !statusPembayaranBulan[8]) jumlahBulanDipilih++;
            if (oktober.isSelected() && !statusPembayaranBulan[9]) jumlahBulanDipilih++;
            if (november.isSelected() && !statusPembayaranBulan[10]) jumlahBulanDipilih++;
            if (desember.isSelected() && !statusPembayaranBulan[11]) jumlahBulanDipilih++;

            int totalPembayaran = jumlahBulanDipilih * sppPerBulan;
            tftotal.setText(String.valueOf(totalPembayaran));

            String uangDibayarText = tfpmbyrn.getText().trim();
            if (uangDibayarText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Harap masukkan jumlah uang yang dibayar!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int uangDibayar = Integer.parseInt(uangDibayarText);


            penghitungan();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan jumlah uang yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }                                      
         
        
    }//GEN-LAST:event_btntotalActionPerformed

    private void btnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatusActionPerformed
         updateStatusPembayaranTabel();
    }
        private void updateStatusPembayaranTabel() {
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        DefaultTableModel model = (DefaultTableModel) tabelstatus.getModel();
        model.setRowCount(0); 

        boolean lunasSemua = true;  

        for (int i = 0; i < statusPembayaranBulan.length; i++) {
            String status = statusPembayaranBulan[i] ? "Lunas" : "Belum dibayar";
            model.addRow(new Object[]{bulan[i], status});

            
            if (!statusPembayaranBulan[i]) {
                lunasSemua = false;
            }
        }

        if (lunasSemua) {
            JOptionPane.showMessageDialog(null, "Pembayaran sudah lunas untuk semua bulan.", "Status Pembayaran", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pembayaran belum lunas. Silakan cek bulan yang belum dibayar.", "Status Pembayaran", JOptionPane.WARNING_MESSAGE);
        }
    
    }//GEN-LAST:event_btnstatusActionPerformed

    private void btndatasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatasiswaActionPerformed
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
    }//GEN-LAST:event_btndatasiswaActionPerformed

    private void tfpmbyrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpmbyrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpmbyrnActionPerformed

    private void tfkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfkembaliActionPerformed

    private void btnpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpembayaranActionPerformed
    String totalPembayaranText = tftotal.getText().trim();
    
    if (totalPembayaranText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harap klik tombol Total terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; 
    }

    
    try {
        int totalPembayaran = Integer.parseInt(totalPembayaranText);
        int uangDibayar = Integer.parseInt(tfpmbyrn.getText().trim());

        if (uangDibayar < totalPembayaran) {
            JOptionPane.showMessageDialog(null, "Pembayaran kurang!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (januari.isSelected()) {
            statusPembayaranBulan[0] = true;
            januari.setEnabled(false); 
        }
        if (februari.isSelected()) {
            statusPembayaranBulan[1] = true;
            februari.setEnabled(false);
        }
        if (maret.isSelected()) {
            statusPembayaranBulan[2] = true;
            maret.setEnabled(false); 
        }
        if (april.isSelected()) {
            statusPembayaranBulan[3] = true;
            april.setEnabled(false); 
        }
        if (mei.isSelected()) {
            statusPembayaranBulan[4] = true;
            mei.setEnabled(false); 
        }
        if (juni.isSelected()) {
            statusPembayaranBulan[5] = true;
            juni.setEnabled(false); 
        }
        if (juli.isSelected()) {
            statusPembayaranBulan[6] = true;
            juli.setEnabled(false); 
        }
        if (agustus.isSelected()) {
            statusPembayaranBulan[7] = true;
            agustus.setEnabled(false); 
        }
        if (september.isSelected()) {
            statusPembayaranBulan[8] = true;
            september.setEnabled(false); 
        }
        if (oktober.isSelected()) {
            statusPembayaranBulan[9] = true;
            oktober.setEnabled(false); 
        }
        if (november.isSelected()) {
            statusPembayaranBulan[10] = true;
            november.setEnabled(false); 
        }
        if (desember.isSelected()) {
            statusPembayaranBulan[11] = true;
            desember.setEnabled(false); 
        }

        tfpmbyrn.setText("");
        tfkembali.setText("");
        tftotal.setText("");
        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
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
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Masukkan jumlah uang yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    if (namaSiswa.isEmpty() || kelasSiswa.isEmpty() || nisnSiswa.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harap mengisi data siswa terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }


    }//GEN-LAST:event_btnpembayaranActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed

       if (namaSiswa.isEmpty() || kelasSiswa.isEmpty() || nisnSiswa.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Belum ada data siswa yang diinputkan!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
        StringBuilder riwayat = new StringBuilder();
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        riwayat.append("Nama: ").append(namaSiswa).append("\n");
        riwayat.append("Kelas: ").append(kelasSiswa).append("\n");
        riwayat.append("NISN: ").append(nisnSiswa).append("\n\n");

        boolean adaPembayaran = false;
        for (int i = 0; i < statusPembayaranBulan.length; i++) {
            if (statusPembayaranBulan[i]) {
                riwayat.append(bulan[i]).append(" sudah dibayar\n");
                adaPembayaran = true;
            }
        }

        if (!adaPembayaran) {
            riwayat.append("Belum ada pembayaran yang dilakukan.");
        }

        JOptionPane.showMessageDialog(null, riwayat.toString(), "Riwayat Pembayaran", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void juniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juniActionPerformed

    }//GEN-LAST:event_juniActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    
        
        if (pilihan == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed

        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);

        
        tftotal.setText("");
        tfpmbyrn.setText("");

        
        JOptionPane.showMessageDialog(null, "Pilihan pembayaran telah dibatalkan.", "Pembatalan", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnbatalActionPerformed

    private void aprilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aprilActionPerformed

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
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btndatasiswa;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnpembayaran;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btnstatus;
    private javax.swing.JButton btntotal;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox januari;
    private javax.swing.JCheckBox juli;
    private javax.swing.JCheckBox juni;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JCheckBox september;
    private javax.swing.JTable tabelstatus;
    private javax.swing.JTextField tfkelas;
    private javax.swing.JTextField tfkembali;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnisn;
    private javax.swing.JTextField tfpmbyrn;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
