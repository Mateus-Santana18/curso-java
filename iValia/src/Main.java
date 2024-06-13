import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Avaliacao a = new Avaliacao();
        a.setContentPane(a.telaPrincipal);
        a.setTitle("AVALIAÇÃO");
        a.setSize(1000,600);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}