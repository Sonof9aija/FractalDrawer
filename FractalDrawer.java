// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;


public class FractalDrawer {
    Color[] listColors = new Color[]{Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW,Color.BLACK,Color.CYAN,Color.ORANGE,Color.RED};

    private double totalPerimeter=0;  // member variable for tracking the total area
    private double totalArea = 0;

    public FractalDrawer() {}  // contructor



    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(8000,8000);
        switch (type) {
            case "triangle":
                drawTriangleFractal(450,250,500,500,listColors[0],drawing,0);
                break;
            case "rectangle":
                drawRectangleFractal(650, 350, 450,200, listColors[0], drawing, 0);
                break;
            case "circle":
                drawCircleFractal(100, 400, 400, listColors[0], drawing, 0);
                break;
        } return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle myTriangle = new Triangle(x,y,width,height);
        myTriangle.setColor(c);
        can.drawShape(myTriangle);
        totalArea += myTriangle.calculateArea();
        if(level<7){
            drawTriangleFractal(width/2,height/2,x-(width/2),y,listColors[level+1],can,level+1);
            drawTriangleFractal(width/2,height/2,x+width,y,listColors[level+1],can,level+1);
            drawTriangleFractal(width/2,height/2,x+(width/4),y-height,listColors[level+1],can,level+1);
        }
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle myCircle = new Circle(x,y,radius);
        myCircle.setColor(c);
        can.drawShape(myCircle);
        totalArea += myCircle.calculateArea();
        if(level<7){
            drawCircleFractal(radius/2,x+(radius*2),y,listColors[level+1],can,level+1);
            drawCircleFractal(radius/2,x-(radius*2),y,listColors[level+1],can,level+1);
            drawCircleFractal(radius/2,x,y+(radius*2),listColors[level+1],can,level+1);
            drawCircleFractal(radius/2,x,y-(radius*2),listColors[level+1],can,level+1);

        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle myRectangle = new Rectangle(x,y,width,height);
        myRectangle.setColor(c);
        can.drawShape(myRectangle);
        totalArea += myRectangle.calculateArea();
        if(level<7){
            drawRectangleFractal(width/2,height/2,x+width,y-height/2,listColors[level+1],can,level+1);
            drawRectangleFractal(width/2,height/2,x-width/2,y-height/2,listColors[level+1],can,level+1);
            drawRectangleFractal(width/2,height/2,x-width/2,y+height,listColors[level+1],can,level+1);
            drawRectangleFractal(width/2,height/2,x+width,y+height,listColors[level+1],can,level+1);
        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print perimeter of fractal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired shape: ");
        String input = sc.nextLine();
        input = input.toLowerCase();

        FractalDrawer fractal = new FractalDrawer();
        fractal.drawFractal(input);
        System.out.println(fractal.totalArea);
    }
}