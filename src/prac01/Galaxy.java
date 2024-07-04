package prac01;

public class Galaxy extends Phone {
    String model;
    public Galaxy(Person owner) {
        super(owner);
        this.brand = "삼송";
    }
    @Override
    public  void printLogo(){
        System.out.println("*** Samsung ***");

    }
    @Override
    void buy(){
        System.out.println( owner.name +"님이 "+ brand+"을 구매했습니다");
    }
    @Override
    void turnOn(){
        System.out.println( owner.name +"님이 삼송폰을 켰습니다.");
        System.out.println("*** 폰 켜지는중 ***");
    }
}
