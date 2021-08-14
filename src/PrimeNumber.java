import javax.swing.*;
import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {

        String n1= JOptionPane.showInputDialog("Enter First Number ");
        String n2 = JOptionPane.showInputDialog("Enter Second Number ");

        int number1 = Integer.parseInt(n1);
        int number2 = Integer.parseInt(n2);

        System.out.println("Prime Numbers are : " + findPrimes(number1, number2));
    }

        public static ArrayList<Integer> findPrimes(int start ,int end) {
        ArrayList<Integer> primes = new ArrayList<Integer> ();

        for (int n=start; n<=end ; n++){

            boolean prime = true;
            int i = 2;
            while (i <= n/2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;

            }
            if (prime){
                primes.add(n);
            }
        }

        return primes;

    }

}
