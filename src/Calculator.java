import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {

        String n1= JOptionPane.showInputDialog("Enter First Number ");
        String n2 = JOptionPane.showInputDialog("Enter Second Number ");

        int number1 = Integer.parseInt(n1);
        int number2 = Integer.parseInt(n2);

        int add = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 / number2;
        int rem = number1 % number2;


        System.out.println("Addition of " + number1+" and "+number2+ " is   : "+add);
        System.out.println("Substation of " + number1 + " and  "+number2 +" is : "+sub);
        System.out.println("Multiplication of "+ number1 + " and "+number2 +" is : "+mul);
        System.out.println("Division of  "+ number1 + " and   "+ number2 +" is : "+div);
        System.out.println("Reminder of  "+ number1 + " and   "+ number2 +" is : "+rem);
    }
}

