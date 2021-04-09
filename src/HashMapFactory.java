import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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

public class HashMapFactory <K,V> {
    
    /**
     * Method that selects and retorns the implementation that is going to be used.
     * @param opcion
     * @return map selected 
     */
 
    public Map seleecionarMapa(int opcion){
        // HashMap option 
        if (opcion ==1) {
            
            return new HashMap<K,V>();
        // TreeMap option 
        }else if(opcion==2){

            return new TreeMap<K,V>();
        // LinkedHashMap option 
        }else if(opcion == 3){
            return new LinkedHashMap<K,V>();
            
        } else { return null;
            
        }
    }
    
}
