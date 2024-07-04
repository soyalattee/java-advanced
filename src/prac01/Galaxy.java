package prac01;

public class Galaxy extends Phone {
    String model;
    public Galaxy() {
        super();
        this.brand = "삼송";
    }
    @Override
    public  void printLogo(){
        System.out.println("*** Samsung ***");
    }
    @Override
    void turnOn(){
        System.out.println("*** 폰 켜지는중 ***");
    }
}
