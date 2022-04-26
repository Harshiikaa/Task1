

public class CanVoteOrNot {
    public static void main(String[] args){
        //Write a program to check whether a person can cast a vote or not. Condition is you must
        //be above 18 years to vote.
        int age = 19;
        if (age>18) {
            System.out.println("You can cast a vote");
        }
        else {
            System.out.println("You can't cast a vote");
        }
    }
}
// Write a program to calculate SI
class SI {
    public static void main(String[] args){
        int principal = 5000; // in rupees
        int rate = 10; // in percentage
        int time= 5; // in years
        int Simple_Interest = (principal*rate*time)/100;

        System.out.println("The simple interest is: " + Simple_Interest);
    }
}
// Write a program to Area of triangle.
class AreaOfTriangle{
    public static void main(String[] args){
        int base = 4; // in cm
        int height = 4; // in cm
        int Area_Of_Triangle = (base*height)/2;

        System.out.println("The area of triangle is: " + Area_Of_Triangle);
    }

}
// Write a program to calculate Volume of Cube
class VolumeOfCube{
    public static void main(String[] args) {
        int length = 3; // in cm
        int Volume_Of_Cube = length*length*length;
        System.out.println("The volume of cube is: " + Volume_Of_Cube);
    }
}
// Write a program to calculate Volume of  Cuboid.
class VolumeOfCuboid{
    public static void main(String[] args){
        int length = 2; // in cm
        int base = 4; // in cm
        int height = 6; // in cm
        int Volume_Of_Cuboid = length*base*height;
        System.out.println("The volume of Cuboid is: " + Volume_Of_Cuboid);
    }
}
   // Write ternary operator for the question no. 1.
class TernaryOperator{
    public static void main(String[] args){
        int age = 18;
        String CastVote;
        CastVote = (age>18)?"You can cast vote":"You can't cast vote";
        System.out.println(CastVote);
    }
   }
   /*Write a program to calculate the total marks of four subjects of a student and the total
percentage secured. And use following conditions to generate the final result;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail.*/



class Marks{
    public static void main(String[] args){
        int Maths= 80;
        int Physics= 50;
        int Biology= 70;
        int Chemistry= 75;
        int Total_Marks= 400;
        int Obtained_Marks= Maths+Physics+Biology+Chemistry;
        float Percentage= (Obtained_Marks*100)/Total_Marks;
        System.out.println("The total marks is: "+ Total_Marks +"The percentage is: "+ Percentage);
//        if (Percentage>=70){
//            System.out.println("First Class");
//        }
//        else if(Percentage>59){
//            System.out.println("Upper Secnond class");
//        }
//        else if (Percentage>49){
//            System.out.println("Second Class");
//        }
//        else if (Percentage>39){
//            System.out.println("Third Class");
//        }
//        else{
//            System.out.println("THE RESULT IS FAIL");
//        }
        String grade;
        grade= (Percentage>=70)?"First Class":(Percentage>59&&Percentage<70)?"Upper second class":
                (Percentage>49&&Percentage<59)?"Second class":(Percentage>39&&Percentage<49)?"Third class":"Fail";
        System.out.println(grade);
// println vayesii aaru pachi ko statement aarko line maa jaancha tara print maatra garera aaru statement vayesii same line maaa aaucha

        }
   }






