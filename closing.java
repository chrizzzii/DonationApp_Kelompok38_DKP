
import java.util.*;

public class closing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("===================================");
            System.out.println("    Silahkan pilih bank tujuan :   ");
            System.out.println("           1. BNI                  ");
            System.out.println("           2. BCA                  ");
            System.out.println("           3. BRI                  ");
            System.out.println("           4. Mandiri              ");
            System.out.println("===================================");

            int opsi = scan.nextInt();

            System.out.println();

            if (opsi == 1) {
                System.out.println("  No. Rekening: 78 78 0 78 003   ");
                System.out.println("    Atas Nama: PROGRAM DONASI    ");
                break;
            } else if (opsi == 2) {
                System.out.println("  No. Rekening: 7401 18 1800     ");
                System.out.println("    Atas Nama: PROGRAM DONASI    ");
                break;
            } else if (opsi == 3) {
                System.out.println("No. Rekening: 03850 1000 265 303 ");
                System.out.println("    Atas Nama: PROGRAM DONASI    ");
                break;
            } else if (opsi == 4) {
                System.out.println(" No. Rekening: 167 000 110 8314  ");
                System.out.println("    Atas Nama: PROGRAM DONASI    ");
                break;
            } else
                System.out.println("Opsi tidak ditemukan, silahkan pilih lagi");
        }
        System.out.println();
        System.out.println("=================================");
        System.out.println("  Terima kasih atas donasi anda  ");
        System.out.println(" semoga bermanfaat bagi penerima ");
        System.out.println("=================================");
    }
}
public class closing{

}
