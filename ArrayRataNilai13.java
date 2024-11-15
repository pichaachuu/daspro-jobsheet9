import java.util.*;
public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int jumlahMHS;
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2lulus, rata2tidaklulus;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMHS = input13.nextInt();
        
        int[] nilaiMhs = new int[jumlahMHS];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input13.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus ++;
            } else {
                jumlahTidakLulus ++;
            }
        }
        // System.out.println("Jumlah mahasiswa yang lulus adalah " + jumlahLulus);

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2lulus = totalLulus/jumlahLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2lulus);
        rata2tidaklulus = totalTidakLulus/jumlahTidakLulus;
        System.out.println("Rata-rata nilai tidak lulus " + rata2tidaklulus);


        input13.close();
    }
}
