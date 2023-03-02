package objects;


import org.w3c.dom.css.Rect;

// Object Practice
public class Rectangle {

    // Rectangle object
    protected double length;
    protected double width;
    protected double sides = 4;


    public Rectangle(){
        length = 0;
        width = 0;
    }


    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }

    public double calculateArea(){
        return length * width;
    }


    // getters and setters
    public double getLength(){
        return length;
    }
    public void setLength(double length){ this.length = length; }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public void print(){
        System.out.println("I am a rectangle");
    }

}
