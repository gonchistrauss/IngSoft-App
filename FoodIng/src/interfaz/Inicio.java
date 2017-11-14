package interfaz;

import dominio.Sistema;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Inicio {

    public static void main(String[] args) throws ParseException {
        Sistema s;
        String string = "January 2, 2010";
        try {
            DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
            Date date = format.parse(string);
            FileInputStream file = new FileInputStream("fooding.app");
            BufferedInputStream buffer = new BufferedInputStream(file);
            ObjectInputStream obj = new ObjectInputStream(buffer);
            s = (Sistema) obj.readObject();
            s.agregarUsuario("usuarioPrueba" + s.getListaUsuarios().size(), "apellidoPrueba" + s.getListaUsuarios().size(), "UY", date, "/imagenes/avatar.png");
            s.agregarProfesional("profesionalPrueba" + s.getListaProfesionales().size(), "apellidoPrueba" + s.getListaProfesionales().size(),"", date, string, string, string, date);
        } catch (IOException | ClassNotFoundException e) {
            s = new Sistema();
            System.out.println("Archivo no encontrado");
        }
        MenuPrincipal menu = new MenuPrincipal(s);
        menu.setVisible(true);
    }
}
