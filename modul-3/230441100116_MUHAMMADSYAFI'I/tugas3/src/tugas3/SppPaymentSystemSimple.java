package tugas3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SppPaymentSystemSimple extends JFrame {
    // Komponen GUI
    private JTextField txtNamaSiswa, txtJumlahSpp;
    private JCheckBox[] monthCheckBoxes;
    private JButton btnBayar, btnHitungPembayaran, btnCekStatus, btnReset;
    private JLabel lblStatus;

    // Bulan dalam setahun
    private final String[] months = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    private boolean[] statusPembayaran = new boolean[12];

    public SppPaymentSystemSimple() {
        setTitle("Pembayaran SPP");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        // Panel utama dengan BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        
        // Panel input untuk nama siswa dan jumlah SPP
        JPanel inputPanel = new JPanel(new GridLayout(2, 1)); // Menggunakan GridLayout untuk dua input
        JPanel namaPanel = new JPanel(new FlowLayout());
        namaPanel.add(new JLabel("Nama Siswa:"));
        txtNamaSiswa = new JTextField(20);
        namaPanel.add(txtNamaSiswa);
        inputPanel.add(namaPanel);

        JPanel sppPanel = new JPanel(new FlowLayout());
        sppPanel.add(new JLabel("Jumlah SPP per bulan:"));
        txtJumlahSpp = new JTextField(15);
        sppPanel.add(txtJumlahSpp);
        inputPanel.add(sppPanel);

        panel.add(inputPanel, BorderLayout.NORTH); // Letakkan di bagian atas

        // Checkbox untuk bulan
        JPanel bulanPanel = new JPanel(new GridLayout(3, 4)); // Grid 3x4 untuk bulan
        monthCheckBoxes = new JCheckBox[12];
        for (int i = 0; i < 12; i++) {
            monthCheckBoxes[i] = new JCheckBox(months[i]);
            bulanPanel.add(monthCheckBoxes[i]);
        }
        panel.add(bulanPanel, BorderLayout.CENTER); // Letakkan di bagian tengah

        // Tombol dan status di bagian bawah
        JPanel buttonPanel = new JPanel(new FlowLayout());
        btnBayar = new JButton("Bayar");
        btnHitungPembayaran = new JButton("Hitung Pembayaran");
        btnCekStatus = new JButton("Cek Status");
        btnReset = new JButton("Reset");

        buttonPanel.add(btnBayar);
        buttonPanel.add(btnHitungPembayaran);
        buttonPanel.add(btnCekStatus);
        buttonPanel.add(btnReset);

        panel.add(buttonPanel, BorderLayout.SOUTH); // Letakkan di bagian bawah

        // Label status
        lblStatus = new JLabel("Status: ");
        panel.add(lblStatus, BorderLayout.SOUTH); // Status juga bisa diletakkan di bawah

        add(panel);

        // Action listeners
        btnBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bayarSPP();
            }
        });

        btnHitungPembayaran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungPembayaran();
            }
        });

        btnCekStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cekStatusPembayaran();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });
    }

    // Method untuk pembayaran SPP
    private void bayarSPP() {
        String nama = txtNamaSiswa.getText();
        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama siswa tidak boleh kosong");
            return;
        }

        for (int i = 0; i < 12; i++) {
            if (monthCheckBoxes[i].isSelected()) {
                statusPembayaran[i] = true; // Tandai bulan tersebut sebagai lunas
            }
        }
        JOptionPane.showMessageDialog(this, "Pembayaran berhasil!");
    }

    // Method untuk menghitung total pembayaran
    private void hitungPembayaran() {
        String jumlahSppStr = txtJumlahSpp.getText();
        if (jumlahSppStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jumlah SPP tidak boleh kosong");
            return;
        }

        try {
            double jumlahSpp = Double.parseDouble(jumlahSppStr);
            int bulanTerpilih = 0;
            for (int i = 0; i < 12; i++) {
                if (monthCheckBoxes[i].isSelected()) {
                    bulanTerpilih++;
                }
            }
            double totalPembayaran = bulanTerpilih * jumlahSpp;
            JOptionPane.showMessageDialog(this, "Total pembayaran: Rp " + totalPembayaran);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah SPP harus berupa angka.");
        }
    }

    // Method untuk mengecek status pembayaran
    private void cekStatusPembayaran() {
        ArrayList<String> belumDibayar = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            if (!statusPembayaran[i]) {
                belumDibayar.add(months[i]);
            }
        }

        if (belumDibayar.isEmpty()) {
            lblStatus.setText("Status: Lunas");
        } else {
            lblStatus.setText("Status: Menunggak - Belum dibayar: " + String.join(", ", belumDibayar));
        }
    }

    // Method untuk mereset form
    private void resetForm() {
        txtNamaSiswa.setText("");
        txtJumlahSpp.setText("");
        for (JCheckBox checkBox : monthCheckBoxes) {
            checkBox.setSelected(false); // Reset semua checkbox
        }
        lblStatus.setText("Status: "); // Reset label status
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SppPaymentSystemSimple().setVisible(true);
        });
    }
}
