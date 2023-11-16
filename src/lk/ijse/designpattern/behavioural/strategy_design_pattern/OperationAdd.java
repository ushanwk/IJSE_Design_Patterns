package lk.ijse.designpattern.behavioural.strategy_design_pattern;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
