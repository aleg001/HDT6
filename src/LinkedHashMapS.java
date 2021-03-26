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

public class LinkedHashMapS {
     
    /**
     * Generate LinkedHashMap
     * @param item
     * @param ArchivoTexto
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */

    public void gLM(LinkedHashMap <Integer, Almacen> pLHM, String fl ){
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
        // Method that adds a new product to the HashMap 
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

    public String ShowProduct(LinkedHashMap <Integer,Almacen> item, String nombreProductoExistente) {
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
        public String ShowCategoria(LinkedHashMap <Integer, Almacen> item, String nombreProductoExistente) {
            //Se definen variables
            String producto = ""; String categoria = "";
            //Se crea ciclo for para ver los items y categorias
            for(Almacen ObjetoExistente: item.values()) {producto = ObjetoExistente.getProducto();
                //Se define ciclo if para el producto existente
                if(producto.equalsIgnoreCase(nombreProductoExistente)) {
                    categoria = ObjetoExistente.getCategoriaProducto();}}

            //Se retorna la categoria a la que pertenece
            return categoria;}
    }
