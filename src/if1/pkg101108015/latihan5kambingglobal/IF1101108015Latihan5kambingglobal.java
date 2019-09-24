/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg101108015.latihan5kambingglobal;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program variabel kambing menjadi 
 *                        variabel global
 */
public class IF1101108015Latihan5kambingglobal {

    //variabel global
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing settelah ditambah: "
                + jumlahKambing);
                
    }
   
    public static void main(String[] args) {
       IF1101108015Latihan5kambingglobal kambingSusu = new IF1101108015Latihan5kambingglobal();
       
       //Menampilkan jumlah Kambing yang ada saat program pertama kali berjalan
       kambingSusu.getJumlahKambing();
       
       //Menambah 5 Kambing
       kambingSusu.tambahKambing();
       
       //Menampilkan Jumlah Kambing yang ada
       kambingSusu.getJumlahKambing();
               
    }
    
}
