import java.util.Scanner;



public class ProgramDonasi {
    public static void main(String[] args) {

        //Ini halaman login
        String emailuser, passworduser;
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        emailuser = input.nextLine();
        System.out.print("Password : ");
        passworduser = input.nextLine();
        userService halamanlogin = new userService(emailuser, passworduser);
        halamanlogin.login(); //Autentikasi Inputan User

        //Interface Awal Donasi
        System.out.println("Selamat Datang di Program Donasi");
        System.out.println("Pilih tempat Anda berdonasi: ");
        listNamaTempatDonasi(); //Output List Nama Tempat Donasi


    }

    static void listNamaTempatDonasi(){
        String tempatDonasi[] = {"Panti Asuhan, Panti Jompo, Rumah Ibadah, Rumah Ibadah"};
        System.out.println("======Silahkan pilih BANK======");

        for (int namaTempatDonasi = 0; namaTempatDonasi < 3; namaTempatDonasi++) {
            int UrutanNamaTempatDonasi = namaTempatDonasi + 1;
            System.out.println("|||          " + UrutanNamaTempatDonasi + ". " + tempatDonasi[namaTempatDonasi] + "         |||");
        }
    }

}
