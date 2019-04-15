package ejOnready;

import java.text.DecimalFormat;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	private String marca;
	private String modelo;
	private double precio;
	private String precioEnMiles;
	
	
	public Vehiculo( String marca, String modelo, double precio ){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.precioEnMiles = formatearPrecio();
	}
	
	
	public String getMarca( ){
		return marca;
	}
	
	public String getModelo( ){
		return modelo;
	}
	
	public double getPrecio( ){
		return precio;
	}
	
	public String getPrecioEnMiles( ){
		return precioEnMiles;
	}
	
	
	private String formatearPrecio( ){
		String pattern = "###,###,###.##";
		DecimalFormat myFormatter = new DecimalFormat( pattern );
        String precio = myFormatter.format( getPrecio() );
        return precio;
	}
	
	public String toString( ){
		return "Marca: "+ marca +" // "+ modelo +" // "+ precio;
	}
	


}
