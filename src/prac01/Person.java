package prac01;

public class Person {
    String name;
    int age;
    int weight;

    // 기본 생성자
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0;
    }
    // 매개변수가 있는 생성자
    public Person(String name) {
        this.name = name;
    }

    // 매개변수가 있는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 매개변수가 있는 생성자
    public Person( int age,int weight) {
        this.age = age;
        this.weight = weight;
    }

    void introduce(){
        String intro = "안녕하세요, 저는 "+age+"살"+name+"입니다.";
        System.out.println(intro);
    }

    public void setPersonInfo(String name, int age){
        this.name = name;
        if(age >0 ) this.age = age;
        else System.out.println("0이 넘는 값만 입력하세요.");
    }
}
