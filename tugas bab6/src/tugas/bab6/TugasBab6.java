/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.bab6;

import java.util.Scanner;

/**
 *
 * @author KELOMPOK32
 */
public class TugasBab6 {

    public static String nama;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        fungsi objek = new fungsi();
        io objek2 = new io();
        
        do {
            objek2.opening();
            System.out.println("Mari cari tau yang cewekmu mau");
            Scanner sc = new Scanner(System.in);
            System.out.println("Siapa nama cewekmu?");
            nama = sc.nextLine();
            objek2.opening2();
            System.out.println(nama + " lagi pengen apa?");
            int pingin = sc.nextInt();
        
            switch (pingin) {
                case 1:
                    objek.makan();
                    
                    break;
                case 2:
                    objek.hangout();
                    
                    break;
                case 3:
                    objek.kado();
                    
                    break;
                default:
                    objek2.salahinput();
                    break;
            }
            Scanner x = new Scanner(System.in);
            System.out.println("Ingin mengulang? (Y/N)");
                    String ulang = x.nextLine();
                    a = ulang;
        } 
        
        while ("Y".equals(a));
        objek2.penutup();
    }
    
}

