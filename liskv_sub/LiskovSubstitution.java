package liskv_sub;

//popular example on internet


class Rectangle {
    int length, breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

}

class Square extends Rectangle {
    public void setLength(int length) {
        super.setBreadth(length);
        super.setLength(length);
    }

    public void setBreadth(int breadth) {
        super.setLength(breadth);
        super.setBreadth(breadth);
    }
}
class RectangleAreaCalculator {
    void calculateArea(Rectangle rect){
        System.out.println("area is "+rect.length*rect.breadth);
    }
}

public class LiskovSubstitution {

    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setBreadth(5);
        rect.setLength(6);
        new RectangleAreaCalculator().calculateArea(rect);
    }
}
