import java.util.ArrayList;
import java.util.List;

interface paymentStrategy{
    public void pay(double amount);
}
class creditCard implements paymentStrategy{
    String creditCard_number;
    creditCard(String number){
        this.creditCard_number=number;
    }

    public void pay(double amount){
        System.out.println("paid "+amount+" using credit card: "+creditCard_number);
    }
}

class Paypal implements paymentStrategy{
    String email_id;
    Paypal(String id){
        this.email_id=id;
    }

    public void pay(double amount){
        System.out.println("paid"+amount+"using Paypal: "+email_id);
    }
}

class Bitcoin implements paymentStrategy{
    String id;
    Bitcoin(String number){
        this.id=number;
    }

    public void pay(double amount){
        System.out.println("paid"+amount+"using bitcoin: "+id);
    }
}

class shooping_cart{
    List<Double> item;
    paymentStrategy pay;
    shooping_cart(){
        item = new ArrayList<>();
    }
    void add(double it){
        item.add(it);
    }
    void setPayS(paymentStrategy p){
        this.pay=p;
    }
    void checkout(){
        if(pay==null){
            System.out.println("Payment strategy not set");
            return;
        }
        double total=0;
        for(int i = 0 ; i < item.size();i++){
            total+=item.get(i);
        }
        pay.pay(total);

    }
}
public class exp11_paymentst {
    public static void main(String[] args) {
        shooping_cart c = new shooping_cart();
        c.add(10.2);
        c.add(35);
        c.setPayS(new creditCard("abcd-6547-ased-9850"));
        c.checkout();
    }
}
