
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
        void exercicioDois(){
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
                System.out.println("Ano bissexto!!");
            }else{
                System.out.println("Esse ano não é bissexto!!!");
            }
        }
        void exercicioTres(){
            int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do primeiro lado: "));
            int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do segundo lado: "));
            int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do terceiro lado: "));

            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("O triângulo é escaleno.");
            }else{
                System.out.println("O triângulo é isósceles.");
            }
        }
        void exercicioQuatro(){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (numero % 2 == 0 && numero > 10){
                System.out.println("O número é par e maior que 10");
            }else{
                System.out.println("O número não é par ou não é maior que 10");
            }
        }
        void exercicioCinco(){
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
            int frequencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a frequência do aluno: "));

            if (nota >= 7 && frequencia > 75){
                System.out.println("Aluno aprovado!!");
            }else {
                System.out.println("Aluno Reprovado!!");
            }
        }
        void exercicioSeis(){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("O número é divisível por 3 e por 5.");
            }else{
                System.out.println("O número não é divisível por 3 e por 5 simultaneamente");
            }
        }
        void exercicioSete(){
            String caractere = JOptionPane.showInputDialog("Digite um caractere: ");

            boolean isVogalMinuscula = caractere.equals("a") || caractere.equals("e") || caractere.equals("i") || caractere.equals("o") || caractere.equals("u");
            boolean isNumeroImpar = false;
            if (caractere.matches("\\d")) {
                int numero = Integer.parseInt(caractere);
                isNumeroImpar = (numero % 2 != 0);
            }
            if (isVogalMinuscula || isNumeroImpar) {
                JOptionPane.showMessageDialog(null, "O caractere é uma vogal minúscula ou um número ímpar.");
            } else {
                JOptionPane.showMessageDialog(null, "O caractere não é uma vogal minúscula ou um número ímpar.");
            }
        }
        void exercicioOito(){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (num >= 20 && num <= 30){
                System.out.println("O número está no intervalo de 20 a 30, inclusive.");
            }else{
                System.out.println("O número não está no intervalo de 20 a 30, inclusive.");
            }
        }
        void exercicioNove(){
            int notaDisciplina1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da disciplina 1: "));
            int notaDisciplina2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da disciplina 2:"));
            int notaDisciplina3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da disciplina 3:"));

            if (notaDisciplina1 >= 7 && notaDisciplina2 >= 7 && notaDisciplina3 >= 7){
                System.out.println("Aluno aprovado em todas as disciplinas.");
            } else if (notaDisciplina1 < 7 && notaDisciplina2 >= 7 && notaDisciplina3 >= 7) {
                System.out.println("Aluno reprovado na primeira disciplina.");
            } else if (notaDisciplina1 >= 7 && notaDisciplina2 < 7 && notaDisciplina3 >= 7) {
                System.out.println("Aluno reprovado na segunda disciplina.");
            }else if (notaDisciplina1 >= 7 && notaDisciplina2 >= 7 && notaDisciplina3 < 7){
                System.out.println("Aluno reprovado na terceira disciplina.");
            }else {
                System.out.println("Aluno reprovado em todas as disciplinas.");
            }
        }
        void exercicioDez(){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do candidato:"));
            String experienciaPrevia = JOptionPane.showInputDialog("O candidato possui experiência prévia (sim/não) ?");
            String concluiuEnsinoMedio = JOptionPane.showInputDialog("O candidato concluiu o ensino médio nos últimos 5 anos (sim/não)?");

            if (idade > 18 && experienciaPrevia.equals("sim") || idade > 18 && concluiuEnsinoMedio.equals("sim")) {
                System.out.println("Candidato apto para a vaga de emprego.");
            } else {
                System.out.println("Candidato não apto para a vaga de emprego.");
            }
        }
}
