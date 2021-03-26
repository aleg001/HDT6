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

    // Method that generates a HashMap
    public void gHM(HashMap <Integer, Almacen> item, String ArchivoTexto ){
        try{Scanner s = new Scanner(new File(ArchivoTexto));
            int Contador =1; // counter 
            // Cicle that reads line by line of the document 
            while(s.hasNextLine()) {
                //Scanner is defined
                String l = s.nextLine();
                String[] t = l.split(" \\|	"); // Separates the document according to the // 
                item.put(Contador, new Almacen(t[0],t[1], 10)); 
                Contador++; // add 1 to the counter 
             }}catch(Exception e){ //L'exception est définie
                System.out.println(e);}
        }

     /**
     * Add item to HashMap
     * @param item
     * @param CategoriaProducto
     * @param Producto
     * @param Avaible 
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */
        // Method that adds a new product to the HashMap 
        public void addHashMap(HashMap <Integer, Almacen> item, String CategoriaProducto, String Producto, Integer Available){
            int tamano= item.size();  // size of the hashmap 
            item.put((tamano+1), new Almacen(CategoriaProducto, Producto, Available)); // Add a new item to the HashMap 
        }

     /**
     * Show item in HashMap
     * @param item
     * @param itemName
     * @author Alejandro Gómez & Gaby Contreras
     * @return n/a
     */
        public String ShowItem(HashMap <Integer, Almacen> item, String itemName){
            String Producto = "";
            String CategoriaProducto = "";

            for(Almacen ItemInAlmacen: item.values()){
                Producto= ItemInAlmacen.getProducto();
                CategoriaProducto=ItemInAlmacen.getCategoriaProducto();
                
            }
            return "La categoria es: " + CategoriaProducto +" y el producto selccionado es: : " + Producto ; 
        }


        //public String ShowC(HashMap <Integer, Almacen> item, String itemName ){}

        

        
}
    


