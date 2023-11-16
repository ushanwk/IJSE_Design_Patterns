package lk.ijse.designpattern.structural.facade_design_pattern;

public class Square implements Shape {

    public Square(){
        System.out.println("It's Square");
    }

    @Override
    public void draw() {
        System.out.println("Square Drawed");
    }
}
