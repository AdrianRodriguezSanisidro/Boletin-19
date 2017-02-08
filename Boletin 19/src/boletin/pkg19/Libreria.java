package boletin.pkg19;

import java.util.ArrayList;
import static Sanisidro.PedirDatos.pedirFloat;
import static Sanisidro.PedirDatos.pedirInt;
import static Sanisidro.PedirDatos.pedirString;
/**
 *
 * @author Adry
 */
public class Libreria {
    ArrayList <Libro> libreria=new ArrayList();
    public void engadirLibros (){
        libreria.add(new Libro(pedirString(),pedirString(),pedirString(),pedirFloat(),pedirInt()));
    }
    public void borrarLibro(Libro l,ArrayList<Libro>libreria){
        int index=libreria.indexOf(l);
        libreria.remove(index);
    }
}
