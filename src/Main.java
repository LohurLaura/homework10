public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Mark", 1000, 34567890);
        Client client2 = new Client("Jeff", 5000, 345678901);
        Client client3 = new Client("Marta", 9000, 455556789);

        System.out.println(client1.sayTere());

        int firstValue = 10;
        int secondValue = 5;
        int difference = Client.calculateDifference(firstValue,secondValue);
        System.out.println("The difference between" + firstValue + "and" + secondValue + "is" + difference);
    }
}