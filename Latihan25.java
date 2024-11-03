
package Pertemuan5;

import java.util.Scanner;

public class Latihan25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input nama
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = input.nextLine();
        
        // Menampilkan header ejaan
        System.out.println("\nEjaan untuk \"" + nama + "\" adalah : ");
        
        // Mengeja setiap huruf
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + " : " + nama.charAt(i));
        }
        
        input.close();
    }
    
}
