import javax.swing.*;
import java.util.ArrayList;

public class Main {
   static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            String nomePessoa =
                    JOptionPane.showInputDialog("Digite um nome:");
            int idadePessoa =
                    Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: " + (i + 1)));
            Pessoa p = new Pessoa(nomePessoa, idadePessoa);
            pessoas.add(p);
        }
        for (Pessoa lista : pessoas){
            System.out.println("Nome: " + lista.getNome() + ", Idade: " + lista.getIdade());
        }

    }
}