import java.awt.*;

public class Rectangle {
    double xPos;
    double yPos;
    double width;
    double height ;
    Color color;
    public Rectangle(double xPos, double yPos, double width, double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;


    }
    public void setPos(double x, double y) {
        this.xPos = x ;
        this.yPos = y ;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getXPos() {
        return xPos;
    }
    public double getYPos() {
        return yPos;
    }
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
    public double calculateArea() {
        return this.width * this.height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
