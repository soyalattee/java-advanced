package prac01;

public class Main {

    public static void main(String[] args) {
        Person jobs = new Person("잡스");
        Person jDragon = new Person("재용");
        iPhone iphone = new iPhone();
        Galaxy galaxy = new Galaxy();

        jobs.buyPhone(iphone);
        jobs.turnOnPhone();
        jDragon.buyPhone(galaxy);
        jDragon.turnOnPhone();
    }
}