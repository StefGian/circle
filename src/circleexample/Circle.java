package circleexample;

public class Circle { //kaloupi gia kuklous
    //state - instance variables (ka8e antikeimeno pou ftiaxnoume 8a exei auta ta variables/xarakthristika)
    private int x;  //ta private var ta blepei mono h class pou anhkoun
    private int y;  // ta public var ta blepoun oloi
    private int radius;  //to default var ta blepoun osoi einai sto idio paketo me auto
    
    //methods - behavior
    public int getX(){
        return x;
    }
    
    public void setX(int arithmos) { // alliws : (int x)
        if (arithmos >=0){ // if (x >=0)
            x = arithmos;  // this.x = x;
        }
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int arithmos){
        y = arithmos;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public void setRadius(int kati){
        if (kati >=0){
        radius = kati;
        }
    }
    /*
    This is a method to set coordinates of the circle
    */
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;// this.y -> einai to prwto y pou dhlwsame
    }
    
    /**
     * Sets x, y, radius
     * @param x will go to x
     * @param y will go to y
     * @param radius will go to radius
     */
    public void setDetails (int x, int y, int radius){
        this.x = x; //or we type:   setCoordinates(x,y);
        this.y = y;
        this.radius = radius;
    }
    
    
    public double getPerimeter(){
        double result = 2*Math.PI*radius;  //PI(3.14)
        return result;   //prepei to return me thn upografh ths me8odou na sumpiptei (double)   
    }
    
    public double getArea(){ //embadon
        double result = Math.PI*Math.pow(radius, 2); // pi*radius*radius, to "result" einai local var
        return result;
    }
    
    public void sayHello(){
        int a = -7;
        int b =0;
        if (a>0){ // to "b" einai block variable, to scope ths einai mesa sta {} pou dhlw8hke, meta ta {} pe8ainei
            b = a;
            System.out.println(b);
        }
        System.out.println(b);
    }
    
}
