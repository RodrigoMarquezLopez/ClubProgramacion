
/**
 * Write a description of class Contrasenia2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Contrasenia2
{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String cont= "Paracetamoles";
        String val=" ";
       System.out.println("Ingresa la contraseña");
       val=sc.nextLine();
       if(cont.equalsIgnoreCase(val))
        System.out.println("Awebo le atinaste" );
        else
        System.out.println("Esa no es wey F");
        
    } 
}
