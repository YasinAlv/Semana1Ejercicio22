/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg22;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int contador=0;
        String frase = "La lluvia en Sevilla es una maravilla";
        
        for (int i = 0; i < frase.length(); i++) {
            
            switch (frase.charAt(i)) {
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
                default:
                    break;
            }     
        }
        
        System.out.println("La cantidad de vocales corresponde a: "+contador);
        
        
    }
    
}
