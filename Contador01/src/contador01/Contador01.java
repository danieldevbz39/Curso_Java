/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author PCGAMERCASA
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc =0;
        while (cc<=10){//enquanto (contador for menor que 4)
            cc++;//contador recebe mais 1
            if (cc == 2 || cc == 3 || cc == 4) {//se contador for igual a 5 ou contador for igual a 7
                continue;
            }
            if (cc == 7){//se contador for igual a 7
                break;
            }
            System.out.println("Cambalhota " + cc);
            
        }
    }
    
}
