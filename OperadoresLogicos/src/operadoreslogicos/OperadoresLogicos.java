/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author PCGAMERCASA
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        // = (x<y && y<z)?true:false;//r recebe (se x for menor que y e y for menor que z, então verdadeiro, senão falso)
        //r = (x<y || y==z)?true:false;//r recebe (se x for menor que y ou y for menor que z, então verdadeiro, senão falso)
        r = (x<y ^ y<z)?true:false;//r recebe (se x for menor que y ou y for menor que z, então verdadeiro, senão falso)
        System.out.println(r);
    }
    
}
