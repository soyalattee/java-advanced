package prac01;

public class iPhone extends Phone {


    public iPhone() {
        super();
        this.brand = "애플";
    }
    @Override
    void printLogo(){
        System.out.println("@@@ Apple @@@");
    }
    @Override
    void turnOn(){
        System.out.println("@@@ 폰 켜지는중 @@@");
    }

}
