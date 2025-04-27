abstract class Shape {

private int length, width;

public int getLength (){
    return length;
}

public int getWidth (){
    return width;
}

public void setLength(int l){
    length = l;
}

public void setWidth(int w){
    width = w;
}

public int calcArea(){ // no need for parameters.
    return length*width;
}
}
class Square extends Shape{ //no need for public class Shape and extends is the Java way.
    
    public int calcArea(){ // java override is a lot smoother than C++
        int l= getLength(); // Use getter for length
        return l*l;
    }

}

class Circle extends Shape{
    public int calcArea(){
        int r = getLength();
        return r*r*3; // need to look into casting if its just (int) 3.14 or some other way.
    }
}

public class ShapeTest {
public static void main(String[] args){
    Square square = new Square();
    square.setLength(4);

    Circle circle = new Circle();
    circle.setLength(3);

    int squareArea = square.calcArea();
    int circleArea = circle.calcArea();



    int totalArea = squareArea + circleArea;

System.out.println("Total area is: " + totalArea);
}

}
