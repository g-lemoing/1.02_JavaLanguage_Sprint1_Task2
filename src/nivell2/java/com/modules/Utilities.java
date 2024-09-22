package nivell2.java.com.modules;

import nivell2.java.com.exceptions.EntradaStringException;

public class Utilities {
    static char getFirstChar(String str) throws EntradaStringException {
        if (str.length() == 1){
            return str.charAt(0);
        }
        else{
            throw new EntradaStringException("Has d'entrar un carácter i només un.");
        }
    }

    static String checkName(String str) throws EntradaStringException{
        if(str.matches("[\\p{L}-]+")){
            return str;
        }
        else{
            throw new EntradaStringException("El teu nom només ha de contenir lletres.");
        }
    }

    static boolean getTrueFalse(String str) throws EntradaStringException{
        if (str.length() == 1 && str.matches("[sSnN]")){
            return str.matches("[sS]");
        }
        else{
            throw new EntradaStringException("Ha de respondre amb 's' --> Sí, 'n' --> No.");
        }
    }
}
