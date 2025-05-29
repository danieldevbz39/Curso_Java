/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idiomasistema;

import java.util.Locale;

/**
 *
 * @author daniel
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("Seus sitema está em");
        System.out.println(loc.getDisplayLanguage());        
        System.out.println(loc.getLanguage());

    }
}
