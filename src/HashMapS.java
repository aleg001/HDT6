/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* HashMap.java
* Autores: Alejandro Gomez
* Autores: Paola Contreras
* Fecha de creacion:
* Ultima edicion: 
********************************************************/


//Se definen los imports
import java.io.File; import java.util.HashMap; import java.util.Scanner;

public class HashMapS {
    
    /**
     * Generate HashMap
     * @param item
     * @param ArchivoTexto
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */


    public void gHM(HashMap <Integer, Almacen> item, String ArchivoTexto ){
        try{Scanner s = new Scanner(new File(ArchivoTexto));int Contador =1; 
            while(s.hasNextLine()) {
                String l = s.nextLine();String[] t = l.split(" \\|	");item.put(Contador, new Almacen(t[0],t[1], 10)); Contador++;
        }}catch(Exception e){System.out.println(e);}
            
            }
        
        
}
    


