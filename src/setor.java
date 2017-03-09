
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cupumendewa
 */
public class setor {
    private int saldo;
    public void menabung(int bal, int s){
        if (s%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \n Silahkan Ulangi Kembali!", "Transaksi Gagal!", 0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah Rp.50.000,00","ERROR",0);
        else if(s>=50000){
            saldo = bal+s;
            JOptionPane.showMessageDialog(null, "Saldo saat ini Sebesar : "+ saldo);
        }
    }
    public int getsaldo(){
        return saldo;
    }
}
