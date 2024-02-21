import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ServiceImplement imp=new ServiceImplement();
        while (true){
            System.out.println("1.. Create Account");
            System.out.println("2.. Show User info");
            System.out.println("3.. Delete User");
            System.out.println("4.. Update Account info");
            System.out.println("5.. Exit");

            int select=sc.nextInt();
            if(select==1){
                imp.addUser();
            } else if (select==2) {
                imp.showUser();
            } else if (select==3) {
                imp.deleteUser();
            } else if (select==4) {
                imp.editUser();
            } else if (select==5) {
                imp.exit();


            }else {
                System.out.println("Incorrect selection! Please try Again");
            }
        }
    }
}