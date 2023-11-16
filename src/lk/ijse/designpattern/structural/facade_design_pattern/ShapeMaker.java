package lk.ijse.designpattern.structural.facade_design_pattern;

public class ShapeMaker {

    private Shape circle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
