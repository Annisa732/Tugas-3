package SearchingBinary;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int Angka[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari = 18;
        int indeks1 = 0;
        int indeks10 = Angka.length-1;
        int ketemu = 0;
        int point = 0;
        String key;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan data yang dicari: ");
        key = scan.nextLine();
        
        System.out.println("isi data adalah: ");
        for (int i = 0; i < Angka.length; i++){
            
            System.out.print(Angka[i] + " ");
        }
        System.out.println("");
        System.out.println("");
                
        while ((indeks1 <= indeks10) && ketemu == 0){
        point = (indeks1 + indeks10) / 2;
        System.out.println("indeks pointer :"+ point);
            if (cari == Angka[point]) {
                ketemu = 1;
                System.out.println("Data " +
                cari + " Telah ditemukan pada indkes ke " + point);
            }
        
            else if (cari < Angka[point]){
                System.out.println("Cari di kiri ");
                indeks10 = point-1; 
            }
            
            else {
                indeks1 = point+1;
                System.out.println("Cari di kanan");
            }
        }
        
        
        if (ketemu == 1)
            System.out.println("kesimpulan: data ditemukan");
        else
            System.out.println("kesimpulan: data tidak ditemukan");
    System.out.println("Annisa Nadia Nur Afifah");
   }
}