package albastro.decision.myapplication;

import java.lang.Math ;
public class Formulas{

     public static double coneAreaFormula(double radius, double height){

         return (Math.PI*radius)*(radius+Math.sqrt((height*height)) + (radius*radius));

     }
     public static double coneVolumeFormula(double radius, double height) {

         return Math.PI * Math.pow(radius, 2) * (height / 3);
     }
     public static double pyramidAreaFormula(double length, double width, double height){

         return (length * width) + (length * Math.sqrt(Math.pow(width/2,2) + Math.pow(height,2))) + (width * Math.sqrt(Math.pow(length/2,2)+Math.pow(height,2)));
     }
    public static double pyramidVolumeFormula(double length, double width, double height){

        return (length * width * height) / 3;
    }
    public static double cubeAreaFormula(double Edge){

         return  6 * Math.pow (Edge,2);
    }
    public static double cubeVolumeFormula(double edge){

         return Math.pow(edge, 3.0);
    }
    public static double cylinderAreaFormula(double radius, double height){
        return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2.0));
    }

    public static double cylinderVolumeFormula(double radius, double height){
        return (Math.PI * Math.pow(radius, 2.0) * height);
    }
}
