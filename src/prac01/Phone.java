package prac01;

public class Phone {

        String brand;
        String type;
        int price;
        String color;
        String phoneNumber;
        Boolean power;
        Person owner;

        public Phone(Person owner){
                this.owner = owner;
        }

        void buy(){

        }
        void turnOn(){
                printLogo();
                System.out.println("핸드폰이 켜졌습니다.");
        }


        void turnOff(){
                System.out.println("띠로리로.");
        }

        void printLogo(){}
}
