package ejOnready;


public class Moto extends Vehiculo {
	private String cilindrada;
	
	public Moto( String marca, String modelo, double precio, String cilindrada ){
		super( marca, modelo, precio );
		this.cilindrada = cilindrada;
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
		return "Marca: "+ getMarca() +" // Modelo: "+ getModelo() +" // Cilindrada: "+ cilindrada +" // Precio: $"+ getPrecioEnMiles();
	}

}
