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
        
        
//        String bL = "Laptop";
//        System.out.println("Nama Barang : "+ bL);
//        int bLh = 7;
//        System.out.println("Jumlah Barang : "+ bLh);
//        int tTl = bLh * 1000000;
//        System.out.println("Total Harga : "+ tTl);
//        
//         String bHd = "Hardisk";
//        System.out.println("Nama Barang : "+ bHd);
//        int bHdh = 11;
//        System.out.println("Jumlah Barang : "+ bHdh);
//        int tTh = bHdh * 150000;
//        System.out.println("Total Harga : "+ tTh);
//        
//         String bM = "Mouse";
//        System.out.println("Nama Barang : "+ bM);
//        int bLM = 21;
//        System.out.println("Jumlah Barang : "+ bLM);
//        int tTm = bLh * 150000;
//        System.out.println("Total Harga : "+ tTm);
//        
//        System.out.println("=========================");
//        
//        int totalAset = tTl + tTh + tTm;
//        System.out.println("Total Aset : "+ totalAset);


//           Scanner scan = new Scanner(System.in);
//           System.out.print("Masukkan Jumlah Laptop : ");
//           int jumlahLaptop = scan.nextInt();
//           
//           System.out.print("Masukkan Jumlah Hardisk : ");
//           int jumlahHardisk = scan.nextInt();
//           
//           System.out.print("Masukkan Jumlah Mouse : ");
//           int jumlahMouse = scan.nextInt();
//           
//           int totalAset = (jumlahLaptop*10000000) + (jumlahHardisk*1500000) + (jumlahMouse*150000);
//           
//          System.out.println("Total Aset Toko Tersebut Adalah : "+ totalAset);

//String nama =JOptionPane.showInputDialog("Nama : ");
//      String umur =JOptionPane.showInputDialog("Umur : ");
//      double tinggibadan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi Badan (m) : "));  
//      double beratbadan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Berat Badan (kg) : "));
//      double bmi = beratbadan / (tinggibadan * tinggibadan) ;
//      JOptionPane.showMessageDialog(null, "Nama : "+nama);
//      JOptionPane.showMessageDialog(null, "Umur : "+umur);
//      JOptionPane.showMessageDialog(null, "BMI : "+bmi);

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
