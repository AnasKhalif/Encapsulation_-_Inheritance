/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;
import java.util.Scanner;

/**
 *
 * @author anaskhalifm
 */
public class Project1 {
    public static void main(String[] args) {
       welcome();
       int hasil = menghitung();
       System.out.println("total pembelian anda " + hasil);
       tanya(hasil);
    }
    
    public static void welcome(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Selamat datang di toko bangunan pak Amin");
        System.out.println("----------Barang yang terseda---------" +
                "\n1.Semen : 50000"+
                "\n2.Paku  : 12000"+
                "\n3.Pipa  : 8000"+
                "\n4.Pasir : 1000000"
                );
    }
    
    public static int menghitung(){
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan anda :");
        int pilihan = Scanner.nextInt();
        System.out.println("Masukkan jumlah yang ingin anda beli : ");
        int jumlah = Scanner.nextInt();
        
        
        int totalpembelian = 0;
        switch(pilihan){
            case 1:
                totalpembelian += jumlah * 50000;
                break;
            case 2:
                totalpembelian += jumlah * 12000;
                break;
            case 3:
                totalpembelian += jumlah * 8000;
                break;
            case 4: 
                totalpembelian += jumlah * 1000000;
                break;
            default:
                System.out.println("pilihan tidak tersedia");
                break;
        }
        
        return totalpembelian;
         
    }
    
    public static void tanya(int hasil){
        Scanner Scanner = new Scanner(System.in);
        int b = 0; // 24
        
        while(true){
            System.out.println("Apakah anda ingin membeli barang lain?, jika iya ketik 'Y' jika tidak ketik 'T'");
            String jawab = Scanner.next();
            if("Y".equals(jawab)){
                int hasil2 = menghitung();
                int a = hasil + hasil2;
                System.out.println("hasil belanja anda : " + a);
                System.out.println("ketik 'selesai' jika menyelesaikan transaksi, ketik 'tidak' untuk melanjutkan");
                String tanyalagi = Scanner.next();
                
                if("selesai".equals(tanyalagi)){
                    break;
                }else if("tidak".equals(tanyalagi)){
//                        int gabungan = 
                        int coba = b  += a;
                        System.out.println(coba);
                        hasil -= hasil; // hasil jadi 0
                }

            }else if("T".equals(jawab)){
                System.out.println("Trimakasih sudah belanja di toko kami :), Selamat datang kembali... ");
                break;
            }
        }
    }
}
