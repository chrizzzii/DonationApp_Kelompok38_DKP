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
        halamanlogin.login();

        //Interface Donasi
        System.out.println("Selamat Datang di Program Donasi");
        System.out.println("Pilih tempat Anda berdonasi: ");
        tempatdonasi daftar = new tempatdonasi();
        System.out.println(daftar);


    }
}
