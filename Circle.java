import java.awt.*;

public class Circle {
    double xPosition;
    double yPosition;
    double radius;
    Color color;


    public Circle (double xPos, double yPos, double radius) {
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.radius = radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius ;
    }
    public double calculateArea() {
        return radius * radius * Math.PI  ;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPos(double xPos, double yPos) {
        this.yPosition = yPos;
        this.xPosition = xPos;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Color getColor() {
        return color;
    }
    public double getXPos() {
        return xPosition;
    }
    public double getYPos() {
        return yPosition;
    }
    public double getRadius() {
        return radius;
    }
}
