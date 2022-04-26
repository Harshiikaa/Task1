import jdk.jshell.Snippet;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Switch waala garum la");
    }
}




// to check ever or odd
class Check_everOrOdd {
    public static void main(String[] args) {

        int number = 1;

        switch (number % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
        }
    }
}


class MinOrMax{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter the value for a: ");
        int a = myObj.nextInt();

        System.out.println("Enter the value for b: ");
        int b = myObj.nextInt();

        switch ((b>a)?0:(a>b)?1:2){
            case 0:
                System.out.println("b is max");
                break;
            case 1:
                System.out.println("a is max");
        }
    }
}
/*Using switch statement Write a JAVA program to input marks of five subjects Physics,
        Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
        following:
        Percentage >= 90% : Grade A
        Percentage >= 80% : Grade B
        Percentage >= 70% : Grade C
        Percentage >= 60% : Grade D
        Percentage >= 40% : Grade E
        Percentage < 40% : Grade F*/
class PercentageSwitch {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter your marks of Physics: ");
        double physics= myObj.nextDouble();

        System.out.println("Enter your marks of Chemistry: ");
        double chemistry= myObj.nextDouble();

        System.out.println("Enter your marks of Biology: ");
        double biology= myObj.nextDouble();

        System.out.println("Enter your marks of Mathematics: ");
        double mathematics= myObj.nextDouble();

        System.out.println("Enter your marks of Computer: ");
        double computer= myObj.nextDouble();

        double obtained_marks, total_marks, percentage;
        obtained_marks = physics+chemistry+biology+mathematics+computer;
        total_marks= 500;
        percentage= (obtained_marks/5);

        switch ((percentage>=90)?0:(percentage>=80 && percentage<=89)?1:(percentage>=70 && percentage<=79)?2:
                (percentage>=60 && percentage<=69)?3:(percentage>=40 && percentage<=59)?4:(percentage<40)?5:6){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade D");
                break;
            case 4:
                System.out.println("Grade E");
                break;
            case 5:
                System.out.println("Grade F");
                break;
        }
    }
}

//2. JAVA Program to find the maximum between two numbers. Using the switch statement.

class MaxSwitch{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1= myObj.nextDouble();

        System.out.println("Enter another number: ");
        double num2= myObj.nextDouble();

        switch ((num1>num2)? 0:1){
            case 0:
                System.out.println(num1 + " is the maximum number");
                break;
            case 1:
                System.out.println(num2 + " is the maximum number");
                break;
        }
    }
}
// 3. JAVA Program to find the maximum between three numbers. Using the switch statement.
class MaxSwitch3{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1= myObj.nextDouble();

        System.out.println("Enter second number: ");
        double num2= myObj.nextDouble();

        System.out.println("Enter third number: ");
        double num3= myObj.nextDouble();

        switch ((num1>num2&&num1>num3)? 0:(num2>num1&&num2>num3)? 1:(num3>num1&&num3>num2)? 2:3) {
            case 0:
                System.out.println(num1 + " is the maximum number");
                break;
            case 1:
                System.out.println(num2 + " is the maximum number");
                break;
            case 2:
                System.out.println(num3 + " is the maximum number");
                break;
        }
    }
}
//4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch statement.
class DivisibleSwitch{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num= myObj.nextInt();
        switch ((num%5==0 && num%11==0)? 0:1){
            case 0:
                System.out.println( num+ " is divisible by 5 and 11");
                break;
            case 1:
                System.out.println( num+ " is not divisible by 5 and 11");
                break;
        }
    }
}

//5. JAVA Program to check whether a year is a leap year or not. Using switch statement
class LeapSwitch{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter a year: ");                // wrong aayo
        double year= myObj.nextDouble();
        switch ((year%400==0 ||year%4==0 && year%100!=0)?1:2){
            case 0:
                System.out.println("The year is a leap year");
                break;
            case 1:
                System.out.println("The year is not a leap year");
                break;
        }
    }
}
//6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class CheckAlphaSwitch{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter a character: ");
        char charac= scn.next().charAt(0);
        switch ((charac>='a' && charac<='z') ||(charac>='A' && charac<='Z')? 1:2){
            case 1:
                System.out.println("The character is an alphabet");
            break;
            case 2:
                System.out.println("The character is not an alphabet");
                break;
        }
    }
}
//7. JAVA Program to take the value from the user as input any alphabet and check whether it is
//vowel or consonant. Using the switch statement.
class CheckVowelSwitch{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter an alphabet: ");
        char charac= scn.next().charAt(0);
        switch ((charac=='a')? 0: (charac=='e')? 1: (charac=='i')? 2: (charac=='o')? 3: (charac=='u')?4:5){
            case 0,1,2,3,4:
                System.out.println("The character is vowel");
                break;
            case 5:
                System.out.println("The character is consonant");
        }
    }
}
//8. JAVA Program to take the value from the user as input any character and check whether it is
//the alphabet, digit or special character. Using the switch statement.
class CheckSwitch{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter any character: ");
        char charac= scn.next().charAt(0);
        switch ((charac>='a'&& charac<='z')||(charac>='A'&& charac<='Z')? 0:(charac>='0'&& charac<0)? 1:2){
            case 0:
                System.out.println("The character is an alphabet");
                break;
            case 1:
                System.out.println("The character is a digit");
                break;
            case 2:
                System.out.println("The character is a special character");
                break;
        }
    }
}
//9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
//switch statement.
class CheckUpperLowerSwitch{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        char charac= scn.next().charAt(0);
        switch ((charac>='a' && charac<='z')? 0: (charac>='A' && charac<='Z')? 1:2){
            case 0:
                System.out.println("The character is an uppercase");
                break;
            case 1:
                System.out.println("The character is lowercase");
                break;
            case 2:
                System.out.println("invalid value");
        }
    }
}
//10. JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement.
class WeekNo {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter the week number: ");
        int weekdays= myObj.nextInt();

        switch(weekdays){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

//11. JAVA Program to take the value from the user as input the month number and print number of
//days in that month. Using switch statement
class monthSwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int month_num= scn.nextInt();
        switch (month_num){
            case 1:
                System.out.println("The number of days in this month is 31");
                break;
            case 2:
                System.out.println("The number of days in this month is 28");
                break;
            case 3:
                System.out.println("The number of days in this month is 31");
                break;
            case 4:
                System.out.println("The number of days in this month is 30");
                break;
            case 5:
                System.out.println("The number of days in this month is 31");
                break;
            case 6:
                System.out.println("The number of days in this month is 30");
                break;
            case 7:
                System.out.println("The number of days in this month is 31");
                break;
            case 8:
                System.out.println("The number of days in this month is 31");
                break;
            case 9:
                System.out.println("The number of days in this month is 31");
                break;
            case 10:
                System.out.println("The number of days in this month is 31");
                break;
            case 11:
                System.out.println("The number of days in this month is 30");
                break;
            case 12:
                System.out.println("The number of days in this month is 31");
                break;
        }
    }
}
//12. JAVA Program to count the total number of notes in a given amount. Using the switch
//statement.
class CountSwitch{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double amount= scn.nextDouble();

        System.out.println("Enter the note: ");
        double note= scn.nextDouble();
        double total_note= (amount/note);
        switch((amount%note==0)? 0:1){
            case 0:
                System.out.println("The total number of notes in: " + amount + " of note: " +note+ " is: " +total_note);
                break;
            case 1:
                System.out.println("The amount is indivisible");
                break;
        }
    }
}
//13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
//the triangle is valid or not. Using switch statement
class CheckTriangleSwitch{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter the side of a triangle: ");
        double side1= scn.nextDouble();

        System.out.println("Enter the side of a triangle: ");
        double side2= scn.nextDouble();

        System.out.println("Enter the side of a triangle: ");
        double side3= scn.nextDouble();
        switch( ( (side1*side1)>=(side2*side2)+(side3*side3) ) || ( (side2*side2)>=(side1*side1)+(side3*side3) ) ||
                ((side3*side3)>=(side1*side1)+(side2*side2))? 0:1){
            case 0:
                System.out.println("The triangle is valid");
                break;
            case 1:
                System.out.println("The triangle is invalid");
                break;
        }
    }
}
//14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
//Using switch statement
class CheckTriangleType{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter the first side of the triangle: ");
        double side1= scn.nextDouble();

        System.out.println("Enter the second side of the triangle: ");
        double side2= scn.nextDouble();

        System.out.println("Enter the third side of the triangle: ");
        double side3= scn.nextDouble();
        switch((side1==side2 && side2==side3)? 0: ((side1==side2) || (side2==side3) || (side1==side3))? 1:2){
            case 0:
                System.out.println("The triangle is equilateral");
                break;
            case 1:
                System.out.println("The triangle is isosceles");
                break;
            case 2:
                System.out.println("The triangle is scalene");
                break;
        }
    }
}

//15. JAVA Program to find all the roots of a quadratic equation. Using switch statement
class QuadraticSwitch{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a= scn.nextDouble();

        System.out.println("Enter the value of b: ");
        double b= scn.nextDouble();

        System.out.println("Enter the value of c: ");
        double c= scn.nextDouble();

        double determ = (b*b-4*a*c);
        double determinant = Math.sqrt(determ);      // answer niskena k wrong cha?

        double root1,root2;

        switch((determinant>=1)? 0: (determinant==0)? 1:2){
            case 0:
                root1 = (-b+ determinant)/2*a;
                root2 = (-b- determinant)/2*a;
                System.out.println("The value of root1 and root 2 are: " + root1 +","+ root2);
                break;
            case 1:
                root1 = root2 =(-b)/2*a;
                System.out.println("The value of root1 and root 2 are: " + root1 +","+ root2);
                break;
        }
    }
}
//16. JAVA Program to calculate profit or loss. Using switch statement.
class ProfitOrLossSwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the selling price: ");
        double sp= scn.nextDouble();

        System.out.println("enter the cost price: ");
        double cp= scn.nextDouble();
        switch ((sp>cp)? 0: (cp>sp)? 1:2) {
            case 0:
                double profit= sp-cp;
                System.out.println("The profit is: " + profit);
                break;
            case 1:
                double loss= cp-sp;
                System.out.println("The profit is: " + loss);
                break;
        }
    }
}
//17. Using switch statement JAVA Program to take the value from the user as input marks of five
//subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and
//grade according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B,
//Percentage >= 70% : Grade C, Percentage >= 60% : Grade D, Percentage >= 40% : Grade E,
//Percentage < 40% : Grade F, Using switch statement.

// 17 no is same as 1 number

//18. JAVA Program to take the value from the user as input the basic salary of an employee and
//calculate its Gross salary according to the following:
// Basic Salary <= 10000: HRA = 20%, DA =80%……………………………….
//.Basic Salary <= 20000 : HRA = 25%, DA =90%………………………………
// Basic Salary > 20000 : HRA = 30%, DA = 95%.


//19. JAVA Program to take the value from the user as input electricity unit charges and calculate
//total electricity bill according to the given condition: For the first 50 units Rs.
//0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit
//……………For unit above 250 Rs. 1.50/unit………An additional surcharge of 20% is added to
//the bill…….Using the switch statement.
class ElectricitySwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your unit charge of electricity: ");
        double unit_charge= scn.nextDouble();
        double amount, sur_charge, total_amount;

        switch((unit_charge<=50)? 0: (unit_charge<=150)? 1: (unit_charge<=250)? 2:3){
            case 0:
                amount = (unit_charge*0.50);
                sur_charge = (0.2*amount);
                total_amount = amount+sur_charge;
                System.out.println("The amount and surcharge will be: " + total_amount);
                break;
            case 1:
                amount = (25+ (unit_charge-50)*0.75);
                sur_charge = (0.2*amount);
                total_amount = amount+sur_charge;
                System.out.println("The total amount will be: " + total_amount);
                break;
            case 2:
                amount = (25+ 75+ (unit_charge-150)*1.20);
                sur_charge = (0.2*amount);
                total_amount = amount+sur_charge;
                System.out.println("The total amount will be: " + total_amount);
                break;
            case 3:
                amount = (25+ 75+ 120+ (unit_charge-250)*1.50);
                sur_charge = (0.2*amount);
                total_amount = amount+sur_charge;
                System.out.println("The total amount will be: " + total_amount);
                break;
        }
    }
}


//20. Write a program that determines a student’s grade. The program will read three types of scores
//(quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
//average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
//grade=B……………………-if the average score>=50% and <70%
//=>grade=C……………………..-if the average score<50% =>grade=F
class GradeSwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your quiz score: ");
        double quiz = scn.nextDouble();

        System.out.println("Enter your mid-term score: ");
        double mid_term = scn.nextDouble();

        System.out.println("Enter your final score: ");
        double final_score = scn.nextDouble();
        double total_marks = 300;
        double obtained_marks= quiz+mid_term+final_score;
        double percentage = obtained_marks/3;
        switch ((percentage>=90)? 0:((percentage>=70) && (percentage<90))? 1: ((percentage>=50) && (percentage<70))? 2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
        }
    }
}


//21. Program to take the hours and minutes as input by the user and the show that whether it is AM
//or PM by using the switch statement.
class CheckAmPmSwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the hours: ");
        int hours = scn.nextInt();

        System.out.println("Enter the minutes: ");
        int minutes = scn.nextInt();
        switch ((hours >=0 && minutes>=0)||(hours <=11 && minutes<=59)? 1:(hours >=12 && minutes>=0)||(hours <=24 && minutes<=59)? 2:3) {
            case 1:
                System.out.println("AM");
                break;
            case 2:                              // halkaa mistake cha condition maa
                System.out.println("PM");
                break;
        }
    }
}
//22. Program to convert a positive number into negative number and negative number into a positive
//number using switch statement
class ConvertSwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scn.nextDouble();

        switch ((number<0) || (number>=0)? 1:2){
            case 1:
                System.out.println(-number);
                break;
            case 2:
                System.out.println();
                break;
        }
    }
}

//23. Write a program to swap the values of two numbers if the values of both variables are not the
//same using a switch statement.
class SwapSwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scn.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scn.nextDouble();
        double temp = num1;                  // aayena

        switch (((num1 == num2) && (num2 == temp))? 0:1){
            case 0:
                System.out.println("swapped values are: " + num1 +num2);
                break;
            case 1:
                System.out.println("invalid idk ");
                break;
        }
    }
}


//24. Program to Convert even number into its upper nearest odd number Switch Statement.
class EvenSwitch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter an even number: ");
        int num = scn.nextInt();
        int UpperNearestValue;
        switch ((UpperNearestValue)=(num+1)){
            case 0:
                System.out.println(" the upper nearest value of: " + num +" is" + UpperNearestValue);
                break;                     // yo pani aayena
            case 1:
                System.out.println("Invalid type");
                break;
        }
    }
}

