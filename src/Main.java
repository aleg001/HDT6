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
// Imports 
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{ 
        
        //Declaration of instances 
        Vista v = new Vista(); 
        File f = new File("ListadoProducto.txt");
        Scanner scanFile = new Scanner(f);
        StringBuilder xdxd = new StringBuilder();
        ArrayList producto= new ArrayList();

        // Declaration of variables e instancias
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        boolean salir1= false;
        boolean anadir= false;
        boolean OpcionHash = false;
        int opcion = 0; 
        int opcionsubmenu = 0;
        int opcionMenusito =0; 
        int Num = 0;
        String lineasEnText="";
        String ProductoIngresado = "";
        String CategoriaIngresada = "";
        
        HashMapFactory <String,Almacen> FactoryMap= new HashMapFactory<String,Almacen>();
        Map<String, Almacen> AlmacenInventario = null; 
        Map<String, Almacen> ColeccionInventario = null; // Posible error jejeje

        v.Welcome(); // Welcome message is called
        
        //Cycle to save the information of the document 
            while(true){ 
                try{ 
                    opcion=v.Options(); 
                    if(opcion > 0  & opcion < 4){ 
                        break;
                    } else{
                        v.Inc();  
                    }
                }catch(Exception e){
                    v.Inc();
                    continue;
                }
            }
  
            // Acording to the option seleccted the it calls the instance
            AlmacenInventario = FactoryMap.seleecionarMapa(opcion); 
            ColeccionInventario = FactoryMap.seleecionarMapa(opcion);  

            // Cycle to start saving the elements 
            while(scanFile.hasNextLine()){
                lineasEnText = scanFile.nextLine(); // read file 
                String[] SeparacionDeLineas = lineasEnText.split("\\|"); // separates file acording to "|"
                String CategoriaAlmacen = ((SeparacionDeLineas[0].trim()));  // Saves Category
                String ProductosAlmacen = ((SeparacionDeLineas[1].trim()));  // Saves Product 
                Almacen xdxdxdxdx; 
            
            // Conditional to created an Almacen 
            if (AlmacenInventario.isEmpty()){
                xdxdxdxdx = new Almacen(CategoriaAlmacen, ProductosAlmacen);
                AlmacenInventario.put(ProductosAlmacen, xdxdxdxdx);
            }
            // Add info to the existing Almacen 
            else { 
                if(AlmacenInventario.containsKey(ProductosAlmacen)){
                    Almacen GetProductoAlmacen = AlmacenInventario.get(ProductosAlmacen); 
                    GetProductoAlmacen.setAvailable(1); // sets the quantity of the product 
                } else {
                    xdxdxdxdx = new Almacen(CategoriaAlmacen, ProductosAlmacen);
                    AlmacenInventario.put(ProductosAlmacen, xdxdxdxdx);  
                }
            }
            producto.add(CategoriaAlmacen);
        }

            // Cycle to start the program 
                while(salir1== false){
                    opcionMenusito = v.OpcionesPorOperacion(); // method OpcionesPorOperacion is called
                    // Add product 

                    if(opcionMenusito == 1){
                       
                        v.Ingreso();
                        CategoriaIngresada= scan.nextLine(); // input categoria 
                        int ElementosAnalizados = 0; 

                        if (producto.contains(CategoriaIngresada)){
                            v.AgregarP();
                            ProductoIngresado = scan.nextLine(); // ingreso product
                            int ProductoAdd = 1;        
                        }else{
                            v.CategoriaFake();
                            //System.out.println("ERROR ELSE");
                            v.Error();
                        }
                    // Conditional to save a product if is not in the colecction  
                        if(!ColeccionInventario.containsKey(ProductoIngresado)){
                            // Conditional to save the product 
                            if(AlmacenInventario.containsKey(ProductoIngresado)){
                               Almacen ValorGenerado = AlmacenInventario.get(ProductoIngresado); // obtein data of the map
                                ValorGenerado.setAvailable(1);
                                ColeccionInventario.put(ProductoIngresado, ValorGenerado); // save to the colecction 
                            } else {
                                Almacen ValorTemporal = new Almacen(ProductoIngresado, CategoriaIngresada);
                                ColeccionInventario.put(ProductoIngresado, ValorTemporal);
                            
                            }
                        } else { 
                            ColeccionInventario.get(ProductoIngresado).setAvailable(1); // add 1 to the amount of the product 
                        }
                       v.CorrectoAgregado(ProductoIngresado); // Message that show the user that the product was successfully saved

                    } if (opcionMenusito==2){
                        // Llamar una categoria basandose en un producto 
                       
                        v.IngresoP();
                        String nombreP = scan.nextLine();
                        if(ColeccionInventario.containsKey(nombreP)){
                            // Mostrar mensaje que se encontro en coleccion
                            v.EncontarProductoC();
                            ColeccionInventario.get(nombreP).ImprimirCosasXD();
                        }else if (AlmacenInventario.containsKey(nombreP)){
                            v.EncontarProductoI();
                           AlmacenInventario.get(nombreP).ImprimirCosasXD();
                        }else {v.UpsNOEncontrado();}                       
    
                    } if (opcionMenusito==3){
                        // Mostrar coleccion 
                        v.Coleccion();
                        v.ColleccionItems();
                        // Cycle to comper the data of the Almacen and the Coleccion Inventario
                        for(Map.Entry<String, Almacen> XD :ColeccionInventario.entrySet() ){
                            XD.getValue().ImprimirCosasXD();
                        }
                        
                    } if (opcionMenusito==4){
                        // Mostrar inventario ordenado
                        v.ColOrdenadaI();
                        // Mostrar coleccion 
                        v.Coleccion();
                        v.ColleccionItems();
                        // Cycle to comper the data of the Almacen and the Coleccion Inventario
                        for(Map.Entry<String, Almacen> XD :ColeccionInventario.entrySet() ){
                            XD.getValue().ImprimirCosasXD();
                        }
                        
                    } if (opcionMenusito==5){
                        // Mostrar prod/categoria 
                        v.Alma();
                        v.AlmacenItems();
                        // Cycle to compare the data of the Almacen and the Coleccion Inventario
                        for(Map.Entry<String, Almacen> jejeje :AlmacenInventario.entrySet() ){
                            jejeje.getValue().ImprimirCosasXD();
                        }
                        
                    } if (opcionMenusito==6){
                        // Mostrar prod/categoria existente ordenada
                        // Cycle to compare the data of the Almacen and the Coleccion Inventario
                        for(Map.Entry<String, Almacen> jejeje :AlmacenInventario.entrySet() ){
                        jejeje.getValue().ImprimirCosasXD();
                    }
                    } if (opcionMenusito==7){
                        // Salir
                        salir1 = true;
                        v.Despedida();
                    }
                }
        }
    }


        
    
