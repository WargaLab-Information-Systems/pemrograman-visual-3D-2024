/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BayarSPP;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldinn
 */
public class spp extends javax.swing.JFrame {

    /**
     * Creates new form spp
     */
    
    private boolean[] bulan = new boolean[12]; 
    int total = 0;
    public spp() {
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

        North = new javax.swing.JPanel();
        LabelJudul = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        InputBayaran = new javax.swing.JTextField();
        LabelBayar = new javax.swing.JLabel();
        InputNama = new javax.swing.JTextField();
        LabelJumlahSpp = new javax.swing.JLabel();
        InputJumlahSPP = new javax.swing.JTextField();
        LabelInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        LabelGaris2 = new javax.swing.JLabel();
        LabelBayar1 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        LabelGaris3 = new javax.swing.JLabel();
        LabelGaris4 = new javax.swing.JLabel();
        LabelGaris5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaRiwayat = new javax.swing.JTextArea();
        Riwayat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelBtn = new javax.swing.JPanel();
        HitungPembayaran = new javax.swing.JButton();
        Bayar = new javax.swing.JButton();
        CekStatus = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        PanelRiwayat = new javax.swing.JPanel();
        PanelBulan = new javax.swing.JPanel();
        Januari = new javax.swing.JCheckBox();
        Februari = new javax.swing.JCheckBox();
        Maret = new javax.swing.JCheckBox();
        April = new javax.swing.JCheckBox();
        Mei = new javax.swing.JCheckBox();
        Juni = new javax.swing.JCheckBox();
        Juli = new javax.swing.JCheckBox();
        Agustus = new javax.swing.JCheckBox();
        September = new javax.swing.JCheckBox();
        Oktober = new javax.swing.JCheckBox();
        November = new javax.swing.JCheckBox();
        Desember = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pembayaran SPP");
        setPreferredSize(new java.awt.Dimension(765, 420));

        North.setBackground(new java.awt.Color(0, 204, 204));
        North.setMinimumSize(new java.awt.Dimension(681, 100));
        North.setPreferredSize(new java.awt.Dimension(635, 260));
        North.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelJudul.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LabelJudul.setText("PEMBAYARAN SPP SMKN 1 KAMAL");
        North.add(LabelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, -1));

        LabelNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNama.setText("Nama         ");
        North.add(LabelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));
        North.add(InputBayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 320, -1));

        LabelBayar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelBayar.setText("Bayar");
        North.add(LabelBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));
        North.add(InputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 320, -1));

        LabelJumlahSpp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelJumlahSpp.setText("SPP ");
        North.add(LabelJumlahSpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));
        North.add(InputJumlahSPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 320, -1));

        LabelInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelInfo.setText("* Pastikan Anda Membayar Spp Setiap Bulan.");
        North.add(LabelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 260, -1));

        jLabel3.setText("Jl. Raya Telang, Kamal, Bangkalan, Jawa Timur, Indonesia.");
        North.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        Status.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Status.setText("Status                          :");
        North.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, 20));

        LabelGaris2.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        North.add(LabelGaris2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 960, 20));

        LabelBayar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelBayar1.setText("Total");
        North.add(LabelBayar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        North.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 320, -1));

        LabelGaris3.setText("---------------------------------------------------------------------------------");
        North.add(LabelGaris3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, 30));

        LabelGaris4.setText("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        North.add(LabelGaris4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 870, 30));

        LabelGaris5.setText("-----------------------------------------------------------------------------------------------");
        North.add(LabelGaris5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 460, 30));

        AreaRiwayat.setEditable(false);
        AreaRiwayat.setColumns(20);
        AreaRiwayat.setRows(5);
        jScrollPane1.setViewportView(AreaRiwayat);

        North.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 290, 70));

        Riwayat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Riwayat.setText("Riwayat Pembayaran :");
        North.add(Riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Downloads\\Logo_SMKN_20__1_-removebg-preview.png")); // NOI18N
        North.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toshiba\\Downloads\\spp__1_-removebg-preview.png")); // NOI18N
        North.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, -10, -1, 80));

        getContentPane().add(North, java.awt.BorderLayout.PAGE_START);

        PanelBtn.setBackground(new java.awt.Color(204, 255, 255));

        HitungPembayaran.setBackground(new java.awt.Color(0, 204, 204));
        HitungPembayaran.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        HitungPembayaran.setText("Hitung");
        HitungPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungPembayaranActionPerformed(evt);
            }
        });
        PanelBtn.add(HitungPembayaran);

        Bayar.setBackground(new java.awt.Color(0, 204, 204));
        Bayar.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        Bayar.setText("Bayar");
        Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarActionPerformed(evt);
            }
        });
        PanelBtn.add(Bayar);

        CekStatus.setBackground(new java.awt.Color(0, 204, 204));
        CekStatus.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        CekStatus.setText("Cek Status");
        CekStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekStatusActionPerformed(evt);
            }
        });
        PanelBtn.add(CekStatus);

        Keluar.setBackground(new java.awt.Color(0, 204, 204));
        Keluar.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        PanelBtn.add(Keluar);

        getContentPane().add(PanelBtn, java.awt.BorderLayout.PAGE_END);

        PanelRiwayat.setBackground(new java.awt.Color(0, 204, 204));
        PanelRiwayat.setLayout(new javax.swing.BoxLayout(PanelRiwayat, javax.swing.BoxLayout.PAGE_AXIS));
        getContentPane().add(PanelRiwayat, java.awt.BorderLayout.LINE_END);

        PanelBulan.setBackground(new java.awt.Color(0, 204, 204));
        PanelBulan.setPreferredSize(new java.awt.Dimension(332, 85));
        PanelBulan.setLayout(new java.awt.GridLayout(3, 4));

        Januari.setText("Januari");
        PanelBulan.add(Januari);

        Februari.setText("Februari");
        PanelBulan.add(Februari);

        Maret.setText("Maret");
        PanelBulan.add(Maret);

        April.setText("April");
        April.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AprilActionPerformed(evt);
            }
        });
        PanelBulan.add(April);

        Mei.setText("Mei");
        PanelBulan.add(Mei);

        Juni.setText("Juni");
        PanelBulan.add(Juni);

        Juli.setText("Juli");
        Juli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuliActionPerformed(evt);
            }
        });
        PanelBulan.add(Juli);

        Agustus.setText("Agustus");
        PanelBulan.add(Agustus);

        September.setText("September");
        PanelBulan.add(September);

        Oktober.setText("Oktober");
        PanelBulan.add(Oktober);

        November.setText("November");
        PanelBulan.add(November);

        Desember.setText("Desember");
        PanelBulan.add(Desember);

        getContentPane().add(PanelBulan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JuliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JuliActionPerformed

    private void HitungPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungPembayaranActionPerformed
        // TODO add your handling code here:
        int spp = Integer.parseInt(InputJumlahSPP.getText()); // Jumlah SPP per bulan
        
        if (Januari.isSelected() && !bulan[0]) total += spp;
        if (Februari.isSelected() && !bulan[1]) total += spp;
        if (Maret.isSelected() && !bulan[2]) total += spp;
        if (April.isSelected() && !bulan[3]) total += spp;
        if (Mei.isSelected() && !bulan[4]) total += spp;
        if (Juni.isSelected() && !bulan[5]) total += spp;
        if (Juli.isSelected() && !bulan[6]) total += spp;
        if (Agustus.isSelected() && !bulan[7]) total += spp;
        if (September.isSelected() && !bulan[8]) total += spp;
        if (Oktober.isSelected() && !bulan[9]) total += spp;
        if (November.isSelected() && !bulan[10]) total += spp;
        if (Desember.isSelected() && !bulan[11]) total += spp;
        
        // hasil total pembayaran
        Total.setText(String.valueOf(total));     
        
        JOptionPane.showMessageDialog(this, "Total Pembayaran: Rp " + total);
    }//GEN-LAST:event_HitungPembayaranActionPerformed

    private void BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarActionPerformed
        // TODO add your handling code here:
        String NamaSiswa = InputNama.getText();
        if(InputBayaran.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukkan jumlah pembayaran yang valid.", "Kesalahan",
                    JOptionPane.ERROR_MESSAGE);
        return;
        }
        int total = Integer.parseInt(Total.getText());
// Validasi atau parsing input yang diharapkan berbentuk angka (misal: jumlah pembayaran)
double jumlah;
try {
    jumlah = Double.parseDouble(InputBayaran.getText());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Masukkan jumlah pembayaran yang valid.", "Kesalahan",
            JOptionPane.ERROR_MESSAGE);
    return; 
}

// Simpan status awal dari bulan untuk pembayaran kurang
boolean[] bulanAwal = bulan.clone();

StringBuilder InfromasiPembayaran = new StringBuilder("Pembayaran oleh " + NamaSiswa + " untuk bulan: ");

// Cek tiap bulan dan tambahkan ke log pembayaran jika dipilih dan belum lunas
if (Januari.isSelected() && !bulan[0]) {
    bulan[0] = true;
    InfromasiPembayaran.append("\nJanuari ");
}
if (Februari.isSelected() && !bulan[1]) {
    bulan[1] = true;
    InfromasiPembayaran.append("\nFebruari ");
}
if (Maret.isSelected() && !bulan[2]) {
    bulan[2] = true;
    InfromasiPembayaran.append("\nMaret ");
}
if (April.isSelected() && !bulan[3]) {
    bulan[3] = true;
    InfromasiPembayaran.append("\nApril ");
}
if (Mei.isSelected() && !bulan[4]) {
    bulan[4] = true;
    InfromasiPembayaran.append("\nMei ");
}
if (Juni.isSelected() && !bulan[5]) {
    bulan[5] = true;
    InfromasiPembayaran.append("\nJuni ");
}
if (Juli.isSelected() && !bulan[6]) {
    bulan[6] = true;
    InfromasiPembayaran.append("\nJuli ");
}
if (Agustus.isSelected() && !bulan[7]) {
    bulan[7] = true;
    InfromasiPembayaran.append("\nAgustus ");
}
if (September.isSelected() && !bulan[8]) {
    bulan[8] = true;
    InfromasiPembayaran.append("\nSeptember ");
}
if (Oktober.isSelected() && !bulan[9]) {
    bulan[9] = true;
    InfromasiPembayaran.append("\nOktober ");
}
if (November.isSelected() && !bulan[10]) {
    bulan[10] = true;
    InfromasiPembayaran.append("\nNovember ");
}
if (Desember.isSelected() && !bulan[11]) {
    bulan[11] = true;
    InfromasiPembayaran.append("\nDesember");
}

// Cek apakah jumlah pembayaran cukup atau berlebihan
if (jumlah < total) {
    // Jika pembayaran kurang, kembalikan status bulan ke kondisi awal
    bulan = bulanAwal; // Rollback ke status bulan sebelum pembayaran
    JOptionPane.showMessageDialog(this, "Uang pembayaran tidak cukup! Total Anda : " + total, "PERINGATAN",
            JOptionPane.ERROR_MESSAGE);
    return;
} else if (jumlah > total) {
    JOptionPane.showMessageDialog(this, "Masukkan uang pas! Total Anda : " + total, "PERINGATAN",
            JOptionPane.WARNING_MESSAGE);
    return;
}

// Tampilkan log pembayaran di area riwayat pembayaran
AreaRiwayat.append(InfromasiPembayaran.toString() + "\n");
JOptionPane.showMessageDialog(this, "Pembayaran berhasil diproses.", "INFORMASI",
        JOptionPane.INFORMATION_MESSAGE);
   
    }//GEN-LAST:event_BayarActionPerformed

    private void CekStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CekStatusActionPerformed
        // TODO add your handling code here:
        boolean cekstatus = false;
        StringBuilder status = new StringBuilder("Bulan yang belum dibayar : ");
        // status.setLength(0);
        
        if (!bulan[0]) {
            cekstatus = true;
            status.append("Januari, ");
        }
        if (!bulan[1]) {
            cekstatus = true;
            status.append("Februari, ");
        }
        if (!bulan[2]) {
            cekstatus = true;
            status.append("Maret, ");
        }
        if (!bulan[3]) {
            cekstatus = true;
            status.append("April, ");
        }
        if (!bulan[4]) {
            cekstatus = true;
            status.append("Mei, ");
        }
        if (!bulan[5]) {
            cekstatus = true;
            status.append("Juni, ");
        }
        if (!bulan[6]) {
            cekstatus = true;
            status.append("Juli, ");
        }
        if (!bulan[7]) {
            cekstatus = true;
            status.append("Agustus, ");
        }
        if (!bulan[8]) {
            cekstatus = true;
            status.append("September, ");
        }
        if (!bulan[9]) {
            cekstatus = true;
            status.append("Oktober, ");
        }
        if (!bulan[10]) {
            cekstatus = true;
            status.append("November, ");
        }
        if (!bulan[11]) {
            cekstatus = true;
            status.append("Desember, ");
        }
        
        if (cekstatus) {
            Status.setText("Status : Menunggak");
            JOptionPane.showMessageDialog(this, status.toString());
        } else {
            Status.setText("Status : Lunas");
            JOptionPane.showMessageDialog(this, "Pembayaran Anda Sudah LUNAS", "INFORMASI",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_CekStatusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void AprilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AprilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AprilActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

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
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Agustus;
    private javax.swing.JCheckBox April;
    private javax.swing.JTextArea AreaRiwayat;
    private javax.swing.JButton Bayar;
    private javax.swing.JButton CekStatus;
    private javax.swing.JCheckBox Desember;
    private javax.swing.JCheckBox Februari;
    private javax.swing.JButton HitungPembayaran;
    private javax.swing.JTextField InputBayaran;
    private javax.swing.JTextField InputJumlahSPP;
    private javax.swing.JTextField InputNama;
    private javax.swing.JCheckBox Januari;
    private javax.swing.JCheckBox Juli;
    private javax.swing.JCheckBox Juni;
    private javax.swing.JButton Keluar;
    private javax.swing.JLabel LabelBayar;
    private javax.swing.JLabel LabelBayar1;
    private javax.swing.JLabel LabelGaris2;
    private javax.swing.JLabel LabelGaris3;
    private javax.swing.JLabel LabelGaris4;
    private javax.swing.JLabel LabelGaris5;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelJumlahSpp;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JCheckBox Maret;
    private javax.swing.JCheckBox Mei;
    private javax.swing.JPanel North;
    private javax.swing.JCheckBox November;
    private javax.swing.JCheckBox Oktober;
    private javax.swing.JPanel PanelBtn;
    private javax.swing.JPanel PanelBulan;
    private javax.swing.JPanel PanelRiwayat;
    private javax.swing.JLabel Riwayat;
    private javax.swing.JCheckBox September;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
