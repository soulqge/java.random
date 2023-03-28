
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ahmad Arfa
 */
public class toegas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Masukkan ID Mahasiswa : ");
        int id = input.nextInt();
        System.out.print("Masukkan jalur Masuk : ");
        String jm = input.next();
        System.out.print("Masukkan Pendapatan : ");
        int golP = input.nextInt();
        System.out.print("Masukkan Total Semester Yang Akan Dibayarkan (1-8) : ");
        int tS = input.nextInt();
        int dspA = 5000000;
        int sppA = 500000;
        int dspB = 15000000;
        int sppB = 1000000;
        int dspC = 30000000;
        int sppC = 2000000;
        int dspAn = 7000000;
        int sppAn = 500000;
        int dspBn = 17000000;
        int sppBn = 1000000;
        int dspCn = 35000000;
        int sppCn = 2000000;
        int dspAm = 10000000;
        int sppAm = 1000000;
        int dspBm = 25000000;
        int sppBm = 2000000;
        int dspCm = 50000000;
        int sppCm = 3000000;
        String gol=null;
   
        if (golP <=2000000) {
            gol="A";
            System.out.println("Golongan A");
        }
        else if (golP >2000000&&golP <=10000000) {
            gol="B";
            System.out.println("Golongan B");
        }
        else if (golP > 10000000) {
            gol="C";
            System.out.println("Golongan C");
        }
        
        if (jm.equalsIgnoreCase("SBMPTN")) {
            if (gol.equals("A")) {
                int totalBiaya = (dspA+(tS*sppA));
                System.out.println("Total Biaya : "+totalBiaya);
            }
            else if (gol.equals("B")) {
                int totalBiaya = (dspB+(tS*sppB));
                System.out.println("Total Biaya : "+totalBiaya);
            }
            else if (gol.equals("C")) {
               int totalBiaya = (dspC+(tS*sppB));
                 System.out.println("Total Biaya : "+totalBiaya);
            }
            }
         if (jm.equalsIgnoreCase("SNMPTN")) {
            if (gol.equals("A")) {
                int totalBiaya = (dspAn+(tS*sppAn));
                System.out.println("Total Biaya : "+totalBiaya);
            }
            else if (gol.equals("B")) {
                int totalBiaya = (dspBn+(tS*sppBn));
                System.out.println("Total Biaya : "+totalBiaya);
            }
            else if (gol.equals("C"))  {
               int totalBiaya = (dspCn+(tS*sppCn));
                 System.out.println("Total Biaya : "+totalBiaya);
            }
            }
          if (jm.equalsIgnoreCase("Mandiri")) {
            if (gol.equals("A")) {
                int totalBiaya = (dspAm+(tS*sppAm));
                System.out.println("Total Biaya : "+totalBiaya);
            }
            else if (gol.equals("B")) {
                int totalBiaya = (dspBm+(tS*sppBm));
                System.out.println("Total Biaya : "+totalBiaya);
            }
            else if (gol.equals("C")) {
               int totalBiaya = (dspCm+(tS*sppCm));
                 System.out.println("Total Biaya : "+totalBiaya);
            }
            }  
        }     
    }