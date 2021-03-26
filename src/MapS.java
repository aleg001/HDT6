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

public interface MapS<K, V> {
    
        /**
         * @param key serch key
         * @return key
         */
        public abstract boolean containsKey(K key);
    
        /**
         * @param value serch value
         * @return value
         */
        public abstract boolean containsValue(V value);
    
        /**
         * @param key key to add 
         * @param value value to add
         * @return value added 
         */
        public abstract V put(K key, V value);
    
        /**
         * @param index index of the key
         * @return key
         */
        public abstract K getKey(int index);
    
        /**
         * @param key key
         * @return value
         */
        public abstract V get(K key);
    
}
