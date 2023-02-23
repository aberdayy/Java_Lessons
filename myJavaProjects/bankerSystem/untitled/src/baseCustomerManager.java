public class baseCustomerManager {
    private String name;
    private String surname;
    private String password;
    private int accountNumber;
    private int age;
    private double ballance;
    //getter
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPassword(){
        return password;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getAge(){
        return age;
    }
    public double getBallance(){
        return ballance;
    }
    //setter
    public void setName(String MyName){
        this.name = MyName;
    }
    public void setSurname(String MySurname){
        this.surname = MySurname;
    }
    public void setPassword(String myPassword){
        this.password = myPassword;
    }
    public void setAccountNumber(int MyAccountNumber){
        this.accountNumber = MyAccountNumber;
    }
    public void setAge(int MyAge){
        this.age = MyAge;
    }
    public void setBallance(double MyBallace){
        this.ballance = MyBallace;
    }



}
