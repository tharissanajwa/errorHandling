import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine(); // Membaca baris teks dari input pengguna

        int age = 0;
        boolean isMarried = false;

        // Input umur dengan error handling
        boolean umurValidasi = false;
        while (!umurValidasi) {
            try {
                System.out.print("Masukkan umur Anda: ");
                age = scanner.nextInt(); // Membaca nilai integer dari input pengguna
                umurValidasi = true;
            } catch (InputMismatchException e) {
                System.out.println("Input umur yang Anda masukkan salah, format harus berupa angka. Silahkan coba kembali.");
                scanner.next();
            }
        }

        // Input status pernikahan dengan error handling
        boolean statusValidasi = false;
        while (!statusValidasi) {
            try {
                System.out.print("Apakah Anda sudah menikah? (true/false): ");
                isMarried = scanner.nextBoolean(); // Membaca nilai boolean dari input pengguna
                statusValidasi = true;
            } catch (InputMismatchException e) {
                System.out.println("Input status yang Anda masukkan salah, formatnya harus berupa true bila sudah menikah dan false bila belum menikah. Silahkan coba kembali.");
                scanner.next();
            }
        }

        scanner.close();

        // Output data
        System.out.println("Output : ");
        System.out.println("Hallo " + name);
        System.out.println("Usia mu " + age + " tahun");
        System.out.print("Dan kamu ");
        if (isMarried) {
            System.out.print("sudah ");
        } else {
            System.out.print("belum ");
        }
        System.out.print("menikah");
    }
}