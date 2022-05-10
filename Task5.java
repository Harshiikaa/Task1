import org.xml.sax.SAXNotRecognizedException;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Lets do some iterations ko questions");
    }
}
//Question 1
//        Write a program to print numbers from 1 to 10.
class PrintNumbers{
    public static void main(String[] args) {
        for (int number =1; number<=10; number++){
            System.out.println(number);
        }
    }
}

//        Question 2
//        WAP to display even number between 10 and 30.
class EvenNumber{
    public static void main(String[] args) {
        for(int number = 10; number<30; number+=2){
            System.out.println(number);
        }
    }
}

//        Question 3
//        WAP to display the number of even numbers between 10 and 30.
class NoOfEvenNum{
    public static void main(String[] args) {
        int num = 10;
        int count= 0;
        while(num<=30){
            if (num%2==0){
                count++;
            }
            num++;
            System.out.println(count);
        }
    }
}

//        Question 4
//        WAP to display no. of even and no. of odd number between 10 and 30.
class NoOfEvenAndOdd{
    public static void main(String[] args){
        int EvenNum = 10, OddNum = 11;
        int countEven = 0,countOdd = 0;
        while(EvenNum<=30){
            if(EvenNum%2==0){
                countEven++;
            }
            EvenNum++;
            System.out.println("The number of Even numbers are: "+countEven);
        }
        while(OddNum<30){
            if(OddNum%2!=0){
                countOdd++;
            }
            OddNum++;
            System.out.println("The number of Odd numbers are: "+countOdd);
        }
    }
}

//        Question 5
//        WAP to display multiplication table of a given no.
class MultiplicationTableUser{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number you want multiplication table of: ");
        int number = scn.nextInt();
        int i = 1;
        while(i<=10){
            int multiply = number*i;
            System.out.println(number+ "*"+ i+ "="+ multiply);
            i++;
        }
    }
}

//        Question 6
//        Write a program to calculate the sum of first 10 natural number.
class SumOf10NaturalNumber{
    public static void main(String[] args) {
        int naturalNumber = 1;
        while(naturalNumber<=10){
            System.out.println(naturalNumber);
            naturalNumber++;
        }
    }
}

//        Question 7
//        Write a program that prompts the user to input a positive integer. It should then
//        print the multiplication table of that number.
class MultTableOfPo{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int PositiveInteger= scn.nextInt();


        if (PositiveInteger>=0){
            int i=1;
            while(i<=10){
                int product = PositiveInteger*i;
                System.out.println(PositiveInteger+ "x"+ i+ "="+ product);
                i++;
            }
            }
        else{
            System.out.println("You entered Negative integer");
        }
        }
    }
//        Question 8
//        Write a program to find the factorial value of any number entered through the
//        keyboard.
class Factorial{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number you want the factorial of: ");
        int number = scn.nextInt();

        for(int i = 1; i<=number ; i++){
            int result = number*i;
            System.out.println(result);
        }
    }
}

//        Question 9
//        Two numbers are entered through the keyboard. Write a program to find the value
//        of one number raised to the power of another. (Do not use Java built-in method)
class PowerRaised{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a base: ");
        int base = scn.nextInt();

        System.out.println("Enter a exponent: ");
        int exponent = scn.nextInt();


        System.out.println(Math.pow(base,exponent));
    }
}

//        Question 10
//        Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed. For example, if the input is 12345, the output
//        should be 54321.
class ReverseDigits{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter an integer: ");
        int integer = scn.nextInt();
        int rev = 0;
        int number;
        while (integer!=0){
            int remainder = integer%10;
            rev = rev*10 + remainder;
            integer = integer/10;
        }
        System.out.println(rev);
    }
}

//        Question 11
//        Write a program that reads a set of integers, and then prints the sum of the even
//        and odd integers.
class SumOfEvenAndODd{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an integer: ");    // confuse vaye
        int integer = scn.nextInt();
        int SumEven = 0, SumOdd= 0;
        for (int i=1;i<=20; i++ ){
            if(integer%2==0){
                SumEven+=i;
                System.out.println(SumEven);
            }else{
                SumOdd+=i;
                System.out.println(SumOdd);
            }
        }
    }
}
//        Question 12
//        Write a program that prompts the user to input a positive integer. It should then
//        output a message indicating whether the number is a prime number.
class FindPrimeOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a postive integer: ");
        int integer = scn.nextInt();

        for (int j = 1; j <= integer - 1; j++) {       // niskena
            int count = 0;
            if (integer % j == 0) {
                count += 1;
            }
            if (count == 2) {
                System.out.println("The number is a prime number");
            } else {
                System.out.println("The number is not a prime number");
            }
        }
    }
}
//        Question 13
//        Write a program to calculate HCF of Two given number.
class FindHCF{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = scn.nextInt();

        System.out.println("Enter a number: ");
        int num2 = scn.nextInt();
        int HCF = 1;

        for(int i =1; (i<=num1 && i<=num2); i++){
            if(num1%i==0 && num2%i==0){
                HCF = i;
                System.out.println(HCF);
            }
        }
    }
}
//        Question 14
//        Write a do-while loop that asks the user to enter two numbers. The numbers
//        should be added and the sum displayed. The loop should ask the user whether he
//        or she wishes to perform the operation again. If so, the loop should repeat;
//        otherwise it should terminate.
//class DoWhileSum{
//    public static void main(String[] args) {
//        Scanner scn= new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int num1= scn.nextInt();
//
//        System.out.println("Enter a number: ");
//        int num2= scn.nextInt();
//        int sum = num1+num2;
//
//        do{
//            System.out.println(sum);
//        }while()
//    }
//}


//        Question 15
//        Write a program to enter the numbers till the user wants and at the end it should
//        display the count of positive, negative and zeros entered.
class DisplayNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number up to which you wish to enter the number: ");
        int number= scn.nextInt();
        for(int i=1; i<=number; i++) {
            System.out.println("Enter the number: ");
            int num = scn.nextInt();
            int countP=0;
            int countZero = 0;
            int countN = 0;
            if (num>=0){
                countP+=1;
                System.out.println("The number of postive integers are: " + countP);
            }
            else if(num==0){
                countZero+=1;
                System.out.println("the number of zero integers are: "+ countZero);
            }
            else if(num<0){             // ssyena
                countN+=1;
                System.out.println("The number of negative integers are: "+ countN);
            }
            i++;
        }

    }
}

//        Question 16
//        Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
class FindLargestAndSmallest{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number up to which you want the input: ");
        int number = scn.nextInt();
        for (int i=1;i<=number;i++){
            System.out.println("The largest number is: " + Math.max(number,i));
            System.out.println("The largest number is: " + Math.min(number,i));

        }
    }
}

//        Question 17
//        Write a program to print out all Armstrong numbers between 1 and 500. If sum of
//        cubes of each digit of the number is equal to the number itself, then the number is
//        called an Armstrong number.
//        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
class ArmstrongNumber{
    public static void main(String[] args) {
        int digit, sum = 0;
        for(int num = 1;num<=500; num++)
        {
            int number =num;   // yo num laai direct narakhera kin number variavle maa rakheeko
            while (number != 0)
            {
                digit = number % 10;
                sum = sum + (digit * digit * digit);   // aayena
                number = number / 10;
                if (sum == number)
                {
                    System.out.println(number + "is an Armstrong number");
                } else
                {
                    System.out.println(number + "is not an Armstrong number");
                }
            }
        }
    }
}

//        Question 18
//        Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 24 .....
class FindFibonacciSeries{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number up to which you want the fibonacci series of: ");
        int number = scn.nextInt();
        int prev = 1, next = 1;
        int temp = 0;
        while(temp<=number){
            temp = prev+next;
            prev = next;
            next = temp;
            System.out.println(temp);
        }
    }
}
//        Question 19
//        Write a program to calculate the sum of following series where n is input by user.
//        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
class sumOfSequence{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        System.out.println("Enter a number up to which you want the sum of: ");
        int n = scn.nextInt();
        int sum = 0;                               // answ aayena
        for(int denominator=1; denominator<=n; denominator++){
            int series = (1/denominator);
            sum = sum+ series;
        }
        System.out.println(sum);
    }
}
//        Question 20
//        Compute the natural logarithm of 2, by adding up to n terms in the series
//        1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
//        where n is a positive integer and input by user.
class ComplexSequence{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n =scn.nextInt();
        int sum = 0, series=0;
        int sign = -1;
        for (int denominator = 1; denominator<=n; denominator++){
            sign = sign*(-1);                  // aayena
            sum = sum+(sign*denominator);
            series = (1/denominator);
        }
        System.out.println(series);
    }
}
//        Question 21
//        Write a program that generates a random number and asks the user to guess what
//        the number is. If the user's guess is higher than the random number, the program
//        should display "Too high, try again." If the user's guess is lower than the random
//        number, the program should display "Too low, try again." The program should use
//        a loop that repeats until the user correctly guesses the random number.
class GuessNumberRandom{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Guess the number: ");
        int number = scn.nextInt();

        int i=0;
        Random rand = new Random();
        int ans = rand.nextInt();;
        while(i<= number){
            if (number==ans){
                System.out.println("Yaahoo! you guessed it right");
            }
            else if(ans>number){       // aayena ta vanyaa
                System.out.println("Too high, try again.");
            }
            else{
                System.out.println("Too low, try again.");
            }
            i++;
        }
    }
}
//        Question 22
// Write a program to print following :
//i)      **********
//        **********
//        **********
//        **********
class Figures{
    public static void main(String[] args) {
        for (int b = 1; b <=4; b++) {
            for(int c= 1; c<=10; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//ii)  *
//     **
//     ***
//     ****
//     *****
class RATriangle{
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//           *
//          **
//         ***
//        ****
//       *****

class UltaRATriangle{
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println(i);
            for(int j=1; j<=i;j++){    // aako chaina
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//      *
//     ***
//    *****
//   *******
//  *********
class Triangle{
    public static void main(String[] args) {

        for (int i=1; i<=5; i++)
        {
            for (int j = 5; j > i; j--) {
                System.out.print("1");       // aayena

            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    1
//   222
//  33333
// 4444444
//555555555
class NumberTriangle{
    public static void main(String[] args)
    {
        for(int i=1; i<=5;i++)
        {
            for(int j=5; j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}

