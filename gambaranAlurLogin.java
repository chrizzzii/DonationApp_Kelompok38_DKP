import java.util.Scanner;
public class gambaranAlurLogin {
    public static void main(String[] args) {
        String emailuser, passworduser;
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        emailuser = input.nextLine();
        System.out.print("Password : ");
        passworduser = input.nextLine();
        userService halamanlogin = new userService(emailuser, passworduser);
    }
}