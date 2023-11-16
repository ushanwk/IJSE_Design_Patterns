package lk.ijse.designpattern.creational.factory_design_pattern;

public class ShapeFactory {

    public Shape getShape(String shape){

        if(shape == null){
            return null;
        }else if(shape .equals("Circle")){
            return new Circle();
        } else if(shape .equals("Square")) {
            return new Square();
        }else{
            return null;
        }

    }

}
