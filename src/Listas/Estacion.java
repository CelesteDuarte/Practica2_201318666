package Listas;

public class Estacion {
	public Nodo estacion;
	public int suben;
	public int bajan;
	public Estacion anterior;
	public Estacion siguiente;
	
	public Lista tren= new Lista();
	
	Nodo imprimir;
	for(imprimir=tren; imprimir != null; imprimir=imprimir.getSiguiente()){
		System.out.println("Cantidad " + imprimir.getCantidad()+ " tipo " + imprimir.getTipo());
		