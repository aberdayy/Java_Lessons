import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 'Name', 'Surname', 'accountNumber' and 'password' to access your Bank account:");
        String name=sc.nextLine();
        String surname=sc.nextLine();
        int accountNumber= Integer.parseInt(sc.nextLine());
        String password=sc.nextLine();



        baseCustomerManager baseCustomerManager = new baseCustomerManager();
        baseCustomerManager.setName(name);
        baseCustomerManager.setSurname(surname);
        baseCustomerManager.setPassword(password);
        baseCustomerManager.setAccountNumber(accountNumber);


        baseCustomerManager.getName();
        baseCustomerManager.getSurname();
        baseCustomerManager.getAccountNumber();
        baseCustomerManager.getPassword();


    }
}