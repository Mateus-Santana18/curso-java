import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Quantas pesquisas deseja fazer ?"));
        float[] arrayPesquisa = new float[pergunta];
        float[] arrayPesquisaAcrescimo = new float[pergunta];
        for (int i = 0; i < pergunta; i++){
            arrayPesquisa[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário: "));
        }
        float maior = -1;
        float   maiorAcrescimo = -1;
        for(int i = 0; i < arrayPesquisaAcrescimo.length; i++) {
            arrayPesquisaAcrescimo[i] = arrayPesquisa[i] * 1.10f;
        }
        for (float m : arrayPesquisa){
            if (maior < m){
                maior = m;
            }
        }
        for (float m : arrayPesquisaAcrescimo){
            if (maiorAcrescimo < m){
                maiorAcrescimo = m;
            }
        }
        for(int i = 0; i < arrayPesquisa.length; i++) {
            float value = arrayPesquisa[i];
            if (value <= 2500 ){
                System.out.println("O salário é de: " + value + " Com o acréscimo dos 10% fica um total de: " + arrayPesquisaAcrescimo[i]);
            }
        }
        System.out.println("O maior salário dentre as pequisas é: " + maior);
        if (maiorAcrescimo <= 2500) {
            System.out.println("O maior salário com acrescimo dentre as pequisas é: " + maiorAcrescimo);
        }
    }
}