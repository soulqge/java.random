
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ahmad Arfa
 */
public class TEST123 {
    public static void main(String[] args) {
         
//        String siswa [][] = {{"Ani","Perempuan","XR3"},{"Budi","Laki - Laki","XR1"},{"Citra","Perempuan","XR4"}};
//        for (int i = 0; i < siswa.length; i++) {
//            System.out.print("Nama Siswa : "+siswa[i][0]+"\n"+"Jenis Kelamin : "+siswa[i][1]+"\n"+ ""+"Kelas : "+siswa[i][2]+"\n");
//            System.out.println("");
/*
Matriks A 4x4
7   8   0   8
3   3   4   7
6   6   8   9
0   0   1   1   


Matriks B
5   6   3   8
8   5   3   2   
9   0   8   7
7   9   6   4

Matriks A+B


Matriks A = 5x4
7   8   7   0
9   0   8   9
8   8   8   8
5   6   7   4
5   4   3   2

Matriks B = 4x5
5   6   7   8   9
7   8   9   9   0
8   7   6   5   5
9   9   0   0   0

Matriks AxB
5x[4 4]x5
*/

int a [][] = {{7,8,0,8},{3,3,4,7},{6,6,8,9},{0,0,1,1}};
int b [][] = {{5,6,3,8},{8,5,3,2},{9,0,8,7},{7,9,6,4}};
    
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(a[i][j]+b[i][j]+"\t");
            }
            System.out.println();
            }
        System.out.println("==============================");
int c [][] = {{7,8,7,0},{9,0,8,9},{8,8,8,8},{5,6,7,4},{5,4,3,2}};
int d [][] = {{5,6,7,8,9},{7,8,9,9,0},{8,7,6,5,5},{9,9,0,0,0}};
int e [][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    e[i][j] += c[i][k]*d[k][j];
                }
            }
        }
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                System.out.print(e[i][j]+"\t");
            }
            System.out.println();
        }
        
        }

    }


