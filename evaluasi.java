/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahmad Arfa
 */
public class evaluasi {
    
    public static void main(String[] args) {
    String nama = JOptionPane.showInputDialog("Nama : ");
    int jumlahBeras = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Beras (KG) : " ));
    int jumlahMinyak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Minyak (L) : " ));
    int jumlahGula = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Gula (KG) : " ));
    int jumlahSabun = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Sabun (pcs) : " ));
    
    int totalBelanja = (jumlahBeras*11000)+(jumlahMinyak*27500)+(jumlahGula*12500)+(jumlahSabun*8000);
    int hargaMinyak = 27500*jumlahMinyak;
    int hargaSabun = 8000*jumlahSabun;
    int hargaGula = 12500*jumlahGula;
    int hargaBeras = 11000*jumlahBeras;

    
    JOptionPane.showMessageDialog(null, "Nama : "+nama);
    JOptionPane.showMessageDialog(null, "Total Belanjaan : "+totalBelanja);
        if (hargaMinyak <hargaGula+hargaSabun+hargaBeras) {
         JOptionPane.showMessageDialog(null, "Harga Minyak lebih Murah Dari Harga Ketiganya");   
        }
        else if (hargaMinyak >hargaGula+hargaSabun+hargaBeras) {
         JOptionPane.showMessageDialog(null, "Harga Minyak lebih Mahal Dari Harga Ketiganya");   
        }
        if (hargaSabun <hargaGula+hargaMinyak+hargaBeras) {
         JOptionPane.showMessageDialog(null, "Harga Sabun lebih Murah Dari Harga Ketiganya");   
        }
        else if (hargaSabun >hargaGula+hargaMinyak+hargaBeras) {
         JOptionPane.showMessageDialog(null, "Harga Sabun lebih Mahal Dari Harga Ketiganya");   
        }
        if (hargaGula <hargaMinyak+hargaSabun+hargaBeras) {
         JOptionPane.showMessageDialog(null, "Harga Gula lebih Murah Dari Harga Ketiganya");   
        }
        else if (hargaGula >hargaMinyak+hargaSabun+hargaBeras) {
         JOptionPane.showMessageDialog(null, "Harga Gula lebih Mahal Dari Harga Ketiganya");   
        }
        if (hargaBeras <hargaGula+hargaSabun+hargaMinyak) {
         JOptionPane.showMessageDialog(null, "Harga Beras lebih Murah Dari Harga Ketiganya");   
        }
        else if (hargaBeras >hargaGula+hargaSabun+hargaMinyak) {
         JOptionPane.showMessageDialog(null, "Harga Beras lebih Mahal Dari Harga Ketiganya");   
        }
        
        
        
        
        
        
        
        
        
     
    
    
      
    
    
        
    

    
 

                   
                   
      }
    
}
