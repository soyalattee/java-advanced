package prac01;

public class iPhone extends Phone {


    public iPhone(Person owner) {
        super(owner);
        this.brand = "애플";
    }
    @Override
    void printLogo(){
        System.out.println("@@@ Apple @@@");
    }
    @Override
    void buy(){
        System.out.println( owner.name +"님이 "+ brand+"을 구매했습니다");
    }
    @Override
    void turnOn(){
        System.out.println( owner.name +"님이 애플폰을 켰습니다.");
        System.out.println("@@@ 폰 켜지는중 @@@");
    }

}
