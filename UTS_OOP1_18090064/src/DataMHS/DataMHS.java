/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataMHS;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ade Sug
 */
public class DataMHS {
public static void main(String args[]) {
        DataMHS mhs = new DataMHS();
        Scanner sc = new Scanner(System.in);
        while (true) {
            mhs.printMenu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Form Tambah Data");
                    mhs.addData();
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Form Ubah Data");
                    mhs.ubahData();
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.println("Form Hapus Data");
                    mhs.hapusData();
                    break;
                case 4:
                    System.out.println("==================================");
                    System.out.println("Lihat Data");
                    mhs.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang akan dihapus : ");
        int idx = Integer.parseInt(sc.nextLine());
        
        operasi.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang akan diubah : ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.println("===================================");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Kelas : ");
        String Kelas = sc.nextLine();
        
       
        operasi.editData(new Data(nama, nim, Kelas), idx - 1);
    }

    public void listData() {
        
        List<Data> result = operasi.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Kelas : " + result.get(i).getKelas());
           
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Kelas : ");
        String Kelas = sc.nextLine();
       
        
        operasi.addData(new Data(nama, nim, Kelas));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("=================================");
        System.out.println("Aplikasi Perekaman Data Mahasiswa");
        System.out.println("=================================");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}
