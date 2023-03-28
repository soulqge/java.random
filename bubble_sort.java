
package operator_1;

import java.util.Scanner;

/**
 *
 * @author Ahmad Arfa
 */
public class bubble_sort {
    
    public static void main(String[] args) {
        
        int jumlah,i,j, swap;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Bilangan Yang Ingin Di - Input : ");
        jumlah = scan.nextInt();
        
        int array[] = new int[jumlah];
        System.out.println("\nMasukkan "+jumlah+" Buah Bilangan Integer");
        System.out.println("============================================");
        for ( i = 0; i < jumlah; i++) {
            System.out.print("Bilangan Ke - " + (i+1)+" = ");
            array[i] = scan.nextInt();
        }
        
        System.out.println("\nBilangan sebelum Diurutkan");
        for (int a = 0; a < jumlah; a++) {
            System.out.println(array[a]);
        }
        
        for ( i = 0; i < (jumlah-1); i++) {
        
            for (j = 0; j < jumlah-i-1; j++) {
        
                if (array[j] > array[j+1]) {
                      swap = array[j];
                      array [j] = array[j+1];
                      array [j+1] = swap;
                }
            }
        }
        
                System.out.println("\nBilangan Setelah Diurutkan :");
                for ( i = 0; i < jumlah; i++) {
                    System.out.println(array[i]);
        }
    }
}
