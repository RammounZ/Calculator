import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        Window w = new Window("Калькулятор");

        w.setSize(245, 444);
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        w.setResizable(false);
        w.setVisible(true);

    }
}
