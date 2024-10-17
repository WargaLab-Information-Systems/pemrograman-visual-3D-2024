/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BakeryApp extends JFrame {

    private JRadioButton[] rotiButtons;
    private JRadioButton[] toppingButtons;
    private JTextField jumlahPesanan;
    private JLabel totalHargaLabel;
    private JTextField bayarField;
    private JLabel kembalianLabel;

    private final String[] rotiNames = {"Choco Island", "Bread Pizza", "Donat Paket", "Milk Butter", "Funny Choco Cheese", "Choco Crispy", "Abon Mayo", "Roti Tawar"};
    private final int[] hargaRoti = {12000, 30000, 25000, 8000, 10000, 15000, 12000, 18000};
    private final String[] toppingNames = {"No Topping", "Keju", "Coklat"};
    private final int[] hargaTopping = {0, 5000, 4000};

    public BakeryApp() {
        setTitle("Anita Family Bakery");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 1));

        // Panel untuk pilihan roti
        JPanel rotiPanel = new JPanel(new GridLayout(4, 4));
        rotiPanel.setBorder(BorderFactory.createTitledBorder("Menu Roti"));
        ButtonGroup rotiGroup = new ButtonGroup();
        rotiButtons = new JRadioButton[rotiNames.length];
        for (int i = 0; i < rotiNames.length; i++) {
            rotiButtons[i] = new JRadioButton(rotiNames[i] + " (Rp " + hargaRoti[i] + ")");
            rotiGroup.add(rotiButtons[i]);
            rotiPanel.add(rotiButtons[i]);
        }
        add(rotiPanel);

        // Panel untuk pilihan topping
        JPanel toppingPanel = new JPanel(new GridLayout(1, 3));
        toppingPanel.setBorder(BorderFactory.createTitledBorder("Topping"));
        ButtonGroup toppingGroup = new ButtonGroup();
        toppingButtons = new JRadioButton[toppingNames.length];
        for (int i = 0; i < toppingNames.length; i++) {
            toppingButtons[i] = new JRadioButton(toppingNames[i] + " (Rp " + hargaTopping[i] + ")");
            toppingGroup.add(toppingButtons[i]);
            toppingPanel.add(toppingButtons[i]);
        }
        add(toppingPanel);

        // Input jumlah pesanan
        JLabel jumlahPesananLabel = new JLabel("Jumlah Pesanan:");
        jumlahPesanan = new JTextField("1");
        add(jumlahPesananLabel);
        add(jumlahPesanan);

        // Tombol Hitung Total
        JButton hitungButton = new JButton("Hitung Total");
        totalHargaLabel = new JLabel("Total Harga: Rp 0");
        add(hitungButton);
        add(totalHargaLabel);

        // Input Uang Pembeli
        JLabel bayarLabel = new JLabel("Bayar:");
        bayarField = new JTextField();
        add(bayarLabel);
        add(bayarField);

        // Kembalian
        JLabel kembalianTextLabel = new JLabel("Kembalian:");
        kembalianLabel = new JLabel("Kembalian: Rp 0");
        add(kembalianTextLabel);
        add(kembalianLabel);

        // Tombol Reset
        JButton resetButton = new JButton("Reset");
        add(resetButton);

        // ActionListener untuk tombol hitung total
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rotiIndex = getSelectedIndex(rotiButtons);
                int toppingIndex = getSelectedIndex(toppingButtons);

                // Cek jika menu roti dan topping belum dipilih
                if (rotiIndex == -1) {
                    JOptionPane.showMessageDialog(null, "Mohon pilih salah satu menu roti terlebih dahulu.");
                    return;
                }
                if (toppingIndex == -1) {
                    JOptionPane.showMessageDialog(null, "Mohon pilih salah satu topping terlebih dahulu.");
                    return;
                }

                int rotiPrice = hargaRoti[rotiIndex];
                int toppingPrice = hargaTopping[toppingIndex];
                int jumlah = Integer.parseInt(jumlahPesanan.getText());
                int totalHarga = (rotiPrice + toppingPrice) * jumlah;

                // Diskon 5% jika total lebih dari 100.000
                if (totalHarga > 100000) {
                    totalHarga *= 0.95;
                }

                totalHargaLabel.setText("Total Harga: Rp " + totalHarga);

                // Hitung kembalian otomatis
                if (!bayarField.getText().isEmpty()) {
                    int bayar = Integer.parseInt(bayarField.getText());
                    int kembalian = bayar - totalHarga;
                    kembalianLabel.setText("Kembalian: Rp " + kembalian);
                }
            }
        });

        // ActionListener untuk tombol reset
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearSelection(rotiButtons);
                clearSelection(toppingButtons);
                jumlahPesanan.setText("1");
                totalHargaLabel.setText("Total Harga: Rp 0");
                bayarField.setText("");
                kembalianLabel.setText("Kembalian: Rp 0");
            }
        });
    }

    // Helper function untuk mendapatkan indeks radio button yang dipilih
    private int getSelectedIndex(JRadioButton[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                return i;
            }
        }
        return -1;
    }

    // Helper function untuk membersihkan pilihan radio button
    private void clearSelection(JRadioButton[] buttons) {
        for (JRadioButton button : buttons) {
            button.setSelected(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BakeryApp().setVisible(true);
            }
        });
    }
}
