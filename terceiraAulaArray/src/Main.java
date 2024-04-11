//import javax.swing.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int[] idades = new int[5];
//
//        for(int i=0; i<5; i++){
//            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i+1) + "a idade:"));
//        }
//
//        String texto = "";
//        for(int idade : idades){
//          texto += "Idade: " + idade + ";\n";
//            System.out.println("Idade: " + idade + ";\n");
//        }
//        JOptionPane.showMessageDialog(null, texto);
//        System.out.println(texto);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
//                        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
//
//        int[] fim = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        for(int i=0; i < mes.length; i++){
//            System.out.println("O mês de " + mes[i] + " tem " + fim[i] + " dias");
//        }
//
//    }
//}


//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] idades = {14,12,25,44,11,8};
//        Arrays.sort(idades);
//        for(int i = 0; i < idades.length; i++){
//            System.out.print(idades[i] + " ");
//        }
//    }
//}

//import javax.swing.*;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] idades = {14,12,25,44,11,8};
//        Arrays.sort(idades);
//        for (int n : idades){
//            System.out.print(n + " ");
//        }
//        System.out.println("");
//        int pesq = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor deseja procurar no array: "));
//        int pos = Arrays.binarySearch(idades,pesq);
//        System.out.println("Valor na encontrado na posição: "+pos);
//    }
//}


// ===========================> ArrayList <===========================

//import java.util.ArrayList;
//
//    ArrayList<String> dinos = new ArrayList<String>();

// adicionar elemento =>
//        dinos.add("Angaturama");
//        dinos.add("Uberabatitan");

// acessar elemento =>
//      String dino = dinos.get(1);
//	    System.out.println(dino);

// modificar elemento =>
//        dinos.set(1, "Santanarraptor");

// remover elemento =>
//        dinos.remove(2);

// tamanho da coleção =>
//        int tamanho = dinos.size();

// percorrer a coleção - for
//		for (int i= 0; i<dinos.size(); i++){
//            System.out.println("Dino: " + dinos.get(i));
//            }

// percorrer a coleção - “forEach”
//        System.out.println("--= Percorrendo com 'forEach' =--");
//            for (String d : dinos){
//                System.out.println("Dino: " + d);
//            }

// Sort
//        Collections.sort(dinos);

// indexOf
//        int indice = dinos.indexOf("Santanarraptor");