import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Crud extends JFrame{
    public JPanel telaCrud;
    private JTextField inptMarca;
    private JTextField inptTamanho;
    private JTextField inptValor;
    private JButton fakesButton;
    private JButton cadastrarButton;
    private JButton localizarButton;
    private JButton editarButton;
    private JButton apagarButton;
    private JButton mostrarTodosButton;
    private JTextArea txtTodos;
    private JLabel lblMarca;
    private JLabel lblTamanho;
    private JLabel lblValor;
    ArrayList<Chuteira> chuteiras = new ArrayList<Chuteira>();

    private void mostrarTodos(){
        String s = "";
        txtTodos.setText("");
        for (Chuteira c : chuteiras){
            s = s.concat(String.format("Marca: %s \nTamanho: %d \nValor: R$ %.2f \n----------------------\n",c.getMarca(),c.getTamanho(),c.getValor()));
            txtTodos.setText(s);
        }
    }

    public Crud() {

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        localizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mostrarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fakesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    chuteiras.add(new Chuteira("Nike",42,220.00f));
                    chuteiras.add(new Chuteira("Adidas",40,299.90f));
                    chuteiras.add(new Chuteira("Puma",39,159.90f));

                    mostrarTodos();

            }
        });
    }
}
