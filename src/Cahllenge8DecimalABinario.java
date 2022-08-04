public class Cahllenge8DecimalABinario {
    /*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *

     */
    public static String decimalABinario(long decimal) {
        if (decimal <= 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {

            int residuo = (int) (decimal % 2);
            decimal = decimal / 2;

            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }
    public static void main(String[] args) {
        System.out.println(decimalABinario(387));
        System.out.println(decimalABinario(0));
    }
}
