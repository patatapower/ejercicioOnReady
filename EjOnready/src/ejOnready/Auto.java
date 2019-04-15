package ejOnready;

public class Auto extends Vehiculo {
	private int puertas;
	
	public Auto( String marca, String modelo, double precio, int puertas ){
		super( marca, modelo, precio );
		this.puertas = puertas;
	}
	
	public int compareTo( Vehiculo o ){
	    if( getPrecio() > o.getPrecio() ){
	          return -1;
	    }else if( o.getPrecio() > o.getPrecio() ){
	          return 1;
	    }
	    return 0;
	}

	
	public String toString( ){
		return "Marca: "+ getMarca() +" // Modelo: "+ getModelo() +" // Puertas: "+ puertas +" // Precio: $"+ getPrecioEnMiles();
	}
}
