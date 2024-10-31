import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        for (int iOuter=1; iOuter<=N; iOuter++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(" " + N);
            }
            System.out.println();

            System.out.println(" " + N + "  " + " " + N);

            for (int j = 1; j <= N; j++) {
                System.out.print(" " + N);
            }
            System.out.println();
            break;
        }
    }
}