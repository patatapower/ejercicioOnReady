package ejOnready;

import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria {

	private ArrayList<Vehiculo> listaVehiculos;
	
	public Concesionaria( ){
		
		listaVehiculos = new ArrayList<Vehiculo>();
	}
	
	private void crearYcargar( ){
		Vehiculo auto1 = new Auto( "Peugeot", "206", 200000, 4 );
		Vehiculo auto2 = new Auto( "Peugeot", "208", 250000, 5 );
		Vehiculo moto1 = new Moto( "Honda", "Titan", 60000, "125c" );
		Vehiculo moto2 = new Moto( "Yamaha", "YBR", 80500.50, "160c" );
		
		listaVehiculos.add( auto1 );
		listaVehiculos.add( moto1 );
		listaVehiculos.add( auto2 );
		listaVehiculos.add( moto2 );
		
	}
	
	/*
	 * 
	 * Recibe un 0 para mostrar solo el valor de "Marca" y "Modelo" de las instancias en una lista
	 * Recibe un 1 para mostrar el valor de todos los atributos de las instancias en una la lista 
	 * Recibe un 2 para mostrar el valor de "Marca" y "Modelo" de la instancia con el "Precio" mas alto en la lista
	 * Recibe un 3 para mostrar el valor de "Marca" y "Modelo" de la instancia con el "Precio mas bajo en la lista
	 * 
	 *  NOTA: para usar el indice 0 / 2 / 3 previamente hay que disparar la funcion mayorMenor() **/
	
	private void mostrar( int indice ){
		switch( indice ){
			case 0: 
				System.out.println( "Vehiculos ordenados por precio de mayor a menor" );
				for( int i = 0; i < listaVehiculos.size(); i ++ ){
					System.out.println( listaVehiculos.get(i).getMarca()+" "+listaVehiculos.get(i).getModelo() );
				}
				break;
			case 1:
				for( int i = 0; i < listaVehiculos.size(); i++ ){
					System.out.println( listaVehiculos.get(i).toString() );	
				}
				break;
			case 2:
				System.out.println( "Vehiculo más caro: "+listaVehiculos.get(0).getMarca()+" "+listaVehiculos.get(0).getModelo() );
				break;
			case 3:
				System.out.println( "Vehiculo más barato: "+ listaVehiculos.get( listaVehiculos.size() - 1 ).getMarca() +" "+ listaVehiculos.get( listaVehiculos.size() - 1 ).getModelo() );
				break;
			default: 
		}
	}
		
	private void buscarLetra( String letra ){
		Vehiculo myVehiculo = listaVehiculos.get(0);
		for( int i = 0; i < listaVehiculos.size(); i++ ){
			if( listaVehiculos.get(i).getModelo().contains( letra ) ){
				myVehiculo = listaVehiculos.get( i );
			}
		}
		
		System.out.println( "Vehiculo que contiene en el modelo la letra '"+ letra +"' : "+ myVehiculo.getMarca() +" "+ myVehiculo.getModelo() +" "+ myVehiculo.getPrecioEnMiles() );
	}
	
	public void correrPrograma( ){
		// Crea las instancias y las agrega a la lista.
		crearYcargar();
		// Muestra las instancias de la lista.
		mostrar( 1 );
		System.out.println( "=======================================" );
		// Ordena las instancias de la lista de mayor a menor (dependiendo del atributo "Precio").
		mayorMenor();
		mostrar( 2 );
		mostrar( 3 );
		// Busca la instancia de la lista que tenga la Letra seleccionada en el "Modelo"
		buscarLetra( "Y" );
		System.out.println( "=======================================" );
		mostrar( 0 );
		
	}
	
	private void mayorMenor( ) {	
		Collections.sort( listaVehiculos );
	}
	
	
	/*
	 * Funciones masCaro() y masBarato():
	 * Funciones que buscan el menor valor y el mayor valor del atributo "Precio" en toda la lista de Vehiculos **/
	
	/*private void masCaro( ){
	double max = -999999;
	Vehiculo myVehiculo = listaVehiculos.get(0);
	for( int i = 0; i < listaVehiculos.size(); i++ ){
		if( listaVehiculos.get(i).getPrecio() > max ){
			myVehiculo = listaVehiculos.get( i );
			max = myVehiculo.getPrecio();
		}
	}
	
	System.out.println( "Vehiculo más caro: "+myVehiculo.getMarca()+" "+myVehiculo.getModelo() );
}

private void masBarato( ){
	double min = 9999999;
	Vehiculo myVehiculo = listaVehiculos.get(0);
	for( int i = 0; i < listaVehiculos.size(); i++ ){
		if( listaVehiculos.get(i).getPrecio() < min ){
			myVehiculo = listaVehiculos.get( i );
			min = myVehiculo.getPrecio();
		}
	}
	
	System.out.println( "Vehiculo más barato: "+ myVehiculo.getMarca() +" "+ myVehiculo.getModelo() );
}*/
	
	
	
}
