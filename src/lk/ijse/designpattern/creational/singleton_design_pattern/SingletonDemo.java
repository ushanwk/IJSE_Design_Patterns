package lk.ijse.designpattern.creational.singleton_design_pattern;

public class SingletonDemo {

    public static void main(String[] args) {

        SingletonObject instance = SingletonObject.getInstance();
         instance.showMessage();

    }

}
