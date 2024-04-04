
    import javax.swing.*;
    public class Exercicio_um {
        void exercicioUm(){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if (numero > 0){
                System.out.println("Número Positivo!!");
            } else if (numero < 0) {
                System.out.println("Número Negativo!!");
            }else{
                System.out.println("O número é zero!!");
            }
        }



}
