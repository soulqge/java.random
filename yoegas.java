//Toegas Pak Son
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ahmad Arfa
 */
public class yoegas {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = scan.nextInt();
        int hasil = angka%2;
        
        if (hasil ==0) {
            System.out.println("Bilangan Genap");
        }
        else{
            System.out.println("Bilangan Ganjil");
        }
    }
       }
    
    




