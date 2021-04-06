package SearchingSequential;

import java.util.Scanner;

public class Sequential {
    public static void main(String[] args) {
    System.out.println(" ***** SEQUENTIAL SEARCH ***** "+"\n");
        String Sains[] = {"Galileo, Archimedes, Alkhawirizmi, Aljabar, Annisa, Tesla"};
        String key;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan data yang dicari: ");
        key = scan.nextLine();
        
        System.out.print("Isi data adalah: ");
        for (int i = 0; i < Sains.length; i++){
         
            System.out.print(Sains[i] + " ");
        }
        System.out.println("");
        
        for (int i = 0; i <= Sains.length; i++){
            if (key.equalsIgnoreCase(Sains[i])) {
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println(" ***** TERIMA KASIH ***** ");
        System.out.println("Annisa Nadia Nur Afifah");
    }
}
