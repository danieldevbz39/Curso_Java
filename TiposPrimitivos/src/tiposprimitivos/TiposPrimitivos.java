/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author PCGAMERCASA
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);///entrada de dados de
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        //String nome = "Daniel";
        float nota = teclado.nextFloat();
        //float nota = 8.5f;
        //System.out.print("A nota é " + nota);
        //System.out.println(" A nota é " + nota);//sout + tab atalho para System.out.println
        //System.out.printf("A nota de %s é %.2f \n", nome,nota);//printf exibe números em float
        System.out.format("A nota de %s é %.1f \n", nome,nota);
    }
    
}
