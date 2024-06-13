import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Avaliacao extends JFrame{
    private JButton btnGuardar;
    private JButton btnBuscaEstabelecimento;
    private JButton btnBuscarItem;
    private JButton btnMostrar;
    private JTextField txtEstabelecimento;
    private JTextField txtItens;
    private JTextField txtNota;
    private JTextField txtComentario;
    public JPanel telaPrincipal;
    private JButton btnFake;
    private JTextArea txtTodos;
    private JLabel lblEstabelecimento;
    private JLabel lblItens;
    private JLabel lblNota;
    private JLabel lblComentario;
    private JButton btnBuscarNota;
    ArrayList<Objeto> temporario = new ArrayList<Objeto>();
    ArrayList<Objeto> pedidos = new ArrayList<Objeto>();

    private void limparEntradas(){

        txtEstabelecimento.setText("");
        txtItens.setText("");
        txtNota.setText("");
        txtComentario.setText("");

    }

    private void mostrarTodos(){
        String s = "";
        txtTodos.setText("");
        for (Objeto o : pedidos){
            s = s.concat(String.format("Estabelecimento: %s \nItem: %s \nNota: %d \nComentario: %s \n----------------------\n",o.getEstabelecimento(), o.getItens(), o.getNota(), o.getComentario()));
            txtTodos.setText(s);
        }
    }
    private void mostrarFiltrado(){
        String s = "";
        txtTodos.setText("");
        System.out.println(temporario.size());
        for (Objeto o : temporario){
            s = s.concat(String.format("Estabelecimento: %s \nItem: %s \nNota: %d \nComentario: %s \n----------------------\n",o.getEstabelecimento(), o.getItens(), o.getNota(), o.getComentario()));

        }
        txtTodos.setText(s);
    }

    public Avaliacao() {
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temporario.clear();
                String estabelecimento = txtEstabelecimento.getText();
                String itens = txtItens.getText();
                int nota = Integer.parseInt(txtNota.getText());
                String comentario = txtComentario.getText();

                Objeto o = new Objeto(estabelecimento,itens,nota,comentario);
                pedidos.add(o);
                limparEntradas();
            }
        });
        btnBuscaEstabelecimento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temporario.clear();
                for (Objeto o : pedidos){
                        if (o.getEstabelecimento().toLowerCase().contains(txtEstabelecimento.getText().toLowerCase())){

                        temporario.add(o);

                    }
                }
                mostrarFiltrado();
                limparEntradas();
            }
        });
        btnBuscarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temporario.clear();
                for (Objeto o : pedidos){
                    if (o.getItens().toLowerCase().contains(txtItens.getText().toLowerCase())){
                        temporario.add(o);

                    }
                }
                mostrarFiltrado();
                limparEntradas();
            }
        });
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTodos();
            }
        });
        btnFake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pedidos.add(new Objeto("Lanchonete 1","X - Burguer", 2, "Gostei, porém veio muito gorduroso"));
                pedidos.add(new Objeto("Lanchonete 2","X - Frango", 8, "Gostei, bom!"));
                pedidos.add(new Objeto("Lanchonete 3","X - Bacon", 10, "Gostei, muito bom!"));
                pedidos.add(new Objeto("Pizzaria 1","Pizza de Queijo", 10, "Gostei, ótimo!"));
            }
        });
        btnBuscarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temporario.clear();
                int nota;
                if (txtNota.getText().equals("")){
                    nota = 0;
                }else{

                    nota = Integer.parseInt(txtNota.getText());
                }
                for (Objeto o : pedidos){
                    if (o.getItens().toLowerCase().contains(txtItens.getText().toLowerCase()) && o.getNota() >= Integer.parseInt(txtNota.getText())){

                        temporario.add(o);

                    }


                }
                mostrarFiltrado();
                limparEntradas();

            }
        });
    }
}
