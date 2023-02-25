package the.circle.and.cylinder.classes;

public class Circle {
    // private instance variable, not accessible from outside this class
    double radius;
    private String color;
    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle(){ // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
    /** Constructs a Circle instance with the given radius and default color
     * @param r */
    public Circle(double r){ // 2nd constructor
        radius = r;
        color = "red";
    }
    //1.1 Constructor Circle(radius : double, color : string)
    public Circle(double r, String color){
        radius = r;
        this.color = color;
    }
    /** Returns the radius
     * @return  */
    public double getRadius(){
        return radius;
    }
    /** Returns the area of this Circle instance
     * @return  */
    public double getArea(){
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    public String toString(){
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
        
    // setter dan getter variabel Color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
