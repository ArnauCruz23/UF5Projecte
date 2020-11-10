package cat.copernic.m03uf05review2.generics.collections.Ex.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExprMain {

    /**
     * Expresión regular que valide NIF
     */
    static boolean validateNif(String nif) {
        Pattern p = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher m1 = p.matcher(nif);
        return m1.matches();
        
    }

    /**
     * Expresión regular que valide NIE
     */
    
    static boolean validateNie(String nie) {
        Pattern p = Pattern.compile("[XYZ][0-9]{7}[A-Z]");
        Matcher m1 = p.matcher(nie);
        return m1.matches();
    }
    /**
     * Expresión regular que valide un telefono de movil
     */
    
    static boolean validateTelefon(String telefon) {
        Pattern p = Pattern.compile("[0-9]{9}");
        Matcher m1 = p.matcher(telefon);
        return m1.matches();
    }
    /**
     * Expresión regular que valide un telefono de España
     */
    
    static boolean validateTelefonEspanya(String telefonE) {
        Pattern p = Pattern.compile("[+][3][4][0-9]{9}");
        Matcher m1 = p.matcher(telefonE);
        return m1.matches();
    }
    /**
     * Expresión regular que valide una matricula: 4 digitos espacio 3 letras
     * mayúscula sin vocales
     */
    
    static boolean validateMatricula(String matricula) {
        Pattern p = Pattern.compile("^[0-9]{4}\\p{Blank}[BCDFGHJKLMNPRSTVWXYZ]{3}");
        Matcher m1 = p.matcher(matricula);
        return m1.matches();
    }
    /**
     * Expresión regular que valide una fecha formato dd/mm/aaaa
     */
    
    static boolean validateData(String data) {
        Pattern p = Pattern.compile("(0[1-9]||1[0-9]||3[0-1])/(0[0-9]||1[0-2])/[0-9]{4}");
        Matcher m1 = p.matcher(data);
        return m1.matches();
    }
    /**
     * Expresión regular que valide un email
     */
    
    static boolean validateMail(String mail) {
        Pattern p = Pattern.compile("[a-zA-Z0-9.-]*@[a-zA-Z0-9.]*(.[a-zA-Z])*");
        Matcher m1 = p.matcher(mail);
        return m1.matches();
    }
    
    
    /**
     * @param args the command line arguments Regular expressions are a way to
     * describe a set of strings based on common characteristics shared by each
     * string in the set
     *
     * A Pattern object is a compiled representation of a regular expression
     *
     * A Matcher object is the engine that interprets the pattern and performs
     * match operations against an input string
     *
     * A PatternSyntaxException object is an unchecked exception that indicates
     * a syntax error in a regular expression pattern
     *
     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(\\p{Lower}|\\p{Digit})+$");
        Matcher m1 = p.matcher("a9");
        Matcher m2 = p.matcher("ab8");
        boolean b1 = m1.matches();
        boolean b2 = m2.matches();
        //System.out.println(b1);
        //System.out.println(b2);
        
        System.out.println(validateNif("46377899F"));
        System.out.println(validateNie("X1234567F"));
        System.out.println(validateTelefon("937891071"));
        System.out.println(validateTelefonEspanya("+34600568872"));
        System.out.println(validateMatricula("9850 DCF"));
        System.out.println(validateData("12/12/2020"));
        System.out.println(validateMail("cruzcambra98.arnau@gmail.institut.com"));
        
        
    }

}
