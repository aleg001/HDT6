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
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapS {
 
    public TreeMapS() {
    }
    
    public void gTM(TreeMap <Integer, Almacen> itemT, String ArchivoTexto) {
         try {Scanner s = new Scanner(new File(ArchivoTexto));
                int Contador = 1;
                while (s.hasNextLine()) {
                    String l = s.nextLine();
                    String[] XD = l.split(" \\|	");
                    itemT.put(Contador, new Almacen(XD[0], XD[1], 10));Contador++;
                }}catch(Exception e){System.out.println(e);}}
    


}
