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

public class Almacen {
    
    //Se definen variables:
    private String CategoriaProducto; 
    private String Producto; 
    private Integer Available;

    public Almacen(String CategoriaProducto, String Producto, Integer Available){
        this.CategoriaProducto = CategoriaProducto; 
        this.Producto= Producto;
        this.Available= Available;
    }
    
    //Getters
    public String getCategoriaProducto(){return this.CategoriaProducto; }
    public String getProducto(){return this.Producto;}
    public int getAvailable(){return this.Available;}

    //Setters
    public void setCategoriaProducto(String CategoriaProducto) {this.CategoriaProducto = CategoriaProducto;}
    public void setProducto(String Producto) {this.Producto = Producto;}
    public void setAvailable(Integer Available) {this.Available = Available;}

    // Method that show all the information of the txt
    public String toString(){       
        return ("Categoria: " + CategoriaProducto + "," + "Nombre del Producto: "+ Producto + "," + "Cantidad:" + Available);
    }

}
