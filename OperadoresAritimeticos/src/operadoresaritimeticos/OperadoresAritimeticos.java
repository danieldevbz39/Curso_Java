/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author PCGAMERCASA
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2; // o sinal + é pra adição
        System.out.println("A média é igual a " + m); // sinal + fora é pra concatenação
        
        int numero = 10;
        int valor = 4 + numero --;
        System.out.println(numero);
        System.out.println(valor);;
        
        int x = 4; 
        x *= 2; // x = x + 2
        System.out.println(x);
        
        float v =8.4f; //arredondando números
        int ar = (int) Math.round(v);
        System.out.println(ar);;
        
        double ale = Math.random(); //gerando numeros aleatórios
        int n = (int) (15 + ale * (50-15));
        System.out.println(n);
    }
    
}
