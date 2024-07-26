class BankAccount{
    public String username;
    private String password;
    void setPass(String password){
        this.password=password;
    }
    public String getPass(){
        return this.password;
    }
}

public class Main1{
    public static void main(String arg[]){
        BankAccount obj = new BankAccount();
        obj.username="kanhaiya123";
        obj.setPass("Abc@123");
        System.out.println(obj.username);
        System.out.println(obj.getPass());
    }
}