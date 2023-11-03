/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author pc15
 */
public class Array {
    public static void main(String[] args) {
     //array 1 dimensi
        System.out.println("hasil array 1 dimensi");
    String[] nama = {"Upin", "Ipin", "Memei", "Jarjid", "Susanti"};  
    System.out.println("Absen Pertama :"+nama[0]);
    System.out.println("Absen Terakhir :"+nama[4]);
    //array multidimensi
        System.out.println("\nhasil array multidimensi");
    String[][] favfruit ={{"Upin","Semangka"},{"Ipin","Melon"},{"Memei","Jeruk"},{"Jarjid","Jambu"},{"Susanti","Kelengkeng"}};
    for (int a=0; a <favfruit.length; a++){
            System.out.println("Nama :"+favfruit[a][0]);
            System.out.println("Buah Kesukaan :"+favfruit[a][1]);
            System.out.println(" ");
    }
}
}