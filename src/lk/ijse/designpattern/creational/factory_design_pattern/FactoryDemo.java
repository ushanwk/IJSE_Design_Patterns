package lk.ijse.designpattern.creational.factory_design_pattern;

public class FactoryDemo {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("Circle");

    }

}
