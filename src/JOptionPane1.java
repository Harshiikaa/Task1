import javax.swing.*;
import java.util.Scanner;

public class JOptionPane1 {
    public static void main(String[] args) {
        System.out.println("Let's do JOption pane waala");
    }
}
class StudentDetailsJ{
    public static void main(String[] args){
        // Write a program to take student details as input and display the result.

        String name, address;
        double age, percentage;

        name= JOptionPane.showInputDialog("Enter your name: ");
        address= JOptionPane.showInputDialog("Enter your address: ");

        age= Double.parseDouble(JOptionPane.showInputDialog("Enter your age: "));
        percentage=Double.parseDouble(JOptionPane.showInputDialog("Enter your percentage: "));

        JOptionPane.showMessageDialog(null,"name= "+name+"\n age= "+age+"\n address= "+address+"\n percentage= "+percentage);
    }
}

class SumOfFourNumbersJ{
    public static void main(String[] args){
        //Write a program to calculate sum of four numbers taking user input.
        double num1,num2,num3,num4,sum;
        num1= Double.parseDouble(JOptionPane.showInputDialog("Enter num1: "));
        num2= Double.parseDouble(JOptionPane.showInputDialog("Enter num2: "));
        num3= Double.parseDouble(JOptionPane.showInputDialog("Enter num3: "));
        num4= Double.parseDouble(JOptionPane.showInputDialog("Enter num4: "));
        sum = num1+num2+num3+num4;

        JOptionPane.showMessageDialog(null,"The sum of four numbers is: " + sum);
    }
}

class MarksJ{
    public static void main(String[] args){
        // Write a program to take input of the total marks of four subjects of a student and calculate
        //the total percentage secured. Then display the percentage and final result of the student;
        //a. If equal to or more than 70 -> First Class
        //b. If more than 59 -> Upper second Class
        //c. If more than 49 -> Second class
        //d. If more than 39 -> Third class and if below than 40 the result is fai
        double Maths, Physics,Biology, Chemistry, Obtained_Marks, Percentage;
        int Total_Marks;
         Maths= Double.parseDouble(JOptionPane.showInputDialog("Enter your marks of maths: "));
         Physics= Double.parseDouble(JOptionPane.showInputDialog("Enter your marks of Physics: "));
         Biology= Double.parseDouble(JOptionPane.showInputDialog("Enter your marks of biology: "));
         Chemistry= Double.parseDouble(JOptionPane.showInputDialog("Enter your marks of Chemistry: "));

         Total_Marks= 400;
         Obtained_Marks= Maths+Physics+Biology+Chemistry;
         Percentage= (Obtained_Marks*100)/Total_Marks;
        JOptionPane.showMessageDialog(null,"The total marks is: "+ Total_Marks +"The percentage is: "+ Percentage);
        if (Percentage>=70){
            JOptionPane.showMessageDialog(null,"First Class");
        }
        else if(Percentage>59){
            JOptionPane.showMessageDialog(null,"Upper Second class");
        }
        else if (Percentage>49){
            JOptionPane.showMessageDialog(null,"Second Class");
        }
        else if (Percentage>39){
            JOptionPane.showMessageDialog(null,"Third Class");
        }
        else{
            JOptionPane.showMessageDialog(null,"THE RESULT IS FAIL");
        }
    }
}

// Write a program to take two integer inputs from user and print sum and product of them
class SumOfTwoIntegerJ{
    public static void main(String[] args){
        int integer1,integer2,sum_of_integer;
        integer1= Integer.parseInt(JOptionPane.showInputDialog("Enter integer1: "));
        integer2= Integer.parseInt(JOptionPane.showInputDialog("Enter integer2: "));
        sum_of_integer= integer1+integer2;
        JOptionPane.showMessageDialog(null,"The sum of these two integers will be: " + sum_of_integer);
    }
}
//Take two integer inputs from user. First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results
class AsQuestionJ{
    public static void main(String[] args){
        int integer1,integer2,sum_of_integer,product_of_integer,total_sum,total_product;
        integer1= Integer.parseInt(JOptionPane.showInputDialog("Enter integer1: "));
        integer2= Integer.parseInt(JOptionPane.showInputDialog("Enter integer2: "));
        sum_of_integer= integer1+integer2;
        JOptionPane.showMessageDialog(null,"The sum of two integers will be: " + sum_of_integer);

        product_of_integer= integer1*integer2;
        JOptionPane.showMessageDialog(null,"The product of two integers will be: " + product_of_integer);

        total_sum= sum_of_integer+product_of_integer;
        JOptionPane.showMessageDialog(null,"The sum of the obtained result is: " + total_sum);

        total_product= sum_of_integer*product_of_integer;
        JOptionPane.showMessageDialog(null,"The product of obtained marks will be: " + total_product);
    }
}
// Ask user to give two double input for length and breadth of a rectangle and print area type
//    casted to int.
class AreaOfRectangleJ{
    public static void main(String[] args){
        double length,breadth,Area_Of_Rectangle;
        length= Double.parseDouble(JOptionPane.showInputDialog("Enter the length of rectangle: "));
        breadth= Double.parseDouble(JOptionPane.showInputDialog("Enter the breadth of rectangle: "));
        Area_Of_Rectangle= length*breadth;
        int area_of_rectangle= (int)Area_Of_Rectangle;
        JOptionPane.showMessageDialog(null,"The are of triangle with double input but the type casted output is: " +area_of_rectangle);
    }
   }

// Take name, roll number and field of interest from user and print in the format below :Hey,
//   my name is xyz and my roll number is xyz. My field of interest are xyz
class IntroJ{
    public static void main(String[] args){
        String name,field_of_interest;
        int roll_no;
        name= JOptionPane.showInputDialog("Enter your name: ");
        roll_no= Integer.parseInt(JOptionPane.showInputDialog("Enter your Roll no: "));
        field_of_interest= JOptionPane.showInputDialog("Enter your field of interest: ");

        JOptionPane.showMessageDialog(null,"Hello! this is" +" " +name+ " " + "and My roll number is"+ " " +roll_no+ " " +
                "My field of interests are" +" " +field_of_interest);
    }
}
//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input
class AreaAndPerimeterOfSquareJ{
    public static void main(String[] args){

        double side_of_square,perimeter_of_square,area_of_square;
        side_of_square= Double.parseDouble(JOptionPane.showInputDialog("Enter the side of the square: "));
        perimeter_of_square= 4*side_of_square;
        area_of_square= (side_of_square)*2;
        JOptionPane.showMessageDialog(null,"The perimeter of square is: " +perimeter_of_square+
                " "+ "and the area of square is: " +area_of_square); ;
    }
}
class SIJ{
    public static void main(String[] args){
        double principal,rate,time,Simple_Interest;
        principal = Double.parseDouble(JOptionPane.showInputDialog("Enter the principal: ")); // in rupees
        rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the rate: "));// in percentage
        time= Double.parseDouble(JOptionPane.showInputDialog("Enter the time: "));; // in years
        Simple_Interest = (principal*rate*time)/100;

        JOptionPane.showMessageDialog(null,"The simple interest is: " + Simple_Interest);
    }
}
class AreaOfTriangleJ{
    public static void main(String[] args){
        double base,height,Area_Of_Triangle;
        base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of triangle: ")); // in cm
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of triangle: ")); // in cm
        Area_Of_Triangle = (base*height)/2;

        JOptionPane.showMessageDialog(null,"The area of triangle is: " + Area_Of_Triangle);
    }

}
class VolumeOfCubeJ{
    public static void main(String[] args) {
        double length,Volume_Of_Cube;
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of cube: ")); // in cm
        Volume_Of_Cube = length*length*length;
        JOptionPane.showMessageDialog(null,"The volume of cube is: " + Volume_Of_Cube);
    }
}
class VolumeOfCuboidJ{
    public static void main(String[] args){
        double length,base,height,Volume_Of_Cuboid;
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of Cuboid: ")); // in cm
        base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of Cuboid: ")); // in cm
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of Cuboid: ")); // in cm
        Volume_Of_Cuboid = length*base*height;
        JOptionPane.showMessageDialog(null,"The volume of Cuboid is: " + Volume_Of_Cuboid);
    }
}

/*  Write a program to find square of a number.
       E.g.- INPUT : 2 OUTPUT : 4
       INPUT : 5 OUTPUT : 25 */
class SquareOfNumberJ{
    public static void main(String[] args){
        double a;
        a= Double.parseDouble(JOptionPane.showInputDialog("Enter any number, you want the square of: "));
        JOptionPane.showMessageDialog( null,"The power of 2 is: " +Math.pow(a,2));
    }
}

/*10. Take two different string input and print them in same line. E.g.-
        INPUT : Codes
        Dope
        OUTPUT : CodesDope */
class StringInSameLineJ{
    public static void main(String[] args){
        String input1,input2;
        input1= JOptionPane.showInputDialog("Enter any string: ");
        input2= JOptionPane.showInputDialog("Enter any string again: ");
        JOptionPane.showMessageDialog(null,input1+input2);
    }
}
/* Take 3 inputs from user and check :
        all are equal
        any of two are equal
        ( use && || with ternary operator ) */
class EqualOrNotJ{
    public static void main(String[] args){
        double input1,input2,input3;
        input1= Double.parseDouble(JOptionPane.showInputDialog("Enter your first input: "));
        input2= Double.parseDouble(JOptionPane.showInputDialog("Enter your second input: "));
        input3= Double.parseDouble(JOptionPane.showInputDialog("Enter your third input: "));
        String equal_or_not;
        equal_or_not= (input1==input2)?"Any of two are equal" : (input1==input3&&input2!=input3)?
                "any of two are equal" :(input1==input2&&input2==input3)?"all are equal":"all are not equal";
        JOptionPane.showMessageDialog(null,equal_or_not);
    }
}
//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true
class ComparisonJ{
    public static void main(String[] args){
        double a,b;
        a= Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
        b= Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
        String Compare;
        Compare= (a<50)?"true":(a<b)?"True":"False";
        JOptionPane.showMessageDialog(null,Compare);
    }
}
//. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks
class RobertsReportJ{
    public static void main(String[] args){
        double math,science,social,total_marks,total_marks_obtained,percentage;
        math= Double.parseDouble(JOptionPane.showInputDialog("Enter the marks of math: "));
        science= Double.parseDouble(JOptionPane.showInputDialog("Enter the marks of science: "));
        social= Double.parseDouble(JOptionPane.showInputDialog("Enter the marks of social: "));
        total_marks= 300;
        total_marks_obtained= (math+science+social);
        percentage= (total_marks_obtained/total_marks)*100;
        JOptionPane.showMessageDialog(null,"The obtained marks of Robert is: " + total_marks_obtained + " "
                + "and the percentage is: " + percentage);
    }
}

