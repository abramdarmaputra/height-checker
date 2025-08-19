import java.util.Arrays;
import java.util.Scanner;

public class HeightChecker {
    
    public static int heightChecker(int[] height) {
        int[] expected = height.clone(); // salin array asli
        Arrays.sort(expected); // sort untuk expected
        int mismatch = 0;
        
        for (int i = 0; i < height.length; i++) {
            if (height[i] != expected[i]) {
                mismatch++;
            }
        }
        return mismatch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan array tinggi (pisahkan dengan spasi): ");
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");
        int[] height = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            height[i] = Integer.parseInt(parts[i]);
        }

        int result = heightChecker(height);
        System.out.println("Jumlah siswa yang tidak sesuai urutan: " + result);

        sc.close();
    }
}
