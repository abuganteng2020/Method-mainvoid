
import java.io.InputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMAD
 */
public class Scanner {

    public Scanner(InputStream in) {
    }//tipe data dan variabel
    String nama, nama2, jenis, makanan, jawaban, jawaban3;
    Boolean jawaban2 = true;

    //method void pertama
    void KelompokHewan() {
        //scanner untuk input oleh user
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Hewan : ");
        nama = input.nextLine();
        System.out.println();
        System.out.println("<<< Jenis Makanan Hewan >>>");
        System.out.println("1.Daging");
        System.out.println("2.Tumbuhan");
        System.out.println("3.Daging dan Tumbuhan");
        System.out.println();
        System.out.print("Masukkan Makanan Hewan : ");
        makanan = input.nextLine();
        System.out.println();
        System.out.println("hasil pendataan :");
        System.out.println();

        //percabangan
        if (makanan.equalsIgnoreCase("Tumbuhann")) {
            System.out.println(nama + " merupakan hewan berjenis Herbivora");
        } else if (makanan.equals("2")) {
            System.out.println(nama + " merupakan hewan berjenis Herbivora");
        } else if (makanan.equalsIgnoreCase("Daging")) {
            System.out.println(nama + " merupakan hewan berjenis Karnivora");
        } else if (makanan.equals("1")) {
            System.out.println(nama + " merupakan hewan berjenis Karnivora");
        } else if (makanan.equalsIgnoreCase("Daging dan Tumbuhan")) {
            System.out.println(nama + " merupakan hewan berjenis Omnivora");
        } else if (makanan.equals("3")) {
            System.out.println(nama + " merupakan hewan berjenis Omnivora");
        } else {
            System.out.println("Mungkin itu hewan jadi - jadian");
        }
    }

    //perulangan kedua
    void Perulangan() {
        //scanner untuk input oleh user
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.print("Masukkan Nama Tumbuhan : ");
        nama2 = input.nextLine();
        System.out.println();
        System.out.println("<<< Daftar Jenis Tumbuhan : >>>");
        System.out.println("1.Dikotil");
        System.out.println("2.Monokotil");
        System.out.print("Jenis Tumbuhan : ");
        jenis = input.nextLine();
        System.out.println();
        System.out.println("hasil pendataan :");
        System.out.println();
        //percabangan
        if (jenis.equalsIgnoreCase("Dikotil")) {
            System.out.print(nama2 + " merupakan tumbuhan berkeping ");
            //perulangan untuk menampilkan nilai
            for (int a = 1; a < 2; a++) {
                System.out.print(a);
            }
        } else if (jenis.equals("1")) {
            System.out.print(nama2 + " merupakan tumbuhan berkeping ");
            //perulangan untuk menampilkan nilai
            for (int a = 1; a < 2; a++) {
                System.out.print(a);
            }
        } else if (jenis.equalsIgnoreCase("Monokotil")) {
            System.out.print(nama2 + " merupakan tumbuhan berkeping ");
            //perulangan untuk menampilkan nilai
            for (int b = 2; b <= 2; b++) {
                System.out.print(b + " ");
            }
        } else if (jenis.equals("2")) {
            System.out.print(nama2 + " merupakan tumbuhan berkeping ");
            //perulangan untuk menampilkan nilai
            for (int b = 2; b <= 2; b++) {
                System.out.print(b + " ");
            }
        } else {
            System.out.println("Jenis Tidak Tersedia");
        }
    }

    void perulangan2() {
        Scanner input = new Scanner(System.in);
        System.out.println();

        while (jawaban2) {
            System.out.println("Ingin melakukan pencarian lagi ? ");
            System.out.print("Jawab [ya/tidak]> ");
            System.out.print("jawaban : ");
            jawaban3 = input.nextLine();

            if (jawaban3.equalsIgnoreCase("ya")) {
                KelompokHewan();
                Perulangan();
                perulangan2();
                
            } else {
                jawaban2 = false;
            }
        }
    }

    private String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
}
