/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Balok;

import javax.swing.JTextField;

public class balok implements operasibalok{

    private double pnj, lbr, tng;
    
    public balok(double pnj, double lbr, double tng) {
        this.pnj = pnj;
        this.lbr = lbr;
        this.tng = tng;
    }

    public balok(JTextField pnj, JTextField lbr, JTextField tng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getpnj() {
        return pnj;
    }

    public void setpnj(double pnj) {
        this.pnj = pnj;
    }

    public double getlbr() {
        return lbr;
    }

    public void setlbr(double lbr) {
        this.lbr = lbr;
    }
    
    public double gettng() {
        return tng;
    }

    public void settng(double tng) {
        this.tng = tng;
    }
    
    
  //Note :
    //luper = luas persegi
    //kelper = keliling persegi
    //vobal = volume balok
    //lpb = luas permukaan balok
    
    // Membuat sebuah method Luas untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double hasilluper() {
        return pnj * lbr;
    }
    
    @Override
    public double hasilkelper() {
        return 2 * (pnj + lbr);
    }
    
    @Override
    public double hasilvobal() {
        return (pnj * lbr * tng);
    }
    
    @Override
    public double hasillpb() {
        return 2 * ( ((pnj * lbr) + (pnj * tng) + (lbr * tng)));
    }

    
}



