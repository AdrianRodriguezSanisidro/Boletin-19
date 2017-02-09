package boletin.pkg19;

import java.util.ArrayList;
import static Sanisidro.PedirDatos.pedirFloat;
import static Sanisidro.PedirDatos.pedirInt;
import static Sanisidro.PedirDatos.pedirString;
import java.util.Collections;
import java.util.Iterator;
/**
 *
 * @author Adry
 */
public class Libreria {
    ArrayList <Libro> libreria=new ArrayList();
    public void engadirLibros (){
        libreria.add(new Libro(pedirString(),pedirString(),pedirString(),pedirFloat(),pedirInt()));
    }
    public void venderLibro(){
        Libro ventaLibro=new Libro(pedirString(),pedirString(),pedirString(),pedirFloat(),pedirInt());
        for(int i=0;i<libreria.size();i++){
            if(ventaLibro.ISBN.equals(libreria.get(i).getISBN())){
                if (libreria.get(i).getNumUnidades()>=ventaLibro.getNumUnidades()){
                    libreria.get(i).setNumUnidades(libreria.get(i).numUnidades-ventaLibro.numUnidades);
                }else
                    System.out.println("No quedan suficientes unidades");
            }
        }
    }
    public void amosarLibros(){
       Iterator<Libro>libroIterator=libreria.iterator();
       while(libroIterator.hasNext()){
           System.out.println(libroIterator.next());
       }
    }
    public void darDeBaixa(){
        for(int i=0;i<libreria.size();i++)
            while(libreria.get(i).getNumUnidades()==0)
                libreria.remove(i);
    }
}
