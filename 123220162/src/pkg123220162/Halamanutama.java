/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220162;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Balok.balok;



class Frameutama extends JFrame implements ActionListener {
    //inisiasi awalan
    JLabel tulisan1 = new JLabel();
    JLabel tulisan2 = new JLabel("Tentukan Panjang, Lebar, dan Tinggi untuk menghitung Balok ");
    
    //inisiasi JLabel dan JText panjang, lebar, dan tinggi
    JLabel pnjg = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel ting = new JLabel("Tinggi");
    
    //kolom panjang, lebar, dan tinggi
    JTextField pnj = new JTextField();
    JTextField lbr = new JTextField();
    JTextField tng = new JTextField();
    
    //inisiasi bttn hitung dan reset
    JButton htng = new JButton("Hitung");
    JButton rst = new JButton("Reset");
    
    //Hasil
    JLabel hsl = new JLabel("Hasil");
    
    JLabel hslluper = new JLabel("Luas Persegi : ");
    JLabel hslkelper = new JLabel("Keliling Persegi : ");
    JLabel hslvobal = new JLabel("Volume Balok : ");
    JLabel hsllpb = new JLabel("Luas Permukaan Balok : ");
    
    //back home
    JButton home = new JButton("Back Home");
    
    Frameutama(String user, String pilJenKel){
        tulisan1.setText("Welcome, "+ pilJenKel + user);
        setVisible(true);
        setSize(720, 720);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(tulisan1);
        tulisan1.setBounds(20, 20, 400, 24);
        tulisan1.setFont(new Font("Arial", Font.PLAIN, 25));
        add(tulisan2);
        tulisan2.setBounds(20, 50, 600, 25);
        tulisan2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        add(pnjg);
        pnjg.setBounds(20, 100, 300, 25);
        pnjg.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lebar);
        lebar.setBounds(20, 130, 300, 25);
        lebar.setFont(new Font("Arial", Font.PLAIN, 15));
        add(ting);
        ting.setBounds(20, 160, 300, 25);
        ting.setFont(new Font("Arial", Font.PLAIN, 15));
        
        //input angka
        add(pnj);
        pnj.setBounds(100, 100, 300, 25);
        pnj.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lbr);
        lbr.setBounds(100, 130, 300, 25);
        lbr.setFont(new Font("Arial", Font.PLAIN, 15));
        add(tng);
        tng.setBounds(100, 160, 300, 25);
        tng.setFont(new Font("Arial", Font.PLAIN, 15));
        
        add(htng);
        htng.setBounds(20, 210, 300, 30);
        htng.setFont(new Font("Arial", Font.PLAIN, 15));
        htng.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hitung();
            }
        });
        
        add(rst);
        rst.setBounds(360, 210, 300, 30);
        rst.setFont(new Font("Arial", Font.PLAIN, 15));
        rst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                riset();
            }
        });
        
        
        add(hsl);
        hsl.setBounds(180, 250, 300, 30);
        hsl.setFont(new Font("Arial", Font.PLAIN, 20));
        add(hslluper);
        hslluper.setBounds(20, 280, 300, 30);
        hslluper.setFont(new Font("Arial", Font.PLAIN, 15));
        add(hslkelper);
        hslkelper.setBounds(20, 310, 300, 30);
        hslkelper.setFont(new Font("Arial", Font.PLAIN, 15));
        add(hslvobal);
        hslvobal.setBounds(20, 340, 300, 30);
        hslvobal.setFont(new Font("Arial", Font.PLAIN, 15));
        add(hsllpb);
        hsllpb.setBounds(20, 370, 300, 30);
        hsllpb.setFont(new Font("Arial", Font.PLAIN, 15));
        
        add(home);
        home.setBounds(80, 410, 200, 30);
        home.setFont(new Font("Arial", Font.PLAIN, 18));
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homepage();
            }
        });
        
    }
    
    private void homepage(){
        dispose();
        new Framelogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void hitung(){
        
        if(pnj.getText().isEmpty() || lbr.getText().isEmpty() || tng.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Mohon lengkapi semua kolom input !!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        try{
        // Mengambil nilai panjang, lebar, dan tinggi dari JTextField
        double panjang = Double.parseDouble(pnj.getText());
        double lebar = Double.parseDouble(lbr.getText());
        double tinggi = Double.parseDouble(tng.getText());

        // Membuat objek balok dengan nilai panjang, lebar, dan tinggi yang diambil dari input
        balok myBalok = new balok(panjang, lebar, tinggi);

        // Menghitung hasil menggunakan metode-metode yang telah didefinisikan di kelas balok
        double luasPersegi = myBalok.hasilluper();
        double kelilingPersegi = myBalok.hasilkelper();
        double volumeBalok = myBalok.hasilvobal();
        double luasPermukaanBalok = myBalok.hasillpb();

        // Menetapkan hasil perhitungan ke JLabel masing-masing
        hslluper.setText("Luas Persegi : " + luasPersegi);
        hslkelper.setText("Keliling Persegi : " + kelilingPersegi);
        hslvobal.setText("Volume Balok : " + volumeBalok);
        hsllpb.setText("Luas Permukaan Balok : " + luasPermukaanBalok);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Mohon masukkan input berupa angka.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void riset(){
        pnj.setText("");
        lbr.setText("");
        tng.setText("");
        hslluper.setText("Luas Persegi : ");
        hslkelper.setText("Keliling Persegi : ");
        hslvobal.setText("Volume Balok : ");
        hsllpb.setText("Luas Permukaan Balok : ");
    }
}


