package lk.ijse.designpattern.behavioural.observer_design_pattern;

public class ObserverDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);

        subject.setState(10);

    }

}
