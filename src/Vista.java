/***************************************************************
* Vista.java
* Autor: Alejandro Gómez
* Autor: Paola Contreras
* Universidad del Valle de Guatemala
* Fecha creacion: 
* Ultima modificacion: 
***************************************************************/

import java.util.Scanner;

public class Vista {
    // Atributes 
    Scanner scan;

    // ------------------------------- MENU ---------------------------------------------

    /**
     * Metodo constructor
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public Vista(){
        scan = new Scanner(System.in);
    }

    // Menus used in the program 
    /**
     * Metodo de opciones
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    
     public int MenuOp(){
        int op = 2;
        String ops = "";
        boolean validar = true;
        System.out.println("\n1. Usar supermercado");
        System.out.println("2. Salir\n");
        while(validar == true){
            System.out.println("Ingrese su opcion:  ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
        
    }

    /**
     * Opciones
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public int Options(){
        int op = 4;
        String ops = "";
        boolean validar = true;
        System.out.println("\nCual implementacion usara?");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        System.out.println("4. Salir\n");
        while(validar == true){
            System.out.println("Ingrese su opcion:  ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
    }

    /**
     * Options sub menu
     *  @author Paola Contreras 
     * @param n/a
     * @return op
     */
    public int OpcionesPorOperacion(){
        int op = 7;
        String ops = "";
        boolean validar = true;
        System.out.println("1. Agregar Producto");
        System.out.println("2. Ver la categoria de un producto ");
        System.out.println("3. Ver Colección");
        System.out.println("4. Ver Colección Ordenada");
        System.out.println("5. Ver inventario");
        System.out.println("6. Ver inventario ordenado");
        System.out.println("7. Regresar al Menu");

        while(validar == true){
            System.out.println("Ingrese su opcion:  ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
    }


    // ------------------------------- MESAGESS -------------------------------------------------
    
    
    /**
     * Metodo de Bienvenida
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public void Welcome(){
        System.out.println("\nBienvenido al supermercado La Torre");
    }


    /**
     * Error
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public void FileError(){
        System.out.println("Ha ocurrido un error al leer tu archivo, intentalo nuevamente");
    }

    /**
     * @author Alejandro Gomez
     * @param rawNumero
     * @return n/a
     */

    public int validarNum (String rawNumero) {
        int numInt = -1;
        try {
            numInt = Integer.parseInt(rawNumero);
        }
        catch (NumberFormatException e)
        {
           System.out.println( "\nIngrese un numero valido porfa." );
        }
        
        return numInt;
      }

      public int IngresoDeCantidad(){
        int op = 2;
        String ops = "";
        boolean validar = true;
        CantIngreso();
        while(validar == true){
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
        
      }
      /**
       * @author Alejandro Gomez
       * @param n/a
       * @return N/A
       */
    public void MensajeSalida(){
        System.out.println("Gracias por usar nuestro supermercado!");
        System.out.println("Autores:");
        System.out.println("Alejandro Gomez");
        System.out.println("Paola Contreras");
    }

    public void Agregar(){
        System.out.println("1. Agregar Producto");
    }
    
    public void Categoria(){
        System.out.println("2. Ver la categoria de un producto ");
    }
    
    public void Coleccion(){
        System.out.println("3. Ver Colección");
    }
    
    public void ColOrdenada(){
        System.out.println("4. Ver Colección Ordenada");
    }
    
    public void Inventario(){
        System.out.println("5. Ver inventario");
    }
    
    public void InventarioOrd(){
        System.out.println("6. Ver inventario ordenado");
    }

    public void Ingreso(){
        System.out.println("Ingrese la categoria del producto que desea agregar");
    }
    public void NombreIngreso(){
        System.out.println("Ingrese el nombre del producto");
    }
    
    public void CantIngreso(){
        System.out.println("Ingrese cantidad del prdoucto");
    }
}
