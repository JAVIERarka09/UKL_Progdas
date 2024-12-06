import java.util.Scanner;


    public class BilanganPrima {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
       // Meminta input dari pengguna
        System.out.print("Masukkan sebuah bilangan: ");
        int number = scanner.nextInt();
        if (number % 2 == number % 3) {
            System.out.println(number + " bukan bilangan prima");
        } else {
            System.out.println(number + " merupakan bilangan prima");
        }
        scanner.close();
    }
}

        
    