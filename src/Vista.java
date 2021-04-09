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
        int op = 3;
        String ops = "";
        boolean validar = true;
        System.out.println("\nCual implementacion usara?");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
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
        System.out.println("7. Salir \n");

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
     * IngresoCantidad
     *  @author Alecraft
     * @param n/a
     * @return op
     */

    public int IngresoCantidad(){
        int op = 0;
        String ops = "";
        boolean validar = true;
        System.out.println("Proceda a ingresar cantidad del producto");
        while(validar == true){
            System.out.println("Ingrese: ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else{}
        } return op;
    }

    public void CorrectoAgregado(String producto){
        System.out.println("Se ha agregado de forma correcta " + producto);
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
      public void Despedida(){
        System.out.println( "\nGracias por venir a la torre." );
        System.out.println("Autores:");
        System.out.println( "Alejandro Gomez" );
        System.out.println( "Paola Contreras" );
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

    public void AgregarP(){
        System.out.println("Agregue su producto: ");
    }

    public void IngresoP(){
        System.out.println("Que producto quiere buscar? ");
    }
    
    public void Categoria(){
        System.out.println("2. Ver la categoria de un producto ");
    }
    public void CategoriaFake(){
        System.out.println("Cuidadoooo, esa categoria no existe, aun :o");
    }
    
    public void Coleccion(){
        System.out.println("3. Ver Colección");
    }

    public void Alma(){
        System.out.println("5. Ver almacen");
    }
    public void ColleccionItems(){
        System.out.println("Se mostrara a continuacion su coleccion: ");
    }
    public void AlmacenItems(){
        System.out.println("Se mostrara a continuacion su almacen: ");
    }
    
    public void ColOrdenada(){
        System.out.println("4. Ver Colección Ordenada");
    }
    
    public void ColOrdenadaI(){
        System.out.println("A continuacion se muestra la colección ordenada ");
    }
    public void Inventario(){
        System.out.println("5. Ver inventario");
    }
    public void Corr(){
        System.out.println("Ingresado correcto");
    }
    public void Inc(){
        System.out.println("Ingresado mal");
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
    public void Error(){
        System.out.println("Cuidado. Ha ocurrido un error :o");
    }
    public void EncontarProductoC(){
        System.out.println("Se ha encontrado su producto en coleccion");
    }
    public void EncontarProductoI(){
        System.out.println("Se ha encontrado su producto en inventario");
    }
    public void UpsNOEncontrado(){
        System.out.println("Caray! No se ha encontrado su productoe");
    }
}
