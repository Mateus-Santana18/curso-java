import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, maior = -1;
        for (int i = 0; i <= 3; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog((i+1) + " O número: "));

            if (n > maior){
                maior = n;
            }
        }
        System.out.println("Maior: " + maior);
    }
}