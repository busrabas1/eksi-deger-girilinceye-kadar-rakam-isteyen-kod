/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksideger;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Eksideger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi;
        int b;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Sayı Giriniz");
    sayi=scanner.nextInt();
    
        while(sayi>0) {
            //System.out.println(sayi*sayi);
            Scanner scan = new Scanner(System.in);
            System.out.println("Sayı Giriniz");
            sayi=scan.nextInt();
        } 
        System.out.println(sayi*sayi);
        
    }
    
}
