package boletin.pkg19;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin19 {

    public static void main(String[] args) {
       /*Libreria libro1=new Libreria();
       Libreria libro2=new Libreria();
       Libreria libro3=new Libreria();
       libro1.engadirLibros();
       libro2.engadirLibros();
       libro3.engadirLibros();*/
       Libreria objLibro=new Libreria();
       int opcion;
       do {
           opcion=Integer.parseInt(JOptionPane.showInputDialog("Selecciona la opcion que quieras realizar:\n1=Añadir libro\n2=Borrar libro\n3=Amosar todos os libros\n4=Dar de baixa\n5=Consultar libro"));
           
           switch(opcion){
           case 1:objLibro.engadirLibros();
           break;
           case 2:objLibro.venderLibro();
           break;
           case 3:objLibro.amosarLibros();
           break;
           case 4:objLibro.darDeBaixa();
           break;
           case 5:objLibro.consultarLibro();
           break;
           case 6:System.exit(0);
       }
               
       }while(opcion<6||opcion>0);
    }
    
}
