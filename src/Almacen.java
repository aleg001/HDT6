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
    private Integer Available=1;

    public Almacen(String xd1, String yd1){
        CategoriaProducto = xd1; 
        Producto = yd1;

    }
    
    //Getters
    public String getCategoriaProducto(){return this.CategoriaProducto; }
    public String getProducto(){return this.Producto;}
    public int getAvailable(){return this.Available;}

    //Setters
    public void setCategoriaProducto(String CategoriaProducto) {this.CategoriaProducto = CategoriaProducto;}
    public void setProducto(String Producto) {this.Producto = Producto;}
    public void setAvailable(Integer x) {this.Available = Available + x;}

    
    public String ImprimirProductoCategoria(){
        return("Categoria: " + CategoriaProducto + "Nombre producto: " + Producto);
    }
    public String ImprimirCategoria(){
        return("Categoria del producto " + Producto + "es: "+CategoriaProducto);
    }

    // Method that show all the information of the txt
    public void ImprimirCosasXD(){       
        System.out.println("Producto: " + CategoriaProducto + "," + "Categoria: "+ Producto + "," + "Cantidad:" + Available );
        System.out.println(" ");
    }

    

}
