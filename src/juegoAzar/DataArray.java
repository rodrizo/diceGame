package juegoAzar;

/**
 *
 * @author Rodney Rizo
 */
//Clase constructora para ir almacenando posición por posición en el array
public class DataArray {
    
    String [] array = new String[10];
    
    public String[] getArray() {
        return array;
    }
    
    public void setArray(String[] array, int n){
        this.array[n] = array[n];
    }

}
