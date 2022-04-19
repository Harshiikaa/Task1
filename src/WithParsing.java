import java.util.Scanner;

public class WithParsing {
    public static void main(String[] args) {
        System.out.println("Lets do question with Parsing");
    }
}
class StudentDetailsParsing{
    public static void main(String[] args){
        // Write a program to take student details as input and display the result.
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();
        double age1= Double.parseDouble(age);

        System.out.print("Enter your address: ");
        String address= scanner.nextLine();

        System.out.print("Enter your percentage: ");
        String percentage= scanner.nextLine();
        double percentage1= Double.parseDouble(percentage);

        System.out.print("Name= " +name+ "," + "Age= " +age1+ "," + "Address: " + address+ "," +
               "percentage= "+percentage1);
    }
}
class SumOfFourNumbersParsing{
    public static void main(String[] args){
        //Write a program to calculate sum of four numbers taking user input.
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String num1= scanner.nextLine();
        double number1= Double.parseDouble(num1);

        System.out.println("Enter the second number: ");
        String num2= scanner.nextLine();
        double number2= Double.parseDouble(num2);

        System.out.println("Enter the third number: ");
        String num3= scanner.nextLine();
        double number3= Double.parseDouble(num3);

        System.out.println("Enter the fourth number: ");
        String num4= scanner.nextLine();
        double number4= Double.parseDouble(num4);

        double sum_of_4_number= number1+number2+number3+number4;

        System.out.println("The sum of four number is: " + sum_of_4_number);
    }
}

// Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fai
class MarksParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the marks of Math: ");
        String maths= scanner.nextLine();
        double maths1= Double.parseDouble(maths);

        System.out.println("Enter the marks of physics: ");
        String physics= scanner.nextLine();
        double physics1= Double.parseDouble(physics);

        System.out.println("Enter the marks of biology: ");
        String biology= scanner.nextLine();
        double biology1= Double.parseDouble(biology);

        System.out.println("Enter the marks of chemistry: ");
        String chemistry= scanner.nextLine();
        double chemistry1= Double.parseDouble(chemistry);

        int Total_Marks= 400;
        double Obtained_Marks= maths1+physics1+biology1+chemistry1;
        double Percentage= (Obtained_Marks*100)/Total_Marks;
        System.out.println("The total marks is: "+ Total_Marks + "," +"The percentage is: "+ Percentage);
        if (Percentage>=70){
            System.out.println("First Class");
        }
        else if(Percentage>59){
            System.out.println("Upper Second class");
        }
        else if (Percentage>49){
            System.out.println("Second Class");
        }
        else if (Percentage>39){
            System.out.println("Third Class");
        }
        else{
            System.out.println("THE RESULT IS FAIL");
        }
    }
}
// Write a program to take two integer inputs from user and print sum and product of them
class SumOfTwoIntegerParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String integer1= scanner.nextLine();
        double integer11= Double.parseDouble(integer1);

        System.out.println("Enter another integer: ");
        String integer2= scanner.nextLine();
        double integer22= Double.parseDouble(integer1);
        double sum_of_integer= integer11+integer22;
        System.out.println("The sum of these two integers will be: " + sum_of_integer);
    }
}
//Take two integer inputs from user. First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results
class AsQuestionParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter an integer: ");
        String integer1= scanner.nextLine();
        double integer11= Double.parseDouble(integer1);


        System.out.println("Enter another integer: ");
        String integer2= scanner.nextLine();
        double integer22= Double.parseDouble(integer2);

        double sum_of_integer= integer11+integer22;
        System.out.println("The sum of two integers will be: " + sum_of_integer);
        double product_of_integer= integer11*integer22;
        System.out.println("The product of two integers will be: " + product_of_integer);
        double total_sum= sum_of_integer+product_of_integer;
        System.out.println("The sum of the obtained result is: " + total_sum);
        double total_product= sum_of_integer*product_of_integer;
        System.out.println("The product of obtained marks will be: " + total_product);
    }
}
// Ask user to give two double input for length and breadth of a rectangle and print area type
//    casted to int.
class AreaOfRectangleParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        double length= scanner.nextDouble();

        System.out.println("Enter the breadth of rectangle: ");
        double breadth= scanner.nextDouble();
        double Area_Of_Rectangle= length*breadth;
        int area_of_rectangle= (int)Area_Of_Rectangle;
        System.out.println("The are of triangle with double input but the type casted output is: " +area_of_rectangle);
    }
   }

// Take name, roll number and field of interest from user and print in the format below :Hey,
//   my name is xyz and my roll number is xyz. My field of interest are xyz
class IntroParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name= scanner.nextLine();

        System.out.println("Enter your roll number: ");
        String roll_no= scanner.nextLine();
        double roll_no1= Double.parseDouble(roll_no);

        System.out.println("Enter your field of interests: ");
        String field_of_interest= scanner.nextLine();

        System.out.println("Hello! this is\t" +name+ " " + "and My roll number is\t" +roll_no1+ " " +
                "My field of interests are\t" +field_of_interest);
    }
}
//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input
class AreaAndPerimeterOfSquareParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the side of square: ");
        String side_of_square= scanner.nextLine();
        double side_of_square1= Double.parseDouble(side_of_square);

        double perimeter_of_square= 4*side_of_square1;
        double area_of_square= (side_of_square1)*2;
        System.out.println("The perimeter of square is: " +perimeter_of_square+
                " "+ "and the area of square is: " +area_of_square) ;
    }
}
class SIParsing {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the principal: ");
        String principal = scanner.nextLine(); // in rupees
        double principal1= Double.parseDouble(principal);

        System.out.println("Enter the rate: ");
        String rate = scanner.nextLine(); // in percentage
        double rate1= Double.parseDouble(rate);

        System.out.println("Enter the time: ");
        String time= scanner.nextLine(); // in years
        double time1= Double.parseDouble(time);

        double Simple_Interest = (principal1*rate1*time1)/100;
        System.out.println("The simple interest is: " + Simple_Interest);
    }
}
class AreaOfTriangleParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the base of a triangle: ");
        String base = scanner.nextLine() ; // in cm
        double base1= Double.parseDouble(base);

        System.out.println("Enter the height of a triangle: ");
        String height = scanner.nextLine(); // in cm
        double height1= Double.parseDouble(height);

        double Area_Of_Triangle = (base1*height1)/2;

        System.out.println("The area of triangle is: " + Area_Of_Triangle);
    }

}
class VolumeOfCubeParsing{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of a cube: ");
        String length1 = scanner.nextLine(); // in cm
        double length= Double.parseDouble(length1);

        double Volume_Of_Cube = length*length*length;
        System.out.println("The volume of cube is: " + Volume_Of_Cube);
    }
}
class VolumeOfCuboidParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of a cube: ");
        String length1= scanner.nextLine(); // in cm
        double length= Double.parseDouble(length1);

        System.out.println("Enter the base of a cube: ");
        String base1 = scanner.nextLine(); // in cm
        double base= Double.parseDouble(base1);

        System.out.println("Enter the height of a cube: ");
        String height1 = scanner.nextLine(); // in cm
        double height= Double.parseDouble(height1);

        double Volume_Of_Cuboid = length*base*height;
        System.out.println("The volume of Cuboid is: " + Volume_Of_Cuboid);
    }
}
/*  Write a program to find square of a number.
       E.g.- INPUT : 2 OUTPUT : 4
       INPUT : 5 OUTPUT : 25 */
class SquareOfNumberParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: ");
        String A= scanner.nextLine();
        double a= Double.parseDouble(A);

        System.out.println( "The square of"+ " " +a+  " "+ "is: " +Math.pow(a,a));
    }
}
/*10. Take two different string input and print them in same line. E.g.-
        INPUT : Codes
        Dope
        OUTPUT : CodesDope */
class StringInSameLineParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input1= scanner.nextLine();

        System.out.println("Enter another string: ");
        String input2= scanner.nextLine();

        System.out.print(input1);
        System.out.print(input2);
    }
}
/* Take 3 inputs from user and check :
        all are equal
        any of two are equal
        ( use && || with ternary operator ) */
class EqualOrNotParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your first input: ");
        String input11= scanner.nextLine();
        double input1= Double.parseDouble(input11);

        System.out.println("Enter second input: ");
        String input22= scanner.nextLine();
        double input2= Double.parseDouble(input22);

        System.out.println("Enter third input: ");
        String input33= scanner.nextLine();
        double input3= Double.parseDouble(input33);

        String equal_or_not;
        equal_or_not= (input1==input2)?"Any of two are equal" : (input1==input3&&input2!=input3)?
                "any of two are equal" :(input1==input2&&input2==input3)?"all are equal":"all are not equal";
        System.out.println(equal_or_not);
    }
}

//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true
class ComparisonParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter  a value for a: ");
        String A= scanner.nextLine();
        double a= Double.parseDouble(A);

        System.out.println("Enter a value for b: ");
        String B= scanner.nextLine();
        double b= Double.parseDouble(B);

        String Compare;
        Compare= (a<50)?"true":(a<b)?"True":"False";
        System.out.println(Compare);
    }
}
//. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks
class RobertsReportParsing{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your marks of math: ");
        String math1= scanner.nextLine();
        double math= Double.parseDouble(math1);

        System.out.println("Enter your marks of science: ");
        String science1= scanner.nextLine();
        double science= Double.parseDouble(science1);

        System.out.println("Enter your marks of social: ");
        String social1= scanner.nextLine();
        double social= Double.parseDouble(social1);

        double total_marks= 400;
        double total_marks_obtained= (math+science+social);
        double percentage= (total_marks_obtained/total_marks)*100;
        System.out.println("The obtained marks of Robert is: " + total_marks_obtained + " "
                + "and the percentage is: " + percentage);
    }
}

