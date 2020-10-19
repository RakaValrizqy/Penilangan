package penilangan;
import java.util.Scanner;
public class Penilangan {
public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     String[] yn = {"Bawa", "Tidak"};
     int dendaMasker = 50000, dendaSTNK = 75000, dendaSIM = 100000;
     int pilihan, pilihan2, pilihan3;
     System.out.println("-----Program Proses Penilangan-----");
     System.out.println("Apakah anda membawa masker? ");
     for (int i = 0; i < yn.length; i++) {
         System.out.println(i+". "+yn[i]);
    }
     System.out.print("Masukkan pilihan anda : ");
     pilihan = input.nextInt();
     
     if (pilihan == 0) {
         System.out.println("Apakah anda membawa STNK?");
         for (int i = 0; i < yn.length; i++) {
             System.out.println(i+". "+yn[i]);
         }
         System.out.print("Masukkan pilihan anda : ");
         pilihan2 = input.nextInt();
         
         if (pilihan2 == 0) {
             System.out.println("Apakah anda membawa SIM?");
             for (int i = 0; i < yn.length; i++) {
                 System.out.println(i+". "+yn[i]);
             }
             System.out.print("Masukkan pilihan anda : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Perlengkapan anda Sangat Lengkap!");
                 System.out.println("Anda Aman!");
             } else if (pilihan3 == 1) {
                 System.out.println("Perlengkapan anda Kurang Lengkap!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+dendaSIM+",00");
                 System.out.println("Kendaraan anda juga akan kami tahan!");
             } else {
                 System.out.println("Error!");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang Program!");
             }
         } else if (pilihan2 == 1) {
             System.out.println("Apakah anda membawa SIM?");
             for (int i = 0; i < yn.length; i++) {
                 System.out.println(i+". "+yn[i]);
             }
             System.out.print("Masukkan pilihan anda : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Perlengkapan anda Kurang Lengkap!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+dendaSTNK+",00");
                 System.out.println("Kendaraan anda juga akan kami tahan!");
             } else if (pilihan3 == 1) {
                 System.out.println("Perlengkapan anda Kurang Lengkap!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+(dendaSTNK+dendaSIM)+",00");
                 System.out.println("Kendaraan anda juga akan kami tahan!");
             } else {
                 System.out.println("Error!");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang Program!");
             }
         } else {
             System.out.println("Error!");
             System.out.println("Kode yang anda masukkan salah!");
             System.out.println("Harap ulang Program!");
         }
    } else if (pilihan == 1) {
         System.out.println("Apakah anda membawa STNK?");
         for (int i = 0; i < yn.length; i++) {
             System.out.println(i+". "+yn[i]);
         }
         System.out.print("Masukkan pilihan anda : ");
         pilihan2 = input.nextInt();
         
         if (pilihan2 == 0) {
             System.out.println("Apakah anda membawa SIM?");
             for (int i = 0; i < yn.length; i++) {
                 System.out.println(i+". "+yn[i]);
             }
             System.out.print("Masukkan pilihan anda : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Perlengkapan anda Kurang Lengkap!");
                 System.out.println("Anda mendapat denda sebanyak : Rp "+dendaMasker+",00");
             } else if (pilihan3 == 1) {
                 System.out.println("Perlengkapan anda Kurang Lengkap!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+(dendaMasker+dendaSIM)+",00");
                 System.out.println("Kendaraan anda juga akan kami tahan!");
             } else {
                 System.out.println("Error!");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang Program!");
             }
         } else if (pilihan2 == 1) {
             System.out.println("Apakah anda membawa SIM?");
             for (int i = 0; i < yn.length; i++) {
                 System.out.println(i+". "+yn[i]);
             } 
             System.out.print("Masukkan pilihan anda : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Perlengkapan anda Kurang Lengkap!");
                 System.out.println("Anda mendapat denda sebanyak : Rp "+(dendaMasker+dendaSTNK)+",00");
                 System.out.println("Kendaraan anda juga akan kami tahan!");
             } else if (pilihan3 == 1) {
                 System.out.println("Perlengkapan anda Sangat Tidak Lengkap!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+(dendaMasker+dendaSTNK+dendaSIM)+",00");
                 System.out.println("Kendaraan anda juga akan kami tahan!");
             } else {
                 System.out.println("Error!");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang Program!");
             }
         } else {
             System.out.println("Error!");
             System.out.println("Kode yang anda masukkan salah!");
             System.out.println("Harap ulang Program!");
         }
    } else {
         System.out.println("Error!");
         System.out.println("Kode yang anda masukkan salah!");
         System.out.println("Harap ulang Program!");
    }
     
    }
    
}
