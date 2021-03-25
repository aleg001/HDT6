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

public class Main {
    public static void main(String[] args){ 
        //Se declaran instancias y variables
        
        Vista v = new Vista();
        boolean salir = false; boolean verificar = false;
        int opcion = 0; int opcionsubmenu = 0; 

        v.Welcome();
         
        while (salir == false){
            opcion = v.MenuOp();
            v.FileName();
            String archivo = v.Archivo();
            v.LectorArchivo(archivo);
            //Lector de archivo

            if(opcion == 1){
                opcionsubmenu = v.Options();
                //El usuario ingresa que tipo de stack quiere usar

                if(opcionsubmenu == 1){
                    //OPCION HashMap
                    

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