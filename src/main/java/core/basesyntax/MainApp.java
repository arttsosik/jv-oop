package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] amachine = {truck, bulldozer, excavator};
        for (core.basesyntax.Machine machine : amachine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
