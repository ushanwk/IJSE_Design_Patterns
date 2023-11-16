package lk.ijse.designpattern.behavioural.strategy_design_pattern;

public class StragedyDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        Context context1 = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context1.executeStrategy(10, 5));

    }

}
