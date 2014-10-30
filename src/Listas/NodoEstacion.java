package Listas;

public class NodoEstacion {
private Nodo siguiente1;
private Nodo anterior;
private Nodo tren;

public Nodo getSiguiente1() {
	return siguiente1;
}

public void setSiguiente1(Nodo siguiente) {
	this.siguiente1 = siguiente;
}

public Nodo getAnterior() {
	return anterior;
}

public void setAnterior(Nodo anterior) {
	this.anterior = anterior;
}

public Nodo getTren() {
	return tren;
}

public void setTren(Nodo tren) {
	this.tren = tren;
}
}
