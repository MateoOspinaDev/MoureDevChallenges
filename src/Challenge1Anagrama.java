import java.util.*;


public class Challenge1Anagrama {


    /*
     * Reto #1
     * ¿ES UN ANAGRAMA?
     * Fecha publicación enunciado: 03/01/22
     * Fecha publicación resolución: 10/01/22
     * Dificultad: MEDIA
     *
     * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Bool) según sean o no anagramas.
     * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
     * NO hace falta comprobar que ambas palabras existan.
     * Dos palabras exactamente iguales no son anagrama.
     *
     * Información adicional:
     * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
     * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
     * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
     * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
     *
     */
    //Una mejor  forma
    static boolean isAnagramOptim(String a, String b){
        if(a.length()!=b.length()) return  false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <b.length() ; i++) {
            char letra = b.charAt(i);
            if (!map.containsKey(i)){
                map.put(letra,1);
            }else{
                Integer frecuencia = map.get(letra);
                map.put(letra,++frecuencia);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            char letra = a.charAt(i);

            if (!map.containsKey(letra)) return false;

            Integer frecuencia  = map.get(letra);

            if(frecuencia==0) return false;
            else {
                map.put(letra,--frecuencia);
            }
        }

        return true;
    }


    static Boolean esAnagrama(String palabra1, String palabra2) {
        if((palabra1.length()!=palabra2.length() || palabra1.equals(palabra2))) return false;

        char[] letrasPalabra1 = palabra1.toLowerCase().toCharArray();
        char[] letrasPalabra2 = palabra2.toLowerCase().toCharArray();
        Arrays.sort(letrasPalabra1);
        Arrays.sort(letrasPalabra2);

        for (int i = 0; i < palabra1.length(); i++) {
            if(letrasPalabra1[i] != letrasPalabra2[i]) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(esAnagrama("hola","hola"));
        System.out.println(esAnagrama("hola","aloh"));
        System.out.println(esAnagrama("hola","ahol"));
        System.out.println(esAnagrama("hola","ahola"));

        System.out.println(isAnagramOptim("hola","hola"));
        System.out.println(isAnagramOptim("hola","aloh"));
        System.out.println(isAnagramOptim("hola","ahol"));
        System.out.println(isAnagramOptim("hola","ahola"));
    }



}
