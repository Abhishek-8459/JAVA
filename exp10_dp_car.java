import java.util.ArrayList;
import java.util.List;

abstract class carM{
    protected String type;
    List<String> accessories= new ArrayList<>();
    public abstract void allocateAccessories();
    public abstract void finalMakeup();
    public void build(){
        allocateAccessories();
        finalMakeup();
    }
    public String toString(){
        return type+" with accessories: "+String.join(",",accessories);
    }

}
class sedan extends carM{
    sedan(){
        this.type="sedan";
    }
    public void allocateAccessories(){
        accessories.add("Sedan-specific accessories");
        accessories.add("luxury wheels");
    }
    public void finalMakeup(){
        accessories.add("Sedan Paint job");
    }
}

class hatchback extends carM{
    hatchback(){
        this.type="hatchback";
    }
    public void allocateAccessories(){
        accessories.add("Hatchback-specific accessories");
        accessories.add("compact wheels");
    }
    public void finalMakeup(){
        accessories.add("Hatchback Paint job");
    }
}

class SUV extends carM{
    SUV(){
        this.type="SUV";
    }
    public void allocateAccessories(){
        accessories.add("SUV-specific accessories");
        accessories.add("All terrain wheels");
    }
    public void finalMakeup(){
        accessories.add("SUV Paint job");
    }
}

class carFactory{
    public static carM createCar(String carType){
        carM car;
        switch (carType.toLowerCase()){
            case ("hatchback"):
                car = new hatchback();
                break;
            case ("sedan"):
                car=new sedan();
                break;
            case ("suv"):
                car= new SUV();
                break;
            default:throw new IllegalArgumentException("Unknown car type");
        }
        car.build();
        return car;
    }

}
public class exp10_dp_car {
    public static void main(String[] args) {
        carM sedan = carFactory.createCar("sedan");
        System.out.println(sedan);
        carM suv = carFactory.createCar("suv");
        System.out.println(suv);
        carM hatchback = carFactory.createCar("hatchback");
        System.out.println(hatchback);

    }
}
