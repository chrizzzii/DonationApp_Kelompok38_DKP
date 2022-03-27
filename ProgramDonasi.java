import java.util.Scanner;

public class ProgramDonasi {
    public static void main(String[] args) {

        String email, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        userService halamanlogin = new userService(email, password);
        halamanlogin.login();
    }
}
