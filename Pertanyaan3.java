import java.util.*;
public class Pertanyaan3 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("======= Menu Cafe =======");
        String[] menu = {"Nasi Goreng", "Mie Goreng" , "Roti Bakar", "Kentang Goreng",
                        "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        String key;
        System.out.print("Masukkan Menu Yang Ingin Dicari: ");
        key = input13.nextLine();

        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                found = true;
                System.out.println("Menu Tersedia");
                break;
            }
        }
        if (!found) {
            System.out.println("Menu Tidak Tersedia Di Menu");
            System.out.println("Silahkan Order Menu Lain");
        }
        input13.close();
    }
}
