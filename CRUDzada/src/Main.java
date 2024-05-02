import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Crud c = new Crud();
        c.setContentPane(c.telaCrud);
        c.setTitle("CRUD");
        c.setSize(800,600);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}