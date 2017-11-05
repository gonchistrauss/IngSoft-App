package interfaz;
import dominio.Sistema;
import java.io.*;
public class Inicio {
    
    public static void main(String[] args){
        Sistema s;
        try{
            FileInputStream file = new FileInputStream("fooding.app");
            BufferedInputStream buffer = new BufferedInputStream(file);
            ObjectInputStream obj = new ObjectInputStream(buffer);
            s = (Sistema) obj.readObject();
        }
        catch (IOException | ClassNotFoundException e){
            s = new Sistema();
            System.out.println("Archivo no encontrado");
        }
         menuPrincipal menu = new menuPrincipal(s);
         menu.setVisible(true);
    }
}
