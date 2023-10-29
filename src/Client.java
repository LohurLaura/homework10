public class Client {
    private String name;
    private double accountBalance;
    private int personalCode;

    public Client (String name, double accountBalance, int personalCode){
    this.name = name;
    this.accountBalance = accountBalance;
    this.personalCode = personalCode;
}
    public String sayTere(){
        return "Tere!";
}
    public static int calculateDifference (int a, int b){
        return a-b;
    }
}