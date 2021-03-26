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

import java.util.HashMap; 
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util. ArrayList;

public class Main {
    public static void main(String[] args){ 
        //Declaration of instances 
        Vista v = new Vista(); 

        // Declaration of Varibles
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        boolean salir1= false;
        int opcion = 0; 
        int opcionsubmenu = 0;
        int opcionMenusito =0; 
        int Num = 0;

        v.Welcome(); // Welcome message is called
        
        // Count the lines in the file 
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            while (reader.readLine() != null) {
                Num++;
            }
            reader.close();
        } catch (Exception e) {
            v.FileError();
        }

        // Cicle of the menu         
        while (salir == false){
            opcion = v.MenuOp();

            if(opcion == 1){
                opcionsubmenu = v.Options();
                //El usuario ingresa que tipo de stack quiere usar

                if(opcionsubmenu == 1){
                    //OPCION HashMap

                    //Se crea HashMap correspondiente a listado producto
                    HashMap <Integer, Almacen> item = new HashMap < Integer, Almacen>();                    
                    Hash.gHM(item, "ListadoProducto.txt");

                    while (salir1 == false){
                        opcionMenusito = v.OpcionesPorOperacion();
                        //Agregar producto
                        if(opcionMenusito == 1){
                            v.Agregar();
                            v.Ingreso();
                            
                            //Categoria
                            String XD= scan.next();
                            //Producto
                            v.NombreIngreso();
                            String xxD= scan.next();
                            //Cantidad
                            v.CantIngreso();
                            Integer xxDD=v.IngresoDeCantidad();
                             
                            Hash.addHashMap(item, XD, xxD, xxDD);

                        }
                        else if (opcionMenusito == 2){
                            v.Categoria();
                            v.NombreIngreso();
                            String xxD= scan.next();
                            Hash.ShowCategoria(item, xxD);

                        }
                        else if (opcionMenusito == 3){
                            v.Coleccion();
                            v.NombreIngreso();
                            String xxD= scan.next();
                            Hash.ShowProduct(item, xxD);
                        }
                        else if (opcionMenusito == 4){
                            v.ColOrdenada();

                        }
                        else if (opcionMenusito == 5){
                            v.Inventario();

                        }
                        else if (opcionMenusito == 6){
                            v.InventarioOrd();

                        }
                        else if (opcionMenusito == 7){salir1 = true;}
                    }


                } else if (opcionsubmenu == 2){
                    //OPCION: TreeMap
                    
                    TreeMap <Integer, Almacen> itemT = new TreeMap < Integer, Almacen>();
                    Tree.gTM(itemT,"ListadoProducto.txt");
                    
                    while (salir1 == false){
                        opcionMenusito = v.OpcionesPorOperacion();
                        //Agregar producto
                        if(opcionMenusito == 1){
                            v.Agregar();

                        }
                        else if (opcionMenusito == 2){
                            v.Categoria();

                        }
                        else if (opcionMenusito == 3){
                            v.Coleccion();
                            
                        }
                        else if (opcionMenusito == 4){
                            v.ColOrdenada();

                        }
                        else if (opcionMenusito == 5){
                            v.Inventario();

                        }
                        else if (opcionMenusito == 6){
                            v.InventarioOrd();

                        }
                        else if (opcionMenusito == 7){salir1 = true;}
                    }

                }
                else if(opcionsubmenu == 3){
                    //OPCION: LinkedHashMap
                    LinkedHashMap <Integer, Almacen> pLHM = new LinkedHashMap < Integer, Almacen>();
                    LHash.gLM(pLHM,"ListadoProducto.txt");
                    
                    
                    while (salir1 == false){
                        opcionMenusito = v.OpcionesPorOperacion();
                        //Agregar producto
                        if(opcionMenusito == 1){
                            v.Agregar();

                        }
                        else if (opcionMenusito == 2){
                            v.Categoria();

                        }
                        else if (opcionMenusito == 3){
                            v.Coleccion();

                        }
                        else if (opcionMenusito == 4){
                            v.ColOrdenada();

                        }
                        else if (opcionMenusito == 5){
                            v.Inventario();

                        }
                        else if (opcionMenusito == 6){
                            v.InventarioOrd();

                        }
                        else if (opcionMenusito == 7){salir1 = true;}
                    }

                    

                }else if(opcionsubmenu == 4){
                    v.MensajeSalida();
                    salir = true;
                    
                }
            }
            else if (opcion ==2){
                v.MensajeSalida();
                salir = true;
            }

        }
    }
}