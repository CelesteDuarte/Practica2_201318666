package Listas;

public class Lista {
private Nodo cabeza;
private int vagoncarbon;
private int vagonpasajero;

public Lista(){
	cabeza=null;
}

public void Agregar(int cantidad, String tipo){
	Nodo nodo1= new Nodo(cantidad, tipo);
	if (getCabeza()==null){
		setCabeza(nodo1);
	}else{
		Nodo nuevo=cabeza;
		while(nuevo.getSiguiente()!=null){
			nuevo=nuevo.getSiguiente();
			
		}
		nuevo.setSiguiente(nodo1);
		nodo1.setSiguiente(new Nodo(0,"4"));
		
	}		
}

//elimina el primero de la lista
public void EliminarInicial(){
		cabeza = null;
}

public void Subirtodos(){
	Nodo subir= cabeza;
	while(subir!=null || subir.getTipo()=="2"){
		if (nuevo.getcantidad<=10){
			
		}
	}
	
	if (nuevo.getCantidad==40){
		
	}
}

public void Bajartodos(){
	
}

//eliminar posición
public void Eliminar(){
	Nodo tmp=cabeza;
	Nodo nuevo=cabeza;
	if (tmp!=null){
		tmp.setSiguiente(nuevo.getSiguiente().getSiguiente());		
	}else{
		System.out.println("No hay vagones");
	}	
}

public void Imprimir(){
	Nodo imprimir;
	for(imprimir=getCabeza(); imprimir != null; imprimir=imprimir.getSiguiente()){
		System.out.println("Cantidad " + imprimir.getCantidad()+ " tipo " + imprimir.getTipo());
	}
}

//regresa el total de elementos de la lista
public int Tamano(){
	Nodo imprimir;
	int dartamano=0;
	
	for(imprimir=getCabeza(); imprimir != null; imprimir=imprimir.getSiguiente()){
		dartamano++;
		
	}	return dartamano;	
}

private Nodo getCabeza() {
	return cabeza;
}

private void setCabeza(Nodo cabeza) {
	this.cabeza = cabeza;
}
}
