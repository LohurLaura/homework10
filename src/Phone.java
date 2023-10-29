public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public void displayModel(){
        System.out.println("Phone model: " + model);
    }

    public void callNumber(String phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
}
