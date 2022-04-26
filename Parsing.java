import javax.swing.*;
import java.util.Scanner;

public class Parsing {
    public static void main(String[] args){
         //parsing method usually numerical data maa use huncha
        Scanner scanner = new Scanner(System.in);
        // print matra ley yeutaii line maa lyaaucha println ley aarko line maa print garcha

        System.out.println("Enter a value for a: ");
        String a = scanner.nextLine();
        double x = Double.parseDouble(a);

        System.out.println("Enter a value for b: ");
        String b = scanner.nextLine();
        double y = Double.parseDouble(b);

        double z = x+y;
        System.out.println("The sum is: " + z);

    }
}


class UserIOJOptionPane{
    public static void main(String[] args){
        int num1,num2,answer;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the num 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the num 2: "));
        answer= num1+num2;
        JOptionPane.showMessageDialog(null,"The sum is: " + answer);

    }
}
class SIParsing{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        String principal = scanner.nextLine();
        Double p = Double.parseDouble(principal);

        System.out.println("Enter the rate: ");
        String rate = scanner.nextLine();
        Double q = Double.parseDouble(rate);

        System.out.println("Enter the time: ");
        String time = scanner.nextLine();
        Double r = Double.parseDouble(time);

        Double s = (p*q*r)/100;
        System.out.println("The Simple Interest is: " + s);
    }
}
class AreaParsing{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        String base = scanner.nextLine();
        Double b = Double.parseDouble(base);

        System.out.println("Enter the height: ");
        String height = scanner.nextLine();
        Double h = Double.parseDouble(height);

        Double AreaOfTriangle = (b*h)/2;
        System.out.println("The Area of triangle is: " + AreaOfTriangle);
    }
}