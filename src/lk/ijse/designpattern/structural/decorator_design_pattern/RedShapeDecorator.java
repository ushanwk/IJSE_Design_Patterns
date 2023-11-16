package lk.ijse.designpattern.structural.decorator_design_pattern;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw(){

    }

    public void setRedBorder(Shape decoratorShape){
        System.out.println("Border Color : RED");
    }

}
