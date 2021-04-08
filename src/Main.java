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
import java.util.concurrent.SynchronousQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{ 
        //Declaration of instances 
        Vista v = new Vista(); 

        // Declaration of Varibles
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        boolean salir1= false;
        boolean anadir= false;
        int opcion = 0; 
        int opcionsubmenu = 0;
        int opcionMenusito =0; 
        int Num = 0;
        String lineasEnText="";
        File f = new File("ListadoProducto.txt");
        Scanner scanFile = new Scanner(f);
        
        StringBuilder xdxd = new StringBuilder();
        ArrayList producto= new ArrayList();
        MapS<String,Almacen> MapInUse = null;
        MapS<String,Almacen> Product = null;
        
        
        HashMapFactory <String,Almacen> FactoryMap= new HashMapFactory<String,Almacen>();
        Map<String, Almacen> inv = null; Map<String, Almacen> col = null; // Posible error jejeje
        
        v.Welcome(); // Welcome message is called
        
        // Count the lines in the file 
        /*try {
            BufferedReader reader = new BufferedReader(new FileReader("ListadoProducto.txt"));
            while (reader.readLine() != null) {
                Num++;
                lineasEnText = reader.readLine();
                xdxd.append(lineasEnText);
                xdxd.append(System.lineSeparator());
                lineasEnText = reader.readLine();
                if(lineasEnText == null)
                    break;
                producto.add(lineasEnText);
            }
            reader.close();
            System.out.println(Arrays.toString(producto.toArray()));
        } catch (Exception e) {
            v.FileError();
        }*/

        //Cycle to save the information of the document 
        while (salir==false){
            v.MenuOp(); // The method MenuOp is called 
            opcion=v.Options();

            // Acording to the option seleccted the it calls the instance
            MapInUse = FactoryMap.seleecionarMapa(opcion); 
            Product = FactoryMap.seleecionarMapa(opcion);  

            // Cycle to start saving the elements 
            while(scanFile.hasNextLine()){
                lineasEnText = scanFile.nextLine(); // read file 
                String[] SeparacionDeLineas = lineasEnText.split("\\|"); // separates file acording to "|"
                String CategoriaAlmacen = ((SeparacionDeLineas[0].trim())); 
                String ProductosAlmacen = ((SeparacionDeLineas[1].trim()));
                Almacen xdxdxdxdx; 
            
                // Conditional to save information in the map
            if (MapInUse == null){
                System.out.println("AKI TRUENA XD");
                xdxdxdxdx = new Almacen(CategoriaAlmacen, ProductosAlmacen);
                MapInUse.put(ProductosAlmacen, xdxdxdxdx);
            }
            else { 
                if(MapInUse.containsKey(ProductosAlmacen)){
                    Almacen GetProductoAlmacen = MapInUse.get(ProductosAlmacen); 
                    GetProductoAlmacen.setAvailable(1);
                } else {
                    xdxdxdxdx = new Almacen(CategoriaAlmacen, ProductosAlmacen);
                    MapInUse.put(ProductosAlmacen, xdxdxdxdx);  
                }
            }
            producto.add(CategoriaAlmacen);
        }

        


            }
            /*    for (String product : producto){
                    String NombreProducto="";
                    String Categoria="";

                    for (int i=0; i<product.length();i++){
                        if (anadir){
                            Categoria += product.charAt(i); // returns the character of a product in the specified index in a string
                            // Product is separated 
                        }if(product.charAt(i)!= '|' && !anadir) {
                            NombreProducto += product.charAt(i); // 
                        }else{
                            anadir=true;
                        }
                    }
                    // Almacen AlmacenTemporal;
                    // AlmacenTemporal = new Almacen(CategoriaProducto, Producto, Available);
                    
                    MapInUse.put(NombreProducto, Categoria); // add to the map the key and the value
                } */
                // Cycle to start the program 
                while(salir1== false){
                    
                    opcionMenusito = v.OpcionesPorOperacion(); // method OpcionesPorOperacion is called

                    // Add product 
                    if(opcionMenusito == 1){
                        v.Agregar();
                        v.Ingreso();
                        String key= scan.nextLine(); // input categoria 
                        int ElementosAnalizados = 0; 

                        if (producto.contains(key)){
                            System.out.println("ERROR11");
                            v.Agregar();
                            String ProductoIngresado = scan.nextLine(); // ingreso product
                            int ProductoAdd = 1;
                            Product.put(key, MapInUse.get(key)); // add info to map 
                            
                        }else{
                            System.out.println("ERROR ELSE");
                            v.Error();
                        }
                        if(!Product.containsKey(key)){
                            if(MapInUse.containsKey(key)){
                                Almacen ValorGenerado = MapInUse.get(key);
                                ValorGenerado.setAvailable(1);
                                Product.put(key, ValorGenerado);
                            } 
                        }else {
                            Product.get(key).setAvailable(1);
                        }
                       v.CorrectoAgregado(key);

                    } if (opcionMenusito==2){
                        v.Categoria();
                       String search= scan.nextLine();
                       
                       if(MapInUse.containsKey(search)){
                            
                            System.out.println("La carta consultada fue: " + MapInUse.get(search));

                       }else{
                           
                           v.Error();
                       }
                    } if (opcionMenusito==3){
                        
                    } if (opcionMenusito==4){
                        
                    } if (opcionMenusito==5){
                        
                    } if (opcionMenusito==6){
   
                    } if (opcionMenusito==7){
                        salir1 = true;
                    }

                }
            }


        }
    
