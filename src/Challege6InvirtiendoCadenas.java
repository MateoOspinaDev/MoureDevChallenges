public class Challege6InvirtiendoCadenas {
    /*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"

     */
    public static String invertirCadena(String cadena){
        StringBuilder cadenaInversa = new StringBuilder();
        for (int i = cadena.length()-1; i >= 0; i--) {
            char letra = cadena.charAt(i);
            cadenaInversa.append(letra);
        }
        return cadenaInversa.toString();
    }

    public static void main(String[] args) {
        System.out.println(invertirCadena("Hola mundo"));
    }
}
