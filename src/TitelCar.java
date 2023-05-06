import javax.swing.*;
public class TitelCar {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Машина");
        Car t = new Car();
        jFrame.add(t);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(900, 600);
        jFrame.setLocation(620, 200);

    }
}
