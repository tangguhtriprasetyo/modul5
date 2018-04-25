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
public class fungsi {
    io objek = new io();
    
    public void makan (){
        objek.openingmakan();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Suka makanan tipe yang mana?");
        int tipemakanan = sc.nextInt();
        switch (tipemakanan) {
                case 1:
                    objek.makan1();
                    break;
                case 2:
                    objek.makan2();
                    break;
                case 3:
                    objek.makan3();
                    break;
                default:
                    objek.salahinput();
                    break;
            }
    
    }
    public void hangout(){
        objek.openinghangout();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Suka tempat hangout tipe yang mana?");
        int tipehangout = sc.nextInt();
        switch (tipehangout) {
                case 1:
                    objek.hangout1();
                    break;
                case 2:
                    objek.hangout2();
                    break;
                default:
                    objek.salahinput();
                    break;
            }
    }
    public void kado(){
        objek.openingkado();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Suka kado tipe yang mana?");
        int tipekado = sc.nextInt();
        switch (tipekado) {
                case 1:
                    objek.kado1();
                    break;
                case 2:
                    objek.kado2();
                    break;
                case 3:
                    objek.kado3();
                    break;
                default:
                    objek.salahinput();
                    break;
            }
    }
}
