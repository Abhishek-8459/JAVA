import java.util.Scanner;

interface vehicle{
     void gear_change();
    void speed_up();
    void apply_brakes();
}
class bicycle implements vehicle {
    Scanner sc = new Scanner(System.in);
    int gear;
    int speed;
    String name;

    bicycle() {
        gear = 0;
        speed = 0;
        System.out.println("Enter name of the bicycle");
        name = sc.next();
        System.out.println("The name of the bicycle is :" + name);
        ;
    }

    public void gear_change() {
        if (gear + 1 <= 4) {
            gear++;
            System.out.println("he current gear is: " + gear);
        } else {
            System.out.println("Your bicycle is at the highest speed");
        }
    }

    public void speed_up() {
        System.out.println("How much to increase?");
        int n = sc.nextInt();
        if (speed + n <= 15) {
            speed += n;
            System.out.println("the speed of the bicycle is: " + speed + "KMPH");
        } else {
            speed = 12;
            System.out.println("Your bicycle is  at its maximum speed 15KMPH");
        }
    }
    public void apply_brakes() {
        if (speed != 0) {
            speed -= 5;
            gear--;
            System.out.println("Brakes applied , and the current speed is: " + speed);
        } else {
            System.out.println("Your Bike is stopped");
        }
    }
    void opreation(){
        System.out.println("Select an operation\n1.gear up\n2.speed up\n3.apply brakes");
        int n = sc.nextInt();
        switch (n){
            case 1: gear_change();opreation();break;
            case 2: speed_up();opreation();break;
            case 3: apply_brakes();opreation();break;
            default: break;
        }
    }
}

    class bike implements vehicle {
        Scanner sc = new Scanner(System.in);
        int gear;
        int speed;
        String name;

        bike() {
            gear = 0;
            speed = 0;
            System.out.println("Enter name of the bike");
            name = sc.next();
            System.out.println("The name of the bike is :" + name);
            ;
        }

        public void gear_change() {
            if (gear + 1 <= 5) {
                gear++;
                System.out.println("he current gear is: " + gear);
            } else {
                System.out.println("Your bicycle is at the highest speed");
            }
        }

        public void speed_up() {
            System.out.println("How much to increase?");
            int n = sc.nextInt();
            if (speed + n <= 25) {
                speed += n;
                System.out.println("the speed of the bike is: " + speed + "KMPH");
            } else {
                speed = 25;
                System.out.println("Your bike is  at its maximum speed 25KMPH");
            }
        }

        public void apply_brakes() {
            if (speed != 0) {
                speed -= 5;
                gear--;
                System.out.println("Brakes applied , and the current speed is: " + speed);
            } else {
                System.out.println("Your Bike is stopped");
            }
        }
        void opreation(){
            System.out.println("Select an operation\n1.gear up\n2.speed up\n3.apply brakes");
            int n = sc.nextInt();
            switch (n){
                case 1: gear_change();opreation();break;
                case 2: speed_up();opreation();break;
                case 3: apply_brakes();opreation();break;
                default: break;
            }
        }
    }

    class car implements vehicle {
        Scanner sc = new Scanner(System.in);
        int gear;
        int speed;
        String name;

        car() {
            gear = 0;
            speed = 0;
            System.out.println("Enter name of the car");
            name = sc.next();
            System.out.println("The name of the car is :" + name);
            ;
        }

        public void gear_change() {
            if (gear + 1 <= 6) {
                gear++;
                System.out.println("he current gear is: " + gear);
            } else {
                System.out.println("Your bicycle is at the highest speed");
            }
        }

        public void speed_up() {
            System.out.println("How much to increase?");
            int n = sc.nextInt();
            if (speed + n <= 60) {
                speed += n;
                System.out.println("the speed of the car is: " + speed + "KMPH");
            } else {
                speed = 60;
                System.out.println("Your bicycle is  at its maximum speed 60KMPH");
            }
        }

        public void apply_brakes() {
            if (speed != 0) {
                speed -= 10;
                gear--;
                System.out.println("Brakes applied , and the current speed is: " + speed);
            } else {
                System.out.println("Your car is stopped");
            }
        }
        void opreation(){
            System.out.println("Select an operation\n1.gear up\n2.speed up\n3.apply brakes");
            int n = sc.nextInt();
            switch (n){
                case 1: gear_change();opreation();break;
                case 2: speed_up();opreation();break;
                case 3: apply_brakes();opreation();break;
                default: break;
            }
        }
    }

    public class exp5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("select your vehicle\n1.Bicycle\n2.Bike\n3.Car");
            int n = sc.nextInt();
            switch (n){
                case 1: bicycle b = new bicycle();
                b.opreation();
                break;
                case 2: bike bi = new bike();
                bi.opreation();
                break;
                case 3:
                    car c = new car();
                    c.opreation();
                    break;
                default:
                    System.out.println("enter valid vehicle");
                    break;
            }
        }
    }


