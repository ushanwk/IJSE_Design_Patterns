package lk.ijse.designpattern.structural.decorator_design_pattern;

public class DecoratorDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCicle = new RedShapeDecorator(new Circle());
        Shape redSqaure = new RedShapeDecorator(new Square());

    }

}
