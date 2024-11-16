package exentradadados;

import javax.swing.JOptionPane;

public class ExEntradaDados {

    public static void main(String[] args) {
        int valor = 0;
        int valores = 0;
        int pares = 0;
        int impares = 0;
        int acima = 0;
        int soma = 0;
        
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor: <br><em>(0 Interrompe)</em></html>", 
                    "Entrada de Dados", JOptionPane.WARNING_MESSAGE));
            
            if (valor != 0) {
                valores++;
                soma += valor;
                
                if (valor % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (valor > 100) {
                    acima++;
                }
            }
        } while (valor != 0);

        double media = (valores > 0) ? (double) soma / valores : 0;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado: <hr>" + 
                "<br>Total de Valores: " + valores + 
                "<br>Total de Pares: " + pares + 
                "<br>Total de Ímpares: " + impares + 
                "<br>Acima de 100: " + acima + 
                "<br>Média dos valores: " + String.format("%.2f", media) +
                "</html>");
    }
}
