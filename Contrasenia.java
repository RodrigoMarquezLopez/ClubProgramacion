
/**
 * Write a description of class Contraseña here.
 * 
 * @author (El kks) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Contrasenia
{
        public static void main (String [] args){
            String contr = " ";
            String val;
            Scanner sc = new Scanner(System.in);
            Scanner z = new Scanner(System.in);
            System.out.println("Ingrese una contraseña : ");
            contr=sc.nextLine();
            for(int i=0;i<5;i++){
                System.out.println("Introduzca la contreseña  :");
                val=z.nextLine();
                if(contr.equals(val)){
                    System.out.println("Contrasenia valida");
                    i=5;
                }else{
                    System.out.println("Contraseña invalida  numero de intentos: " + (i+1));
                }if(i==4){
                    System.out.println("Ya lo bloqueaste wey :'v");
                }
            }
            
        
        
        
    
    
      }
}
