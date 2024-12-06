import java.util.Scanner;

public class ujian22 {

    // Fungsi untuk menghitung luas permukaan bola
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola (r): ");
        int jari = scanner.nextInt();
        luas(jari);
    }
    public static void luas(int jari) {
        double PI = 3.14;
        double total = 4 * PI*jari*jari;
        System.out.println("Luas permuakaan bola = 4 * 3.14 * " +jari + " x " +jari);
        System.out.println("total = "+total);
        
    }
}
