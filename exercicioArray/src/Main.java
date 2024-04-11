import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Quantas pesquisas deseja fazer ?"));
        float[] arrayPesquisa = new float[pergunta];
        for (int i = 0; i < pergunta; i++){
            arrayPesquisa[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário: "));
        };
        float maior = -1, salarioAcrescimo = 0, salarioTotal = 0;

        for (float m : arrayPesquisa){
            if (maior < m){
                maior = m;
            }
        }

        for (float acr : arrayPesquisa){
            if (acr <= 2500){
                acr *= 1.10f;
                salarioAcrescimo = acr;
            }
        }
        for (float salario : arrayPesquisa){
            if (salario <= 2500 ){
                salarioTotal = salario;
                System.out.println("O salário é de: " + salario + " Com o acréscimo dos 10% fica um total de: " + salarioAcrescimo);
            }
        }
        if (salarioTotal > maior){
            maior = salarioTotal;
        }

        System.out.println("O maior salário é: " + maior);

    }
}