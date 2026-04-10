import java.util.Scanner;
public class FixedDeposit{
    public static void main(String[] args){
        char check = 'y';
        while(check=='y'){
            System.out.println("Enter your Principle amount, Time, and Rate");
            Scanner input = new Scanner(System.in);
            double P = input.nextInt();
            double T = input.nextInt();
            double R = input.nextInt();
            double A = 0;
            double F = 0;
            if(P>=1000 && T>=0 && T<=5 && R>=8 && R<=12){
                System.out.println("Principle: " + P);
                System.out.println("Annual Rate: " + R);
                System.out.println("Montly Rate: " + R/12);
                System.out.println("Time in Years: " + T);
                System.out.println("Time in Months: " + T*12);
                A = P*(1 + R/12) * 12 * T;
                System.out.println("Maturity Amount (before fees): " + A);
                System.out.println("Fee Rate : 0.5%");
                F = A*0.005;
                System.out.println("Fee Amount : " + F);
                System.out.println("Final Amount : " + (A-F));
                System.out.println("If you would like to continue, press y, otherwise press n");
                check = input.next().charAt(0); 
            }
    }
}
}