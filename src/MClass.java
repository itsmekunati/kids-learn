public class MClass {
    public static void main(String[] args) {

        int number = 21;
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) count ++;
        }
        if (count == 0){
            System.out.println("this number is a prime number:" + number);
        } else {
            System.out.println("this number is not a prime number:" + number);
        }


    }
}

