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
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){ 
        //Se declaran instancias y variables
        HashMapS Hash = new HashMapS();

        Vista v = new Vista();
        boolean salir = false; boolean verificar = false;
        int opcion = 0; int opcionsubmenu = 0; 

        v.Welcome();
         
        while (salir == false){
            opcion = v.MenuOp();
            /*
    
            Cambiar con el codigo de Gaby Contreras la mas crack de POO y Estructura de Datos y Fisica y Calculo y Juegos/Apps y Assembler
            Con su metodo todo pro que hizo con la compa de 30 centimetros Ana Paola jejejje
            
            */
            
            //v.FileName();
            //String archivo = v.Archivo();
            //v.LectorArchivo(archivo);
            v.ReadArchivo();
            //Lector de archivo

            if(opcion == 1){
                opcionsubmenu = v.Options();
                //El usuario ingresa que tipo de stack quiere usar

                if(opcionsubmenu == 1){
                    //OPCION HashMap
                    
                    //Se crea HashMap correspondiente a listado producto
                    HashMap <Integer, Almacen> item = new HashMap < Integer, Almacen>();                    
                    Hash.gHM(item, "ListadoProducto.txt");

                } else if (opcionsubmenu == 2){
                    //OPCION: TreeMap

                }
                else if(opcionsubmenu == 3){
                    //OPCION: LinkedHashMap

                    

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