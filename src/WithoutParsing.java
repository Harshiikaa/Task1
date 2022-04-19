
public class WithoutParsing {
    public static void main(String[] args){
        System.out.println("Lets do questions without parsing");
    }
}
class StudentDetails{
    public static void main(String[] args){
        // Write a program to take student details as input and display the result.
        String name = "Harshika";
        int age = 19;
        String address = "Hattiban";
        double percentage = 66.67;
        System.out.println("name= "+name+"\n age= "+age+"\n address= "+address+"\n percentage= "+percentage);
    }
}
class SumOfFourNumbers{
    public static void main(String[] args){
        //Write a program to calculate sum of four numbers taking user input.
        int num1= 20;
        int num2= 30;
        int num3= 40;
        int num4= 50;
        int sum = num1+num2+num3+num4;
        System.out.println("The sum of four number is: " + sum);
    }
}
class Marks{
    public static void main(String[] args){
        // Write a program to take input of the total marks of four subjects of a student and calculate
        //the total percentage secured. Then display the percentage and final result of the student;
        //a. If equal to or more than 70 -> First Class
        //b. If more than 59 -> Upper second Class
        //c. If more than 49 -> Second class
        //d. If more than 39 -> Third class and if below than 40 the result is fai
        int Maths= 80;
        int Physics= 50;
        int Biology= 70;
        int Chemistry= 75;
        int Total_Marks= 400;
        int Obtained_Marks= Maths+Physics+Biology+Chemistry;
        float Percentage= (Obtained_Marks*100)/Total_Marks;
        System.out.println("The total marks is: "+ Total_Marks +"The percentage is: "+ Percentage);
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
class SumOfTwoInteger{
    public static void main(String[] args){
        int integer1= 20;
        int integer2= 20;
        int sum_of_integer= integer1+integer2;
        System.out.println("The sum of these two integers will be: " + sum_of_integer);
    }
}
//Take two integer inputs from user. First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results
class AsQuestion{
    public static void main(String[] args){
        int integer1= 20;
        int integer2= 20;
        int sum_of_integer= integer1+integer2;
        System.out.println("The sum of two integers will be: " + sum_of_integer);
        int product_of_integer= integer1*integer2;
        System.out.println("The product of two integers will be: " + product_of_integer);
        int total_sum= sum_of_integer+product_of_integer;
        System.out.println("The sum of the obtained result is: " + total_sum);
        int total_product= sum_of_integer*product_of_integer;
        System.out.println("The product of obtained marks will be: " + total_product);
    }
}
   // Ask user to give two double input for length and breadth of a rectangle and print area type
    //    casted to int.
class AreaOfRectangle{
    public static void main(String[] args){
        double length= 5.2;
        double breadth= 6.1;
        double Area_Of_Rectangle= length*breadth;
        int area_of_rectangle= (int)Area_Of_Rectangle;
        System.out.println("The are of triangle with double input but the type casted output is: " +area_of_rectangle);
    }
   }
// Take name, roll number and field of interest from user and print in the format below :Hey,
//   my name is xyz and my roll number is xyz. My field of interest are xyz
class Intro{
    public static void main(String[] args){
        String name= "Harshika";
        int roll_no= 19;
        String field_of_interest= "Arts,psychology";
        System.out.println("Hello! this is\t" +name+ " " + "and My roll number is\t" +roll_no+ " " +
                "My field of interests are\t" +field_of_interest);
    }
   }
   //Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input
class AreaAndPerimeterOfSquare{
    public static void main(String[] args){
        double side_of_square= 4.5;
        double perimeter_of_square= 4*side_of_square;
        double area_of_square= (side_of_square)*2;
        System.out.println("The perimeter of square is: " +perimeter_of_square+
               " "+ "and the area of square is: " +area_of_square) ;
    }
   }
class SI {
    public static void main(String[] args){
        int principal = 5000; // in rupees
        int rate = 10; // in percentage
        int time= 5; // in years
        int Simple_Interest = (principal*rate*time)/100;

        System.out.println("The simple interest is: " + Simple_Interest);
    }
}
class AreaOfTriangle{
    public static void main(String[] args){
        int base = 4; // in cm
        int height = 4; // in cm
        int Area_Of_Triangle = (base*height)/2;

        System.out.println("The area of triangle is: " + Area_Of_Triangle);
    }

}
class VolumeOfCube{
    public static void main(String[] args) {
        int length = 3; // in cm
        int Volume_Of_Cube = length*length*length;
        System.out.println("The volume of cube is: " + Volume_Of_Cube);
    }
}
class VolumeOfCuboid{
    public static void main(String[] args){
        int length = 2; // in cm
        int base = 4; // in cm
        int height = 6; // in cm
        int Volume_Of_Cuboid = length*base*height;
        System.out.println("The volume of Cuboid is: " + Volume_Of_Cuboid);
    }
}
  /*  Write a program to find square of a number.
        E.g.- INPUT : 2 OUTPUT : 4
        INPUT : 5 OUTPUT : 25 */
class SquareOfNumber{
    public static void main(String[] args){
        double a= 2;
        double b= 5;
        System.out.println( "The power of 2 is: " +Math.pow(a,a) +" "+
                "and the power of 5 is: "+ Math.pow(b,a));
    }
  }
/*10. Take two different string input and print them in same line. E.g.-
        INPUT : Codes
        Dope
        OUTPUT : CodesDope */
class StringInSameLine{
    public static void main(String[] args){
        String input1= "Codes";
        String input2= "Dope";
        System.out.print(input1);
        System.out.print(input2);
    }
}
/* Take 3 inputs from user and check :
        all are equal
        any of two are equal
        ( use && || with ternary operator ) */
class EqualOrNot{
    public static void main(String[] args){
        double input1= 2;
        double input2= 2;
        double input3= 3;
        String equal_or_not;
        equal_or_not= (input1==input2)?"Any of two are equal" : (input1==input3&&input2!=input3)?
                "any of two are equal" :(input1==input2&&input2==input3)?"all are equal":"all are not equal";
        System.out.println(equal_or_not);
    }
}
//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true
class Comparison{
    public static void main(String[] args){
        double a= 61;
        double b= 70;
        String Compare;
        Compare= (a<50)?"true":(a<b)?"True":"False";
        System.out.println(Compare);
    }
}
//. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks
class RobertsReport{
    public static void main(String[] args){
        double math= 67;
        double science= 67;
        double social= 67;
        double total_marks= 300;
        double total_marks_obtained= (math+science+social);
        double percentage= (total_marks_obtained/total_marks)*100;
        System.out.println("The obtained marks of Robert is: " + total_marks_obtained + " "
                + "and the percentage is: " + percentage);
    }
}

