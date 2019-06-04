package circleexample;

import java.util.Arrays;

public class CircleExample {

    
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(); //object
        Circle circle2 = new Circle(); //object
        
//        Circle []pinakas = {circle1, circle2};
//            for (int i = 0; i< pinakas.length; i++){
//                System.out.println(pinakas[i]);
//            } 
        
        //circle1.x = -1; // den kanei initialization giati to x einai private
        circle1.setX(-5);//idio me panw, mesw me8odou
        circle1.setY(2);        
        circle1.setRadius(3);        
        double tempPerimeter = circle1.getPerimeter();
        
                      
                
        System.out.println(circle1.getX());//ginetai mesw me8odou
        System.out.println(circle1.getY());
        System.out.println(circle1.getRadius());
        System.out.println("Perimeter of circle1 is: " + tempPerimeter);
        System.out.println("Area of circle1 is: " + circle1.getArea());
        
        System.out.println(circle2.getX());
        System.out.println(circle2.getY());
        System.out.println(circle2.getRadius());        
        System.out.println("Perimeter of circle2 is: " + circle2.getPerimeter());
        System.out.println("Area of circle2 is: " + circle2.getArea());
    }
    
}
