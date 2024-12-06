import java.util.Scanner;

public class ujian31 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] kehadiran = new int[jumlahSiswa];
        
        int totalKehadiran = 0;
        int hariKerja = 24; 
        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();
            totalKehadiran += kehadiran[i];
        }

        double rataRata = (double) totalKehadiran / jumlahSiswa;

        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + hariKerja + " Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }
        System.out.printf("\nRata-rata kehadiran siswa: "+ rataRata +" hari\n");

        //  kesimpulan    
        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
        System.out.println("\n- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
    }
}

    
    