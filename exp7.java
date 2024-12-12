import java.util.ArrayList;
import java.util.List;

import static oop.GENERICSS.isPrime;

public class exp7{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i<101 ; i++){
            arr.add(i);
        }
        System.out.println("The Palindroms are: "+pali(arr));
        System.out.println("The Even Numbers are: "+even(arr));
        System.out.println("The Odd Numbers are: "+odd(arr));
        System.out.println("The Prime Numbers are: "+prime(arr));


    }
    static List<Integer> pali(List<Integer> arr){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < arr.size() ; i++){
            if(isPali(arr.get(i))){
                ans.add(arr.get(i));
            }
        }
        return ans;
    }
    static List<Integer> even(List<Integer> arr){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < arr.size() ; i++){
            int n = arr.get(i);
            if(n%2==0){
                ans.add(n);
            }
        }
        return ans;
    }

    static List<Integer> odd(List<Integer> arr){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < arr.size() ; i++){
            int n = arr.get(i);
            if(n%2!=0){
                ans.add(n);
            }
        }
        return ans;
    }

    static List<Integer> prime(List<Integer> arr){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < arr.size() ; i++){
            if(isprime(arr.get(i))){
                ans.add(arr.get(i));
            }
        }
        return ans;
    }

     static boolean isprime(Integer integer) {
        int temp = integer;
        for(int i = 2 ; i<=Math.sqrt(temp) ; i++){
            if(temp%i==0) return false;
        }
        return true;
    }

    static boolean isPali(int integer) {
        int temp = integer;
        int ans = 0;
        while (temp!=0){
            int te = temp%10;
            ans = ans*10+te;
            temp=temp/10;
        }
        return (ans==integer);
    }
}
