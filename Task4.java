import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Lets do some for loop ko assignments");
    }
}
//1.WAP to print the first 10 multiples of 2.
class MultipleOF2{
    public static void main(String[] args){
        int multipleOF = 2;
        for (int i=1 ; i<=10 ; i++){
            System.out.println(multipleOF + "x" + i + "=" + (multipleOF*i));
        }
    }
}
// 2.WAP to take your name and age as user input and print it 5 times using for loop.
class NameAndAge{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scn.nextLine();
        System.out.println("My name is " + name);

        System.out.println("Enter your age: ");
        String age = scn.nextLine();
        System.out.println("My age is " + age);
        for (int i=0 ;i<5 ; i++ ){
            System.out.println("My name is " + name);
            System.out.println("My age is " + age);
        }
    }
}
// 3.WAP to print the initialization and condition for the
// for loop and print the even numbers present in between it.
class EvenNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the initialization point which is even: ");
        int iniPoint = scn.nextInt();

        System.out.println("Enter the condition: ");
        int Condition = scn.nextInt();

        for (int i = iniPoint ; i<Condition ; i+=2){
            System.out.println(i);
        }
    }
}

//4.WAP to print the initialization and condition for the for loop and print
// the sum of all the even numbers present in between it.

class SumOFEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the initialization point which is even: ");
        int iniPoint = scn.nextInt();

        System.out.println("Enter the condition: ");
        int Condition = scn.nextInt();

        int sum = 0;

        for (int i = iniPoint; i < Condition; i += 2) {
            System.out.println(i);
            sum =sum+i ;
            System.out.println("The sum of the even numbers are: " + sum );
        }
    }
}



