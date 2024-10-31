import java.util.Scanner;

public class RataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalNilai=0, rataNilai;
        int nilaiMhs;

        for (int i = 1; i <= 5; i++) {
            i = 1;
            while (i <= 5) {
                totalNilai = 0;
                System.out.println("Input nilai mahasiswa ke-" + i);
                for (int j = 1; j <= 5; j++) {
                    System.out.print("Nilai ke-" + j + " = ");
                    nilaiMhs = sc.nextInt();
                    totalNilai += nilaiMhs;
                }
                rataNilai = totalNilai/5;
                i++;
                System.out.println("Rata-rata nilai mahasiswa ke-" + i + " adalah " + rataNilai);
            }
        }
    }
}