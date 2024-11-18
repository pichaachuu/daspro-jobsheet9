import java.util.*;
public class Pertanyaan2 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("=== SISTEM PEMESANAN CAFE ===");
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input13.nextInt();
        input13.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        System.out.println("\n=== INPUT PESANAN ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i+1));

            System.out.print("Nama pesanan: ");
            namaPesanan[i] = input13.nextLine();

            System.out.print("Harga: Rp. ");
            hargaPesanan[i] = input13.nextInt();
            input13.nextLine();
        }

        int totalBiaya = 0;
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("\n========== DAFTAR PESANAN ==========");
        System.out.println("No.\tNama Pesanan\t\tHarga");
        System.out.println("============================================");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%d.\t%-20s\tRp %,d%n",
                                    (i+1), namaPesanan[i], hargaPesanan[i] );
        }
        System.out.println("=============================================");
        System.out.printf("Total Biaya:\t\t\tRp %,d%n", totalBiaya);

        input13.close();
    }
}
