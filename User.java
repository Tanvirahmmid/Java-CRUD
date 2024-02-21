public class User {
    private String name;
    private String email;
    private String password;
    private int accountNum;
    private int phoneNumber;

    public User(String name, String email, String password, int accountNum, int phoneNumber){
        this.name=name;
        this.email=email;
        this.password=password;
        this.accountNum=accountNum;
        this.phoneNumber=phoneNumber;

    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public int getAccountNum(){
        return accountNum;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}
