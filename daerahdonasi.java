import java.util.*;


public class daerahdonasi {

    static void namadaerah(int kota){
        String[] daerah={"Jakarta", "Bandung", "Semarang"};
        System.out.println("Anda akan berdonasi pada panti asuhan di daerah "+daerah[kota-1]);

    }

    static void namametode(int bayar){
        String[] metode={"BCA", "BNI", "BRI"};
        System.out.println("Metode pembayaran yang akan anda gunakan adalah dengan menggunakan Bank "+metode[bayar-1]);
    }
    public static void main(String[] args) {
        String[] metode={"BCA", "BNI", "BRI"};
        String[] daerah={"Jakarta", "Bandung", "Semarang"};

        Scanner sc= new Scanner(System.in);
        System.out.println("Silahkan pilih daerah tujuan donasi: ");
        for (String s : daerah){
        System.out.println("|||     "+s+"     |||");
    }
        System.out.println("");
        System.out.println("Masukkan nomor daerah");
        int nomordaerah=sc.nextInt();
        namadaerah(nomordaerah);

        System.out.println("Silahkan pilih metode pembayaran: ");
        for (String a : metode){
            System.out.println("|||     "+a+"     |||");
        }
        int nomormetode=sc.nextInt();
        namametode(nomormetode);
    }
}
