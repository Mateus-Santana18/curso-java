import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Quantas pesquisas deseja fazer ?"));
        float[] arrayPesquisa = new float[pergunta];
        for (int i = 0; i < pergunta; i++){
            arrayPesquisa[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário: "));
        };
        float maior = -1;

        for (float m : arrayPesquisa){
            if (maior < m){
                maior = m;
            }
        }
        for (float acr : arrayPesquisa){
            if (arrayPesquisa[] < 2500){
                arrayPesquisa[i] *= 1.10;
            }
        }
        System.out.println(maior);
    }
}