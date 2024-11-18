import java.util.*;
public class Pertanyaan1 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        double total = 0, rata2 = 0, tertinggi, terendah;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int mahasiswa = input13.nextInt();

        int[] nilaiMhs = new int[mahasiswa];

        System.out.print("Masukkan nilai mahasiswa ke-1 : ");
        nilaiMhs[0] = input13.nextInt();
        total += nilaiMhs[0];
        tertinggi = terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = input13.nextInt();
            total += nilaiMhs[i];
            
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("\nDaftar nilai mahasiswa: " + Arrays.toString(nilaiMhs));
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Nilai mahasiswa tertinggi: " + tertinggi);
        System.out.println("Nilai mahasiswa terendah: " + terendah);

        
        input13.close();
    }
}
