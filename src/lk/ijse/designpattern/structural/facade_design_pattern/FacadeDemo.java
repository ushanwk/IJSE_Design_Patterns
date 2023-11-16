package lk.ijse.designpattern.structural.facade_design_pattern;


public class FacadeDemo {

    public static void main(String[] args) {

        ShapeMaker shapeMaker1 = new ShapeMaker();
        shapeMaker1.drawCircle();
        shapeMaker1.drawSquare();

    }

}
