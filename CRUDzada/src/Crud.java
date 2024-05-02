import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Crud extends JFrame{
    public JPanel telaCrud;
    private JTextField txtMarca;
    private JTextField txtTamanho;
    private JTextField txtValor;
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
    private Chuteira armazem;
    private Chuteira alvo = null;
    ArrayList<Chuteira> chuteiras = new ArrayList<Chuteira>();

    private void mostrarTodos(){
        String s = "";
        txtTodos.setText("");
        for (Chuteira c : chuteiras){
            s = s.concat(String.format("Marca: %s \nTamanho: %d \nValor: R$ %.2f \n----------------------\n",c.getMarca(),c.getTamanho(),c.getValor()));
            txtTodos.setText(s);
        }
    }

    private void limparEntradas(){
        txtMarca.setText("");
        txtTamanho.setText("");
        txtValor.setText("");
    }

    public Crud() {

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = txtMarca.getText();
                int tamanho = Integer.parseInt(txtTamanho.getText());
                float valor = Float.parseFloat(txtValor.getText());

                Chuteira c = new Chuteira(marca,tamanho,valor);
                chuteiras.add(c);

                mostrarTodos();
                limparEntradas();
            }
        });
        localizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Chuteira c : chuteiras){
                    if (txtMarca.getText().equals(c.getMarca())){
                        alvo = c;
                        txtTamanho.setText(Integer.toString(c.getTamanho()));
                        txtValor.setText(Float.toString(c.getValor()));
                    }
                }
                mostrarTodos();

            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (alvo != null){
                        alvo.setTamanho(Integer.parseInt(txtTamanho.getText()));
                        alvo.setValor(Float.parseFloat(txtValor.getText()));
                    }
                    mostrarTodos();
                    limparEntradas();
            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                for (int i = 0; i < chuteiras.size(); i++){
//                    Chuteira indexObj = chuteiras.get(i);
//                        if (indexObj.getMarca().equals(txtMarca.getText())){
//                            chuteiras.remove(i);
//
//                        }
//                }
                if (alvo != null){
                    chuteiras.remove(alvo);
                }
                alvo = null;
                mostrarTodos();
                limparEntradas();

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
