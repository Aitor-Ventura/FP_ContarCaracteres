package es.ulpgc.eii.strings;

public class StringUtils {
    public static int count(String s1, char b){
        int res = 0;    //creamos una variable que almacenará el resultado
        for (int i = 0; i < s1.length(); i++){  //para i = 0 hasta el tamaño de la string, hacer lo siguiente
            if (s1.charAt(i) == b){   //si el caracter que se encuentre en i es igual a b
                res++;                  //sumar
            }
        }
        return res; //devolver la cantidad de caracteres
    }
}