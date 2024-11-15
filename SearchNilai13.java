import java.util.*;
public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int jumlahMHS;
        int key;
        boolean found = false;
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        jumlahMHS = input13.nextInt();
        
        int[] arrNilai = new int[jumlahMHS];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ":");
            arrNilai[i] = input13.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari :");
        key = input13.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                found = true;
                System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + i );
                break;
            }
        }
        if (!found) {
            System.out.println("Nilai yang dicari tidak ditemukan");

        }

        // System.out.println();
        // System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        // System.out.println();
        input13.close();
    }
}
