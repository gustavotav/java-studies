package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        
        float media = (nota1 + nota2) / 2;
        
        System.out.format("A média de %s é %.1f \n", nome, media);
        
        teclado.close();
    }
}
