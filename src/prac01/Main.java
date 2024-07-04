package prac01;

public class Main {

    public static void main(String[] args) {
        Person jobs = new Person("잡스");
        Person jDragon = new Person("재용");
        iPhone phone = new iPhone(jobs);
        phone.brand = "samsong";

        Galaxy galaxy = new Galaxy(jDragon);
        galaxy.turnOn();

        iPhone iphone = new iPhone(jobs);
        iphone.turnOn();
    }
}