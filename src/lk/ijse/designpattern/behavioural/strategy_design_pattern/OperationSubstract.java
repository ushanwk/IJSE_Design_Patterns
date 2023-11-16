package lk.ijse.designpattern.behavioural.strategy_design_pattern;

import java.sql.Statement;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
