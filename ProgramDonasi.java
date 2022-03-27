import java.util.Scanner;


public class ProgramDonasi {
    public static void main(String[] args) {

        boolean ulang = false;
        do {
            Scanner sc = new Scanner(System.in);

            //Ini halaman login
            String emailuser, passworduser;
            Scanner input = new Scanner(System.in);
            System.out.print("Email : ");
            emailuser = input.nextLine();
            System.out.print("Password : ");
            passworduser = input.nextLine();
            userService halamanlogin = new userService(emailuser, passworduser);
            halamanlogin.login(); //Autentikasi Inputan User
            boolean statud = halamanlogin.login();

            if(statud){


                //Interface Awal Donasi
                System.out.println("Selamat Datang di Program Donasi");
                System.out.println("Pilih tempat Anda berdonasi: ");
                listNamaTempatDonasi(); //Output List Nama Tempat Donasi
                int pilihTempatDonasi = sc.nextInt();
                String[] tempatDonasi = {"Panti Asuhan", "Panti Jompo", "Rumah Ibadah"};
                System.out.println("Masukkan nomor Nama Tempat Donasi");

                //Pilih Tempat Donasi
                String[] metode = {"BCA", "BNI", "BRI"};
                String[] daerah = {"Jakarta", "Bandung", "Semarang"};

                System.out.println("Silahkan pilih daerah tujuan donasi");
                for (String s : daerah) {
                    System.out.println("|||     " + s + "     |||");
                }

                System.out.println("");
                System.out.println("Masukkan nomor daerah: ");
                int nomordaerah = sc.nextInt();
                namadaerah(nomordaerah);
                System.out.println("Anda akan berdonasi pada " + tempatDonasi[pilihTempatDonasi - 1] + " di daerah " + daerah[nomordaerah - 1]);

                System.out.println("Silahkan pilih metode pembayaran: ");
                for (String a : metode) {
                    System.out.println("|||     " + a + "     |||");
                }
                int nomormetode = sc.nextInt();
                namametode(nomormetode);

                if (nomormetode == 1) {
                    System.out.println("  No. Rekening: 78 78 0 78 003   ");
                    System.out.println("    Atas Nama: PROGRAM DONASI    ");
                } else if (nomormetode == 2) {
                    System.out.println("  No. Rekening: 7401 18 1800     ");
                    System.out.println("    Atas Nama: PROGRAM DONASI    ");
                } else if (nomormetode == 3) {
                    System.out.println("No. Rekening: 03850 1000 265 303 ");
                    System.out.println("    Atas Nama: PROGRAM DONASI    ");
                } else {
                    System.out.println("Opsi tidak ditemukan, silahkan pilih lagi");
                }

                System.out.println("Masukkan jumlah donasi: ");
                int jumlahDonasi = sc.nextInt();

                System.out.println("Rincian");
                System.out.println("Anda akan berdonasi kepada " + tempatDonasi[pilihTempatDonasi - 1] + " di daerah " + daerah[nomordaerah - 1] + " Dengan metode pembayaran " + metode[nomormetode - 1] + " Sebesar Rp " + jumlahDonasi);

                System.out.println("=================================");
                System.out.println("  Terima kasih atas donasi anda  ");
                System.out.println(" semoga bermanfaat bagi penerima ");
                System.out.println("=================================");
                System.out.println("Apakah Anda ingin berdonasi kembali? ");
                System.out.println("1. YA / 2.TIDAK");

                int donasiKembali = sc.nextInt();

                switch (donasiKembali) {
                    case 1 -> ulang = true;
                    case 2 -> ulang = false;
                }
            }
           else {
                System.out.println("PROGRAM BERHENTI");
            }

        }//Selesai
        while (ulang == true);
    }


    //Fungsi Nama Tempat Donasi
    static void listNamaTempatDonasi() {
        String[] tempatDonasi = {"Panti Asuhan", "Panti Jompo", "Rumah Ibadah"};
        System.out.println("======Silahkan pilih tempat Donasi======");

        for (int namaTempatDonasi = 0; namaTempatDonasi < 3; namaTempatDonasi++) {
            int UrutanNamaTempatDonasi = namaTempatDonasi + 1;
            System.out.println("|||          " + UrutanNamaTempatDonasi + ". " + tempatDonasi[namaTempatDonasi] + "         |||");
        }
    }

    //Fungsi Daerah Donasi
        static void namadaerah(int kota) {
            String[] daerah = {"Jakarta", "Bandung", "Semarang"};
        }

        static void namametode(int bayar) {
            String[] metode = {"BCA", "BNI", "BRI"};
            System.out.println("Metode pembayaran yang akan anda gunakan adalah dengan menggunakan Bank " + metode[bayar - 1]);
        }


    }
