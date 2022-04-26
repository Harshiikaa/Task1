import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Let's just do task 2");
    }
}

//Write a JAVA program to find maximum between two numbers.
class FindMax{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num11= scanner.nextLine();
        double num1= Double.parseDouble(num11);

        System.out.println("Enter a number: ");
        String num22= scanner.nextLine();
        double num2= Double.parseDouble(num22);

        if (num1>num2){
            System.out.println("The maximum number between two number is: "+ num1);
        }
        else{
            System.out.println("The maximum number between two number is: "+ num2);
        }
    }
}

//2. Write a JAVA program to find maximum between three numbers.
class Maximum{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String num11= scanner.nextLine();
        double num1= Double.parseDouble(num11);

        System.out.println("Enter the second number: ");
        String num22= scanner.nextLine();
        double num2= Double.parseDouble(num22);

        System.out.println("Enter the third number: ");
        String num33= scanner.nextLine();
        double num3= Double.parseDouble(num33);

        if ((num1>num2)&&(num1>num3)){
            System.out.println("The maximum number is: " + num1);
        }
        else if((num2>num1)&&(num2>num3)){
            System.out.println("The maximum number is: "+ num2);
        }
        else{
            System.out.println("The maximum number is: "+ num3);
        }
    }
}
// 3. Write a JAVA program to check whether a number is negative, positive or zero.
class Check{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter any number either negative or positive: ");
        String number1= scanner.nextLine();
        double number= Double.parseDouble(number1);

        if (number<0){
            System.out.println("The number is negative");
        }else if (number==0){
            System.out.println("The number is zero");
        }
        else{
            System.out.println("The number is positive");
        }
    }
}

//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

class DivisibleOrNot{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number1= scanner.nextLine();
        double number= Double.parseDouble(number1);

        if (number%5==0 && number%11==0){
            System.out.println("The number is divisible by 5 and 11");
        }
        else{
            System.out.println("The number is not divisible by 5 and 11");
        }
    }
}

//5. Write a JAVA program to check whether a number is even or odd
class CheckEvenOrOdd{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number1= scanner.nextLine();
        Double number= Double.parseDouble(number1);

        if (number%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}

// 6. Write a JAVA program to check whether a year is leap year or not.
class CheckLeapYear{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a year: ");
        String year1= scanner.nextLine();
        int year= Integer.parseInt(year1);

        if (year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("the year is not a leap year");
        }
    }
}
  // 7. Write a JAVA program to check whether a character is alphabet or not.
class AlphabetOrNot{
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter a character: ");
          char ch= scanner.next().charAt(0);
          if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){  // double quote use garesi aaudaina
              System.out.println(ch + "\t is an alphabet");
          }
          else{
              System.out.println(ch+ "\t is not an alphabet");
          }

//          if(Character.isAlphabetic(ch)){
//              System.out.println(ch + " is an alphabhet.");
//
//          }
//          else{
//              System.out.println(ch + " is not an alphabhet.");
//          }
      }
  }

  //8.Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class VowelOrNot{
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter any alphabet: ");
          String alpha= scanner.nextLine();
// use if maa multiple or use garera
          if (alpha=="a"){
              System.out.println("The alphabet ia vowel");
          }
          else if (alpha=="e"){
              System.out.println("The alphabet ia vowel");
          }
          else if (alpha=="i"){
              System.out.println("The alphabet ia vowel");
          }
          else if (alpha=="o"){
              System.out.println("The alphabet ia vowel");
          }
          else if (alpha=="u"){
              System.out.println("The alphabet ia vowel");
          }
          else{
              System.out.println("The alphabet is consonant");
          }
      }
  }
  // 9.Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character
class Identify{
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter any character: ");
          char character1= scanner.next().charAt(0);

          if (Character.isAlphabetic(character1)){
              System.out.println("The character is alphabet");
          }
          else if(Character.isDigit(character1)){
              System.out.println("The character is digit");
          }
          else{
              System.out.println("the character is special character");
          }
      }
  }

  //  10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class CheckUpperOrLower{
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter a character: ");
      }
  }
  //11. Write a JAVA program to input week number and print weekday.
class WeekDayNumber{
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter a week number: ");
          String week_no= scanner.nextLine();
          int week_day= Integer.parseInt(week_no);

          if (week_day==1){
              System.out.println("1="+ "Sunday");
          }
          else if (week_day==2) {
              System.out.println("1=" + "Monday");
          }
          else if (week_day==3) {
              System.out.println("1=" + "Tuesday");
          }
          else if (week_day==4) {
              System.out.println("1=" + "Wednesday");
          }
          else if (week_day==5) {
              System.out.println("1=" + "Thursday");
          }
          else if (week_day==6) {
              System.out.println("1=" + "Friday");
          }
          else{
              System.out.println("7=" + "Saturday");
          }
      }
  }

  //12. Write a JAVA program to input month number and print number of days in that month.
class MonthAndNumberOfDays{
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter a month number: ");
          String month_no= scanner.nextLine();
          int month= Integer.parseInt(month_no);

//          System.out.println("Enter a year: ");
//          String year_no= scanner.nextLine();
//          int year= Integer.parseInt(year_no);

// month no haalera number of dayss aaunu paryo
          if (month==1){
              System.out.println("the number of days in this month is 31");
          }
          else if (month==2){
              System.out.println("the number of days in this month is 28");
          }
          else if (month==3){
              System.out.println("the number of days in this month is 31");
          }
          else if (month==4){
              System.out.println("the number of days in this month is 30");
          }
          else if (month==5){
              System.out.println("the number of days in this month is 31");
          }
          else if (month==6){
              System.out.println("the number of days in this month is 30");
          }
          else if (month==7){
              System.out.println("the number of days in this month is 31");
          }
          else if (month==8){
              System.out.println("the number of days in this month is 31");
          }
          else if (month==9){
              System.out.println("the number of days in this month is 31");
          }
          else if (month==10){
              System.out.println("the number of days in this month is 31");
          }
          else if (month==11) {
              System.out.println("the number of days in this month is 30");
          }
          else if (month==12){
                  System.out.println("the number of days in this month is 31");
          }
      }
  }


// 13. Write a JAVA program to count total number of notes in given amount.
class CountTotal{
    public static void main(String[] args) {
        // paisa assume garney ani 5 rupees haalera 100 samma hudaa kati wota 5 chahincha garney
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int amount= scanner.nextInt();

        System.out.println("Enter the note of: ");
        int note_of= scanner.nextInt();

        int total_no_notes;
        if (amount%note_of==0){
            total_no_notes=amount/note_of;
            System.out.println(total_no_notes);
        }
        else{
            System.out.println("Enter valid figures");
        }
    }
}
// 14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
class AnglesOfTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an angle of a triangle: ");
        int angle1= scanner.nextInt();
//        Double angle1= Double.parseDouble(angle11);

        System.out.println("Enter second angle of a triangle: ");
        int angle2= scanner.nextInt();
//        Double angle2= Double.parseDouble(angle22);

        System.out.println("Enter third angle of a triangle: ");
        int angle3= scanner.nextInt();


//        Double angle3= Double.parseDouble(angle33);
        int total_angle= angle1+angle2+angle3;
        if (total_angle==180){
            System.out.println("The triangle is valid");
        }
        else{
            System.out.println("The triangle is not valid");
        }
    }
}


// 15. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
class AllSidesOfTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first side of a triangle: ");
        double side1= scanner.nextDouble();

        System.out.println("Enter the second side of a triangle: ");
        double side2= scanner.nextDouble();

        System.out.println("Enter the third side of a triangle: ");
        double side3= scanner.nextDouble();
        if ((side1)*(side1)>=((side2)*(side2))+((side3)*(side3))){
            System.out.println("The triangle is valid");
        }
        else if((side2)*(side2)>=((side1)*(side1))+((side3)*(side3))){
            System.out.println("the triangle is valid");
        }
        else if ((side3)*(side3)>=((side2)*(side2))+((side1)*(side1))){
            System.out.println("The triangle is valid");
        }
        else{
            System.out.println("The triangle is not valid");
        }



//        Double angle= Double.parseDouble(angle1);
// pythagoras theorum use garera ie two side ko sum must be greater than another side
    }
}
// 16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class TriangleIs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a side of a triangle: ");
        double side1 = scanner.nextDouble();
//        Double side1 = Double.parseDouble(side11);

        System.out.println("Enter a side of a triangle: ");
        double side2= scanner.nextDouble();
//        Double side2 = Double.parseDouble(side22);

        System.out.println("Enter a side of a triangle: ");
        double side3= scanner.nextDouble();
//        Double side3 = Double.parseDouble(side33);

        if ((side1 == side2) && (side2 == side3) && (side1 == side3)) {
            System.out.println("The triangle is isoceles triangle");
        } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
            System.out.println("The triangle is equilateral triangle");
        }
        else {
            System.out.println("The triangle is scalene triangle");
        }
    }// wrong cha
}
//17. Write a JAVA program to find all roots of a quadratic equation.
class QuadraticEq{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        String a1= scanner.nextLine();
        double a= Double.parseDouble(a1);

        System.out.println("Enter the value of b: ");
        String b1= scanner.nextLine();
        double b= Double.parseDouble(b1);

        System.out.println("Enter the value of c: ");
        String c1= scanner.nextLine();
        double c= Double.parseDouble(c1);

        double root1,root2;
        double determinant= (b*b)-4*a*c;
        double squarer= Math.sqrt(determinant);

        // this will print two real and distinct root
        if (determinant>0){
            root1= -b+ squarer/(2*a);
            root2= -b- squarer/(2*a);
            System.out.println("root 1 and root 2 will be: " +root1+ "and" +root2);
        }
        // this will print two real and equal roots
        else if(determinant==0){
            root1= root2= (-b)/(2*a);
            System.out.println("root 1 and root 2 will be: " +root1+ "and"+ root2);
        }
    }
}


//18. Write a JAVA program to calculate profit or loss.
class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the selling price: ");
        String SP1 = scanner.nextLine();
        double SP = Double.parseDouble(SP1);

        System.out.println("Enter the cost price: ");
        String CP1 = scanner.nextLine();
        double CP = Double.parseDouble(CP1);

        // to find the profit or loss
        if (SP > CP) {
            System.out.println("Profit");
        } else {
            System.out.println("Loss");
        }
    }
}
//19. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
//Mathematics and Computer. Calculate percentage and grade according to following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
class GradePercentage{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the marks of Physics: ");
        String physics1= scanner.nextLine();
        double physics= Double.parseDouble(physics1);

        System.out.println("Enter the marks of Chemistry: ");
        String chemistry1= scanner.nextLine();
        double chemistry= Double.parseDouble(chemistry1);

        System.out.println("Enter the marks of biology: ");
        String biology1= scanner.nextLine();
        double biology= Double.parseDouble(biology1);

        System.out.println("Enter the marks of mathematics: ");
        String mathematics1= scanner.nextLine();
        double mathematics= Double.parseDouble(mathematics1);

        System.out.println("Enter the marks of computer: ");
        String computer1= scanner.nextLine();
        double computer= Double.parseDouble(computer1);

        int total_marks= 500;
        double obtained_marks= physics+chemistry+biology+mathematics+computer;
        double percentage= obtained_marks/4;
        System.out.println("percentage is: " +percentage);

        if (percentage>=90){
            System.out.println("Grade A");
        }
        else if((percentage>=80)&&(percentage<89)){
            System.out.println("Grade B");
        }
        else if((percentage>=70)&&(percentage<79)){
            System.out.println("Grade C");
        }
        else if((percentage>=60)&&(percentage<69)){
            System.out.println("Grade D");
        }
        else if((percentage>=50)&&(percentage<59)){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}

//20. Write a JAVA program to input basic salary of an employee and calculate its Gross salary
//according to following:
//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
class GrossSalary{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the basic salary: ");
        double basic_salary = scanner.nextDouble();
//        Double basic_salary= Double.parseDouble(basic_salary1);
        double gross_salary;
        if (basic_salary<=10000){
            gross_salary = basic_salary + 0.2*basic_salary;

        }
        else if(basic_salary<=20000){
            gross_salary = basic_salary + 0.25*basic_salary;
        }
        else if(basic_salary>20000){
            gross_salary = basic_salary + 0.30*basic_salary;
        }
    }
}


//21. Write a JAVA program to input electricity unit charges and calculate total electricity bill
//according to the given condition:
//For first 50 units Rs. 0.50/unit
//For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill
class Electricity_bills{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the unit: ");
        String unit1 = scanner.nextLine();
        int units = Integer.parseInt(unit1);

        double amount , sur_charge;
        if (units<=50){
            amount= (units*0.50);
            sur_charge= 0.2* amount;
        }
        else if(units<=150){
            amount= (25+ (units-50)*0.75);
            sur_charge= 0.2* amount;
        }
        else if(units<=250){
            amount= (25 + 75+(units-150)*1.20);
            sur_charge= 0.2* amount;
        }
        else{
            amount= (25+ 75+ 120+ (units-250)*1.50);
            sur_charge= 0.2* amount;
        }
        double total_amount= amount+sur_charge;
        System.out.println("The total bill is: " + total_amount);
    }
}