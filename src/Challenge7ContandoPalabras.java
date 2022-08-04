import java.util.HashMap;
import java.util.Map;

public class Challenge7ContandoPalabras {
    /*
     * Reto #7
     * CONTANDO PALABRAS
     * Fecha publicación enunciado: 14/02/22
     * Fecha publicación resolución: 21/02/22
     * Dificultad: MEDIA
     *
     * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de
     *  todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
     *
     */
    public static void printNumbersOfWords(String oración) {
        Map<String,Integer> contador = new HashMap<>();
        oración.toLowerCase().trim();
        String result = oración.replaceAll("\\p{Punct}", "");
        String[] palabras = result.split(" ");
        for (String palabra:
             palabras) {
            if(!contador.containsKey(palabra)) contador.put(palabra,1);
            else contador.replace(palabra,contador.get(palabra)+1);
    }
        System.out.println(contador);
    }

    public static void main(String[] args) {
        printNumbersOfWords("asdasd., asdas,asd asdasd asdasd");
    }
}
