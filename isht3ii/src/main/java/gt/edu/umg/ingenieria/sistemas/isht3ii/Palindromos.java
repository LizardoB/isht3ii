/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.isht3ii;

/**
 *
 * @author lizardo
 */
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String ej3 = "la ruta natural";
        String ej4 = "rallar";
        String ej5 = "recocer";
        String ej6 = "A lA gOrDa DrOgAlA";
        String ej7 = "/*A1^2?3oso+-+oso3?2^1A*/";
        String ej9 = "si le dare una lanosa medalla de mason a la nuera de lis";
        
        System.out.println("\nEjemplos:");
        System.out.println("1. Probando entrada nula: null Resultado: false - Resultado Obtenido: " + evaluate(null));
        System.out.println("2. Probando entrada vacia: \"\" Resultado: true - Resultado Obtenido: " + evaluate(""));
        System.out.println("3. Probando entrada con espacios: "+ej3+" Resultado: true - Resultado Obtenido: " + evaluate("la ruta natural"));
        System.out.println("4. Probando entrada par: "+ej4+" Resultado: true - Resultado Obtenido: " + evaluate("rallar"));
        System.out.println("5. Probando entrada impar: "+ej5+" Resultado: true - Resultado Obtenido: " + evaluate("recocer"));
        System.out.println("6. Probando entrada mayusculas y minusculas: "+ej6+" Resultado: true - Resultado Obtenido: " + evaluate("A lA gOrDa DrOgAlA"));
        System.out.println("7. Probando entrada digitos y simbolos: "+ej7+" Resultado: true - Resultado Obtenido: " + evaluate("/*A1^2?3oso+-+oso3?2^1A*/"));
        System.out.println("8. Probando entrada unitaria: a Resultado: true - Resultado Obtenido: " + evaluate("a"));
        System.out.println("9. Probando entrada grande: "+ej9+" Resultado: true - Resultado Obtenido: " + evaluate("si le dare una lanosa medalla de mason a la nuera de lis"));
        System.out.println("10. Probando entrada par: 2442 Resultado: true - Resultado Obtenido: " + evaluate("2442") + "\n");
    }

    public static boolean evaluate(String word) {
        if (word == null) {
            return false;
        }
        
        word = word.replace(" ", "").toLowerCase();
        
        boolean result = true;
        int length = word.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
