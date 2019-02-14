
import java.util.Scanner;

class Thrads1 extends Thread {

    @Override
    public void run() {
        System.out.println("Banking activity started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account number");
        int an = scan.nextInt();
        System.out.println("Enter the password");

        int pwd = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking activity completed");

    }
}

class Thrads2 extends Thread {

    @Override
    public void run() {
        try {

            System.out.println("Printing activity started");

            for (int i = 1; i <= 10; ++i) {
                System.out.println("ABC");
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing activity completed");
    }
}

class Thrads3 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Addition stared");
            int a = 5467;
            int b = 4532;
            int c = a + b;
            System.out.println(c);

            System.out.println("Addition ended");
        } catch (Exception e) {
        }
    }

}

public class MLThreading5 {

    public static void main(String[] args) throws InterruptedException {
        Thrads1 t1 = new Thrads1();
        Thrads2 t2 = new Thrads2();
        Thrads3 t3 = new Thrads3();
        t1.start();

        t2.start();

        t3.start();
    }
}
