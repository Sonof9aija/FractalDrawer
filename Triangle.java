import java.awt.*;

public class Triangle {
    double xPosition;
    double yPosition;
    double width;
    double height;
    Color color;

    public Triangle(double xPos, double yPos, double width, double height){
        this.xPosition = xPos;//bottom left x-cor
        this.yPosition = yPos;//bottom left y-cor
        this.width = width;//width of triangle
        this.height = height;//height of triangle
    }

    public double calculatePerimeter() {
        double sideLength = Math.pow(this.height,2)+Math.pow(this.width,2);
        double pythagorasTheorom = Math.sqrt(sideLength);
        double perimeter = this.width + (pythagorasTheorom*2);
        return perimeter;
    }
    public double calculateArea() {
        double area = (this.height * this.width)/2;
        return area;
    }
    public void setColor(Color color) {

        this.color = color;
    }
    public void setPos(double x, double y){
        this.xPosition = x;
        this.yPosition = y;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public Color getColor() {

        return color;
    }
    public double getXPos() {

        return this.xPosition;
    }
    public double getYPos() {

        return this.yPosition;
    }
    public double getHeight() {

        return this.height;
    }
    public double getWidth() {

        return this.width;
    }
}
