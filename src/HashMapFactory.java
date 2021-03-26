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
    
    // Method that  all the possible map options 
    public MapS <K,V> seleecionarMapa(int opcion){
        // HashMap option 
        if (opcion ==1){
            return new HashMapS<k,v>();
        // TreeMap option 
        }else if(opcion==2){
            return new TreeMapS<K,V>();
        // LinkedHashMap option 
        }else if(opccion == 3){
            return new LinkedHashMapS<K.V>();
        }
    }
    
}
