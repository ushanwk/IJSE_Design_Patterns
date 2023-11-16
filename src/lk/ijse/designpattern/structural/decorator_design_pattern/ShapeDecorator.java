package lk.ijse.designpattern.structural.decorator_design_pattern;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    public void draw(){
        decoratorShape.draw();
    }

}
