/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Alejandro Gomez
* Autores: Paola Contreras
* Fecha de creacion:
* Ultima edicion: 
********************************************************/

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class LinkedHashMapS <K,V> implements MapS<K, V>{
         
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
/*public class LinkedHashMapS {
     
    /**
     * Generate LinkedHashMap
     * @param item
     * @param ArchivoTexto
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */

    /*public void gLM(LinkedHashMap <Integer, Almacen> pLHM, String fl ){
        try { Scanner i = new Scanner(new File(fl)); 
            int ContadorLHM = 1;
            while (i.hasNextLine()) {String LineaEnArchivo = i.nextLine(); 
                String[] tLHM = LineaEnArchivo.split(" \\|	"); 
                pLHM.put(ContadorLHM, new Almacen(tLHM[0], tLHM[1], 10));
                ContadorLHM++;}
        } catch (Exception e) {System.out.println(e);;}}



     /**
     * Add item to LinkedHashMap
     * @param item
     * @param CategoriaProducto
     * @param Producto
     * @param Avaible 
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */
        /*/ Method that adds a new product to the HashMap 
        public void addLinkedHashMap(LinkedHashMap <Integer, Almacen> item, String CategoriaProducto, String Producto, Integer Available){
            int tamano= item.size();  // size of the hashmap 
            item.put((tamano+1), new Almacen(CategoriaProducto, Producto, Available)); // Add a new item to the HashMap 
        }

        
     /**
     * Show item in LinkedHashMap
     * @param item
     * @param itemName
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */

    /*public String ShowProduct(LinkedHashMap <Integer,Almacen> item, String nombreProductoExistente) {
        String producto = "";String details="";

        for(Almacen ObjetoExistente: item.values()) {
            producto = ObjetoExistente.getProducto();
                if(producto.equalsIgnoreCase(nombreProductoExistente)) 
                {details = ObjetoExistente.toString();}}
        return details;
    }

    /**
     * Show category in LinkedHashMap
     * @param item
     * @param itemName
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */
        /*public String ShowCategoria(LinkedHashMap <Integer, Almacen> item, String nombreProductoExistente) {
            //Se definen variables
            String producto = ""; String categoria = "";
            //Se crea ciclo for para ver los items y categorias
            for(Almacen ObjetoExistente: item.values()) {producto = ObjetoExistente.getProducto();
                //Se define ciclo if para el producto existente
                if(producto.equalsIgnoreCase(nombreProductoExistente)) {
                    categoria = ObjetoExistente.getCategoriaProducto();}}

            //Se retorna la categoria a la que pertenece
            return categoria;}
    }*/
