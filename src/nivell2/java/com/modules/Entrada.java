package nivell2.java.com.modules;
import java.util.InputMismatchException;
import java.util.Scanner;
import nivell2.java.com.exceptions.EntradaStringException;
import static nivell2.java.com.modules.Utilities.*;

public class Entrada {
    static Scanner scan = new Scanner(System.in);

    public static byte llegirByte(String message) {
        boolean correct = false;
        byte result = 0;
        while (!correct){
            System.out.println(message);
            try {
                result = scan.nextByte();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("El tipus de dada entrat és diferent al que s'esperava (byte).");
            }finally {
                scan.nextLine();
            }
        }
        return result;
    }
    public static int llegirInt(String message) {
        boolean correct = false;
        int result = 0;
        while (!correct){
            System.out.println(message);
            try {
                result = scan.nextInt();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("El tipus de dada entrat és diferent al que s'esperava (int).");
            }finally {
                scan.nextLine();
            }
        }
        return result;
    }

    public static float llegirFloat(String message) {
        boolean correct = false;
        float result = 0;
        while (!correct){
            System.out.println(message);
            try {
                result = scan.nextFloat();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("El tipus de dada entrat és diferent al que s'esperava (float).");
                System.out.println("O potser has fet servir un separador decimal incorrecte?");
            }
            finally {
                scan.nextLine();
            }
        }
        return result;
    }
    public static double llegirDouble(String message) {
        boolean correct = false;
        double result = 0;
        while (!correct){
            System.out.println(message);
            try {
                result = scan.nextDouble();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("El tipus de dada entrat és diferent al que s'esperava (double).");
                System.out.println("O potser has fet servir un separador decimal incorrecte?");
            }finally {
                scan.nextLine();
            }
        }
        return result;
    }

    public static char llegirChar(String message) throws EntradaStringException{
        char result = ' ';
        while (true){
            System.out.println(message);
            try{
                result = getFirstChar(scan.nextLine());
                break;
            }
            catch (EntradaStringException e){
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public static String llegirString(String message) throws EntradaStringException{
        String result;
        while(true){
            System.out.println(message);
            try {
                result = checkName(scan.nextLine());
                break;
            }
            catch (EntradaStringException e){
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public static boolean llegirSiNo(String message){
        boolean result;
        while (true){
            System.out.println(message);
            try {
                result = getTrueFalse(scan.nextLine());
                break;
            }
            catch (EntradaStringException e){
                System.out.println(e.getMessage());
            }
        }
        return result;
        }
}
