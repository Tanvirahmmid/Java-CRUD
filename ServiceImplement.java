import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImplement implements Service {
    Scanner sc= new Scanner(System.in);
    List<User> newUser=new ArrayList<>();

    @Override
    public void addUser() {
        System.out.println("Welcome !! Please fill all info.");
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Email");
        String email = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        System.out.println("Enter Account number");
        int accountNum = sc.nextInt();
        System.out.println("Phone number");
        int phoneNumber = sc.nextInt();
        User userobj = new User(name, email, password, accountNum, phoneNumber);
        if (newUser.contains(userobj)) {
            System.out.println("User already in");
        } else {
            newUser.add(userobj);
            System.out.println("Add New Account SuccessFull");
        }
    }

    @Override
    public void showUser() {
        System.out.println("Here is all user info");
        for(User s: newUser){
            System.out.println("Your Name is: "+s.getName()+" Your Email is: "+s.getEmail()+ " Your Account Number is: "+s.getAccountNum()+" Your Phone number is :"+s.getPhoneNumber() );
        }
    }

    @Override
    public void editUser() {
        System.out.print("Enter the Account Number : ");
        int updateAccount = sc.nextInt();

        boolean found = false;
        for (User s : newUser) {
            if (s.getAccountNum() == updateAccount) {
                System.out.print("Enter new name: ");
                sc.nextLine();
                String updatedName = sc.nextLine();
                s.setName(updatedName);
                System.out.println("Account updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

    }

    @Override
    public void deleteUser() {
        System.out.println("Enter Account Number to delete Account");
        int dltAccount=sc.nextInt();
        boolean remove= false;
        for(User s:newUser){
            if(s.getAccountNum()==dltAccount){
                newUser.remove(s);
                System.out.println("Delete successfully");
                remove=true;
            }
        }
        if(!remove){
            System.out.println("Wrong Account number");
        }

    }

    public void exit(){
        sc.close();
        System.out.println("Exiting the application...");
        System.exit(0);
    }
}
