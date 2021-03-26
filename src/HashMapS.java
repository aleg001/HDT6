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
import java.util.ArrayList;

public class HashMapS <K,V> implements MapS<K, V>{
         
        private ArrayList <K> key= new ArrayList <K>();
        private ArrayList <V> Val= new ArrayList <V>();

        public ArrayList<K> getkey() {
            return this.key;
        }
    
        public ArrayList<V> getVal() {
            return this.Val;
        }

        public boolean containsKey(K key) {
            return this.key.contains(key);
        }
    

        public boolean containsValue(V value) {
            return this.Val.contains(value);
        }

        public V put(K key, V value) {
            this.key.add(key);
            this.Val.add(value);
            return value;
        }
    
        public K getKey(int index) {
            return this.key.get(index);
        }
    
        public V get(K key) {
            int place = -1;
            // Search Key 
            for (int i = 0; i < this.key.size(); i++) {
                if (this.key.get(i).equals(key)) {
                    place = i;
                }
            }
            // Return new value
            if (place != -1) {
                return this.Val.get(place);
            } else {
                return null;
            }
        }

}
    


